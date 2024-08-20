package view;

import static utils.IoUtils.generate;

import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeView {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		
		generate("5. Danh sách nhân viên có mức lương cao hơn nhà quản lý là", 
				employeeService.getEmployeesWithSalaryGreaterThanManager());
		
	}
}