-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT *
  FROM t02_item_group;

  -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
  -- Cách 1: sử dụng truy vấn con
  -- Khi cần 'liệt kê' dữ liệu ở bảng A, nhưng điều kiện ở bảng B,C <sub query thông qua linked column>
SELECT * 
  FROM t01_item 
  WHERE C01_ITEM_GROUP_ID = (SELECT C02_ITEMGROUP_ID
                                FROM t02_item_group
                                WHERE C02_ITEMGROUP_NAME LIKE "%Thắt lưng%");

-- Thay vì dùng = (truy vấn con có duy nhất 1 kết quả)
-- Truy vấn con có nhiều hơn 1 kết quả --> dùng IN, EXISTS
--    IN   - truy vấn con --> con chạy trước, được kết quả mới chạy câu lệnh chính <cha>
--     Example:
SELECT * 
  FROM t01_item 
  WHERE C01_ITEM_GROUP_ID IN (SELECT C02_ITEMGROUP_ID
                                FROM t02_item_group
                                WHERE C02_ITEMGROUP_NAME LIKE "T%");
            -- ---------------------------------------
--  EXISTS - truy vấn lồng <song song> --> câu truy vấn cha, con chạy song song
-- Ý tưởng giống với liên kết bảng <JOIN>, nhưng mà chỉ SELECT dữ liệu ở bảng cha
WITH CTE_TL AS (
     SELECT *
	   FROM t02_item_group itg
	   WHERE C02_ITEMGROUP_NAME LIKE "T%"
)
SELECT * 
  FROM t01_item it 
  WHERE EXISTS ( SELECT *
                   FROM CTE_TL ctl
                   WHERE it.C01_ITEM_GROUP_ID = ctl.C02_ITEMGROUP_ID);
                   
-- Top 5 mặt hàng có giá mua cao nhất
SELECT *
  FROM t01_item
  ORDER BY C01_BUY_PRICE DESC
  LIMIT 5;
    
-- Top 5 mặt hàng có giá bán cao nhất <mặt hàng ko kèm thèo size -- mặt hàng nói chung>
-- Dùng 'Group By'
WITH CTE_MAX_SALES_PRICE AS (
	SELECT C12_ITEM_ID, MAX(C12_SALES_PRICE) MAX_SALES_PRICE
      FROM t12_item_detail
      GROUP BY C12_ITEM_ID
      ORDER BY MAX_SALES_PRICE DESC
      LIMIT 5
)
SELECT it.C01_ITEM_ID,
	   it.C01_ITEM_NAME, 
	   cte.MAX_SALES_PRICE
   FROM t01_item it
   JOIN CTE_MAX_SALES_PRICE cte
   ON cte.C12_ITEM_ID = it.C01_ITEM_ID;

-- Liệt kê mặt hàng gồm giá mua và tất cả giá bán của mặt hàng đó theo SIZE
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
  JOIN t12_item_detail t12 
    ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t06_size t6 
	ON t12.C12_SIZE_ID = t6.C06_SIZE_ID
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
  JOIN t12_item_detail t12 
    ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  JOIN t06_size t6 
    ON t12.C12_SIZE_ID = t6.C06_SIZE_ID
  GROUP BY  t1.C01_ITEM_ID,
           t1.C01_ITEM_NAME,
           t1.C01_BUY_PRICE;

-- 2. Đơn hàng
    -- Được bán trong ngày 18/4/2024
SELECT *
  FROM t03_order
  WHERE DATE(C03_ORDER_TIME) = str_to_date('18/4/2024','%d/%m/%Y');
    
    -- Được bán từ ngày 10/4/2024 đến ngày 20/4/2024
SELECT *
  FROM t03_order
  WHERE DATE(C03_ORDER_TIME) BETWEEN '2024-04-10' AND '2024-04-20';
    
    -- Được bán trong tháng 5/2024
