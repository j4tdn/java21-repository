package dao;

import java.util.List;

import entity.Employee;

public interface EmployeeDao {
	
	List<Employee> getEmployeesWithSalaryGreaterThanManager();
	
}