package model;

import javax.persistence.*;

@Entity
@Table(name = "t07_employee")
public class Employee {

    @Id
    @Column(name = "C07_EMPLOYEE_ID")
    private Long id;

    @Column(name = "C07_EMPLOYEE_NAME")
    private String name;

    @Column(name = "C07_EMPLOYEE_SALARY")
    private Double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
