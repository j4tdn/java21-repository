package view;

import static utils.NumberUtils.bd;
import static utils.StreamUtils.toList;
import static utils.StreamUtils.toMap;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Store;
import model.DataModel;

public class WhAllocationManager {

	private static RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
	
	public static void main(String[] args) {
		
		// ================== INPUT =======================
		// Số lượng mặt hàng cần chuyển từ kho đến các cửa hàng
		Integer whAllocationAmount = 300;
		
		// Danh sách các cửa hàng cân nhắc để chuyển hàng đến
		List<Store> stores = DataModel.getStores()
				.stream()
				.filter(s -> s.getSelected())
				.toList();
		
		Map<Long, BigDecimal> storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);
		storeAllocatedAmounts.forEach((storeId, storeAllocatedAmount) ->{
			System.out.println(storeId + " --> " + storeAllocatedAmount);
		});
	}
	
	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores){
		
		// Step One: Filling in missing “Expected Sales” values
		Map<Long, BigDecimal> map = fillMissingExpectedSales(stores);
		
		
		return null;

	}
	
	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores){
		Map<Long, BigDecimal> interpolatedExpectedSalesMap = new LinkedHashMap<>();
		
		Map<Long, BigDecimal> initialExpectedSalesMap = toMap(stores, Store::getStoreId, Store::getExpectedSales);
		
		// Average of store's expected sales with it's own data
		
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
						// Tính trung bình
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
	
	private static BigDecimal calculateAverage(List<Store> stores) {
		List<BigDecimal> nonNullExpectedSales = toList(stores, Store::getExpectedSales, 
				expectedSales -> expectedSales != null);
		
		BigDecimal sum = nonNullExpectedSales.stream()
		     .reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return sum.divide(bd(nonNullExpectedSales.size()), 1, ROUNDING_MODE);
		
	}
}
