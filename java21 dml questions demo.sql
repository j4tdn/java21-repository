-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM t02_item_group;

-- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * FROM t01_item WHERE C01_ITEM_NAME LIKE '%Thắt lưng%';
SELECT * FROM t01_item WHERE C01_ITEM_GROUP_ID = 6;

-- Cách 1: Sử dụng truy vấn con
-- Khi cần 'liệt kê' dữ liệu ở bảng A, nhưng điều kiện ở bảng B, C(sub query thông qua linked column)
SELECT * 
  FROM t01_item 
 WHERE C01_ITEM_GROUP_ID = (SELECT C02_ITEM_GROUP_ID 
                              FROM t02_item_group 
							 WHERE C02_ITEM_GROUP_NAME LIKE '%Thắt lưng%');
                             
-- Thay vì dùng = (truy vấn con có duy nhất 1 kết quả)
-- Truy vấn con có nhiều hơn 1 kết quả, thay = bằng IN, EXISTS

-- IN - Truy vấn con --> con chạy trước, được kết quả mới chạy câu lệnh chính(cha)
SELECT * 
  FROM t01_item 
 WHERE C01_ITEM_GROUP_ID IN (SELECT C02_ITEM_GROUP_ID 
                              FROM t02_item_group 
							 WHERE C02_ITEM_GROUP_NAME LIKE 'T%');

-- EXISTS - Truy vấn lồng(song song) --> câu lệnh truy vấn cha, con chạy song song vs nhau
-- Ý tưởng giống với liên kết bảng, nhưng mà chỉ SELECT dữ liệu ở bảng cha
WITH CTETL AS (
	SELECT *
	  FROM t02_item_group itg
	 WHERE C02_ITEM_GROUP_NAME LIKE 'T%'
)
SELECT * 
  FROM t01_item it
 WHERE EXISTS (SELECT 1
                 FROM CTETL itg
                 WHERE itg.C02_ITEM_GROUP_ID = it.C01_ITEM_GROUP_ID);


-- Cách 2: Sử dụng liên kết bảng - JOIN
-- Khi cần 'liệt kê' kèm với điều kiện xuất hiện ở 2, nhiều bảng --> JOIN
SELECT it.* 
  FROM t01_item it
  JOIN t02_item_group itg
    ON it.C01_ITEM_GROUP_ID = itg.C02_ITEM_GROUP_ID
 WHERE itg.C02_ITEM_GROUP_NAME LIKE '%Thắt lưng%';

-- Top 5 mặt hàng có giá mua cao nhất
SELECT *
  FROM t01_item
 ORDER BY C01_BUY_PRICE DESC
 LIMIT 5;
  
-- Top 5 mặt hàng có giá bán cao nhất
SELECT * FROM t12_item_detail;
WITH CTE_MSP AS (
   SELECT C12_ITEM_ID ITEM_ID,
          MAX(C12_SALES_PRICE) MAX_SALES_PRICE
     FROM t12_item_detail
    GROUP BY C12_ITEM_ID
    ORDER BY MAX_SALES_PRICE DESC
    LIMIT 5
)
SELECT t01.*,
       cte.MAX_SALES_PRICE 
  FROM t01_item t01
  JOIN CTE_MSP cte
    ON t01.C01_ITEM_ID = cte.ITEM_ID; 
    
-- Liệt kê mặt hàng gồm giá mua và tất cả các giá bán của mặt hàng đó theo size
SELECT * FROM t01_item WHERE C01_ITEM_ID = 6;
SELECT * FROM t12_item_detail WHERE C12_ITEM_ID = 6;
SELECT * FROM t06_size WHERE C06_SIZE_ID IN (2, 4, 6, 8, 10);

-- level 1 - basic - 1,2 item
SELECT t1.C01_ITEM_ID,
       t1.C01_ITEM_NAME,
       t1.C01_BUY_PRICE,
       t6.C06_SIZE_NAME,
       IF(C06_GENDER = 0, 'Female', 'Male') AS C06_GENDER,
       t12.C12_SALES_PRICE
  FROM t01_item t1
  JOIN t12_item_detail t12 ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t06_size t6 ON t12.C12_SIZE_ID = t6.C06_SIZE_ID
 WHERE t1.C01_ITEM_ID IN (6,8);

