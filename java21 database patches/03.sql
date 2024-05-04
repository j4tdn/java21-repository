-- 02.sql --> Lien quan den ORDER, STATUS, CUSTOMER, EMPLOYEE, TILE
-- T03_ORDER --> T11_CUSTOMER, 
-- T14_ORDER_DETAIL, T04_PAYMENT_METHOD, T05_ORDER_STATUS, 
-- T15_ORDER_STATUS_DETAIL --> T07_EMPLOYEE --> T08_TITLE
-- Thiếu bảng Bill ?? - ?? --> Chưa sử dụng

USE java21_shopping;

DROP TABLE IF EXISTS T11_CUSTOMER;
CREATE TABLE T11_CUSTOMER (
  C11_CUSTOMER_ID INT PRIMARY KEY,
  C11_CUSTOMER_NAME VARCHAR(255) NOT NULL,
  C11_CUSTOMER_EMAIL VARCHAR(50) NOT NULL,
  C11_CUSTOMER_ADDRESS VARCHAR(100) NOT NULL,
  C11_CUSTOMER_PHONE VARCHAR(11) NOT NULL,
  C11_CUSTOMER_USERNAME VARCHAR(20) NOT NULL,
  C11_CUSTOMER_PASSWORD VARCHAR(20) NOT NULL,
  CONSTRAINT CHECK_CUSTOMER_PHONE_LENGTH CHECK (LENGTH(C11_CUSTOMER_PHONE) BETWEEN 10 AND 11 
                                                AND C11_CUSTOMER_PHONE REGEXP '^[0-9]+$'),
  CONSTRAINT CHECK_CUSTOMER_PASSWORD_FORMAT CHECK (LENGTH(C11_CUSTOMER_PASSWORD) >= 8 
                                                   AND C11_CUSTOMER_PASSWORD REGEXP '[A-Z]' 
                                                    AND  C11_CUSTOMER_PASSWORD REGEXP '[@#$%^&*]')										
);
-- từ khóa REGEXP được sử dụng để thực hiện so sánh chuỗi với một biểu thức chính quy (regular expression).
-- Ex: SELECT * FROM your_table WHERE name REGEXP 'pattern';
ALTER TABLE T11_CUSTOMER
ADD CONSTRAINT UNIQUE_T11_CUSTOMER_USERNAME UNIQUE (C11_CUSTOMER_USERNAME);

ALTER TABLE T11_CUSTOMER
DROP CONSTRAINT CHECK_CUSTOMER_PASSWORD_FORMAT;

DROP TABLE IF EXISTS T04_PAYMENT_METHOD;
CREATE TABLE T04_PAYMENT_METHOD (
  C04_PMETHOD_ID INT PRIMARY KEY,
  C04_PMETHOD_DESC VARCHAR(30) NOT NULL
);

ALTER TABLE T04_PAYMENT_METHOD
MODIFY COLUMN C04_PMETHOD_DESC TEXT;

CREATE TABLE T03_ORDER (
  C03_ORDER_ID INT PRIMARY KEY,
  C03_ORDER_TIME DATETIME NOT NULL,
  C03_DELIVERY_FEE FLOAT,
  C03_DELIVERY_ADDRESS VARCHAR(100) NOT NULL,
  C03_RECEIVER_PHONE VARCHAR(11) NOT NULL,
  C03_TOTAL_OF_MONEY FLOAT NOT NULL,
  C03_PMETHOD_ID INT,
  C03_CUSTOMER_ID INT,
  CONSTRAINT CHECK_RECEIVER_PHONE_LENGTH CHECK (LENGTH(C03_RECEIVER_PHONE) BETWEEN 10 AND 11 
                                                AND C03_RECEIVER_PHONE REGEXP '^[0-9]+&' ),
  CONSTRAINT CHECK_DELIVERY_FEE CHECK (C03_DELIVERY_FEE >= 0),
  CONSTRAINT CHECK_TOTAL_OF_MONEY CHECK (C03_TOTAL_OF_MONEY > 0),
  CONSTRAINT FK_ORDER_CUSTOMER FOREIGN KEY (C03_CUSTOMER_ID) REFERENCES T11_CUSTOMER(C11_CUSTOMER_ID),
  CONSTRAINT FK_ORDER_PMETHOD FOREIGN KEY (C03_PMETHOD_ID) REFERENCES T04_PAYMENT_METHOD(C04_PMETHOD_ID)											
);

ALTER TABLE T03_ORDER
DROP CONSTRAINT CHECK_RECEIVER_PHONE_LENGTH;

ALTER TABLE T03_ORDER
DROP CONSTRAINT CHECK_TOTAL_OF_MONEY;

ALTER TABLE T03_ORDER
MODIFY COLUMN C03_ORDER_TIME DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP();

ALTER TABLE T03_ORDER
MODIFY COLUMN C03_DELIVERY_FEE FLOAT NOT NULL DEFAULT 0;

ALTER TABLE T03_ORDER
MODIFY COLUMN C03_PMETHOD_ID INT NOT NULL;

ALTER TABLE T03_ORDER
MODIFY COLUMN C03_CUSTOMER_ID INT NOT NULL;

CREATE TABLE T05_ORDER_STATUS (
  C05_ORDER_STATUS_ID INT PRIMARY KEY,
  C05_ORDER_STATUS_DESC VARCHAR(255) NOT NULL
);

CREATE TABLE T14_ORDER_DETAIL (
  C14_ORDER_ID INT,
  C14_ITEM_DETAIL_ID INT,
  C14_AMOUNT INTEGER NOT NULL,
  PRIMARY KEY (C14_ORDER_ID, C14_ITEM_DETAIL_ID),
  CONSTRAINT CHECK_AMOUNT CHECK (C14_AMOUNT > 0),
  CONSTRAINT FK_ORDER_DETAIL_ORDER FOREIGN KEY (C14_ORDER_ID) REFERENCES T03_ORDER(C03_ORDER_ID),
  CONSTRAINT FK_ORDER_DETAIL_ITEM_DETAIL FOREIGN KEY (C14_ITEM_DETAIL_ID) REFERENCES T12_ITEM_DETAIL(C12_ITEM_DETAIL_ID)
);

CREATE TABLE T15_ORDER_STATUS_DETAIL (
  C15_ORDER_ID INT,
  C15_ORDER_STATUS_ID INT,
  C15_EMPLOYEE_ID INT,
  C15_LAST_UPDATE VARCHAR(30) NOT NULL,
  PRIMARY KEY (C15_ORDER_ID, C15_ORDER_STATUS_ID),
  CONSTRAINT FK_T15_ORDER FOREIGN KEY (C15_ORDER_ID) REFERENCES T03_ORDER(C03_ORDER_ID),
  CONSTRAINT FK_T15_ORDER_STATUS FOREIGN KEY (C15_ORDER_STATUS_ID) REFERENCES T05_ORDER_STATUS(C05_ORDER_STATUS_ID) ,
  CONSTRAINT FK_T15_EMPLOYEE FOREIGN KEY (C15_EMPLOYEE_ID) REFERENCES T07_EMPLOYEE(C07_EMPLOYEE_ID) 
);

ALTER TABLE T15_ORDER_STATUS_DETAIL
MODIFY COLUMN C15_EMPLOYEE_ID INT NOT NULL; -- Khóa ngoại!

ALTER TABLE T15_ORDER_STATUS_DETAIL
CHANGE C15_LAST_UPDATE C15_LAST_UPDATED DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;





