-- 1. Liệt kê các mặt hàng được bán trong ngày bất kì. Ngày là tham số truyền vào
SELECT t1.C01_ITEM_ID,
       t1.C01_ITEM_NAME,
       time(t3.C03_ORDER_TIME)
FROM t01_item t1
JOIN t12_item_detail t12
ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
JOIN t14_order_detail t14
ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
JOIN t03_order t3
ON t3.C03_ORDER_ID = t14.C14_ORDER_ID
WHERE date(t3.C03_ORDER_TIME) = ?
ORDER BY t3.C03_ORDER_TIME desc, t1.C01_ITEM_ID asc;

-- 2. Thống kế số lượng mặt hàng đang tồn kho của mỗi loại hàng, biết rằng hàng tồn kho là số mặt hàng còn lại trong hệ thống
SELECT t1.C01_ITEM_ID,
	   t1.C01_ITEM_NAME,
	   sum(t12.C12_AMOUNT)
FROM t01_item t1
JOIN t12_item_detail t12 
ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
GROUP BY t1.C01_ITEM_ID, t1.C01_ITEM_NAME

-- 3. Liệt kê top 3 mặt hàng được bán nhiều nhất của năm bất kì. Với năm là tham số truyền vào
SELECT t1.C01_ITEM_NAME
  FROM t03_order t3
  JOIN t14_order_detail t14
	ON t3.C03_ORDER_ID = t14.C14_ORDER_ID
  JOIN t12_item_detail t12
    ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID
  JOIN t01_item t1
	ON t1.C01_ITEM_ID = t12.C12_ITEM_ID
 WHERE year(t3.C03_ORDER_TIME) = ?
 GROUP BY t1.C01_ITEM_ID, t1.C01_ITEM_NAME
 ORDER BY sum(t14.C14_AMOUNT) desc, t1.C01_ITEM_ID desc
 LIMIT 3;
 
-- 4. Liệt kê danh sách các mặt hàng của mỗi loại hàng
SELECT t1.C01_ITEM_ID,
       t1.C01_ITEM_NAME,
	   t12.C12_COLOR,
       t2.C02_ITEM_GROUP_ID,
       t2.C02_ITEM_GROUP_NAME
  FROM t02_item_group t2
  JOIN t01_item t1
    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID
  JOIN t12_item_detail t12
    ON t12.C12_ITEM_ID = t1.C01_ITEM_ID;
    
-- 5. Liệt kê thông tin nhân viên có mức lương cao hơn người quản lý
ALTER TABLE t07_employee ADD COLUMN C07_SALARY DECIMAL;
ALTER TABLE t07_employee ADD COLUMN C07_MANAGER_ID INT;
ALTER TABLE t07_employee ADD FOREIGN KEY (C07_MANAGER_ID) REFERENCES t07_employee(C07_EMPLOYEE_ID);

 


