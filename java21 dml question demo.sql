-- 1. Toàn bộ thông tin các loại hàng
SELECT * 
FROM t02_item_group;

-- Mặt hàng thuộc loại hàng là 'Thắt lưng'
-- Cách 1: Sử dụng truy vấn con
-- when use: Khi cần liệt kê dữ liệu ở bảng A, nhưng điều kiện ở bảng B, C
SELECT * 
	FROM t01_item
WHERE C01_ITEM_GROUP_ID = (SELECT C02_ITEM_GROUP_ID 
							 FROM t02_item_group 
							WHERE C02_ITEM_GROUP_NAME LIKE '%Thắt lưng%');
-- Toán tử = dùng trong trường hợp truy vấn con có duy nhất 1 kết quả
-- Truy vấn con có nhiều hơn 1 kết quả thay toán tử = bằng IN, EXISTS

-- IN - Truy vấn con --> con chạy trước, được kết quả mới chạy câu lệnh chính(cha)
SELECT * 
	FROM t01_item
WHERE C01_ITEM_GROUP_ID IN (SELECT C02_ITEM_GROUP_ID 
							 FROM t02_item_group 
							WHERE C02_ITEM_GROUP_NAME LIKE 'T%');

-- EXISTS - Truy vấn lồng(song song) --> câu lệnh truy vấn cha, con chạy song song với nhau
-- Ý tưởng giống với liên kết bảng, nhưng mà chỉ select dữ liệu ở bảng cha
WITH CTETL AS (
	SELECT *
		FROM t02_item_group AS itg
	WHERE C02_ITEM_GROUP_NAME LIKE 'T%'
)
SELECT * 
	FROM t01_item AS it
WHERE EXISTS (SELECT 1
				FROM CTETL AS itg
			  WHERE it.C01_ITEM_GROUP_ID = itg.C02_ITEM_GROUP_ID);
                            
-- Cách 2: Sử dụng liên kết bảng - JOIN
SELECT it.*
	FROM t01_item AS it
    JOIN t02_item_group AS itg
		ON it.C01_ITEM_GROUP_ID = itg.C02_ITEM_GROUP_ID
	WHERE itg.C02_ITEM_GROUP_NAME LIKE '%Thắt lưng%';

-- Top 5 mặt hàng có giá mua cao nhất
SELECT *  
FROM t01_item
ORDER BY C01_BUY_PRICE DESC
LIMIT 5;

-- Top 5 mặt hàng có giá bán cao nhất
WITH CTE_MSP AS (
	SELECT C12_ITEM_ID AS ITEM_ID,
	   MAX(C12_SALES_PRICE) AS MAX_SALES_PRICE
	FROM t12_item_detail
	GROUP BY C12_ITEM_ID
	ORDER BY MAX_SALES_PRICE DESC
	LIMIT 5
)
SELECT it.*, cte.MAX_SALES_PRICE
FROM t01_item AS it
	JOIN CTE_MSP AS cte
    ON it.C01_ITEM_ID = cte.ITEM_ID;

-- Liệt kê mặt hàng gồm giá mua và tất cả giá bán của mặt hàng đó theo size
SELECT t01.C01_ITEM_ID,
	   t01.C01_ITEM_NAME,
       t01.C01_BUY_PRICE,
       t06.C06_SIZE_NAME,
       if(C06_GENDER = 0, 'Female', 'Male') AS C06_GENDER,
       t12.C12_SALES_PRICE 
	FROM t01_item t01
	JOIN t12_item_detail t12 ON t01.C01_ITEM_ID = t12.C12_ITEM_ID
	JOIN t06_size t06 ON t12.C12_SIZE_ID = t06.C06_SIZE_ID;

SELECT @@sql_mode;
-- disable  
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY','')); 
-- enable
SET sql_mode=(SELECT CONCAT(@@sql_mode, ',ONLY_FULL_GROUP_BY'));
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

-- 2. Đơn hàng Được bán trong ngày 18/04/2024
SELECT * 
FROM t03_order
WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y');    

-- Đơn hàng Được bán từ ngày 14/04/2024 đến ngày 20/04/2024
SELECT * 
FROM t03_order
WHERE cast(C03_ORDER_TIME AS DATE) BETWEEN str_to_date('16.04.2024', '%d.%m.%Y') AND str_to_date('20.04.2024', '%d.%m.%Y');

-- Đơn hàng Được bán trong tháng 04/2024
SELECT *
FROM t03_order
WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('04.2024', '%m.%Y');

-- Đơn hàng Được giao hàng tại Hòa Khánh   
SELECT *
FROM t03_order
WHERE C03_DELIVERY_ADDRESS = 'Địa chỉ 10';

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT it.C01_ITEM_ID, 
	   it.C01_ITEM_NAME,
       ROUND((itd.C12_SALES_PRICE * 0.8), 2) AS DISCOUNT_PRICE
