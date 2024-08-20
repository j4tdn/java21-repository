package view;

import static utils.IoUtils.generate;

import service.OrderDetailService;
import service.OrderDetailServiceImpl;

public class Ex04OrderDetailView {
	
	private static OrderDetailService orderDetailService;
	
	static {
		orderDetailService = new OrderDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		final var orderDetails = orderDetailService.getAll();
		
		generate(
			"Câu 4: Liệt kê danh sách chi tiết các đơn hàng", 
			orderDetails);
		
		System.out.println("order --> " + orderDetails.get(4).getOrder());
	}
	
}