package view;

import service.OrderDetailService;
import service.OrderDetailServiceIplm;
import utils.IoUtils;

public class OrderDetailView {
	
	private static OrderDetailService orderDetailService;
	
	static {
		orderDetailService = new OrderDetailServiceIplm();
	}
	
	public static void main(String[] args) {
		
		IoUtils.generate("Câu 4: Liệt kê danh sách chi tiết đơn hàng",
				orderDetailService.getAll());
	}
}
