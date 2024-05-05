package view;

import static utils.NumberUtils.bd;
import static utils.StreamUtils.toList;
import static utils.StreamUtils.toMap;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class WhAllocationManager {

	private static RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

	public static void main(String[] args) {

		// ================== INPUT =======================
		// Số lượng mặt hàng cần chuyển từ kho đến các cửa hàng
		Integer whAllocationAmount = 300;

		// Danh sách các cửa hàng cân nhắc để chuyển hàng đến
		List<Store> stores = DataModel.getStores().stream().filter(s -> s.getSelected()).toList();

		Map<Long, Integer> storeAllocatedAmounts = new LinkedHashMap<>();
		try {
			storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		generate(storeAllocatedAmounts);
	}

	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) throws Exception {

		boolean hasNoExpectedSales = stores.stream().noneMatch(s -> s.getExpectedSales() != null);

		if (hasNoExpectedSales) {
			String message = ">>> Expected sales cannot be calculated. Please add "
					+ "reference store or include stores with expected sales for interpolation";
			throw new Exception(message);
		}

		System.out.println("Step 1: Filling in missing Expected Sales values");
		Map<Long, BigDecimal> interpolatedExpectedSalesMap = fillMissingExpectedSales(stores);
		generate(interpolatedExpectedSalesMap);

		System.out.println("\n======================================\n");

		System.out.println("Step 2: Calculation of Allocation Key");
		Map<Long, BigDecimal> allocationKeyMap = calculateAllocationKeys(interpolatedExpectedSalesMap);
		generate(allocationKeyMap);

		System.out.println("\n======================================\n");

		System.out.println("Step 3: Calculation of Amount Allocated");
		Map<Long, BigDecimal> stockPreviousDayMap = toMap(stores, Store::getStoreId, Store::getStockPreviousDay);
		Map<Long, Integer> allocatedAmounts = calculateAllocatedAmounts(allocationKeyMap, whAllocationAmount, stockPreviousDayMap);
		generate(allocatedAmounts);
		
		System.out.println("\n======================================\n");

		System.out.println("Step 4: Fix Rounding Issues");
		Map<Long, Integer> fixedAllocatedAmounts = fixRoundingIssues(
				interpolatedExpectedSalesMap, 
				stockPreviousDayMap,
				allocatedAmounts,
				whAllocationAmount);

		return fixedAllocatedAmounts;

	}

	// Step 1: Filling in missing “Expected Sales” values
	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores) {
		Map<Long, BigDecimal> interpolatedExpectedSalesMap = new LinkedHashMap<>();

		Map<Long, BigDecimal> initialExpectedSalesMap = toMap(stores, Store::getStoreId, Store::getExpectedSales);

		// Average of store's expected sales with it's own data
		BigDecimal average = calculateAverage(stores);

		stores.forEach(store -> {
			BigDecimal interpolatedExpectedSales = null;

			Long storeId = store.getStoreId();
			BigDecimal expectedSales = store.getExpectedSales();

			// if store missing expected sales
			if (expectedSales == null) {
				Long refStoreId = store.getReferenceStoreId();
				if (refStoreId == null) {
					// has no reference store --> use average
					interpolatedExpectedSales = average;
					System.out.println("Store " + storeId
							+ " has no expected sales(no reference), use expected sales from average = " + average);
				} else {
					BigDecimal refStoreExpectedSales = initialExpectedSalesMap.get(refStoreId);

					if (refStoreExpectedSales == null) {
						// has reference store which has NO expected sales maintained --> use average
						interpolatedExpectedSales = average;
						System.out.println("Store " + storeId
								+ " has no expected sales(has reference, reference has no expected sales), use expected sales from average = "
								+ average);
					} else {
						// has reference store which has expected sales maintained --> use of reference
						interpolatedExpectedSales = refStoreExpectedSales;
						System.out.println("Store " + storeId
								+ " has no expected sales(has reference, reference has expected sales), use expected sales from average = "
								+ average);
					}
				}
			} else {
				interpolatedExpectedSales = expectedSales;
			}
			interpolatedExpectedSalesMap.put(storeId, interpolatedExpectedSales);
		});
		return interpolatedExpectedSalesMap;
	}

	// Step 2: Calculation of Allocation Key
	private static Map<Long, BigDecimal> calculateAllocationKeys(Map<Long, BigDecimal> interpolatedExpectedSalesMap) {
		BigDecimal sumOfExpectedSales = interpolatedExpectedSalesMap.values()
				.stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		return interpolatedExpectedSalesMap.entrySet().stream().collect(
				Collectors.toMap(
						Entry::getKey, 
						e -> e.getValue().divide(sumOfExpectedSales, 10, ROUNDING_MODE)));
	}
	
	// Step 3: Calculation of Amount Allocated
	private static Map<Long, Integer> calculateAllocatedAmounts(
			Map<Long, BigDecimal> allocationKeyMap,
			Integer whAllocationAmount,
			Map<Long, BigDecimal> stockPreviousDayMap){
		
		BigDecimal sumOfStockPreviousDay = stockPreviousDayMap.values()
				.stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return allocationKeyMap.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					Long storeId = e.getKey();
					BigDecimal allocationKey = e.getValue();
					
					int allocatedAmounts = allocationKey.multiply(bd(whAllocationAmount).add(sumOfStockPreviousDay))
							.subtract(stockPreviousDayMap.get(storeId))
							.setScale(0, ROUNDING_MODE)
							.intValue();
					
					// if allocated amount is negative, use 0 for next steps
					return Math.max(0, allocatedAmounts);
				}));
	}
	
	// Step 4: Fix Rounding Issues
	private static Map<Long, Integer> fixRoundingIssues(
			Map<Long, BigDecimal> interpolatedExpectedSalesMap,
			Map<Long, BigDecimal> stockPreviousDayMap,
			Map<Long, Integer> allocatedAmounts,
			Integer whAllocationAmount ){
		
		Integer sumOfAllocatedAmounts = allocatedAmounts.values()
				                                 .stream()
				                                 .reduce(0, Integer::sum);
		System.out.println("Step 3 result sum: " + sumOfAllocatedAmounts);
		
		if (sumOfAllocatedAmounts.compareTo(whAllocationAmount) == 0) {
			System.out.println(">> Sum of Allocated Amounts equals with wh allocation amount");
			System.out.println(">> No need to fix");
			return allocatedAmounts;
		}
		
		Map<Long, Integer> demandMap = toMap(allocatedAmounts.entrySet(), Entry::getKey, e -> {
			Long storeId = e.getKey();
			return Math.max(interpolatedExpectedSalesMap.get(storeId).subtract(stockPreviousDayMap.get(storeId))
					.setScale(0, ROUNDING_MODE)
					.intValue(), 0);
		});
		
		Map<Long, Integer> fixedAllocationAmounts = new LinkedHashMap<>(allocatedAmounts);
		
		if(sumOfAllocatedAmounts.compareTo(whAllocationAmount) > 0) {
			while(!sumOfAllocatedAmounts.equals(whAllocationAmount)) {
				// find store with biggest diff, ..., setValue(value - 1)
				fixRoundingBiggest(fixedAllocationAmounts, demandMap, interpolatedExpectedSalesMap);
				sumOfAllocatedAmounts = sumOfAllocatedAmounts - 1;
			}
		} else {
			while(!sumOfAllocatedAmounts.equals(whAllocationAmount)) {
				// find store with smallest diff, ..., setValue(value + 1)
				fixRoundingSmallest(fixedAllocationAmounts, demandMap, interpolatedExpectedSalesMap);
				sumOfAllocatedAmounts = sumOfAllocatedAmounts + 1;
			}
		}
		
		System.out.println("Fixed rounding issues: " + sumOfAllocatedAmounts);
		
		return fixedAllocationAmounts;
	}
	
	private static void fixRoundingBiggest(
			Map<Long, Integer> fixedAllocationAmounts,
			Map<Long, Integer> demandMap,
			Map<Long, BigDecimal> interpolatedExpectedSalesMap) {
		
		List<Entry<Long, Integer>> nonZeroAllocatedAmounts = fixedAllocationAmounts.entrySet()
				.stream()
				.filter(e -> e.getValue().compareTo(0) != 0)
				.toList();
		
		// initial selected store as finding store matches conditions to subtract one unit
		Entry<Long, Integer> selectedStore = nonZeroAllocatedAmounts.get(0);
		
		for(Entry<Long, Integer> store : nonZeroAllocatedAmounts) {
			
			Long storeId = store.getKey();
			
			int biggestDiff = selectedStore.getValue() - demandMap.get(selectedStore.getKey());
			int diff = store.getValue() - demandMap.get(storeId);
			
			if (diff > biggestDiff) {
				selectedStore = store;
				continue;
			}
			
			if (diff == biggestDiff) {
				int smallestDemand = demandMap.get(selectedStore.getKey());
				int demand = demandMap.get(storeId);
				
				if (demand < smallestDemand) {
					selectedStore = store;
					continue;
				}
				
				if (demand == smallestDemand) {
					BigDecimal smallestExpectedSales = interpolatedExpectedSalesMap.get(selectedStore.getKey());
					BigDecimal expectedSalesnd = interpolatedExpectedSalesMap.get(storeId);
					
					if (expectedSalesnd.compareTo(smallestExpectedSales) < 0) {
						selectedStore = store;
						continue;
					}
					
					if (expectedSalesnd.compareTo(smallestExpectedSales) == 0) {
						Long smallestStoreId = selectedStore.getKey();
						
						if (storeId < smallestStoreId) {
							selectedStore = store;
						}
					}
				}
			}
			
		}
		selectedStore.setValue(selectedStore.getValue() - 1);
		System.out.println(">> Subtract 1 unit to store " + selectedStore.getKey());
	}
	
	private static void fixRoundingSmallest(
			Map<Long, Integer> fixedAllocationAmounts,
			Map<Long, Integer> demandMap,
			Map<Long, BigDecimal> interpolatedExpectedSalesMap) {
		List<Entry<Long, Integer>> nonZeroAllocatedAmounts = fixedAllocationAmounts.entrySet()
				.stream()
				.filter(e -> e.getValue().compareTo(0) != 0)
				.toList();
		
		// initial selected store as finding store matches conditions to subtract one unit
		Entry<Long, Integer> selectedStore = nonZeroAllocatedAmounts.get(0);
		
		for(Entry<Long, Integer> store : nonZeroAllocatedAmounts) {
			
			Long storeId = store.getKey();
			
			int smallestDiff = selectedStore.getValue() - demandMap.get(selectedStore.getKey());
			int diff = store.getValue() - demandMap.get(storeId);
			
			if (diff < smallestDiff) {
				selectedStore = store;
				continue;
			}
			
			if (diff == smallestDiff) {
				int biggestDemand = demandMap.get(selectedStore.getKey());
				int demand = demandMap.get(storeId);
				
				if (demand > biggestDemand) {
					selectedStore = store;
					continue;
				}
				
				if (demand == biggestDemand) {
					BigDecimal biggestExpectedSales = interpolatedExpectedSalesMap.get(selectedStore.getKey());
					BigDecimal expectedSalesnd = interpolatedExpectedSalesMap.get(storeId);
					
					if (expectedSalesnd.compareTo(biggestExpectedSales) > 0) {
						selectedStore = store;
						continue;
					}
					
					if (expectedSalesnd.compareTo(biggestExpectedSales) == 0) {
						Long smallestStoreId = selectedStore.getKey();
						
						if (storeId < smallestStoreId) {
							selectedStore = store;
						}
					}
				}
			}
			
		}
		selectedStore.setValue(selectedStore.getValue() + 1);
		System.out.println(">> Add 1 unit to store " + selectedStore.getKey());
	}

	private static BigDecimal calculateAverage(List<Store> stores) {
		List<BigDecimal> nonNullExpectedSales = toList(stores, Store::getExpectedSales,
				expectedSales -> expectedSales != null);

		BigDecimal sum = nonNullExpectedSales.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		return sum.divide(bd(nonNullExpectedSales.size()), 1, ROUNDING_MODE);
	}

	private static <K, V> void generate(Map<K, V> entries) {
		entries.forEach((storeId, value) -> {
			System.out.println("Store " + storeId + " --> " + value);
		});
	}
}
