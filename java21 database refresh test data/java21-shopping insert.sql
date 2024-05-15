SET FOREIGN_KEY_CHECKS = 0;

-- t02_item_group
INSERT INTO t02_item_group(C02_ITEMGROUP_ID, C02_ITEMGROUP_NAME) VALUES 
(1,	'Áo'),
(2, 'Quần'),
(3,	'Giày'),
(4,	'Dép'),
(5,	'Mũ'),
(6,	'Thắt lưng'),
(7,	'Túi xách');

-- t04_payment_method
INSERT INTO t04_payment_method(C04_PMETHOD_ID, C04_PMETHOD_DESC) VALUES
(1,	'Tiền mặt'),
(2,	'Thẻ tín dụng'),
(3,	'Thẻ ghi nợ'),
(4,	'Ví điện tử');
-- Cách 2: CTE: common table expression --> "bảng tạm"
-- phạm vi sử dụng: chỉ trong một câu lệnh SQL
-- WITH cte_payment_method AS (
--	  SELECT 1 P_ID, 'Tiền mặt' P_DESC UNION
--    SELECT 2, 'Thẻ tín dụng' UNION
--    SELECT 3, 'Thẻ ghi nợ' UNION
--    SELECT 4, 'Ví điện tử' )

-- t05_order_status
INSERT INTO t05_order_status(C05_ORDER_STATUS_ID, C05_ORDER_STATUS_DESC) VALUES
(1,	'Chờ xác nhận'),
(2,	'Đang đóng gói'),
(3,	'Đóng gói hoàn thành'),
(4,	'Đang vận chuyển'),
(5,	'Giao hàng thành công'),
(6,	'Giao hàng thất bại'),
(7,	'Hủy đơn hàng');

-- t06_size
INSERT INTO t06_size(C06_SIZE_ID, C06_SIZE_NAME, C06_GENDER, C06_SIZE_DESC) VALUES
(1,	'S', 	0,	'Size S cho Nữ'),
(2,	'M',	0,	'Size M cho Nữ'),
(3,	'L',	0,	'Size L cho Nữ'),
(4,	'XL',	0,	'Size XL cho Nữ'),
(5,	'XXL',	0,	'Size XXL cho t12_item_detailNữ'),
(6,	'S',	1,	'Size S cho Nam'),
(7,	'M',	1,	'Size M cho Nam'),
(8,	'L',	1,	'Size L cho Nam'),
(9,	'XL',	1,	'Size XL cho Nam'),
(10, 'XXL',	1,	'Size XXL cho Nam');

-- t08_title
INSERT INTO t08_title(C08_TITLE_ID, C08_TITLE_NAME) VALUES
(1,	'Nhân viên'),
(2, 'Trưởng bộ phận'),
(3,	'Giảm đốc'),
(4,	'Chủ sở hữu');

-- t01_item
INSERT INTO t01_item(C01_ITEM_ID, C01_ITEM_NAME, C01_BUY_PRICE, C01_ITEM_GROUP_ID) VALUES
(1,	'Áo 1',	100, 1),
(2,	'Áo 2',	60,	1),
(3,	'Áo 3',	80,	1),
(4,	'Quần 4', 40,	2),
(5,	'Quần 5', 60,	2),
(6,	'Giày 6', 180, 3),
(7,	'Giày 7', 80,	3),
(8,	'Giày 8', 126, 3),
(9,	'Giày 9', 142, 3),
(10, 'Giày 10',	195, 3),
(11, 'Giép 11',	180, 4),
(12, 'Áo 12', 88,	1),
(13, 'Giép 13',	200, 4),
(14, 'Mũ 14', 120, 5),
(15, 'Mũ 15', 160, 5),
(16, 'Thắt lưng 16', 140, 6),
(17, 'Thắt lưng 17', 170, 6),
(18, 'Mũ 18',	120, 5),
(19, 'Túi xách 1',	175, 7),
(20, 'Túi xách 2',	186, 7);

-- t12_item_detail

-- ITEM, SIZE có ID lẻ: AMOUNT = 125, SALES_PRICE = BUY_PRICE * 2 + SIZE_ID * 5
-- ITEM, SIZE có ID chẵn: AMOUNT = 280, SALES_PRICE = BUY_PRICE * 2 + SIZE_ID * 5 + 20
INSERT INTO t12_item_detail(C12_ITEM_ID, C12_SIZE_ID, 
                            C12_COLOR, C12_SALES_PRICE, C12_AMOUNT)