SELECT *
  FROM t03_order
  WHERE MONTH(C03_ORDER_TIME) = 5
    AND YEAR(C03_ORDER_TIME) = 2024;
       
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân - giá bán
SELECT it.C01_ITEM_ID,
	   it.C01_ITEM_NAME,
       itd.C12_SIZE_ID,
       round((itd.C12_SALES_PRICE * 0.8), 2) NEW_SALES_PRICE
  FROM t01_item it
  JOIN t12_item_detail itd
  ON it.C01_ITEM_ID = itd.C12_ITEM_ID;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 18/4/2024
  SELECT * FROM t03_order WHERE cast(C03_ORDER_TIME AS DATE) = "2024-4-18"; -- id = 5,8,9
  SELECT * FROM t14_order_detail WHERE C14_ORDER_ID IN (5,8,9); -- item_detail_id (14,22,33,88,23,27,98,13,32,38,100);
  SELECT * FROM t12_item_detail WHERE C12_ITEM_DETAIL_ID IN (14,22,33,88,23,27,98,13,32,38,100);

SELECT itd.C12_ITEM_DETAIL_ID,
       itd.C12_SALES_PRICE SALES_PRICE,
	  (itd.C12_SALES_PRICE * 0.8) NEW_SALES_PRICE
  FROM t12_item_detail itd
  WHERE C12_ITEM_DETAIL_ID IN (SELECT odd.C14_ITEM_DETAIL_ID
                                 FROM t14_order_detail odd
                                 WHERE odd.C14_ORDER_ID IN (SELECT od.C03_ORDER_ID
                                                              FROM t03_order od
                                                              WHERE DATE(C03_ORDER_TIME) = str_to_date('18/4/2024','%d/%m/%Y')));

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C12_COLOR COLORS
  FROM t12_item_detail; -- KO NÊN DÙNG GROUP BY --> THỪA!

SELECT GROUP_CONCAT(DISTINCT C12_COLOR SEPARATOR ', ') 
  FROM t12_item_detail;
  
-- 6. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 18/4/2024
SELECT it.C01_ITEM_ID,
       it.C01_ITEM_NAME,
       itd.C12_SIZE_ID,
       odd.C14_AMOUNT,
       od.C03_ORDER_TIME
  FROM t01_item it
  JOIN t12_item_detail itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  JOIN t14_order_detail odd
    ON itd.C12_ITEM_DETAIL_ID = odd.C14_ITEM_DETAIL_ID
  JOIN t03_order od
    ON od.C03_ORDER_ID = odd.C14_ORDER_ID
  WHERE DATE(od.C03_ORDER_TIME) = str_to_date('18/4/2024', '%d/%m/%Y');
  
-- 7. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- Cách 1: SELECT * .... --> lấy SALES_PRICE ở bảng t12 bình thường
-- Cách 2: 
SELECT t12.C12_ITEM_ID,
       t1.C01_ITEM_NAME, -- > Hiểu luôn !! vì ID & NAME 'mapping unique'
       AVG(C12_SALES_PRICE) AVG_SALES_PRICE
  FROM t12_item_detail t12
  JOIN t01_item t1
  ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
  GROUP BY C12_ITEM_ID
  HAVING AVG_SALES_PRICE BETWEEN 100 AND 300;

-- 8. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 9. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- 10. Đếm số lượng mặt hàng của từng loại hàng

-- lấy code của anh !

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT it.*,
	   itd.C12_SALES_PRICE SALES_PRICE
  FROM t01_item it
  JOIN t12_item_detail itd
  ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  ORDER BY itd.C12_SALES_PRICE;
  
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT *
  FROM t01_item
  ORDER BY C01_BUY_PRICE DESC;
  
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT it.*,
	   itd.C12_SALES_PRICE SALES_PRICE
  FROM t01_item it
  JOIN t12_item_detail itd
  ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  ORDER BY itd.C12_SALES_PRICE, it.C01_BUY_PRICE DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) NUMBER_OF_ITEMS
  FROM t01_item;

-- 15. Số lượng 'Giày' được bán trong ngày 18/4/2024
SELECT SUM(odd.C14_AMOUNT) SALES_AMOUNT_AT_INPUT_DATE
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  JOIN t14_order_detail odd
    ON itd.C12_ITEM_DETAIL_ID = odd.C14_ITEM_DETAIL_ID
  JOIN t03_order od
    ON odd.C14_ORDER_ID = od.C03_ORDER_ID
  WHERE DATE(od.C03_ORDER_TIME) = str_to_date('18/4/2024', '%d/%m/%Y')
	AND itg.C02_ITEMGROUP_NAME = 'Giày';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1           Giày    20
