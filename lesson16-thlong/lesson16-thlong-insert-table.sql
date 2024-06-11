-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

INSERT INTO t01_employee (t01_employee_id, t01_name, t01_address, t01_salary, t01_gender, t01_dateofbirth, t01_datestartwork, t01_department_id, t01_supervisor)
VALUES
(1, 'Hoang Long', '123 Le Loi', 50000.00, 'Nam', '1980-01-01', '2020-01-01', 1, 2),
(2, 'Le Phong', '456 Le Do', 60000.00, 'Nam', '1985-05-15', '2019-01-01', 3, 1),
(3, 'Hoang Khoa', '789 Van Cao', 55000.00, 'Nam', '1990-08-20', '2021-01-01', 1, 1),
(4, 'Le Loi', '101 Ha Dong', 52000.00, 'Nữ', '1982-11-30', '2018-01-01', 2, 4),
(5, 'Van Thanh', '202 Vinh Bac', 58000.00, 'Nam', '1988-04-10', '2020-01-01', 3, 1),
(6, 'Van Dung', '2025 Vinh Bac', 55000.00, 'Nam', '1988-04-10', '2017-09-01', 4, 1),
(7, 'Van Long', '201 Vinh Bac', 56000.00, 'Nam', '1988-04-10', '2012-07-01', 5, 2),
(8, 'Van Cao', '6902 Vinh Bac', 56000.00, 'Nam', '1988-04-10', '2012-07-01', 6, 1),
(9, 'Van Hoi', '22 Vinh Bac', 56000.00, 'Nữ', '1988-04-10', '2012-07-01', 7, 1),
(10, 'Thi Hoa', '102 Vinh Bac', 36000.00, 'Nữ', '1988-04-10', '2016-03-01', 8, 1);

INSERT INTO t02_department (t02_department_id, t02_name, t02_employee_id, t02_manager_id)
VALUES
(1, 'Sale', 3, 1),
(2, 'Marketing', 4, 2),
(3, 'Finance', 5, 2),
(4, 'IT', 6, 1),
(5, 'HR', 7, 1),
(6, 'CSKH', 8, 1),
(7, 'IT System', 9, 2),
(8, 'IT Helpdesk', 10, 2);

INSERT INTO t03_project (t03_project_id, t03_name, t03_startdate, t03_finisheddate, t03_revenue, t03_manager_id)
VALUES
-- (1, 'Project 1', '2023-01-01', '2023-06-30', 10000000, 1),
-- (2, 'Project 2', '2022-07-01', '2022-12-31', 80000000, 2),
-- (3, 'Project 3', '2023-03-15', '2023-09-30', 150000000, 3),
-- (4, 'Project 4', '2022-12-15', '2023-06-15', 9000000, 4),
-- (5, 'Project 5', '2023-04-01', '2023-11-30', 110000000, 5),
(6, 'Project 6', '2023-04-01', '2023-11-30', 110000000, 2);

INSERT INTO t04_projectapp (t04_project_id, t04_employee_id, t04_hourwork)
VALUES
(1, 6, 100),
(2, 6, 120),
(3, 7, 80),
(4, 8, 90),
(5, 7, 110);

INSERT INTO t05_role (t05_role_id, t05_name)
VALUES
(1, 'Manager'),
(2, 'Developer'),
(3, 'Tester'),
(4, 'Supervisor'),
(5, 'Designer');

INSERT INTO t06_employee_role (t06_employee_id, t06_role_id, t06_daterole)
VALUES
(1, 1, '2021-09-23'),
(2, 4, '2020-08-15'),
(3, 2, '2019-05-10'),
(4, 2, '2016-04-09'),
(5, 2, '2023-11-02');
delete from t01_employee