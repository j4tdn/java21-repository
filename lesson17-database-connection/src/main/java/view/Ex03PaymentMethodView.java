package view;

import service.PaymentMethodService;
import service.PaymentMethodServiceImpl;
import static utils.IoUtils.*;

public class Ex03PaymentMethodView {
	
	private static PaymentMethodService paymentMethodService;
	
	static {
		paymentMethodService = new PaymentMethodServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1A. Liệt kê các phương thức thanh toán", paymentMethodService.getAll());
	}
}
