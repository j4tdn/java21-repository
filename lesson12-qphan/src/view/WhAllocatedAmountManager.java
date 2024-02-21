package view;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
    	
        // B1
        final Integer whAllocationAmount = 300;

        // B2
        final List<Store> data = DataModel.getItems();
        
        // B3
        Map<Long, Integer> storeAllocatedValues = doAllocation(data, whAllocationAmount);
        
        // B4
        // In kết quả
    }

    /**
     * Do Allocation.
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(List<Store> data, Integer whAllocationAmount) {
        // calculation

        return null;
    }


}
