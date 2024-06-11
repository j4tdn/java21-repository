select * from t01_item;

-- execution plan: run câu lệnh thực tế và chỉ ra chi tiết câu lệnh làm gì
-- Thực tế
-- explain plan: run câu lệnh với chế độ dự đoán chứ không chạy thực tế câu lệnh(lý thuyết)
-- dự đoán


-- Khi tạo PK, FK, UNIQUE constraint --> tự động tạo index
-- ngoài ra, khi nào sẽ tạo/đánh index cho các column khác
-- chức năng tìm kiếm theo column A, filter bị chậm 
-- cân nhắc để tạo index
-- + tạo khi giá trị của column A không /ít trùng nhau
-- lưu ý: truy vấn mệnh đề where cố gắng nếu được thì nên truy vấn theo pk

-- tạo index
-- index theo giá trị 
-- 		 theo phân vùng giá trị
-- 
-- Liệt kê mặt hàng có MaMH = 5 hoặc TenMH = 5
select * from t01_item where C01_ITEM_ID=5;
explain select * from t01_item where C01_ITEM_ID=5;


-- VD tạo index cho column C01_BUY_PRICE
ALTER TABLE T01_ITEM
ADD INDEX IDXNAME(C01_BUY_PRICE)
-- rows: số dòng câu lệnh duyệt qua
-- filtered: tính ra % số dòng câu lệnh trả về từ rows
--         : càng lớn -> càng tốt (duyệt rows bao nhiêu dòng, lấy nhiều nhất có thể
--         : càng nhỏ -> càng xấu (duyệt row nhiều dòng, chỉ lấy rất ít)

explain select * from t01_item where C01_BUY_PRICE= 60;

select * from t01_item where C01_item_group_id = 1;