package entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t07_employee")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Employee {

    public static final String PROP_ID = "id";
    public static final String PROP_NAME = "name";
    public static final String PROP_ADDRESS = "address";
    public static final String PROP_PHONE = "phone";
    public static final String PROP_EMAIL = "email";
    public static final String PROP_USERNAME = "username";
    public static final String PROP_PASSWORD = "password";
    public static final String PROP_TITLE = "title";
    public static final String PROP_SALARY = "salary";
    public static final String PROP_MANAGER_ID = "managerId";

    @Id
    @Column(name = "C07_EMPLOYEE_ID", nullable = false)
    private Integer id;

    @Column(name = "C07_EMPLOYEE_NAME", nullable = false)
    private String name;

    @Column(name = "C07_EMPLOYEE_ADDRESS", nullable = false)
    private String address;

    @Column(name = "C07_EMPLOYEE_PHONE", nullable = false)
    private String phone;

    @Column(name = "C07_EMPLOYEE_EMAIL", nullable = false)
    private String email;

    @Column(name = "C07_EMPLOYEE_USERNAME", nullable = false)
    private String username;

    @Column(name = "C07_EMPLOYEE_PASSWORD", nullable = false)
    private String password;

    @Column(name = "C07_TITLE_ID", nullable = false)
    private String title;

    @Column(name = "C07_SALARY", nullable = true)
    private BigDecimal salary;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C07_MANAGER_ID")
    private Manager manager;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", manager=" + manager + "]";
	}   
}