-- 	2           Áo      28
SELECT itg.C02_ITEMGROUP_ID, 
       itg.C02_ITEMGROUP_NAME,
       SUM(itd.C12_AMOUNT) AS AMOUNT_ITEMS_IN_ITG
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON itd.C12_ITEM_ID = it.C01_ITEM_ID
  GROUP BY itg.C02_ITEMGROUP_ID, 
           itg.C02_ITEMGROUP_NAME;
  
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT it.*,
       itd.C12_SALES_PRICE
  FROM t01_item it
  JOIN t02_item_group itg
    ON it.C01_ITEM_GROUP_ID = itg.C02_ITEMGROUP_ID
  JOIN t12_item_detail itd
    ON itd.C12_ITEM_ID = it.C01_ITEM_ID
  WHERE itg.C02_ITEMGROUP_NAME = 'Giày'
  ORDER BY itd.C12_SALES_PRICE DESC
  LIMIT 1;
 
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT itg.*,
       MAX(itd.C12_SALES_PRICE) MAX_SALES_PRICE
  FROM t01_item it
  JOIN t02_item_group itg
    ON it.C01_ITEM_GROUP_ID = itg.C02_ITEMGROUP_ID
  JOIN t12_item_detail itd
    ON itd.C12_ITEM_ID = it.C01_ITEM_ID
  GROUP BY itg.C02_ITEMGROUP_ID, 
           itg.C02_ITEMGROUP_NAME; -- ? Cách để xuất ra tên mặt hàng <item>

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 3000
SELECT itg.C02_ITEMGROUP_ID, 
       itg.C02_ITEMGROUP_NAME,
       SUM(itd.C12_AMOUNT) AS AMOUNT_ITEMS_IN_ITG
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON itd.C12_ITEM_ID = it.C01_ITEM_ID
  GROUP BY itg.C02_ITEMGROUP_ID, 
		   itg.C02_ITEMGROUP_NAME
  HAVING SUM(itd.C12_AMOUNT) > 3000;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng[kèm với size] có số lượng nhiều nhất trong mỗi loại hàng
-- 'Số lượng trong kho ở bảng t12_item_detail'
WITH CTE_ITEM_DETAILS AS (
     SELECT itg.C02_ITEMGROUP_ID     ITEMGROUP_ID,
            itg.C02_ITEMGROUP_NAME   ITEMGROUP_NAME,
            it.C01_ITEM_ID           ITEM_ID,
            it.C01_ITEM_NAME         ITEM_NAME,
            itd.C12_SIZE_ID          SIZE_ID,
            itd.C12_AMOUNT           AMOUNT
       FROM t01_item it
       JOIN t02_item_group itg
         ON it.C01_ITEM_GROUP_ID = itg.C02_ITEMGROUP_ID
       JOIN t12_item_detail itd
         ON itd.C12_ITEM_ID = it.C01_ITEM_ID
),
CTE_MAX_AMOUNT_OF_ITEMS AS (
      SELECT cid.ITEMGROUP_ID     ITEMGROUP_ID,
             cid.ITEMGROUP_NAME   ITEMGROUP_NAME,
             MAX(cid.AMOUNT)      MAX_AMOUNT_IN_EACH_ITEMS
        FROM CTE_ITEM_DETAILS cid
        GROUP BY cid.ITEMGROUP_ID, cid.ITEMGROUP_NAME
)
SELECT cte1.ITEM_ID   ITEM_ID,
       cte1.ITEM_NAME NAME_ID,
       cte1.SIZE_ID   SIZE_ID,
       cte1.AMOUNT    MAX_AMOUNT
  FROM CTE_ITEM_DETAILS cte1
  JOIN CTE_MAX_AMOUNT_OF_ITEMS cte2
    ON  cte1.ITEMGROUP_ID = cte2.ITEMGROUP_ID 
    AND cte1.AMOUNT = cte2.MAX_AMOUNT_IN_EACH_ITEMS;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT itg.C02_ITEMGROUP_ID      ITEMGROUP_ID,
	   itg.C02_ITEMGROUP_NAME    ITEMGROUP_NAME,
       AVG(itd.C12_SALES_PRICE)  AVG_SALES_PRICE
  FROM t01_item it
  JOIN t02_item_group itg
	ON it.C01_ITEM_GROUP_ID = itg.C02_ITEMGROUP_ID
  JOIN t12_item_detail itd
	ON itd.C12_ITEM_ID = it.C01_ITEM_ID
  GROUP BY itg.C02_ITEMGROUP_ID, 
           itg.C02_ITEMGROUP_NAME;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- AMOUNT<T12> --> SUM IT BY EACH ITEMS !
