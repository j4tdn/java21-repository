-- MySQL workbench: safe updates(reject delete, update without restriction)

SELECT @@foreign_key_checks;

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




 