WITH 
CTE_ITEM_DETAIL_ODD AS (
    SELECT 
        it.C01_ITEM_ID ITEM_ID,
        s.C06_SIZE_ID SIZE_ID,
        (SELECT elt(floor(rand() * 7 + 1), 'Đỏ', 'Cam', 'Vàng', 'Lục', 'Lam', 'Chàm', 'Tím')) COLOR,
        it.C01_BUY_PRICE * 2 + s.C06_SIZE_ID * 5 SALES_PRICE,
        '125' AMOUNT
    FROM 
        t01_item it, t06_size s
    WHERE 
        (it.C01_ITEM_ID MOD 2 != 0) AND 
        (s.C06_SIZE_ID MOD 2 != 0)
    ORDER BY 
        it.C01_ITEM_ID, s.C06_SIZE_ID
),
CTE_ITEM_DETAIL_EVEN AS (
    SELECT 
        it.C01_ITEM_ID ITEM_ID,
        s.C06_SIZE_ID SIZE_ID,
        (SELECT elt(floor(rand() * 7 + 1), 'Đỏ', 'Cam', 'Vàng', 'Lục', 'Lam', 'Chàm', 'Tím')) COLOR,
        it.C01_BUY_PRICE * 2 + s.C06_SIZE_ID * 5 + 20 SALES_PRICE,
        '280' AMOUNT
    FROM 
        t01_item it, t06_size s
    WHERE 
        (it.C01_ITEM_ID MOD 2 = 0) AND 
        (s.C06_SIZE_ID MOD 2 = 0)
    ORDER BY 
        it.C01_ITEM_ID, s.C06_SIZE_ID
), 
CTE_ITEM_DETAIL AS (
    SELECT * FROM CTE_ITEM_DETAIL_ODD
    UNION 
    SELECT * FROM CTE_ITEM_DETAIL_EVEN
)

SELECT * 
  FROM CTE_ITEM_DETAIL
  ORDER BY ITEM_ID, SIZE_ID;
  
-- t11_customer
CALL insert_into_cust(18);

-- t03_order
INSERT INTO t03_order(C03_ORDER_ID, C03_ORDER_TIME, C03_DELIVERY_FEE,
                      C03_DELIVERY_ADDRESS, C03_RECEIVER_PHONE,
                      C03_TOTAL_OF_MONEY, C03_PMETHOD_ID, C03_CUSTOMER_ID) 
