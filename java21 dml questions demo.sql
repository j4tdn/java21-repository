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

-- 2. Đơn hàng
    SELECT * FROM t03_order;
    SELECT * FROM t05_order_status;
    SELECT * FROM t14_order_detail;
    SELECT * FROM t15_order_status_detail;
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
  SELECT * FROM t14_order_detail WHERE C14_ORDER_ID IN (5,8,9); -- item_detail_id (11,22,33,88,23,27,98,11,22,32,45,100);
  SELECT * FROM t12_item_detail WHERE C12_ITEM_DETAIL_ID IN (11,33,88,23,27,98,11,22,32,45,100);
        -- ?? dữ liệu bảng t12 --> cột ID

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
SELECT C12_COLOR COLORS
  FROM t12_item_detail
  GROUP BY C12_COLOR;
  
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 18/4/2024
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
  
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1           Giày    20
-- 	2           Áo      28
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
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

