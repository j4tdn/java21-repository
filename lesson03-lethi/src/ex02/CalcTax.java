package ex02;

public class CalcTax {

	public static double tax(Vehicle vehicle) {
		
		if(vehicle.getDungTich() < 100) {
			return 0.01 * vehicle.getTriGia();
		}else if(vehicle.getDungTich() <= 200) {
			return 0.03 * vehicle.getTriGia();
		}else {
			return 0.05 * vehicle.getTriGia();
		}
	}
	
}
