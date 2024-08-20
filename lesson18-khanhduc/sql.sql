
-- câu 1:Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số truyền vào
-- Kết quả trả về được sắp xếp theo CREATED_TIME desc, ID asc

SELECT * FROM t01_item;
SELECT * FROM t03_order;


-- ALTER TABLE t03_order
-- ADD COLUMN C03_ITEM_ID INT,
-- ADD CONSTRAINT fk_item
-- FOREIGN KEY (C03_ITEM_ID) 
-- REFERENCES t01_item(C01_ITEM_ID);

SELECT i.C01_ITEM_ID AS ITEM_ID, i.C01_ITEM_NAME AS ITEM_NAME, o.C03_ORDER_TIME AS CREATED_TIME
FROM t01_item i
JOIN t03_order o ON i.C01_ITEM_ID = o.C03_ITEM_ID
WHERE DATE_FORMAT(o.C03_ORDER_TIME, '%Y-%m-%d') = '2024-04-10'
ORDER BY o.C03_ORDER_TIME DESC, i.C01_ITEM_ID ASC;

-- câu 2:Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng
SELECT 
    g.C02_ITEM_GROUP_ID AS ID,
    g.C02_ITEM_GROUP_NAME AS NAME,
    SUM(d.C12_AMOUNT) AS AMOUNT_OF_ITEMS
FROM 
    t02_item_group g
JOIN 
    t01_item i ON g.C02_ITEM_GROUP_ID = i.C01_ITEM_GROUP_ID
JOIN 
    t12_item_detail d ON i.C01_ITEM_ID = d.C12_ITEM_ID
GROUP BY 
    g.C02_ITEM_GROUP_ID, g.C02_ITEM_GROUP_NAME
ORDER BY 
    AMOUNT_OF_ITEMS DESC;
 
 
-- câu 3: Liệt kê top 3 mặt hàng được bán nhiều nhất năm bất kỳ.
-- Với năm là tham số truyền vào.
-- Nếu có nhiều hơn 3 mặt hàng có số lượng lớn nhất bằng
-- nhau, chọn mặt hàng có mã mặt hàng lớn hơn
SELECT name
FROM (
    SELECT i.C01_ITEM_ID AS id, 
           i.C01_ITEM_NAME AS name, 
           SUM(d.C12_AMOUNT) AS amount
    FROM t01_item i
    JOIN t12_item_detail d ON i.C01_ITEM_ID = d.C12_ITEM_ID
    JOIN t03_order o ON d.C12_ITEM_ID = o.C03_ORDER_ID
    WHERE YEAR(o.C03_ORDER_TIME) = 2024
    GROUP BY i.C01_ITEM_ID, i.C01_ITEM_NAME
    ORDER BY amount DESC, id DESC
    LIMIT 3
) AS top_items
LIMIT 0, 1000;


-- câu 4: . Liệt kê danh sách các mặt hàng của mỗi loại hàng

SELECT it.C01_ITEM_ID, it.C01_ITEM_NAME, it.C01_BUY_PRICE, idt.C12_COLOR, idt.C12_SALES_PRICE, itg.C02_ITEM_GROUP_ID, itg.C02_ITEM_GROUP_NAME
FROM t01_item it
join t02_item_group itg
ON it.C01_ITEM_GROUP_ID = itg.C02_ITEM_GROUP_ID
join t12_item_detail idt
on it.C01_ITEM_ID = idt.C12_ITEM_ID
order by it.C01_ITEM_ID, it.C01_ITEM_NAME, it.C01_BUY_PRICE, idt.C12_COLOR, idt.C12_SALES_PRICE, itg.C02_ITEM_GROUP_ID, itg.C02_ITEM_GROUP_NAME;



-- câu 5: Cập nhật cơ sở dữ liệu, yêu cầu nhân viên sẽ có thêm
-- thông tin mức lương và người quản lý(cũng là một nhân viên)
-- Thực hiện liệt kê nhân viên có mức lương cao hơn nhà quản lý

-- CREATE TABLE t16_manager (
--     C16_MANAGER_ID  INT PRIMARY KEY AUTO_INCREMENT,
--     C16_MANAGER_NAME VARCHAR(255) NOT NULL,
--     C16_MANAGER_PHONE VARCHAR(15),
--     C16_MANAGER_EMAIL VARCHAR(255)
-- );

-- ALTER TABLE t07_employee
-- ADD COLUMN C07_SALARY DECIMAL(10, 2),
-- ADD COLUMN C07_MANAGER_ID INT;

-- ALTER TABLE t07_employee
-- ADD CONSTRAINT fk_manager
-- FOREIGN KEY (C07_MANAGER_ID) REFERENCES t16_manager(C16_MANAGER_ID);

-- INSERT INTO t07_employee (C07_EMPLOYEE_ID, C07_EMPLOYEE_NAME, C07_EMPLOYEE_ADDRESS, C07_EMPLOYEE_PHONE, C07_EMPLOYEE_EMAIL, C07_EMPLOYEE_USERNAME, C07_EMPLOYEE_PASSWORD, C07_SALARY, C07_MANAGER_ID, C07_TITLE_ID)
-- VALUES 
-- (1, 'Emily Davis', '123 Main St', 'Da Nang', 'emily.davis@example.com', 'edavis', 'password123', 60000, NULL, 1),  
-- (2, 'Michael Brown', '456 Elm St', 'Ho Chi Minh', 'michael.brown@example.com', 'mbrown', 'password456', 55000, 1, 2), 
-- (3, 'Sarah Wilson', '789 Oak St', 'Ha Noi', 'sarah.wilson@example.com', 'swilson', 'password789', 65000, 2, 3),
-- (4, 'John Smith', '101 Maple St', 'Nghe An', 'john.smith@example.com', 'jsmith', 'password123', 70000, 3, 1);


-- INSERT INTO t16_manager (c16_manager_name, c16_manager_phone, c16_manager_email)
-- VALUES 
-- ('John Doe', '123-456-7890', 'john.doe@example.com'),
-- ('Jane Smith', '098-765-4321', 'jane.smith@example.com'),
-- ('Alice Johnson', '555-555-5555', 'alice.johnson@example.com');

-- ALTER TABLE t16_manager
-- add column C16_SALARY DECIMAL(10, 2);


SELECT e.C07_EMPLOYEE_ID, e.C07_EMPLOYEE_NAME, e.C07_SALARY, e.C07_MANAGER_ID
FROM t07_employee e
join t16_manager m
on e.C07_MANAGER_ID = m.C16_MANAGER_ID
where e.C07_SALARY > m.C16_SALARY;