FROM t01_item it, 
	 t12_item_detail itd
WHERE it.C01_ITEM_ID = itd.C12_ITEM_ID;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT it.C01_ITEM_ID, 
	   it.C01_ITEM_NAME,
       itd.C12_COLOR	
FROM t01_item AS it
	JOIN t12_item_detail AS itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
ORDER BY it.C01_ITEM_ID;
    
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 18/04/2024
SELECT t3.C03_ORDER_TIME,
       t3.C03_ORDER_ID,
       t1.C01_ITEM_ID,
       t1.C01_ITEM_NAME,
       t12.C12_AMOUNT
  FROM t03_order t3
  JOIN t14_order_detail t14 ON t3.C03_ORDER_ID = t14.C14_ORDER_ID
  JOIN t12_item_detail  t12 ON t14.C14_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
  JOIN t01_item         t1  ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
 WHERE cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y');
 
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT it.C01_ITEM_ID, 
	   it.C01_ITEM_NAME,
       itd.C12_SALES_PRICE
FROM t01_item it, 
	 t12_item_detail itd
WHERE itd.C12_SALES_PRICE BETWEEN 100 AND 300
	AND it.C01_ITEM_ID = itd.C12_ITEM_ID
ORDER BY itd.C12_SALES_PRICE;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
WITH CTE_MATL AS (
	SELECT *
		FROM t02_item_group AS itg
	WHERE C02_ITEM_GROUP_NAME LIKE '%Mũ%' OR C02_ITEM_GROUP_NAME LIKE '%Thắt lưng%'
)
SELECT * 
	FROM t01_item AS it
WHERE EXISTS (SELECT 1
				FROM CTE_MATL AS itg
			  WHERE it.C01_ITEM_GROUP_ID = itg.C02_ITEM_GROUP_ID);

-- 9. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

-- 10. Đếm số lượng mặt hàng của từng loại hàng
SELECT * FROM t02_item_group;
SELECT * FROM t01_item;

SELECT *
  FROM t02_item_group t2
  LEFT JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID;

SELECT t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME,
       COUNT(t1.C01_ITEM_ID) AMOUNT_OF_ITEMS
  FROM t02_item_group t2
  LEFT JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
 GROUP BY t2.C02_ITEM_GROUP_ID;
 
 
-- 11. Sắp xếp các mặt hàng [kích cỡ] với giá bán tăng dần
SELECT t1.*,
       t12.C12_SIZE_ID,
       t12.C12_SALES_PRICE
  FROM t01_item t1
  JOIN t12_item_detail t12
    ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  ORDER BY t12.C12_SALES_PRICE;

WITH CTE_ITEM_SALES_DATA AS (
   SELECT t12.C12_ITEM_ID ITEM_ID,
		  avg(t12.C12_SALES_PRICE) SALES_PRICE
   FROM t12_item_detail t12
   GROUP BY t12.C12_ITEM_ID
)
SELECT t1.*,
       cte.SALES_PRICE
  FROM CTE_ITEM_SALES_DATA cte
  JOIN t01_item t1
    ON t1.C01_ITEM_ID = cte.ITEM_ID
  ORDER BY cte.SALES_PRICE;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần

-- 14. Đếm số lượng các mặt hàng trong hệ thống

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT t3.C03_ORDER_ID ORDER_ID,
       t1.C01_ITEM_ID ITEM_ID,
       t1.C01_ITEM_NAME ITEM_NAME,
       t12.C12_ITEM_DETAIL_ID ITEM_DETAIL_ID,
       t14.C14_AMOUNT AMOUNT,
       t3.C03_ORDER_TIME
  FROM t01_item t1
  JOIN t12_item_detail t12  ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t14_order_detail t14 ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
  JOIN t03_order t3         ON t14.C14_ORDER_ID = t3.C03_ORDER_ID
 WHERE cast(t3.C03_ORDER_TIME AS DATE) = '2024-04-18'
   AND t1.C01_ITEM_NAME LIKE '%Quần 5%';
   
-- query
SELECT 'Quần 5' MatHang,
	   '2024-04-18' NgayBan,
       sum(t14.C14_AMOUNT) SoLuongBan
  FROM t01_item t1
  JOIN t12_item_detail t12  ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t14_order_detail t14 ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
  JOIN t03_order t3         ON t14.C14_ORDER_ID = t3.C03_ORDER_ID
 WHERE cast(t3.C03_ORDER_TIME AS DATE) = '2024-04-18'
   AND t1.C01_ITEM_NAME LIKE '%Quần 5%';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	     1       Giày    20
-- 	     2       Áo      28
SELECT t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME,
       sum(t12.C12_AMOUNT) AMOUNT
  FROM t02_item_group t2
  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
  GROUP BY t2.C02_ITEM_GROUP_ID,
           t2.C02_ITEM_GROUP_NAME;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
