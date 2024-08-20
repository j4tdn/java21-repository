package view;

import service.PaymentMethodService;
import service.PaymentMethodServiceImpl;
import static utils.IoUtils.*;

public class Ex06PaymentMethodView {
	
	private static PaymentMethodService paymentMethodService;
	
	static {
		paymentMethodService = new PaymentMethodServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1. All Payment Method -->", paymentMethodService.getAll());
	}
	
}
