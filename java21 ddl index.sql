SELECT * FROM t01_item;

-- execution plan: run câu lệnh thực tế với dữ liệu trong CSDL và chi tiết câu lệnh làm gì
-- thực tế

-- explain plan: run câu lệnh với chế độ dự đoán chứ không chạy thực tế câu lệnh(lí thuyết)
-- dự đoán

-- khi tạo PK, FK. UNIQUE constraint --> tự động tạo index
-- ngoài ra, khi nào sẽ tạo/ đánh index cho các column khác
-- chức năng tìm kiếm theo column A, filter bị chậm
-- cân nhắc để tạo ra index
--		+ tạo khi giá trị của column A không/ ít trùng nhau
-- lưu ý: truy vấn mệnh đề where cố gắng nếu được thì nên truy vấn theo pk

EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_ID = 5;
-- rows: số dòng cần lệnh duyệt qua
-- filtered: tính ra % số dòng câu lệnh trả về rows
--		   : lớn -> tốt(duyệt rows bao nhiêu dòng, lấy nhiều nhất có thể)  
--         : nhỏ -> xấu(duyệt rows nhiều dòng, chỉ lấy rất ít)

SELECT * FROM t01_item WHERE C01_ITEM_NAME = 'Quần 5';
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_NAME = 'Quần 5';

-- VD tạo index cho column C01_BUY_PRICE
ALTER TABLE C01_BUY_PRICE
ADD 