SELECT t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME,
       sum(t12.C12_AMOUNT) AMOUNT
  FROM t02_item_group t2
  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
  GROUP BY t2.C02_ITEM_GROUP_ID,
           t2.C02_ITEM_GROUP_NAME
  HAVING sum(t12.C12_AMOUNT) > 3000;
  
  
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 4 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- lấy chính xác 4 records duy nhất theo tiêu chí sắp xếp ...
SELECT t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME,
       sum(t12.C12_AMOUNT) AMOUNT
  FROM t02_item_group t2
  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
  GROUP BY t2.C02_ITEM_GROUP_ID,
           t2.C02_ITEM_GROUP_NAME
  ORDER BY sum(t12.C12_AMOUNT) DESC, t2.C02_ITEM_GROUP_ID DESC
  LIMIT 4;

WITH CTE_ITEM_GROUP_AMOUNTS AS (  
	SELECT t2.C02_ITEM_GROUP_ID ITEM_GROUP_ID,
		   t2.C02_ITEM_GROUP_NAME ITEM_GROUP_NAME,
		   sum(t12.C12_AMOUNT) AMOUNT
	  FROM t02_item_group t2
	  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
	  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID
	  GROUP BY t2.C02_ITEM_GROUP_ID,
			   t2.C02_ITEM_GROUP_NAME
)
SELECT GROUP_CONCAT(ITEM_GROUP_NAME) GROUP_NAMES,
       AMOUNT
  FROM CTE_ITEM_GROUP_AMOUNTS
  GROUP BY AMOUNT
  ORDER BY AMOUNT DESC
  LIMIT 4;


-- ITEM_GROUP
-- ITEM

-- UI: Áo, (Áo 1, Áo 2, ....)
-- Map<ItemGroup, List<Item>>

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019


-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
    
SELECT t3.C03_ORDER_ID,
       t3.C03_DELIVERY_FEE,
       t3.C03_TOTAL_OF_MONEY,
       t14.C14_ITEM_DETAIL_ID,
       t12.C12_ITEM_ID,
       t1.C01_ITEM_NAME,
       t12.C12_SIZE_ID,
       t6.C06_SIZE_NAME,
       t12.C12_SALES_PRICE,
       t14.C14_AMOUNT
  FROM t03_order t3
  JOIN t14_order_detail t14 ON t14.C14_ORDER_ID = t3.C03_ORDER_ID
  JOIN t12_item_detail t12  ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
  JOIN t01_item t1          ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t06_size t6          ON t6.C06_SIZE_ID = t12.C12_SIZE_ID
 WHERE t3.C03_ORDER_ID = 1;
 
SELECT t3.C03_ORDER_ID MaDH,
       group_concat(t1.C01_ITEM_NAME, '(',  t6.C06_SIZE_NAME, ')', '-' , t12.C12_SALES_PRICE, '-', t14.C14_AMOUNT SEPARATOR ', ') ThongTinDonHang,
	   sum(t12.C12_SALES_PRICE * t14.C14_AMOUNT) TongTien
  FROM t03_order t3
  JOIN t14_order_detail t14 ON t14.C14_ORDER_ID = t3.C03_ORDER_ID
  JOIN t12_item_detail t12  ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
  JOIN t01_item t1          ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t06_size t6          ON t6.C06_SIZE_ID = t12.C12_SIZE_ID
  GROUP BY  t3.C03_ORDER_ID;

SELECT * FROM t03_order;
UPDATE t03_order SET C03_TOTAL_OF_MONEY = 0;

  
-- Tính tổng tiền và cập nhật vào bảng đơn hàng
WITH CTE_CALC_MONEY AS (
   SELECT t3.C03_ORDER_ID ORDER_ID,
	      sum(t12.C12_SALES_PRICE * t14.C14_AMOUNT) TOTAL_OF_MONEY
     FROM t03_order t3
     JOIN t14_order_detail t14 ON t14.C14_ORDER_ID = t3.C03_ORDER_ID
     JOIN t12_item_detail t12  ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
     JOIN t01_item t1          ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
     JOIN t06_size t6          ON t6.C06_SIZE_ID = t12.C12_SIZE_ID
    GROUP BY  t3.C03_ORDER_ID
)
-- UPDATE t03_order t3 SET C03_TOTAL_OF_MONEY = (SELECT TOTAL_OF_MONEY FROM CTE_CALC_MONEY cte WHERE t3.C03_ORDER_ID = cte.ORDER_ID);
UPDATE t03_order t3
  JOIN CTE_CALC_MONEY cte ON t3.C03_ORDER_ID = cte.ORDER_ID
   SET t3.C03_TOTAL_OF_MONEY = cte.TOTAL_OF_MONEY;