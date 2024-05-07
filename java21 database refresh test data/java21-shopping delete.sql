SET FOREIGN_KEY_CHECKS = 0;
-- Phân biệt DELETE, TRUNCATE, DROP
-- Nên dùng DELETE hay TRUNCATE để xóa dữ liệu

-- DELETE (DML)
-- kiểm tra từng dòng dữ liệu trong bảng nếu có liên kết với bảng khác thì không cho xóa(báo lỗi).
-- Còn nếu bảng đó chưa có dữ liệu thì cho phép xóa
-- Lệnh DELETE có điều kiện where

-- TRUNCATE
-- Tùy hệ quản trị csdl mà TRUNCATE có lúc là DDL có lúc là DML
-- Nếu bảng đó mà reference với bảng khác thì sẽ báo lỗi
-- Lệnh TRUNCATE không có điều kiện where
-- Nên dùng trong trường hợp khi muốn xóa tất cả test data vì không kiểm tra nên performance sẽ nhanh hơn

DELETE FROM t01_item;
DELETE FROM t02_item_group;
DELETE FROM t03_order;
DELETE FROM t04_payment_method;
DELETE FROM t05_order_status;
DELETE FROM t06_size;
DELETE FROM t07_employee;
DELETE FROM t08_title;
DELETE FROM t09_item_statistic;
DELETE FROM t10_revenue;
DELETE FROM t11_customer;
DELETE FROM t12_item_detail;
DELETE FROM t13_gallery;
DELETE FROM t14_order_detail;
DELETE FROM t15_order_status_detail;

SET FOREIGN_KEY_CHECKS = 1;