-- Đề bài: 
-- Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan tới nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban có một tên duy nhất, một mã
-- số duy nhất, một nhân viên, người quản lý cụ thể quản lý phòng đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.

-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
CREATE DATABASE lesson16_exam_company_manager;

CREATE TABLE T02_DEPARTMENT(
	C01_DEPARTMENT_ID INT PRIMARY KEY,
    C02_DEPARTMENT_NAME VARCHAR(255) NOT NULL,
    C03_MANAGER_ID INT NOT NULL,
    C04_START_DATE DATE NOT NULL,
    CONSTRAINT UNQ_DEPARTMENT_NAME UNIQUE(C02_DEPARTMENT_NAME)
    
);

CREATE TABLE T01_EMPLOYEE(
	C01_EMPLOYEE_ID INT PRIMARY KEY,
    C02_EMPLOYEE_NAME VARCHAR(200) NOT NULL,
    C03_EMPLOYEE_ADDRESS VARCHAR(200) NOT NULL,
    C04_EMPLOYEE_SALARY DECIMAL(18,2),
    C05_EMPLOYEE_GENDER BIT(1) NOT NULL,
    C05_BIRTH_DATE DATE NOT NULL,
    C06_HIRE_DATE DATE NOT NULL,
    C07_SUPERVISOR_ID INT NOT NULL,
    C08_DEPARTMENT_ID INT NOT NULL,
    CONSTRAINT FK_EMPLOYEE_EMPLOYEE FOREIGN KEY (C07_SUPERVISOR_ID) REFERENCES T01_EMPLOYEE(C01_EMPLOYEE_ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY (C08_DEPARTMENT_ID) REFERENCES T02_DEPARTMENT(C01_DEPARTMENT_ID)
);

ALTER TABLE t02_department
ADD CONSTRAINT FK_DEPARTMENT_EMPLOYEE FOREIGN KEY (C03_MANAGER_ID) REFERENCES T01_EMPLOYEE(C01_EMPLOYEE_ID);

CREATE TABLE T03_PROJECT(
	C01_PROJECT_ID INT PRIMARY KEY,
    C02_PROJECT_NAME VARCHAR(200) NOT NULL,
    C03_START_DATE DATE NOT NULL,
    C04_END_DATE DATE NOT NULL,
    C05_REVENUE DECIMAL(18,2) NOT NULL,
    C05_MANAGER_ID INT NOT NULL,
    CONSTRAINT UNQ_PROJECT_NAME UNIQUE(C02_PROJECT_NAME),
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (C05_MANAGER_ID) REFERENCES T01_EMPLOYEE(C01_EMPLOYEE_ID)
);

CREATE TABLE T04_PARTICIPATION(
	C01_PARTICIPATION_ID INT PRIMARY KEY,
    C02_PROJECT_ID INT NOT NULL,
    C03_EMPLOYEE_ID INT NOT NULL,
    C04_WORKING_HOURS INT NOT NULL,
    CONSTRAINT UNQ_PROJECT_EMPLOYEE UNIQUE(C02_PROJECT_ID, C03_EMPLOYEE_ID),
    CONSTRAINT FK_PARTICIPATION_PROJECT FOREIGN KEY (C02_PROJECT_ID) REFERENCES T03_PROJECT(C01_PROJECT_ID),
    CONSTRAINT FK_PARTICIPATION_EMPLOYEE FOREIGN KEY (C03_EMPLOYEE_ID) REFERENCES T01_EMPLOYEE(C01_EMPLOYEE_ID)
);

-- 
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO t02_department(C01_DEPARTMENT_ID, C02_DEPARTMENT_NAME, C03_MANAGER_ID, C04_START_DATE)
VALUES
	(1, 'IT Department', 1, str_to_date('01.01.2023', '%d.%m.%Y')),
	(2, 'Sales Department', 2, str_to_date('01.02.2023', '%d.%m.%Y')),
	(3, 'Marketing Department', 3, str_to_date('01.03.2023', '%d.%m.%Y')),
	(4, 'HR Department', 4, str_to_date('01.04.2023', '%d.%m.%Y')),
	(5, 'Finance Department', 5, str_to_date('01.05.2023', '%d.%m.%Y'));

INSERT INTO t01_employee (C01_EMPLOYEE_ID, C02_EMPLOYEE_NAME, C03_EMPLOYEE_ADDRESS, C04_EMPLOYEE_SALARY, C05_EMPLOYEE_GENDER, C05_BIRTH_DATE, C06_HIRE_DATE, C07_SUPERVISOR_ID, C08_DEPARTMENT_ID) 
VALUES
(1, 'Nguyen Van A', 'Hanoi', 10000000, 1, str_to_date('01.01.1980', '%d.%m.%Y'), str_to_date('01.01.2010', '%d.%m.%Y'), 1, 1),
(2, 'Tran Thi B', 'Haiphong', 15000000, 0, str_to_date('02.02.1985', '%d.%m.%Y'), str_to_date('02.02.2012', '%d.%m.%Y'), 1, 2),
(3, 'Le Van C', 'Danang', 20000000, 1, str_to_date('03.03.1990', '%d.%m.%Y'), str_to_date('03.03.2014', '%d.%m.%Y'), 2, 3),
(4, 'Pham Thi D', 'Cantho', 25000000, 0, str_to_date('04.04.1995', '%d.%m.%Y'), str_to_date('04.04.2016', '%d.%m.%Y'), 3, 4),
(5, 'Hoang Van E', 'HCMC', 30000000, 1, str_to_date('05.05.2000', '%d.%m.%Y'), str_to_date('05.05.2018', '%d.%m.%Y'), 4, 5);

INSERT INTO t03_project(C01_PROJECT_ID, C02_PROJECT_NAME, C03_START_DATE, C04_END_DATE, C05_REVENUE, C05_MANAGER_ID)
VALUES
(1, 'Project A', str_to_date('01.01.2023', '%d.%m.%Y'), str_to_date('01.06.2023', '%d.%m.%Y'), 100000000, 1),
(2, 'Project B', str_to_date('01.02.2023', '%d.%m.%Y'), str_to_date('01.07.2023', '%d.%m.%Y'), 200000000, 2),
(3, 'Project C', str_to_date('01.03.2023', '%d.%m.%Y'), str_to_date('01.08.2023', '%d.%m.%Y'), 300000000, 3),
(4, 'Project D', str_to_date('01.04.2023', '%d.%m.%Y'), str_to_date('01.09.2023', '%d.%m.%Y'), 400000000, 4),
(5, 'Project E', str_to_date('01.05.2023', '%d.%m.%Y'), str_to_date('01.10.2023', '%d.%m.%Y'), 500000000, 5);

INSERT INTO t04_participation
VALUES
(1, 1, 1, 1),
(2, 2, 2, 5),
(3, 3, 3, 3),
(4, 4, 4, 4),
(5, 5, 5, 2);

-- 

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * FROM t03_project t3
WHERE YEAR(t3.C03_START_DATE) = 2023 AND t3.C05_REVENUE > 300000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT t1.C02_EMPLOYEE_NAME, t3.C02_PROJECT_NAME, t4.C04_WORKING_HOURS
FROM t01_employee t1
JOIN t04_participation t4 ON t1.C01_EMPLOYEE_ID = t4.C03_EMPLOYEE_ID
JOIN t03_project t3 ON t3.C01_PROJECT_ID = t4.C02_PROJECT_ID
WHERE t4.C04_WORKING_HOURS > 1;
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT t1.C02_EMPLOYEE_NAME AS Employee, t2.C02_EMPLOYEE_NAME AS Supervisor, t1.C04_EMPLOYEE_SALARY, t2.C04_EMPLOYEE_SALARY
FROM t01_employee t1
JOIN t01_employee t2 ON t1.C07_SUPERVISOR_ID = t2.C01_EMPLOYEE_ID
WHERE t1.C04_EMPLOYEE_SALARY >= t2.C04_EMPLOYEE_SALARY;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT t2.C02_DEPARTMENT_NAME AS DepartmentName, COUNT(t1.C01_EMPLOYEE_ID) AS EmployeeCount
FROM t02_department t2
JOIN t01_employee t1 ON t2.C01_DEPARTMENT_ID = t1.C08_DEPARTMENT_ID
GROUP BY t2.C02_DEPARTMENT_NAME
HAVING COUNT(t1.C01_EMPLOYEE_ID) > 0;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT t1.C02_EMPLOYEE_NAME, t1.C06_HIRE_DATE
FROM t01_employee t1
WHERE DATEDIFF(CURRENT_DATE(), t1.C06_HIRE_DATE) >= 2 * 365;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT t1.C02_EMPLOYEE_NAME
FROM t01_employee t1
JOIN t02_department t2 ON t1.C01_EMPLOYEE_ID = t2.C03_MANAGER_ID
JOIN t03_project t3 ON t1.C01_EMPLOYEE_ID = t3.C05_MANAGER_ID;
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT t1.C02_EMPLOYEE_NAME, COUNT(t3.C01_PROJECT_ID) AS ManagedProjects
FROM t01_employee t1
JOIN t03_project t3 ON t1.C01_EMPLOYEE_ID = t3.C05_MANAGER_ID
GROUP BY t1.C02_EMPLOYEE_NAME
HAVING COUNT(t3.C01_PROJECT_ID) > 0;
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

CREATE TABLE ParticipationLog (
    LogID INT PRIMARY KEY AUTO_INCREMENT,
    EmployeeID INT,
    ProjectID INT,
    ParticipationTime DATETIME,
    Hours INT,
    LogType NVARCHAR(10), -- 'PARTICIPATION' or 'UPDATE'
    OldHours INT,
    NewHours INT,
    FOREIGN KEY (EmployeeID) REFERENCES t01_employee(C01_EMPLOYEE_ID),
    FOREIGN KEY (ProjectID) REFERENCES t03_project(C01_PROJECT_ID)
);