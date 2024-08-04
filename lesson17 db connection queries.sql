-- Dạng 1: Bài toán LIỆT KÊ
USE java21_shopping;
-- Liệt kê các loại hàng trong hệ thông
SELECT C02_ITEM_GROUP_ID c2_id, 
       C02_ITEM_GROUP_NAME c2_name
  FROM t02_item_group;
  
SELECT C04_PMETHOD_ID,
       C04_PMETHOD_DESC
  FROM t04_payment_method;  
  
-- get all(query) --> 100.000 --> 5s
-- save 100.000 into Java Memory
-- logic of java to get 1 in 100.000 elements

SELECT * FROM t02_item_group WHERE C02_ITEM_GROUP_ID = 5;

SELECT * FROM t02_item_group WHERE C02_ITEM_GROUP_NAME = Áo;

-- sql injection
SELECT C02_ITEM_GROUP_ID id, 
       C02_ITEM_GROUP_NAME name
  FROM t02_item_group 
 WHERE C02_ITEM_GROUP_NAME = 'xx' OR '1=1';

-- get(query) --> 1 -> 0.0005s
-- save 1 into Java Memory
-- no need to process logic

-- use Java to process logic when SQL/Query not able to process requirement
-- || slow query

-- Thêm/Cập nhật Loại Hàng
INSERT INTO t02_item_group(C02_ITEM_GROUP_NAME)
VALUES('Loại hàng 1');

UPDATE t02_item_group
   SET C02_ITEM_GROUP_NAME = 'Loại hàng 9'
 WHERE C02_ITEM_GROUP_ID = 9;
 
-- Sử dụng procedure
DELIMITER $$

CREATE PROCEDURE merge_item_group(pId INT, pName VARCHAR(255))
BEGIN
    DECLARE nofGroups INT DEFAULT 0; 
	SELECT count(*) INTO nofGroups FROM t02_item_group WHERE C02_ITEM_GROUP_ID = pId;
    IF nofGroups = 0 THEN
      INSERT INTO t02_item_group(C02_ITEM_GROUP_NAME)
	  VALUES(pName);
    ELSE
	  UPDATE t02_item_group
	     SET C02_ITEM_GROUP_NAME = pName
	   WHERE C02_ITEM_GROUP_ID = pId;
	END IF;
END $$

CALL merge_item_group(14, 'Loại hàng 141');

-- Liệt kê các mặt hàng(MatHang) được bán trong ngày bất kì
WITH cte_sales_item_ids AS (
	SELECT DISTINCT t12.C12_ITEM_ID ITEM_ID
      FROM t12_item_detail t12
	  JOIN t14_order_detail t14
        ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
	  JOIN t03_order t03
        ON t03.C03_ORDER_ID = t14.C14_ORDER_ID
    WHERE cast(t03.C03_ORDER_TIME AS DATE) = '2024-04-18'
)
SELECT *
  FROM t01_item t01
  WHERE EXISTS (SELECT 1
                  FROM cte_sales_item_ids cte
                  WHERE t01.C01_ITEM_ID = cte.ITEM_ID);
                  
-- 2. Đếm số lượng các mặt hàng của từng loại hàng
SELECT t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME,
       sum(t12.C12_AMOUNT),
       GROUP_CONCAT(concat(t1.C01_ITEM_NAME,'-',t6.C06_SIZE_NAME,'-',t12.C12_AMOUNT))
  FROM t02_item_group t2
  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
  JOIN t06_size t6 ON t12.C12_SIZE_ID = t6.C06_SIZE_ID
  GROUP BY t2.C02_ITEM_GROUP_ID,
           t2.C02_ITEM_GROUP_NAME;
           
-- 4. Thêm mới khách hàng với mật khẩu mã hóa
INSERT INTO t11_customer(
	C11_CUSTOMER_NAME, C11_CUSTOMER_EMAIL, C11_CUSTOMER_ADDRESS, 
    C11_CUSTOMER_PHONE, C11_CUSTOMER_USERNAME, C11_CUSTOMER_PASSWORD)
VALUES(?, ?, ?, ?, ?, ?);

SELECT C11_CUSTOMER_ID,
	   C11_CUSTOMER_NAME,
       C11_CUSTOMER_EMAIL,
       C11_CUSTOMER_ADDRESS,
       C11_CUSTOMER_PHONE
  FROM t11_customer
 WHERE C11_CUSTOMER_USERNAME = ?
   AND C11_CUSTOMER_PASSWORD = ?;
   
-- Thực hành transaction management
SELECT * FROM t02_item_group;

UPDATE t02_item_group SET C02_ITEM_GROUP_NAME = ? WHERE C02_ITEM_GROUP_ID = ?; -- sql1 đúng

DELETE t02_item_group WHERE C02_ITEM_GROUP_ID = ?; -- sql sai cú pháp

  