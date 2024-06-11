USE managerstaff ;

INSERT INTO department (dept_id, dept_name, manager_id, manager_start_date)
VALUES (1, 'HR', NULL, '2023-01-15'),
       (2, 'Finance', NULL, '2022-03-01'),
       (3, 'IT', NULL, '2021-12-10'),
       (4, 'Marketing', NULL, '2020-06-25'),
       (5, 'Operations', NULL, '2019-11-05');


INSERT INTO employee (employee_id, full_name, address, salary, gender, birth_date, hire_date, dept_id, supervisor_id)
VALUES (1, 'John Doe', '123 Main St', 80000, 'M', '1985-07-20', '2010-05-10', 1, NULL),
       (2, 'Jane Smith', '456 Side Ave', 85000, 'F', '1988-11-25', '2012-03-15', 2, 1),
       (3, 'Alice Johnson', '789 Down St', 75000, 'F', '1991-03-12', '2015-08-01', 3, 1),
       (4, 'Bob Brown', '321 West St', 70000, 'M', '1979-06-30', '2008-02-18', 4, 2),
       (5, 'Charlie Green', '654 Up Ave', 95000, 'M', '1975-09-03', '2000-01-01', 5, 3);


UPDATE department SET manager_id = 1 WHERE dept_id = 1;
UPDATE department SET manager_id = 2 WHERE dept_id = 2;
UPDATE department SET manager_id = 3 WHERE dept_id = 3;
UPDATE department SET manager_id = 4 WHERE dept_id = 4;
UPDATE department SET manager_id = 5 WHERE dept_id = 5;


INSERT INTO project (project_id, project_name, start_date, end_date, revenue, manager_id)
VALUES (1, 'Project A', '2023-01-01', '2023-06-01', 5000000, 1),
       (2, 'Project B', '2022-04-01', '2022-12-01', 10000000, 2),
       (3, 'Project C', '2021-09-01', '2022-03-01', 3000000, 3),
       (4, 'Project D', '2023-03-10', '2023-11-10', 8000000, 4),
       (5, 'Project E', '2020-06-01', '2021-01-01', 2500000, 5);


INSERT INTO project_assignment (project_id, employee_id, hours_worked)
VALUES (1, 1, 120),
       (1, 2, 80),
       (2, 2, 100),
       (2, 3, 70),
       (3, 3, 90),
       (3, 4, 60),
       (4, 4, 110),
       (4, 5, 150),
       (5, 1, 130),
       (5, 3, 70);