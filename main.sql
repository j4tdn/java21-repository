CREATE DATABASE bkit_21_exam_2;

USE bkit_21_exam_2;
-- SET FOREIGN_KEY_CHECKS = 1;
CREATE TABLE t01_department (
    C01_ID INT AUTO_INCREMENT PRIMARY KEY,
    C01_NAME VARCHAR(255) UNIQUE,
    C01_CODE INT UNIQUE
);

DROP TABLE IF EXISTS t02_employee;
CREATE TABLE t02_employee (
	C02_ID INT AUTO_INCREMENT PRIMARY KEY,
    C02_FULL_NAME VARCHAR(255),
    C02_CODE INT UNIQUE,
    C02_ADDRESS VARCHAR(255),
    C02_SALARY FLOAT,
    C02_GENDER BIT(1),
    C02_DOB DATE,
    C02_COMPANY_JOIN_DATE DATE,
    C02_DEPARTMENT_ID INT NOT NULL,
    CONSTRAINT T02_CHECK CHECK (C02_COMPANY_JOIN_DATE > C02_DOB),
    CONSTRAINT FK_DEPARTMENT_T02 FOREIGN KEY (C02_DEPARTMENT_ID) REFERENCES t01_department(C01_ID)
);

CREATE TABLE t03_manage_department (
    C03_DEPARTMENT_ID INT NOT NULL,
    C03_MANAGER_ID INT NOT NULL,
    C03_GAIN_ROLE_DATE DATE, -- ngày nhận chức
    PRIMARY KEY(C03_DEPARTMENT_ID, C03_MANAGER_ID),
    CONSTRAINT FK_DEPARTMENT FOREIGN KEY (C03_DEPARTMENT_ID) REFERENCES t01_department(C01_ID),
    CONSTRAINT FK_MANAGER FOREIGN KEY (C03_MANAGER_ID) REFERENCES t02_employee(C02_ID)
);

CREATE TABLE t04_project (
    C04_ID INT AUTO_INCREMENT PRIMARY KEY,
    C04_NAME VARCHAR(255) NOT NULL,
    C04_CODE INT UNIQUE,
    C04_START_AT DATE,
    C04_END_AT DATE,
    C04_INCOME_OF_PROJECT FLOAT,
    C04_MANAGER_ID INT NOT NULL,
    CONSTRAINT FK_MANAGER_T04 FOREIGN KEY (C04_MANAGER_ID) REFERENCES t02_employee(C02_ID)
);

CREATE TABLE t05_employees_in_project ( -- n-n giữa employee và project
    C05_PROJECT_ID INT NOT NULL,
    C05_MANAGER_ID INT NOT NULL,
    C05_WORKING_TIME INT,
    PRIMARY KEY(C05_PROJECT_ID, C05_MANAGER_ID),
    CONSTRAINT FK_DEPARTMENT_T05 FOREIGN KEY (C05_PROJECT_ID) REFERENCES t04_project(C04_ID),
    CONSTRAINT FK_MANAGER_T05 FOREIGN KEY (C05_MANAGER_ID) REFERENCES t02_employee(C02_ID)
);
------------------------------------------------------------------------------------------------------

-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
FROM t04_project
WHERE (YEAR(C04_START_AT) = 2023 OR YEAR(C04_END_AT) = 2023)
  AND C04_INCOME_OF_PROJECT > 200000; -- Đơn vị VND
 
 
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
--    dự án mà nhân viên tham gia
SELECT e.C02_ID, e.C02_FULL_NAME, p.C04_NAME, ep.C05_WORKING_TIME
FROM t05_employees_in_project ep
JOIN t02_employee e ON ep.C05_MANAGER_ID = e.C02_ID
JOIN t04_project p ON ep.C05_PROJECT_ID = p.C04_ID
WHERE ep.C05_WORKING_TIME > 100;


-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT e.C02_ID, e.C02_FULL_NAME, e.C02_SALARY, 
	   m.C02_FULL_NAME AS Manager_Name, 
       m.C02_SALARY AS Manager_Salary
FROM t05_employees_in_project ep
JOIN t04_project p ON ep.C05_PROJECT_ID = p.C04_ID
JOIN t02_employee e ON ep.C05_MANAGER_ID = e.C02_ID
JOIN t02_employee m ON p.C04_MANAGER_ID = m.C02_ID
WHERE e.C02_SALARY >= m.C02_SALARY;


-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT d.C01_ID, d.C01_NAME, COUNT(e.C02_ID) AS Employee_Count
FROM t01_department d
JOIN t02_employee e ON d.C01_ID = e.C02_DEPARTMENT_ID
GROUP BY d.C01_ID, d.C01_NAME
HAVING COUNT(e.C02_ID) > 2;


-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT C02_ID, C02_FULL_NAME, C02_COMPANY_JOIN_DATE
FROM t02_employee
WHERE DATEDIFF(CURRENT_DATE(), C02_COMPANY_JOIN_DATE) >= 2 * 365; -- ? số năm


-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT e.C02_ID, e.C02_FULL_NAME, d.C01_NAME AS Department_Name, p.C04_NAME AS Project_Name
FROM t03_manage_department md
JOIN t02_employee e ON md.C03_MANAGER_ID = e.C02_ID
JOIN t01_department d ON md.C03_DEPARTMENT_ID = d.C01_ID
JOIN t04_project p ON md.C03_MANAGER_ID = p.C04_MANAGER_ID;


-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
WITH multiple_projects AS (
    SELECT C04_MANAGER_ID
    FROM t04_project
    GROUP BY C04_MANAGER_ID
    HAVING COUNT(*) > 1
)
SELECT e.C02_ID, e.C02_FULL_NAME
FROM t02_employee e
JOIN multiple_projects ON e.C02_ID = multiple_projects.C04_MANAGER_ID;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
CREATE TABLE employee_project_log (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT,
    project_id INT,
    action_desc VARCHAR(255),
    old_working_time INT,
    new_working_time INT,
    action_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TRIGGER insert_employee_to_project
AFTER INSERT ON t05_employees_in_project
FOR EACH ROW
    INSERT INTO employee_project_log (employee_id, project_id, action_desc, action_time)
    VALUES (NEW.C05_MANAGER_ID, NEW.C05_PROJECT_ID, 'join', NOW());


CREATE TRIGGER update_working_time
AFTER UPDATE ON t05_employees_in_project
FOR EACH ROW
    INSERT INTO employee_project_log (employee_id, project_id, action_desc, old_working_time, new_working_time, action_time)
    VALUES (NEW.C05_MANAGER_ID, NEW.C05_PROJECT_ID, 'update', OLD.C05_WORKING_TIME, NEW.C05_WORKING_TIME, NOW());



    