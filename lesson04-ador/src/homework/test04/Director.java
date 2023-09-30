package homework.test04;

import java.math.BigDecimal;

public class Director extends Personal {
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public Director(String emplName, String emplBrithday, BigDecimal heSoLuong, BigDecimal heSoChucVu) {
		super("Director", emplName, emplBrithday, heSoLuong, heSoChucVu);
	}

	@Override
	public BigDecimal getSalary(BigDecimal salary) {
		return (super.getHeSoLuong().add(super.getHeSoChucVu())).multiply(salary);
	}

}