VALUES 
(1, STR_TO_DATE('10.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 1', 2581369741, 0, 1, 1),
(2, STR_TO_DATE('12.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 2', 2583269741, 0, 1, 2),
(3, STR_TO_DATE('14.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 3', 2583369741, 0, 2, 3),
(4, STR_TO_DATE('16.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 4', 2583369741, 0, 2, 4),
(5, STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 5', 2583469741, 0, 3, 5),
(6, STR_TO_DATE('12.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 6', 2583569741, 0, 3, 6),
(7, STR_TO_DATE('14.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 7', 2586369741, 0, 4, 7),
(8, STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 50, 'Địa chỉ 8', 2586369741, 0, 4, 8),
(9, STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 50, 'Địa chỉ 9', 2587369741, 0, 4, 1),
(10, STR_TO_DATE('18.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 10', 2568369741, 0, 4, 2),
(11, STR_TO_DATE('20.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 11', 2568369741, 0, 3, 9),
(12, STR_TO_DATE('26.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 12', 2586369741, 0, 3, 10),
(13, STR_TO_DATE('28.04.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 13', 2583669741, 0, 1, 5);

-- CHÈN THÊM DỮ LIỆU CHO BẢNG T03_ORDER
INSERT INTO t03_order(C03_ORDER_ID, C03_ORDER_TIME, C03_DELIVERY_FEE,
                      C03_DELIVERY_ADDRESS, C03_RECEIVER_PHONE,
                      C03_TOTAL_OF_MONEY, C03_PMETHOD_ID, C03_CUSTOMER_ID) 
VALUES 
(14, STR_TO_DATE('01.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 14', 2581369741, 0, 1, 1),
(15, STR_TO_DATE('02.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 15', 2583269741, 0, 1, 2),
(16, STR_TO_DATE('03.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 16', 2583369741, 0, 2, 3),
(17, STR_TO_DATE('04.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 17', 2583369741, 0, 2, 4),
(18, STR_TO_DATE('05.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 18', 2583469741, 0, 3, 5),
(19, STR_TO_DATE('06.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 19', 2583569741, 0, 3, 6),
(20, STR_TO_DATE('07.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 20', 2586369741, 0, 4, 7),
(21, STR_TO_DATE('08.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 50, 'Địa chỉ 21', 2586369741, 0, 4, 8),
(22, STR_TO_DATE('09.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 50, 'Địa chỉ 22', 2587369741, 0, 4, 1),
(23, STR_TO_DATE('10.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 23', 2568369741, 0, 4, 2),
(24, STR_TO_DATE('11.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 24', 2568369741, 0, 3, 9),
(25, STR_TO_DATE('12.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 25', 2586369741, 0, 3, 10),
(26, STR_TO_DATE('13.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 26', 2583669741, 0, 1, 5),
(27, STR_TO_DATE('14.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 27', 2581369741, 0, 1, 1),
(28, STR_TO_DATE('15.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 28', 2583269741, 0, 1, 2),
(29, STR_TO_DATE('16.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 29', 2583369741, 0, 2, 3),
(30, STR_TO_DATE('17.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 30', 2583369741, 0, 2, 4),
(31, STR_TO_DATE('01.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 31', 2581369741, 0, 1, 1),
(32, STR_TO_DATE('02.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 32', 2583269741, 0, 1, 2),
(33, STR_TO_DATE('03.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 33', 2583369741, 0, 2, 3),
(34, STR_TO_DATE('04.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 34', 2583369741, 0, 2, 4),
(35, STR_TO_DATE('05.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 30, 'Địa chỉ 35', 2583469741, 0, 3, 5),
(36, STR_TO_DATE('06.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 36', 2583569741, 0, 3, 6),
(37, STR_TO_DATE('07.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 40, 'Địa chỉ 37', 2586369741, 0, 4, 7),
(38, STR_TO_DATE('08.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 50, 'Địa chỉ 38', 2586369741, 0, 4, 8),
(39, STR_TO_DATE('09.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 50, 'Địa chỉ 39', 2587369741, 0, 4, 1),
(40, STR_TO_DATE('10.05.2024 08:10:20', '%d.%m.%Y %H:%i:%s'), 20, 'Địa chỉ 40', 2568369741, 0, 4, 2);


-- T07_EMPLOYE
CALL insert_into_employee(10);
UPDATE t07_employee SET C07_TITLE_ID = 2 WHERE C07_EMPLOYEE_ID IN (3,7);
UPDATE t07_employee SET C07_TITLE_ID = 3 WHERE C07_EMPLOYEE_ID IN (8); 
UPDATE t07_employee SET C07_TITLE_ID = 4 WHERE C07_EMPLOYEE_ID IN (10);

-- T13_GALLERY
INSERT INTO t13_gallery(C13_PATH, C13_ITEM_ID)
SELECT concat('https://images.pexels.com/photos/736230/', C01_ITEM_ID), C01_ITEM_ID FROM t01_item;

-- T14_ORDER_DETAIL
INSERT INTO t14_order_detail(C14_ORDER_ID, C14_ITEM_DETAIL_ID, C14_AMOUNT) VALUES
(1,	1,	2), (1,	3,	4),
(2,	4,	2), (2,	5,	2),
(3,	6,	4), (3,	2,	4),
(4,	8,	2), (4,	12,	4),
(5,	88, 1), (5,	22,	3), (5,	11,	1), (5,	33,	1),
(6,	2,	1),
(7,	1,	2),
(8,	27,	1), (8,	23,	1), (8,	98,	2),
(9,	100,6), (9,	11,	7), (9,	45,	2), (9,	22,	2), (9,	32,	1),
(10,18,	2), (10,29,	4),
(11,33,	2),(11,	65,	1), (11,1,	1),(11,	2,	2),(11,	5,	5),(11,	7,	10),
(12,55,	1),
(13,92, 1), (13,14,	2);

-- CHÈN THÊM DỮ LIỆU VÀO BẢNG T14_ORDER_DETAIL
INSERT INTO t14_order_detail(C14_ORDER_ID, C14_ITEM_DETAIL_ID, C14_AMOUNT) VALUES
(14, 1, 2), (14, 3, 4),
(15, 4, 2), (15, 5, 2),
(16, 6, 4), (16, 2, 4),
(17, 8, 2), (17, 12, 4),
(18, 88, 1), (18, 22, 3), (18, 11, 1), (18, 33, 1),
(19, 2, 1),
(20, 1, 2),
(21, 27, 1), (21, 23, 1), (21, 98, 2),
(22, 100, 6), (22, 11, 7), (22, 45, 2), (22, 22, 2), (22, 32, 1),
(23, 18, 2), (23, 29, 4),
(24, 33, 2), (24, 65, 1), (24, 1, 1), (24, 2, 2), (24, 5, 5), (24, 7, 10),
(25, 55, 1),
(26, 92, 1), (26, 14, 2),
(27, 1, 2), (27, 3, 4),
(28, 4, 2), (28, 5, 2),
(29, 6, 4), (29, 2, 4),
(30, 8, 2), (30, 12, 4),
(31, 88, 1), (31, 22, 3), (31, 11, 1), (31, 33, 1),
(32, 2, 1),
(33, 1, 2),
(34, 27, 1), (34, 23, 1), (34, 98, 2),
(35, 100, 6), (35, 11, 7), (35, 45, 2), (35, 22, 2), (35, 32, 1),
(36, 18, 2), (36, 29, 4),
(37, 33, 2), (37, 65, 1), (37, 1, 1), (37, 2, 2), (37, 5, 5), (37, 7, 10),
(38, 55, 1),
(39, 92, 1), (39, 14, 2),
(40, 1, 2), (40, 3, 4);


INSERT INTO `t15_order_status_detail`(C15_ORDER_ID, C15_ORDER_STATUS_ID, C15_EMPLOYEE_ID, C15_LAST_UPDATED)
WITH CTE_ORDER_DELIVERY_STATUS_DETAIL AS (
	-- 1. Đơn hàng từ 1 - 5 --> Giao thành công (trạng thái từ 1 - 5)
	SELECT dorder.C03_ORDER_ID ORDER_ID,
		   dstatus.C05_ORDER_STATUS_ID STATUS_ID,
		   1 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (5 - dstatus.C05_ORDER_STATUS_ID) DAY) LAST_UPDATED_AT 
	  FROM t03_order dorder, t05_order_status dstatus
	 WHERE dorder.C03_ORDER_ID BETWEEN 1 AND 5
	   AND dstatus.C05_ORDER_STATUS_ID BETWEEN 1 AND 5

	UNION
	 
	-- 2. Đơn hàng từ 6 - 8 --> Đóng gói thành công (trạng thái từ 1 - 3)
	SELECT dorder.C03_ORDER_ID ORDER_ID,
		   dstatus.C05_ORDER_STATUS_ID STATUS_ID,
		   2 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (3 - dstatus.C05_ORDER_STATUS_ID) DAY) LAST_UPDATED_AT 
	FROM t03_order dorder, t05_order_status dstatus
	WHERE dorder.C03_ORDER_ID BETWEEN 6 AND 8
	AND dstatus.C05_ORDER_STATUS_ID BETWEEN 1 AND 3

	UNION

	-- 3. Đơn hàng từ 9 - 10 --> Đang giao hàng (trạng thái từ 1 - 4)
	SELECT dorder.C03_ORDER_ID ORDER_ID,
		   dstatus.C05_ORDER_STATUS_ID STATUS_ID,
		   3 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (4 - dstatus.C05_ORDER_STATUS_ID) DAY) LAST_UPDATED_AT 
	FROM t03_order dorder, t05_order_status dstatus
	WHERE dorder.C03_ORDER_ID BETWEEN 9 AND 10
	AND dstatus.C05_ORDER_STATUS_ID BETWEEN 1 AND 4

	UNION

	-- 4. Đơn hàng từ 11 - 12 --> Hủy đơn hàng (trạng thái 7)
	SELECT dorder.C03_ORDER_ID ORDER_ID,
		   7 STATUS_ID, -- cancel
		   4 EMPLOYEE_ID,
		   current_timestamp() LAST_UPDATED_AT
	  FROM t03_order dorder
	 WHERE dorder.C03_ORDER_ID BETWEEN 11 AND 12
     
     UNION
     
     -- 5. Đơn hàng từ 13 --> Giao hàng thất bại (trạng thái từ 1,2,3,4,6)
	SELECT dorder.C03_ORDER_ID ORDER_ID,
		   dstatus.C05_ORDER_STATUS_ID STATUS_ID,
		   5 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (6 - dstatus.C05_ORDER_STATUS_ID) DAY) LAST_UPDATED_AT 
	FROM t03_order dorder, t05_order_status dstatus
	WHERE dorder.C03_ORDER_ID = 13
	AND dstatus.C05_ORDER_STATUS_ID IN (1,2,3,4,6)
     
     
)
SELECT * FROM CTE_ORDER_DELIVERY_STATUS_DETAIL
ORDER BY ORDER_ID, STATUS_ID;

SET FOREIGN_KEY_CHECKS = 1;