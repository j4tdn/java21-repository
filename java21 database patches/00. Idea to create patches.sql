-- Tạo database
CREATE DATABASE java21_shopping CHAR SET utf8mb4

-- Idea để tạo những patches cho csdl
-- Mỗi file .sql gọi là một file patch

-- 01.sql --> Lien quan den ITEM 
-- T01_ITEM, T02_ITEMGROUP, T06_SIZE, T09_ITEM_STATISTIC, T12_ITEM_DETAIL, T13_GALLERY

-- 02.sql --> Lien quan den ORDER, STATUS, CUSTOMER, EMPLOYEE, TITLE
-- T03_ORDER, T04_PAYMENT_METHOD, T05_ORDER_STATUS, T11_CUSTOMER, 
-- T14_ORDER_DETAIL, T15_ORDER_STATUS_DETAIL, T07_EMPLOYEE
-- Thiếu bảng Bill ?? - ??

-- 03.sql --> Lien quan den STATISTIC
-- T09_ITEM_STATISTIC, T10_REVENUE

