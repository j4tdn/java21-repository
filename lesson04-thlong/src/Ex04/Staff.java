package Ex04;

import java.time.LocalDate;

public class Staff extends Manager{
	
	private Manager manager;
	
	public Staff() {
	}
	

	public Staff(String name, LocalDate date, float coeSalary, String unitName, Manager manager) {
		super(name, date, coeSalary, unitName);
		this.manager = manager;
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public double salary () {
		return getCoeSalary() * 1250000;
	}


	@Override
	public String toString() {
		return "Nhân viên [Họ và tên=" + getName() + ", Ngày sinh=" + getDate() + ", Hệ số lương=" + getCoeSalary()
				+ ", Tên đơn vị=" + getUnitName() + ", Trưởng phòng=" + manager.getName() + "]";
	}

	
	
}
