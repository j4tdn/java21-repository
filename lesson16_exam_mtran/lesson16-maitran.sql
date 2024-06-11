CREATE DATABASE java21_company_management;

USE java21_company_management;
SET FOREIGN_KEY_CHECKS = 0;

-- create table DEPARTMENT
DROP TABLE IF EXISTS T01_DEPARTMENT;
CREATE TABLE IF NOT EXISTS T01_DEPARTMENT (
   C01_DEPARTMENT_ID INT PRIMARY KEY,
   C01_DEPARTMENT_NAME VARCHAR(255) UNIQUE NOT NULL,
   C01_MANAGER_ID INT NOT NULL
);

-- create table EMPLOYEE
DROP TABLE IF EXISTS T02_EMPLOYEE;
CREATE TABLE IF NOT EXISTS T02_EMPLOYEE (
    C02_EMPLOYEE_ID INT PRIMARY KEY,
    C02_EMPLOYEE_NAME VARCHAR(255) NOT NULL,
    C02_ADDRESS TEXT NOT NULL,
    C02_SALARY DECIMAL(15,2),
    C02_GENDER VARCHAR(10) NOT NULL,
    C02_DOB DATE NOT NULL, 
    C02_JOIN_DATE DATE NOT NULL,
    C02_DEPARTMENT_ID INT NOT NULL,
    C02_SUPERVISOR_ID INT NOT NULL,
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT_ID FOREIGN KEY (C02_DEPARTMENT_ID) REFERENCES T01_DEPARTMENT(C01_DEPARTMENT_ID),
    CONSTRAINT FK_EMPLOYEE_EMPLOYEE_ID FOREIGN KEY (C02_SUPERVISOR_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID)
);

ALTER TABLE T01_DEPARTMENT
ADD CONSTRAINT FK_DEPARTMENT_EMPLOYEE
FOREIGN KEY (C01_MANAGER_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID);


-- create table DEPARTMENT_MANAGER
DROP TABLE IF EXISTS T03_DEPARTMENT_MANAGER;
CREATE TABLE IF NOT EXISTS T03_DEPARTMENT_MANAGER(
	C03_EMPLOYEE_ID INT PRIMARY KEY,
    C03_DEPARTMENT_ID INT NOT NULL,
    C03_START_DATE DATE NOT NULL, 
    CONSTRAINT FK_EMPLOYEE_ID_DEPARTMENT_MANAGER FOREIGN KEY (C03_EMPLOYEE_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID),
	CONSTRAINT FK_DEPARTMENT_ID_DEPARTMENT FOREIGN KEY (C03_DEPARTMENT_ID) REFERENCES T01_DEPARTMENT(C01_DEPARTMENT_ID)
);



-- create table PROJECT
DROP TABLE IF EXISTS T04_PROJECT;
CREATE TABLE IF NOT EXISTS T04_PROJECT (
    C04_PROJECT_ID INT PRIMARY KEY,
    C04_PROJECT_NAME VARCHAR(255) UNIQUE,
    C04_PROJECT_START_DATE DATE NOT NULL,
    C04_PROJECT_END_DATE DATE NOT NULL,
    C04_PROJECT_REVENUE DECIMAL(15, 2) NOT NULL
);

-- create table PROJECT_MANAGER
DROP TABLE IF EXISTS T05_PROJECT_MANAGER;
CREATE TABLE IF NOT EXISTS T05_PROJECT_MANAGER (

      C05_EMPLOYEE_ID INT,
      C05_PROJECT_ID INT,
      PRIMARY KEY (C05_EMPLOYEE_ID, C05_PROJECT_ID),
	  CONSTRAINT FK_EMPLOYEE_ID_PROJECT_MANAGER FOREIGN KEY (C05_EMPLOYEE_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID),
      CONSTRAINT FK_PROJECT_ID_PROJECT FOREIGN KEY (C05_PROJECT_ID) REFERENCES T04_PROJECT(C04_PROJECT_ID)
);


