-- CREATE DATABASE lesson16;
-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS t01_employee;
CREATE TABLE t01_employee (
    t01_employee_id INT PRIMARY KEY,
    t01_name VARCHAR(255) NOT NULL,
    t01_address VARCHAR(255) NOT NULL,
    t01_salary DECIMAL(15, 2),
    t01_gender VARCHAR(50),
    t01_dateofbirth DATE,
    t01_datestartwork DATE,
    t01_department_id INT NOT NULL,
    t01_supervisor INT,
    FOREIGN KEY (t01_department_id) REFERENCES t01_department_id(t02_department_id),
    FOREIGN KEY (t01_supervisor) REFERENCES t01_employee(t01_employee_id)
);

DROP TABLE IF EXISTS t02_department;
CREATE TABLE t02_department (
    t02_department_id INT PRIMARY KEY,
    t02_name VARCHAR(50) UNIQUE NOT NULL,
	t02_employee_id INT NOT NULL,
    t02_manager_id INT NOT NULL,
    
    FOREIGN KEY (t02_manager_id) REFERENCES t01_employee(t01_employee_id),
    FOREIGN KEY (t02_employee_id) REFERENCES t01_employee(t01_employee_id)
);

DROP TABLE IF EXISTS t03_project;
CREATE TABLE t03_project (
    t03_project_id INT PRIMARY KEY,
    t03_name VARCHAR(255) UNIQUE NOT NULL,
    t03_startdate DATE,
    t03_finisheddate DATE,
    t03_revenue DECIMAL(15, 2),
    t03_manager_id INT,
    FOREIGN KEY (t03_manager_id) REFERENCES t01_employee(t01_employee_id)
);

DROP TABLE IF EXISTS t04_projectapp;
CREATE TABLE t04_projectapp (
    t04_project_id INT PRIMARY KEY,
    t04_employee_id INT NOT NULL,
    t04_hourwork FLOAT NOT NULL,
    FOREIGN KEY (t04_employee_id) REFERENCES t01_employee(t01_employee_id),
    FOREIGN KEY (t04_project_id) REFERENCES t03_project(t03_project_id)
);

DROP TABLE IF EXISTS t05_role;
CREATE TABLE t05_role (
    t05_role_id INT PRIMARY KEY,
    t05_name VARCHAR(255) UNIQUE NOT NULL
);

DROP TABLE IF EXISTS t06_employee_role;
CREATE TABLE t06_employee_role (
    t06_employee_id INT PRIMARY KEY,
    t06_role_id INT NOT NULL,
    t06_daterole DATE,
	FOREIGN KEY (t06_employee_id) REFERENCES t01_employee(t01_employee_id),
    FOREIGN KEY (t06_role_id) REFERENCES t05_role(t05_role_id)
);

SET FOREIGN_KEY_CHECKS = 1;