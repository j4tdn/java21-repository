package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.xml.catalog.Catalog;

import bean.Store;
import model.DataModel;

/**
 	Đọc đề, load dữ liệu cần thiến từ package model.DataModel
 	
 	Bổ sung nếu thông tin chưa có
		
	Thực hiện các bước tính toán theo đề bài và trả về kết quả
		
	Yêu cầu: In thông tin chi tiết kết quả cho từng bước tính toán
 */
		
public class WhAllocatedAmountManager {
    public static void main(String[] args) {
    	
        // B1 Dữ liệu vào
        final Integer whAllocationAmount = 300;

        // B2 
        final List<Store> selectedStores = DataModel.getStores().stream()
        														.filter(s -> s.getSelected())
        														.toList();
        // test null expect sale
        boolean isAllNonNull = isAllNullExpectSale(selectedStores);
        if(!isAllNonNull) {
        	System.out.println("Stop calculation");
        	System.out.println("Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
        	throw new IllegalArgumentException();
        }
        
        // B3 : Tính toán
        Map<Long, Integer> storeAllocatedValues = doAllocation(selectedStores, whAllocationAmount);
        
        // B4
        // In kết quả
//        storeAllocatedValues.entrySet().stream().forEach(System.out::println);
       System.out.println("finish");
    }
    
    private static boolean isAllNullExpectSale(List<Store> stores) {
    	for(Store store : stores) {
    		if(store.getExpectedSales()!=null) {
    			return true;
    		}else {
    			continue;
    		}
    	}
    	return false;
    }

    /**
     * Do Allocation.
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(List<Store> stores, Integer whAllocationAmount) {
        // calculation
    	// Step One: Filling in missing “Expected Sales” values
    	Map<Long, BigDecimal> interpolatedExpectedSales = fillMissingExpectedSales(stores);
    	
    	// Step Two: Calculate Allocation Key
    	StoreParamDto<BigDecimal> interpolatedSales = new StoreParamDto<>(interpolatedExpectedSales, BigDecimal.ZERO, BigDecimal::add);
    	Map<Long, BigDecimal> allocationKeyMap = calculateAlloKey(interpolatedSales);
    	
    	// Step Three: Calculation of “Amount Allocated”
    	Map<Long, BigDecimal> stockPreviousDayMap = stores.stream().collect(Collectors.toMap(Store::getStoreId, Store::getStockPreviousDay));
    	StoreParamDto<BigDecimal> stockPreviousDay = new StoreParamDto<>(stockPreviousDayMap, BigDecimal.ZERO, BigDecimal::add);
    	Map<Long, Integer> allocatedAmountMap = calculateAlloAmount(allocationKeyMap, whAllocationAmount, stockPreviousDay);
        
    	// Step 4:Fix rounding issue
    	Map<Long, Integer> fixAllocatedAmountMap = fixRoundingIssue(whAllocationAmount,interpolatedExpectedSales, stockPreviousDayMap, allocatedAmountMap);
    	
    	return fixAllocatedAmountMap;
    }
    

	

	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores){
    	Map<Long, BigDecimal> resultMap = new HashMap<>();
    	
    	List<Store> valueOwnSalesNonNulls = stores.stream().filter(store -> store.getExpectedSales() != null)
    											 .toList();
    	
    	List<BigDecimal> valueOwnSales = valueOwnSalesNonNulls.stream()						  
    										   .map(Store::getExpectedSales)
    										   .toList();
    	
    	BigDecimal averageOwnSales = avgExpectedSalesMap(valueOwnSales);
    	
    	Map<Long, BigDecimal> expectedSalesMap = valueOwnSalesNonNulls.stream()
    												   .collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));
    	for(Store store : stores) {
    		BigDecimal expectSales = store.getExpectedSales();
    		BigDecimal adaptExpectSale = null;
    		if(expectSales != null) {
    			adaptExpectSale = store.getExpectedSales();
    		}else {
    				Long referId = store.getReferenceStoreId();
    				BigDecimal referExpectedSales = expectedSalesMap.get(referId);
    			if(referId!=null && referExpectedSales!=null) {
    				adaptExpectSale = referExpectedSales;			
    			}else {
    				// average
    				adaptExpectSale = averageOwnSales;
    			}
    		}
    		
    		resultMap.put(store.getStoreId(), adaptExpectSale);
    	}
    	return resultMap;
    }
    
    
    private static Map<Long, BigDecimal> calculateAlloKey(StoreParamDto<BigDecimal> interpolatedSales){	
    	BigDecimal sum = interpolatedSales.getSum();
    	return interpolatedSales.getStoreParams().stream().collect(Collectors.toMap(Entry::getKey, e -> e.getValue().divide(sum, 10, RoundingMode.HALF_UP) ));
    }
    
    private static Map<Long, Integer> calculateAlloAmount(Map<Long, BigDecimal> allocationKeyMap,
			Integer whAllocationAmount, StoreParamDto<BigDecimal> stockPreviousDay) {
		
		return allocationKeyMap.entrySet().stream().collect(Collectors.toMap(Entry::getKey, e -> {
			BigDecimal allocationKey = e.getValue();
			BigDecimal sumStock = stockPreviousDay.getSum();
			BigDecimal stockPrevious = stockPreviousDay.getStoreParam(e.getKey());
			
			return Math.max(allocationKey.multiply(bd(whAllocationAmount).add(sumStock))
								.subtract(stockPrevious)
								.setScale(0, RoundingMode.HALF_UP).intValue(), 0);
		}));
	}
    
    
    private static BigDecimal bd(long value) {
    	return BigDecimal.valueOf(value);
    }
    
    private static BigDecimal avgExpectedSalesMap(List<BigDecimal> valueOwnSales) {
    	BigDecimal sum = valueOwnSales.stream().reduce(bd(0), (a,b)->a.add(b));
    	BigDecimal averageOwnSales = sum.divide(bd(valueOwnSales.size()), 1, RoundingMode.HALF_UP);
    	return averageOwnSales;
    }
    
    private static Map<Long, Integer> fixRoundingIssue(Integer whAllocationAmount,
			Map<Long, BigDecimal> interpolatedExpectedSales, Map<Long, BigDecimal> stockPreviousDayMap,
			Map<Long, Integer> allocatedAmountMap) {
		
    	Map<Long, Integer> fixedAllocatedAmountMap = new HashMap<>(allocatedAmountMap);
    	StoreParamDto<Integer> allocatedAmount = new StoreParamDto<>(allocatedAmountMap, 0, Integer::sum);
    	Integer sumAllocatedAmount = allocatedAmount.getSum();
    	
    	if(sumAllocatedAmount!=whAllocationAmount) {
    		Map<Long, Integer> demandMap = calculateDemand(stockPreviousDayMap, interpolatedExpectedSales);
    		
    		if(sumAllocatedAmount > whAllocationAmount) {
    			while(sumAllocatedAmount != whAllocationAmount) {
    				fixRoundingBiggest(demandMap, fixedAllocatedAmountMap, interpolatedExpectedSales);
    				sumAllocatedAmount-=1;
    			}
    			
    		}else {
    			while(sumAllocatedAmount != whAllocationAmount) {
    				fixRoundingSmallest(demandMap, fixedAllocatedAmountMap, interpolatedExpectedSales);
    				sumAllocatedAmount+=1;
    			}
    		}
    	}
    	
		return fixedAllocatedAmountMap;
	}

	private static void fixRoundingSmallest(Map<Long, Integer> demandMap, Map<Long, Integer> fixedAllocatedAmountMap,
			Map<Long, BigDecimal> interpolatedExpectedSales) {
		// TODO Auto-generated method stub
		
	}

	private static void fixRoundingBiggest(Map<Long, Integer> demandMap, Map<Long, Integer> fixedAllocatedAmountMap,
			Map<Long, BigDecimal> interpolatedExpectedSales) {
		// TODO Auto-generated method stub
		
	}

	private static Map<Long, Integer> calculateDemand(Map<Long, BigDecimal> stockPreviousDayMap,
			Map<Long, BigDecimal> interpolatedExpectedSales) {
		// TODO Auto-generated method stub
		return null;
	}
    
    

    
}