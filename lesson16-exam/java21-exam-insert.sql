SET FOREIGN_KEY_CHECKS = 0;

-- Insert data into T01_DEPARTMENT
INSERT INTO T01_DEPARTMENT (C01_DEPT_ID, C01_DEPT_NAME, C01_MANAGER_ID, C01_MANAGER_START_DATE) 
VALUES
(1, 'HR', 1, '2020-01-15'),
(2, 'Finance', 2, '2019-06-01'),
(3, 'IT', 3, '2018-11-20'),
(4, 'Marketing', 4, '2021-02-10'),
(5, 'Sales', 5, '2017-03-25');

-- Insert data into T02_EMPLOYEE
INSERT INTO T02_EMPLOYEE (C02_EMPLOYEE_ID, C02_EMPLOYEE_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_BIRTH_DATE, C02_JOIN_DATE, C02_DEPT_ID, C02_SUPERVISOR_ID) 
VALUES
(1, 'Alice Smith', '123 Main St', 60000, 'F', '1985-07-19', '2020-01-15', 1, 1),
(2, 'Bob Johnson', '456 Elm St', 75000, 'M', '1980-05-23', '2019-06-01', 2, 2),
(3, 'Carol Williams', '789 Oak St', 85000, 'F', '1975-02-11', '2018-11-20', 3, 3),
(4, 'David Brown', '101 Pine St', 72000, 'M', '1990-09-12', '2021-02-10', 4, 4),
(5, 'Eva Davis', '202 Maple St', 68000, 'F', '1988-03-05', '2017-03-25', 5, 5);

-- Insert data into T03_PROJECT
INSERT INTO T03_PROJECT (C03_PROJECT_ID, C03_PROJECT_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE, C03_PROJECT_MANAGER_ID) 
VALUES
(1, 'Project Alpha', '2021-01-01', '2021-12-31', 1000000.00, 3),
(2, 'Project Beta', '2021-02-15', '2021-11-30', 750000.00, 4),
(3, 'Project Gamma', '2021-03-01', '2021-12-15', 500000.00, 2),
(4, 'Project Delta', '2021-04-10', '2021-10-31', 250000.00, 1),
(5, 'Project Epsilon', '2021-05-01', '2021-12-01', 300000.00, 5);

-- Insert data into T04_JOIN_PROJECT
INSERT INTO T04_JOIN_PROJECT (C04_EMPLOYEE_ID, C04_PROJECT_ID, C04_HOURS_WORKED) 
VALUES
(1, 1, 150.00),
(2, 2, 200.00),
(3, 3, 250.00),
(4, 4, 180.00),
(5, 5, 220.00),
(1, 2, 120.00),
(2, 3, 130.00),
(3, 4, 140.00),
(4, 5, 160.00),
(5, 1, 170.00);

SET FOREIGN_KEY_CHECKS = 1;