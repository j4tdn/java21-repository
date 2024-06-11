-- Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan tới nhân viên,
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
CREATE DATABASE lesson16_exam CHAR SET utf8mb4;

DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE DEPARTMENT
(
	ID INT,
    NAME VARCHAR(150) NOT NULL,
    PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE
(
	ID INT,
    NAME VARCHAR(100) NOT NULL,
    ADDRESS VARCHAR(100) NOT NULL,
    SALARY FLOAT NOT NULL,
    GENDER VARCHAR(10) NOT NULL,
    DAY_OF_BIRTH date NOT NULL,
    START_DATE DATE NOT NULL,
    DEPARTMENT_ID INT,
    PRIMARY KEY (ID),
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT CK_GENDER CHECK (GENDER IN ('Nam', 'Nữ'))
);

DROP TABLE IF EXISTS PROJECT;
CREATE TABLE PROJECT
(
	ID INT,
    NAME VARCHAR(100) NOT NULL,
    START_DATE DATE NOT NULL,
    END_DATE DATE NOT NULL,
    REVENUE FLOAT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID)
);

DROP TABLE IF EXISTS PROJECT_TEAM_MEMBER;
CREATE TABLE PROJECT_TEAM_MEMBER
(
	ID INT,
    PROJECT_ID INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    CONTROLER_ID INT NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_PROJECT_TEAM_MEMBER_PROJECT FOREIGN KEY(PROJECT_ID) REFERENCES PROJECT(ID),
    CONSTRAINT FK_PROJECT_TEAM_MEMBER_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_PROJECT_TEAM_MEMBER_EMPLOYEE_CONTROLER FOREIGN KEY(CONTROLER_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT UNQ_EMPLOYEE UNIQUE(EMPLOYEE_ID, PROJECT_ID)
);

DROP TABLE IF EXISTS MANAGER;
CREATE TABLE MANAGER
(
	ID INT,
    EMPLOYEE_ID INT NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    SWEARING_IN_DAY DATE NOT NULL,
    PRIMARY KEY (ID),
    CONSTRAINT FK_MANAGER_EMPLOYEE FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEE(ID),
    CONSTRAINT FK_MANAGER_DEAPARTMENT FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(ID),
    CONSTRAINT UNQ_DEPARTMENT UNIQUE(DEPARTMENT_ID)
);


-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
--
INSERT INTO DEPARTMENT(ID, `NAME`)
VALUES(1, 'Phòng nhân sự'),
	  (2, 'Phòng bán hàng'),
      (3, 'Phòng giao hàng'),
      (4, 'Phòng giám sát'),
      (5, 'Phòng quảng cáo');
      
      INSERT INTO EMPLOYEE(ID,`NAME`, ADDRESS, SALARY, GENDER, DAY_OF_BIRTH, START_DATE, DEPARTMENT_ID)
VALUES 	(1,	'Nhân viên A',	'HCM',	15000000, 'Nam', str_to_date('7/9/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('7/9/2023 22:05', '%d/%m/%Y %H:%i'), 1),
		  (2,	'Nhân viên B',	'Quảng Nam',	10000000, 'Nam', str_to_date('1/1/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('7/10/2018 22:05', '%d/%m/%Y %H:%i'), 2),
		  (3,	'Nhân viên C',	'Huế',	15000000, 'Nam', str_to_date('5/5/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('4/9/2023 22:05', '%d/%m/%Y %H:%i'), 3),
		  (4,	'Nhân viên D',	'Hà Nội',	8000000, 'Nữ', str_to_date('7/9/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('2/9/2019 22:05', '%d/%m/%Y %H:%i'), 1),
		  (5,	'Nhân viên E',	'Nghệ An',	7000000, 'Nam', str_to_date('1/9/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('7/9/2020 22:05', '%d/%m/%Y %H:%i'), 1),
		  (6,	'Nhân viên F',	'Đà Nẵng',	5000000, 'Nữ', str_to_date('7/8/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('15/9/2023 22:05', '%d/%m/%Y %H:%i'), 5),
		  (7,	'Nhân viên G',	'Hà Tĩnh',	3000000, 'Nữ', str_to_date('15/9/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('22/9/2021 22:05', '%d/%m/%Y %H:%i'), 4),
		  (8,	'Nhân viên H',	'Đà Nẵng',	1000000, 'Nam', str_to_date('7/1/2001 22:05', '%d/%m/%Y %H:%i'), str_to_date('27/9/2022 22:05', '%d/%m/%Y %H:%i'), 1);

INSERT INTO manager(ID, DEPARTMENT_ID, EMPLOYEE_ID, SWEARING_IN_DAY)
VALUES(1, 3, 2, str_to_date('27/9/2023', '%d/%m/%Y')),
		(2, 2, 3, str_to_date('7/9/2022', '%d/%m/%Y')),
		(3, 1, 5, str_to_date('27/10/2023', '%d/%m/%Y')),
		(4, 4, 8, str_to_date('12/5/2024', '%d/%m/%Y')),
		(5, 5, 1, str_to_date('2/10/2023', '%d/%m/%Y'));

INSERT INTO project(ID, NAME, START_DATE, END_DATE, REVENUE, EMPLOYEE_ID)
VALUES(1, 'Dự án 1', str_to_date('27/9/2023', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 200000000, 1),
		(2, 'Dự án 2',str_to_date('27/9/2023', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 230000000, 3),
		(3, 'Dự án 3',str_to_date('27/9/2022', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 300000000, 4),
		(4, 'Dự án 4',str_to_date('27/9/2023', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 400000000, 6),
		(5, 'Dự án 5',str_to_date('27/9/2023', '%d/%m/%Y'), str_to_date('01/02/2022', '%d/%m/%Y'), 243000000, 7);

INSERT INTO project_team_member(ID, PROJECT_ID, EMPLOYEE_ID, CONTROLER_ID)
VALUES(1, 1, 2, 3),
	(2, 1, 6, 5),
	(3, 1, 5, 4),
	(4, 1, 1, 3),
	(5, 1, 4, 2),
	(6, 2, 2, 1),
	(7, 2, 3, 7),
	(8, 3, 2, 6),
	(9, 4, 2, 8);

--

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
--
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
--
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
--
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
--
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
--
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
--
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
--
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
--