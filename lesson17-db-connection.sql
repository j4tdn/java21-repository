use java21_shopping;

-- Dạng 1: Bài toán liệt kê
-- Liệt kê các loại hàng
SELECT C02_ITEM_GROUP_ID c02_id, C02_ITEM_GROUP_NAME c02_name FROM t02_item_group;

SELECT C04_PMETHOD_ID,
	   C04_PMETHOD_DESC
FROM t04_payment_method;

SELECT C02_ITEM_GROUP_ID, C02_ITEM_GROUP_NAME FROM t02_item_group WHERE C02_ITEM_GROUP_ID = ?;

-- Thêm/Cập nhật loại hàng
INSERT INTO t02_item_group(C02_ITEM_GROUP_NAME)
VALUES('Loại hàng 1');

UPDATE t02_item_group
   SET C02_ITEM_GROUP_NAME = 'Loại Hàng 8'
 WHERE C02_ITEM_GROUP_ID = 8;
 
-- sử dụng procedure
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
CALL merge_item_group(18, 'Loại hàng 18');

-- Liệt kê các mặt hàng (MatHang) được bán trong ngày bất kỳ
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
 WHERE EXISTS (SELECT 1 FROM cte_sales_item_ids cte
			   WHERE t01.C01_ITEM_ID = cte.ITEM_ID);

-- Đếm số lượng các mặt hàng của từng loại hàng
SELECT t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME,
       sum(t12.C12_AMOUNT) AMOUNT,
       group_concat(concat(t1.C01_ITEM_NAME, '-', t6.C06_SIZE_NAME, '-', t12.C12_AMOUNT))
  FROM t02_item_group t2
  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
  JOIN t06_size t6 ON t6.C06_SIZE_ID = t12.C12_SIZE_ID
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

UPDATE t02_item_group SET C02_ITEM_GROUP_NAME = ? WHERE C02_ITEM_GROUP_ID = ?; -- sql đúng
DELETE t02_item_group WHERE C02_ITEM_GROUP_ID = ?; -- sql sai cú pháp