-- create table WORK_HOURS 
DROP TABLE IF EXISTS T06_WORK_HOURS;
CREATE TABLE IF NOT EXISTS T06_WORK_HOURS (
      C06_EMPLOYEE_ID INT,
      C06_PROJECT_ID INT,
      C06_WORKING_HOURS DECIMAL(15,2) NOT NULL,
	  PRIMARY KEY (C06_EMPLOYEE_ID, C06_PROJECT_ID),
      CONSTRAINT FK_EMPLOYEE_ID_WORK_HOURS FOREIGN KEY (C06_EMPLOYEE_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID),
      CONSTRAINT FK_PROJECT_ID_PROJECT_WORK_HOURS FOREIGN KEY (C06_PROJECT_ID) REFERENCES T04_PROJECT(C04_PROJECT_ID)
);
SET FOREIGN_KEY_CHECKS = 1;

-- ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO T01_DEPARTMENT (C01_DEPARTMENT_ID, C01_DEPARTMENT_NAME, C01_MANAGER_ID) VALUES
(1, 'HR', 101),
(2, 'Finance', 102),
(3, 'IT', 103),
(4, 'Marketing', 104),
(5, 'Sales', 105);

SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO T02_EMPLOYEE (C02_EMPLOYEE_ID, C02_EMPLOYEE_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_DOB, C02_JOIN_DATE, C02_DEPARTMENT_ID, C02_SUPERVISOR_ID) VALUES
(101, 'John Doe', '123 Main St', 60000.00, 'Male', '1980-01-15', '2020-01-15', 1, 101),
(102, 'Jane Smith', '456 Elm St', 65000.00, 'Female', '1985-02-20', '2021-02-20', 2, 102),
(103, 'Alice Johnson', '789 Maple St', 70000.00, 'Female', '1990-03-25', '2019-03-25', 3, 103),
(104, 'Bob Brown', '101 Pine St', 55000.00, 'Male', '1982-04-30', '2018-04-30', 4, 104),
(105, 'Charlie Davis', '202 Oak St', 50000.00, 'Male', '1988-05-05', '2022-05-05', 5, 105);

INSERT INTO T03_DEPARTMENT_MANAGER (C03_EMPLOYEE_ID, C03_DEPARTMENT_ID, C03_START_DATE) VALUES
(101, 1, '2020-01-15'),
(102, 2, '2021-02-20'),
(103, 3, '2019-03-25'),
(104, 4, '2018-04-30'),
(105, 5, '2022-05-05');

INSERT INTO T04_PROJECT (C04_PROJECT_ID, C04_PROJECT_NAME, C04_PROJECT_START_DATE, C04_PROJECT_END_DATE, C04_PROJECT_REVENUE) VALUES
(201, 'Project Allpha', '2023-01-01', '2023-06-01', 100000.00),
(202, 'Project Azza', '2023-02-01', '2023-07-01', 150000.00),
(203, 'Project Gabma', '2023-03-01', '2023-08-01', 200000.00),
(204, 'Project Della', '2023-04-01', '2023-09-01', 250000.00),
(205, 'Project Epsislon', '2023-05-01', '2023-10-01', 300000.00);

INSERT INTO T05_PROJECT_MANAGER (C05_EMPLOYEE_ID, C05_PROJECT_ID) VALUES
(101, 201),
(102, 202),
(103, 203),
(104, 204),
(105, 205);

INSERT INTO T06_WORK_HOURS (C06_EMPLOYEE_ID, C06_PROJECT_ID, C06_WORKING_HOURS) VALUES
(101, 201, 120.00),
(102, 202, 130.00),
(103, 203, 140.00),
(104, 204, 150.00),
(105, 205, 160.00);

-- ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

-- Phần C - Thực hiện truy vấn 

-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND

SELECT * FROM T04_PROJECT
	WHERE year(C04_PROJECT_START_DATE) = 2023 ||
		year(C04_PROJECT_END_DATE) = 2023
	AND C04_PROJECT_REVENUE > 100000.00;


-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia

SELECT T02_EMPLOYEE.C02_EMPLOYEE_ID, 
       T02_EMPLOYEE.C02_EMPLOYEE_NAME,
       T06_WORK_HOURS.C06_WORKING_HOURS
       
FROM T02_EMPLOYEE
JOIN T06_WORK_HOURS ON T02_EMPLOYEE.C02_EMPLOYEE_ID = T06_WORK_HOURS.C06_EMPLOYEE_ID
                    WHERE T06_WORK_HOURS.C06_WORKING_HOURS > 100
                    
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó