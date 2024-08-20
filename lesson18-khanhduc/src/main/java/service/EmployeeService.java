package service;

import java.util.List;

import entity.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployeesWithSalaryGreaterThanManager();
}