SELECT @@sql_mode;
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));  -- disable  
SET sql_mode=(SELECT CONCAT(@@sql_mode, ',ONLY_FULL_GROUP_BY')); -- enable
-- ONLY FULL GROUP BY -> nếu có mệnh đề group by, các column trong mệnh đề SELECT phải thuộc trong group by(ngoài trừ các function)
--                    -> các column trong SELECT ko cần phải có trong group by, sẽ lấy giá trị của hàng đầu tiên trong group --> sai
 
 -- level 2 - each record is each item
 SELECT t1.C01_ITEM_ID,
        t1.C01_ITEM_NAME,
        t1.C01_BUY_PRICE,
        GROUP_CONCAT(
		  t6.C06_SIZE_NAME, '(', IF(C06_GENDER = 0, 'Female', 'Male'), ')', ',', t12.C12_SALES_PRICE SEPARATOR ' | '
		) AS ITEM_DETAILS
  FROM t01_item t1
  JOIN t12_item_detail t12 ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t06_size t6 ON t12.C12_SIZE_ID = t6.C06_SIZE_ID
 GROUP BY  t1.C01_ITEM_ID,
           t1.C01_ITEM_NAME,
           t1.C01_BUY_PRICE;

-- 2. Đơn hàng

-- Được bán trong ngày 18/04/2024
SELECT * 
  FROM t03_order
 WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y');

-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019

-- Được bán trong tháng 11/2019

-- Được giao hàng tại Hòa Khánh

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng
SELECT * FROM t12_item_detail;

SELECT DISTINCT C12_COLOR FROM t12_item_detail;

SELECT C12_COLOR FROM t12_item_detail GROUP BY C12_COLOR;

SELECT GROUP_CONCAT(DISTINCT C12_COLOR SEPARATOR ' ') FROM t12_item_detail;
 
-- 6. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 18/04/2024
-- Đơn Hàng --> N Mặt Hàng --> Chi Tiết Đơn Hàng
--          --> Bán ngày nào

-- DEV: Viết full query --> get ra dữ liệu --> UI, LOGIC
-- QA: Viết từng câu riêng lẻ để test xem dữ liệu đúng sai

SELECT * FROM t03_order WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y'); -- 5,8,9,10

-- IN statement values are HUGE --> performance
-- EXISTS
-- JOIN
SELECT * FROM t14_order_detail WHERE C03_ORDER_ID IN (5,8,9,10); -- IN

WITH CTE_IDS AS (
  SELECT C03_ORDER_ID FROM t03_order WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y')
)
SELECT * FROM t14_order_detail root 
WHERE EXISTS (SELECT 1 FROM CTE_IDS sub WHERE sub.C03_ORDER_ID = root.C14_ORDER_ID); -- EXISTS

WITH CTE_IDS AS (
  SELECT C03_ORDER_ID FROM t03_order WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y')
)
SELECT * FROM t14_order_detail root 
  JOIN CTE_IDS cte 
 WHERE cte.C03_ORDER_ID = root.C14_ORDER_ID;
 
-- bài làm
SELECT t3.C03_ORDER_TIME,
       t3.C03_ORDER_ID,
       t1.C01_ITEM_ID,
       t1.C01_ITEM_NAME,
       t12.C12_AMOUNT
  FROM t03_order t3
  JOIN t14_order_detail t14 ON t3.C03_ORDER_ID = t14.C14_ORDER_ID
  JOIN t12_item_detail  t12 ON t14.C14_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
  JOIN t01_item         t1  ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
 WHERE cast(C03_ORDER_TIME AS DATE) = '2024-04-18';

-- 7. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- cách 1 - giá bán kèm size
SELECT * FROM t12_item_detail WHERE C12_SALES_PRICE BETWEEN 100 AND 300;
-- cách 2 - giá bán của mặt hàng
SELECT t12.C12_ITEM_ID,
       t1.C01_ITEM_NAME,
	   AVG(t12.C12_SALES_PRICE) AVG_SALES_PRICES
  FROM t12_item_detail t12
  JOIN t01_item t1 ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
 GROUP BY C12_ITEM_ID
 HAVING AVG_SALES_PRICES BETWEEN 100 AND 300;

-- 8. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'

-- 9. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- 