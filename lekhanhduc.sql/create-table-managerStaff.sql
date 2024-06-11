CREATE DATABASE ManagerStaff;

USE ManagerStaff;

-- Tạo bảng department 
CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(255) NOT NULL UNIQUE,
    manager_id INT,
    manager_start_date DATE
);

-- Tạo bảng employee 
CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    salary DECIMAL(10, 2),
    gender CHAR(1),
    birth_date DATE,
    hire_date DATE,
    dept_id INT,
    supervisor_id INT,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id),
    FOREIGN KEY (supervisor_id) REFERENCES employee(employee_id)
);

ALTER TABLE department
ADD FOREIGN KEY (manager_id) REFERENCES employee(employee_id);

-- Tạo bảng project
CREATE TABLE project (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(255) NOT NULL UNIQUE,
    start_date DATE,
    end_date DATE,
    revenue DECIMAL(15, 2),
    manager_id INT,
    FOREIGN KEY (manager_id) REFERENCES employee(employee_id)
);

-- Tạo bảng project_assignment
CREATE TABLE project_assignment (
    project_id INT,
    employee_id INT,
    hours_worked DECIMAL(10, 2),
    PRIMARY KEY (project_id, employee_id),
    FOREIGN KEY (project_id) REFERENCES project(project_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

-- Tạo bảng project_logs
CREATE TABLE project_logs (
    log_id INT PRIMARY KEY AUTO_INCREMENT,
    project_id INT,
    employee_id INT,
    action VARCHAR(50),
    old_hours_worked DECIMAL(10, 2),
    new_hours_worked DECIMAL(10, 2),
    change_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (project_id) REFERENCES project(project_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);