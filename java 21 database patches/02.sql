-- 02.sql --> Liên quan đến EMPLOYEE, TITLE
-- T07_EMPLOYEE, T08_TITLE

-- disable foreign key check 
-- SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS T08_TITLE;
CREATE TABLE T08_TITLE(
	C08_TITLE_ID INT PRIMARY KEY,
	C08_TITLE_NAME VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS T07_EMPLOYEE;
CREATE TABLE T07_EMPLOYEE(
	C07_EMPLOYEE_ID INT PRIMARY KEY,
	C07_EMPLOYEE_NAME VARCHAR(255) NOT NULL,
	C07_EMPLOYEE_ADDRESS TEXT NOT NULL,
	C07_EMPLOYEE_PHONE VARCHAR(20) NOT NULL,
	C07_EMPLOYEE_EMAIL VARCHAR(255) NOT NULL,
	C07_EMPLOYEE_USERNAME VARCHAR(50) NOT NULL,
	C07_EMPLOYEE_PASSWORD TEXT NOT NULL,
	C07_TITLE_ID INT NOT NULL,
	CONSTRAINT UNQ_EMPLOYEE_USERNAME UNIQUE(C07_EMPLOYEE_USERNAME),
    CONSTRAINT FK_T07_EMPLOYEE_T08_TITLE FOREIGN KEY (C07_TITLE_ID) REFERENCES T08_TITLE(C08_TITLE_ID)
);

-- enable foregin key check
-- SET FOREIGN_KEY_CHECKS = 0;

