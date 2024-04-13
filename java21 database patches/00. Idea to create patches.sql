-- Tạo database
CREATE DATABASE java21_shopping CHAR SET utf8mb4;

-- Idea tạo patches cho CSDL

-- Mỗi file .sql gọi là 1 file patch

-- 01.sql --> Liên quan đến ITEM
-- T01_ITEM, T02_ITEMGROUP, T06_SIZE, T12_ITEM_DETAIL, T13_GALLERY

-- 02.sql --> Liên quan đến ORDER, STATUS, CUSTOMER
-- T03_ORDER, T04_PAYMENT_METHOD, T05_ORDER_STATUS, T11_CUSTOMER
-- T14_ORDER_DETAIL, T15_ORDER_STATUS_DETAIL
-- thiếu bảng BILL ?

-- 03.sql --> Liên quan đến EMPLOYEE, TITLE
-- T07_EMPLOYEE, T08_TITLE

-- 04.sql --> Liên quan đến thống kê STATISTIC
-- T09_ITEM_STATISTIC, T10_REVENUE