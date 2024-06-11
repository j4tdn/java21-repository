-- Phần C. Thực hiện truy vấn
-- 1: Liệt kê các dự án diễn ra trong năm ? có số tiền thu được trên ? triệu VND
USE managerstaff; 

-- 1: Liệt kê các dự án diễn ra trong năm cụ thể có số tiền thu được trên số triệu VND cụ thể
SET @year = 2023;
SET @revenue_threshold_million = 3; -- triệu VND

SELECT * 
FROM project 
WHERE YEAR(start_date) = @year AND revenue / 1000000 > @revenue_threshold_million;

-- 2: Liệt kê các nhân viên đã tham gia hơn số giờ cụ thể trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SET @min_hours = 300; -- giờ

SELECT e.full_name, p.project_name, pa.hours_worked
FROM project_assignment pa
JOIN employee e ON pa.employee_id = e.employee_id
JOIN project p ON pa.project_id = p.project_id
WHERE pa.hours_worked > @min_hours;

-- 3: Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT e.full_name AS 'Employee', e.salary AS 'Employee Salary', s.full_name AS 'Supervisor', s.salary AS 'Supervisor Salary'
FROM employee e
JOIN employee s ON e.supervisor_id = s.employee_id
WHERE e.salary >= s.salary;

-- 4: Liệt kê các phòng ban có số lượng nhân viên lớn hơn số cụ thể
SET @min_employees = 2;

SELECT d.dept_name, COUNT(e.employee_id) AS num_employees
FROM department d
JOIN employee e ON d.dept_id = e.dept_id
GROUP BY d.dept_name
HAVING num_employees > @min_employees;

-- 5: Liệt kê các nhân viên đã làm việc cho công ty hơn số năm cụ thể
SET @min_years = 5;

SELECT full_name, hire_date
FROM employee
WHERE TIMESTAMPDIFF(YEAR, hire_date, CURDATE()) > @min_years;

-- 6: Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT e.full_name
FROM employee e
WHERE e.employee_id IN (
    SELECT d.manager_id FROM department d
) AND e.employee_id IN (
    SELECT p.manager_id FROM project p);

-- 7: Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT e.full_name, COUNT(p.project_id) AS num_projects
FROM project p
JOIN employee e ON p.manager_id = e.employee_id
GROUP BY e.full_name
HAVING num_projects > 1;

-- 8: Lưu lại thông tin khi nhân viên tham gia vào dự án (log)