SELECT itg.C02_ITEMGROUP_ID,
       itg.C02_ITEMGROUP_NAME,
       SUM(itd.C12_AMOUNT) TOTAL_AMOUNT_OF_ITEMS
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd 
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  GROUP BY itg.C02_ITEMGROUP_ID
  ORDER BY TOTAL_AMOUNT_OF_ITEMS DESC
  LIMIT 3;
  
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100 <ORDER_ID>
-- JOIN thuần chưởng --> WHERE ITEM_GROUP_ID = 2 AND ORDER_ID = 100100;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 18/4/2024
SELECT it.C01_ITEM_ID,
       it.C01_ITEM_NAME,
       itd.C12_SIZE_ID,
       itd.C12_AMOUNT,
       itd.C12_COLOR,
       od.C03_ORDER_ID
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  JOIN t14_order_detail odd
    ON itd.C12_ITEM_DETAIL_ID = odd.C14_ITEM_DETAIL_ID
  JOIN t03_order od
    ON od.C03_ORDER_ID = odd.C14_ORDER_ID
  WHERE itg.C02_ITEMGROUP_ID = 2
    AND DATE(od.C03_ORDER_TIME) = str_to_date('18/4/2024','%d/%m/%Y');

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 18/4/2024
WITH CTE_BE_SALED_ITEMS AS (
SELECT it.C01_ITEM_ID    ITEM_ID,
	   it.C01_ITEM_NAME  ITEM_NAME,
       itd.C12_SIZE_ID   SIZE_ID,
       itd.C12_COLOR     COLOR
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  JOIN t14_order_detail odd
    ON odd.C14_ITEM_DETAIL_ID = itd.C12_ITEM_DETAIL_ID
  JOIN t03_order od
    ON odd.C14_ORDER_ID = od.C03_ORDER_ID
  WHERE itg.C02_ITEMGROUP_NAME LIKE '%Mũ%'
    AND DATE(C03_ORDER_TIME) != str_to_date('18/4/2024','%d/%m/%Y')
)
SELECT * FROM CTE_BE_SALED_ITEMS;

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE t12_item_detail itd
   JOIN t01_item it ON itd.C12_ITEM_ID = it.C01_ITEM_ID
   JOIN t02_item_group itg ON it.C01_ITEM_GROUP_ID = itg.C02_ITEMGROUP_ID
SET itd.C12_SALES_PRICE = 199
WHERE itg.C02_ITEMGROUP_NAME = 'Áo';

SELECT * FROM t12_item_detail;

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE BACKUP_DATA_ITG (
    BK_ID INT,
    BK_NAME VARCHAR(50)
);

INSERT INTO BACKUP_DATA_ITG(BK_ID, BK_NAME)
SELECT C02_ITEMGROUP_ID, C02_ITEMGROUP_NAME 
FROM t02_item_group; 

SELECT * FROM BACKUP_DATA_ITG;

