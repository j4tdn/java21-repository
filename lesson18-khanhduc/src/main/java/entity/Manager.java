package entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t16_manager")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Manager {
	
	@Id
	@Column(name = "C16_MANAGER_ID")
	private Integer id;
	
	@Column(name = "C16_MANAGER_NAME")
	private String name;
	
	@Column(name = "C16_MANAGER_PHONE")
	private String phone;
	
	@Column(name = "C16_MANAGER_EMAIL")
	private String email;
	
	@Column(name = "C16_SALARY")
	private BigDecimal salary;
	
	@OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
	private Set<Employee> employees = new HashSet<>();
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", salary=" + salary + "]";
	}
}