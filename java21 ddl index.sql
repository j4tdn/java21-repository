SELECT * FROM t01_item;

-- execution plan(Thực tế): run câu lệnh thực tế với dữ liệu trong csdl và chỉ ra chi tiết câu lệnh làm gì

-- explain plan(Dự đoán): run câu lệnh với chế độ dự đoán chứ kh chạy thực tế câu lệnh(lý thuyết)

-- khi tạo PK, FK, UNIQUE constraint --> tự động tạo index
-- ngoài ra, khi nào sẽ tạo/ đánh index cho các column khác
-- chức năng tìm kiếm theo column A, filter bị chậm
-- 		cân nhắc để tạo index
-- 		+ tạo khi giá trị của column A không hoặc ít trùng nhau
-- 		+ phạm vi giá trị 
-- lưu ý: truy vấn mệnh đề where cố gắng nếu được thì nên truy vấn theo pk

-- Tạo index
-- index theo giá trị

SELECT * FROM t01_item WHERE C01_ITEM_ID = 5;
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_ID = 5;
-- rows: số dòng câu lệnh duyệt qua
-- filtered: tính ra % số dòng câu lệnh trả về từ rows
-- 		   : lớn - tốt(duyệt rows bao nhiêu dòng, lấy nhiều nhất có thể)
-- 		   : nhỏ - xấu(duyệt rows nhiều dòng, chỉ lấy rất ít)

SELECT * FROM t01_item WHERE C01_ITEM_NAME = 'Quẩn 5';

-- Ví dụ: Tạo index cho column C01_BUY_PRICE
ALTER TABLE t01_item
ADD INDEX IDX_BUY_PRICE(C01_BUY_PRICE)