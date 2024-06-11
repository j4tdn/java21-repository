-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    -- Top 5 mặt hàng có giá bán cao nhất
    
    -- Cách 1: Sử dụng truy vấn con
    -- Khi cần 'liệt kê' dữ liệu ở bảng A, nhưng điều kiện ở bảng B, C(sub query thông qua linked column)
    select *
    from t01_item
    WHERE C01_ITEM_GROUP_ID = (select C02_ITEM_GROUP_ID from t02_item_group where C02_ITEM_GROUP_NAME like '%Thắt lưng%');
    
    
    -- Thay vì dùng = (Tuy vấn con có duy nhất 1 kết quả)
    -- Truy vấn con có nhiều hơn 1 kết quả, thay = IN, EXISTS
    -- Cách 2: Sử dụng liên kết bảng - JOIN
    -- Khi cần 'liệt kê' kèm với điều kiện xuất hiện ở 2, nhiều bảng --> JOIN
    WITH CTE_MSP AS(
		Select C12_ITEM_ID ITEM_ID,
			MAX(C12_SALES_PRICE) MAX_SALES_PRICE
            FROM t12_item_detail
            GROUP BY C12_ITEM_ID
            ORDER BY MAX_SALES_PRICE DESC
            LIMIT 5
	)
    SELECT t01.*,
			cte.MAX_SALES_PRICE
    FROM t01_item T01
	JOIN CTE_MSP cte
	ON t01.C01_ITEM_ID = cte.ITEM_ID;
    
    -- Liệt kê mặt hàng gồm giá mua và tất cả các giá bán của mặt hàng đó theo size
    SELECT * FROM t01_item WHERE C01_ITEM_ID = 6;
    SELECT * FROM t12_item_detail WHERE C012_ITEM_ID = 6;
    SELECT * FROM t06_size WHERE C06_IZE_ID IN (2,4,6,8,10);
    
    -- Level 2
    SELECT t1.C01_ITEM_ID,
		   t1.C01_ITEM_NAME,
           t1.C01_BUY_PRICE,
           
           -- t6.C06_SIZE_NAME,
           -- IF(C06_GENDER = 0, 'Female', 'Male') AS C06_GENDER,
           GROUP_CONCAT(
				concat(t6.C06_SIZE_NAME, '(', IF(C06_GENDER = 0, 'Female', 'Male'), ')', t12.C12_SALES_PRICE) SEPARATOR '*|*'
           ) AS ITEM_DETAILS
           
	  FROM t01_item t1 
      JOIN t12_item_detail t12 ON t1.C01_ITEM_ID = 	t12.C12_ITEM_ID
      JOIN t06_size t6 ON t12.C12_SIZE_ID = t6.C06_SIZE_ID
      GROUP BY t1.C01_ITEM_ID,
		   t1.C01_ITEM_NAME,
           t1.C01_BUY_PRICE;
      
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    -- Được bán trong tháng 11/2019
    -- Được giao hàng tại Hòa Khánh
    
    select * 
		from t03_order
        -- where cast(C03_ORDER_TIME AS DATE) = '2024-04-18';
        where cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y ');
        
	-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    select *
		from t03_order
        where cast(C03_ORDER_TIME as DATE) >= str_to_date('10.04.2024', '%d.%m.%Y ') AND 
			  cast(C03_ORDER_TIME as DATE) < str_to_date('18.04.2024', '%d.%m.%Y ');
        
	-- Được bán trong tháng 11/2019
     select *
		from t03_order
        where MONTH(C03_ORDER_TIME) = 4;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019

-- Đơn hàng -- > N Mặt Hàng --> Chi tiết đơn hàng
			-- > Bán ngày nào 
	WITH CTE_IDS AS (
		SELECT C03_ORDER_ID FROM t03_order where cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y ')
    )
    SELECT * FROM t14_order_detail root
    WHERE EXISTS (SELECT 1 FROM CTE_IDS cte WHERE cte.C03_ORDER_ID = root.C14_ORDER_ID); 
    
    -- cach 2
    	WITH CTE_IDS AS (
		SELECT C03_ORDER_ID FROM t03_order where cast(C03_ORDER_TIME AS DATE) = str_to_date('18.04.2024', '%d.%m.%Y ')
    )  
    SELECT * FROM t14_order_detail root
    JOIN CTE_IDS cte 
    ON cte.C03_ORDER_ID = root.C14_ORDER_ID; 

	SELECT t3.C03_ORDER_ID,
			t3.C03_ORDER_TIME,
			t1.C01_ITEM_ID,
			t1.C01_ITEM_NAME,
			t12.C12_AMOUNT,
            t14.*
	FROM t03_order t3
	JOIN t14_order_detail t14 ON t3.C03_ORDER_ID = t14.C14_ORDER_ID
	JOIN t12_item_detail t12 ON t14.C14_ITEM_DETAIL_ID = t12.C12_ITEM_DETAIL_ID
	JOIN t01_item t1 ON t12. C12_ITEM_ID = t1.C01_ITEM_ID
	WHERE cast(C03_ORDER_TIME AS DATE) = '2024-04-18';

	
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	select  t1.C01_ITEM_ID,
			t1.C01_ITEM_NAME,
            t12.C12_SALES_PRICE,
            group_concat(
				 t12.C12_COLOR, t12.C12_AMOUNT
            ) as item_details
		from t01_item t1
        join t12_item_detail t12 on t1.C01_ITEM_ID = t12.C12_ITEM_ID
        where t12.C12_SALES_PRICE >= 100
		AND	  t12.C12_SALES_PRICE <= 300
        group by t1.C01_ITEM_ID,
				t1.C01_ITEM_NAME,
				t12.C12_SALES_PRICE;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)


    
    
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)