-- 30. Liệt kê 2 sản phẩm <mặt hàng> (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
    -- CÁCH 1: Xuất ra 1 mặt hàng 'Áo' có số lượng tồn kho nhiều nhất
	--         VÀ 1 mặt hàng 'Quần' có số lượng tồn kho nhiều nhất 
WITH CTE_ITEM_GROUP_CONDITION AS (
SELECT itg.C02_ITEMGROUP_ID      ITEM_GROUP_ID,
       itg.C02_ITEMGROUP_NAME    ITEM_GROUP_NAME,
       MAX(itd.C12_AMOUNT)       MAX_AMOUNT
  FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  WHERE itg.C02_ITEMGROUP_NAME LIKE '%Áo%' 
     OR itg.C02_ITEMGROUP_NAME LIKE '%Quần%'
  GROUP BY itg.C02_ITEMGROUP_ID
),
CTE_ITEMS_INFO AS ( -- bảng này mục đích để lấy thông tin mặt hàng --> xuất ra console
   SELECT itg.C02_ITEMGROUP_ID   ITEM_GROUP_ID,
          it.C01_ITEM_ID         ITEM_ID,
		  it.C01_ITEM_NAME       ITEM_NAME,
          itd.C12_SIZE_ID        SIZE_ID,
          itd.C12_COLOR          COLOR,
          itd.C12_AMOUNT         AMOUNT
     FROM t01_item it
     JOIN t02_item_group itg
       ON it.C01_ITEM_GROUP_ID = itg.C02_ITEMGROUP_ID
	 JOIN t12_item_detail itd
       ON itd.C12_ITEM_ID = it.C01_ITEM_ID
)
SELECT cte2.ITEM_GROUP_ID,
       cte2.ITEM_ID,
       cte2.ITEM_NAME,
       cte2.SIZE_ID,
       cte2.COLOR,
       cte2.AMOUNT
  FROM CTE_ITEM_GROUP_CONDITION cte1 
  JOIN CTE_ITEMS_INFO cte2
    ON cte1.ITEM_GROUP_ID = cte2.ITEM_GROUP_ID
  WHERE cte1.MAX_AMOUNT = cte2.AMOUNT;
  
      -- CÁCH 2: Xuất ra hai mặt hàng có số lượng tồn kho nhiều nhất miễn là ÁO or QUẦN
SELECT itg.C02_ITEMGROUP_ID    ITEM_GROUP_ID,
       itg.C02_ITEMGROUP_NAME  ITEM_GROUP_NAME,
	   it.C01_ITEM_ID          ITEM_ID,
	   it.C01_ITEM_NAME        ITEM_NAME,
	   itd.C12_SIZE_ID         SIZE_ID,
	   itd.C12_COLOR           COLOR,
	   itd.C12_AMOUNT          AMOUNT
FROM t02_item_group itg
  JOIN t01_item it
    ON itg.C02_ITEMGROUP_ID = it.C01_ITEM_GROUP_ID
  JOIN t12_item_detail itd
    ON it.C01_ITEM_ID = itd.C12_ITEM_ID
  WHERE itg.C02_ITEMGROUP_NAME LIKE '%Áo%' 
	OR  itg.C02_ITEMGROUP_NAME LIKE '%Quần%'
  ORDER BY itd.C12_AMOUNT DESC
  LIMIT 2;
     
-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- SALES_PRICE * AMOUNT <T14> --> SUM lại !
SELECT * FROM t03_order;
SELECT * FROM t14_order_detail;

INSERT INTO t03_order(C03_ORDER_ID, C03_TOTAL_OF_MONEY)
WITH CTE_TOTAL_OF_MONEY AS (
     SELECT odd.C14_ORDER_ID CTE_ORDER_ID,
            SUM(itd.C12_SALES_PRICE * odd.C14_AMOUNT) TOTAL_OF_MONEY
       FROM t14_order_detail odd
       JOIN t12_item_detail itd
         ON odd.C14_ITEM_DETAIL_ID = itd.C12_ITEM_DETAIL_ID
	   GROUP BY odd.C14_ORDER_ID
)
SELECT cte.CTE_ORDER_ID,
       cte.TOTAL_OF_MONEY 
  FROM CTE_TOTAL_OF_MONEY cte ON DUPLICATE KEY;

-- --> Tính ra rồi mà ko biết cách INSERT INTO vào bảng t03_order

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100


-- 23 <xem lại cách làm>,26<50/50>,30<nhờ anh giải thích lại>,31<insert data chưa được>,32