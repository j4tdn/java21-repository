-- Dạng 1: Bài toán LIỆT KÊ

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

SELECT * FROM t02_item_group WHERE C02_ITEM_GROUP_ID = ?;
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

  