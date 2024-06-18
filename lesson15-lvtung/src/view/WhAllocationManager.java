package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static utils.NumberUtils.*;
import bean.Store;
import model.DataModel;
import static utils.StreamUtils.*;

public class WhAllocationManager {
	
	private static RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
	
	public static void main(String[] args) {
		// =================== INPUT ====================

		// số lượng mặt hàng cần chuyển từ kho đến các cửa hàng
		Integer whAllocationAmount = 300;

		// Danh sách các cửa hàng cân nhắc để chuyển hàng đến
		List<Store> stores = DataModel.getStores().stream().filter(Store::getSelected).toList();

		// Step 1: filling in missing "Expected Sales" values
		Map<Long, Integer> storeAllocatedAmounts = new LinkedHashMap<>();
		try {
			storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		storeAllocatedAmounts.forEach((storeId, storeAllocatedAmount) -> {
			System.out.println(storeId + " --> " + storeAllocatedAmount);
		});

	}

	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) throws Exception {

		boolean nonNoexpectedSales = stores.stream().noneMatch(s -> s.getExpectedSales() != null);
		
		if(nonNoexpectedSales) {
			String message = "Expected sales cannot be calculated."
					+ "Please add a reference store or include stores with expected sales for interpolation";
			throw new Exception(message);
		}
		
		System.out.println("Step 1: Filling in missing “Expected Sales” values");
		Map<Long, BigDecimal> interpolatedExpectedSalesMap = fillMissingExpectedSales(stores);

		interpolatedExpectedSalesMap.forEach((storeId, expectedSales) -> {
			System.out.println(storeId + " --> " + expectedSales);
		});
		
		System.out.println("\n======================================\n");
		
		System.out.println("Step 2: Calculation of allocation key");
		
		
		
		return new LinkedHashMap<>();

	}
	
	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores) {
		Map<Long, BigDecimal> interpolatedExpectedSalesMap = new LinkedHashMap<>();

		Map<Long, BigDecimal> initialExpectedSalesMap = toMap(stores, Store::getStoreId, Store::getExpectedSales);

		BigDecimal average = calculateAverage(stores);

		stores.forEach(store -> {
			
			BigDecimal interpolatedExpectedSales = null;

			Long storeId = store.getStoreId();
			BigDecimal expectedSales = store.getExpectedSales();

			if (expectedSales == null) {
				Long refStoreId = store.getReferenceStoreId();
				if (refStoreId == null) {
					// Tính trung bình
					interpolatedExpectedSales = average;
				} else {
					// Lấy expectedSales của refStore
					BigDecimal refStoreExpectedSales = initialExpectedSalesMap.get(refStoreId);

					if (refStoreExpectedSales == null) {
						// tính trung bình
						interpolatedExpectedSales = average;
						
					} else {
						// Dùng expectedSales của refStore
						interpolatedExpectedSales = refStoreExpectedSales;
					}
				}
			} else {
				interpolatedExpectedSales = expectedSales;
			}
			
			interpolatedExpectedSalesMap.put(storeId, interpolatedExpectedSales);
		});
		
		return interpolatedExpectedSalesMap;
	}

	
	private static Map<Long, BigDecimal> calcutateAllocationKeys(Map<Long,BigDecimal> interpolatedExpectedSalesMap) {
		BigDecimal sumOfExpectedSales = interpolatedExpectedSalesMap.values()
				.stream()
				.reduce(bd(0), BigDecimal::add);
				
		return interpolatedExpectedSalesMap.entrySet()
					.stream()
					.collect(Collectors.toMap(
							Entry::getKey, 
							e -> e.getValue().divide(sumOfExpectedSales, 10, ROUNDING_MODE)));
	}
	
	private static BigDecimal calculateAverage(List<Store> stores) {
		List<BigDecimal> nonNullExpectedSales = stores.stream()
				.map(Store::getExpectedSales)
				.filter(expectedSales -> expectedSales != null)
				.toList();
		BigDecimal sum = nonNullExpectedSales.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum.divide(bd(nonNullExpectedSales.size()), 1, RoundingMode.HALF_UP);
	}
}