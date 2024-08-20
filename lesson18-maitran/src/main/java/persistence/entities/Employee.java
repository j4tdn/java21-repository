package persistence.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T07_EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "C07_EMPLOYEE_ID")
    private Integer id;

    @Column(name = "C07_EMPLOYEE_NAME")
    private String name;

    @Column(name = "C07_EMPLOYEE_EMAIL")
    private String email;

    @Column(name = "C07_EMPLOYEE_PHONE")
    private String phone;

    @Column(name = "C07_EMPLOYEE_POSITION")
    private String position;

    // Getters, Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // equals, hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
