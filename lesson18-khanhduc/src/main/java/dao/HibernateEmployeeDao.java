package dao;

import java.util.List;
import entity.Employee;
import utils.GenericDao;
import static constant.QueryConstants.*;

public class HibernateEmployeeDao extends GenericDao implements EmployeeDao {
    
    @Override
    public List<Employee> getEmployeesWithSalaryGreaterThanManager() {
    	    return openSession()
    	        .createQuery(GET_EMPLOYEE_WITH_SALARY_GREATER_THAN_MANAGER, Employee.class)
    	        .getResultList();
    	}
}