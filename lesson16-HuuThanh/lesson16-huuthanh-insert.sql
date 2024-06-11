INSERT INTO t01_department (C01_NAME, C01_CODE) VALUES
('HR', 101),
('Finance', 102),
('IT', 103),
('Marketing', 104),
('Sales', 105),
('Research', 106),
('Customer Service', 107);


INSERT INTO t02_employee (C02_FULL_NAME, C02_CODE, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_DOB, C02_COMPANY_JOIN_DATE, C02_DEPARTMENT_ID) VALUES
('John Doe', 201, '123 Main St', 50000, 1, '1985-01-15', '2010-05-10', 2),
('Jane Smith', 202, '456 Maple Ave', 60000, 0, '1990-02-20', '2015-06-15', 3),
('Alice Johnson', 203, '789 Oak Dr', 55000, 0, '1988-03-25', '2012-07-20', 2),
('Bob Brown', 204, '321 Pine Ln', 53000, 1, '1982-04-30', '2008-08-25', 2),
('Charlie Davis', 205, '654 Cedar St', 58000, 1, '1979-05-10', '2005-09-30', 1),
('Eve White', 206, '987 Birch Rd', 62000, 0, '1992-06-15', '2017-11-05', 1),
('Frank Green', 207, '246 Elm St', 61000, 1, '1983-07-20', '2009-12-10', 4);


INSERT INTO t03_manage_department (C03_DEPARTMENT_ID, C03_MANAGER_ID, C03_GAIN_ROLE_DATE) VALUES
(1, 7, '2015-01-01'),
(2, 4, '2016-02-01'),
(3, 5, '2017-03-01'),
(4, 2, '2018-04-01'),
(5, 4, '2019-05-01'),
(6, 5, '2020-06-01'),
(7, 1, '2021-07-01');


INSERT INTO t04_project (C04_NAME, C04_CODE, C04_START_AT, C04_END_AT, C04_INCOME_OF_PROJECT, C04_MANAGER_ID) VALUES
('Project Alpha', 301, '2022-01-01', '2022-12-31', 100000, 3),
('Project Beta', 302, '2021-02-01', '2021-11-30', 150000, 1),
('Project Gamma', 303, '2023-03-01', '2023-12-31', 200000, 2),
('Project Delta', 304, '2020-04-01', '2020-10-31', 250000, 5),
('Project Epsilon', 305, '2019-05-01', '2019-11-30', 300000, 7),
('Project Zeta', 306, '2023-06-01', '2024-05-31', 350000, 4),
('Project Eta', 307, '2022-07-01', '2023-06-30', 400000, 6);


INSERT INTO t04_project (C04_NAME, C04_CODE, C04_START_AT, C04_END_AT, C04_INCOME_OF_PROJECT, C04_MANAGER_ID) VALUES
('Project A', 1301, '2022-01-01', '2022-12-31', 100000, 3),
('Project B', 1302, '2021-02-01', '2021-11-30', 150000, 3),
('Project C', 1303, '2023-03-01', '2023-12-31', 200000, 2),
('Project D', 1304, '2020-04-01', '2020-10-31', 250000, 2),
('Project E', 1305, '2019-05-01', '2019-11-30', 300000, 3),
('Project H', 1306, '2023-06-01', '2024-05-31', 350000, 4),
('Project KK', 1307, '2022-07-01', '2023-06-30', 400000, 4);


INSERT INTO t05_employees_in_project (C05_PROJECT_ID, C05_MANAGER_ID, C05_WORKING_TIME) VALUES
(1, 3, 120),
(2, 5, 150),
(3, 6, 180),
(4, 7, 160),
(5, 2, 140),
(6, 3, 130),
(7, 4, 170);

