package service;

import model.Item;
import model.Order;
import model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

// Tương tự, class name pattern
// khó phân biệt được đầu là cha, con, declaration, implementation

// service ko làm nhiệm vụ của dao truy vấn DB
public class InventoryService implements InventoryServiceInterface {

    private EntityManagerFactory emf;
    private EntityManager entityManager;

    public InventoryService() {
        this.emf = Persistence.createEntityManagerFactory("PU_NAME");
        this.entityManager = emf.createEntityManager();
    }

   
    @Override
    public List<Item> getItemsSoldOnDate(Date date) {
    	// câu 1: sai yêu cầu
        return entityManager.createQuery("SELECT i FROM Item i ORDER BY i.id ASC", Item.class)
                .getResultList();
    }



    
    // 2
    @Override
    public double getTotalRevenueOnDate(Date date) {
        Double totalRevenue = entityManager.createQuery(
                "SELECT SUM(i.price) FROM Item i WHERE FUNCTION('DATE', i.soldDate) = :date", 
                Double.class)
                .setParameter("date", date)
                .getSingleResult();
        
        System.out.println("Total Revenue on " + date + ": " + (totalRevenue != null ? totalRevenue : 0.0));
        return totalRevenue != null ? totalRevenue : 0.0;
    }

    @Override
    public List<Employee> getEmployeesWithHigherSalary() {
        return entityManager.createQuery(
            "SELECT e1 FROM Employee e1 WHERE e1.salary > (SELECT AVG(e2.salary) FROM Employee e2)",
            Employee.class)
            .getResultList();
    }

  

   
    @Override
    public List<Order> getTopItemsSoldInYear(int year) {
        return entityManager.createQuery(
            "SELECT o FROM Order o WHERE YEAR(o.orderTime) = :year ORDER BY o.totalMoney DESC",
            Order.class)
            .setParameter("year", year)
            .setMaxResults(10)  // Giới hạn số lượng kết quả
            .getResultList();
    }

    
    
    

     @Override
    public void close() {
        entityManager.close();
        emf.close();
    }

   
}
