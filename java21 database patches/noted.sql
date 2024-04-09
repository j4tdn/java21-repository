--                PRIMARY KEY vs FOREIGN KEY IN DBMS

--  1. (1 - N)
-- "Quan hệ 1-nhiều --> bỏ 1 vào nhiều" 
-- * Tên column khóa ngoại không nhất thiết phải trùng với tên khóa chính ở bảng cha (1)
-- * KDL và miền giá trị của FK phải trùng với PK ở bảng cha	
-- * giá trị của FK có thể trùng nhau
-- ** Dữ liệu bên khóa ngoại bảng N<con> phải tồn tại bên khóa chính bảng 1<cha>
-- ** Khi cập nhật/xóa dữ liệu ở bảng cha --> kiểm tra tính hợp lệ xem dữ liệu có tham chiếu đến 
-- bảng N<con> hay không mới cập nhật/xóa

--  2. (1 - 1)
-- Tạo khóa ngoại bỏ bên bảng nào cũng được (xác định logic phù hợp)
-- Khóa ngoại phải là UNIQUE để đảm bảo đúng dữ liệu

-- 3. (N - N)
-- Tạo BẢNG MỚI gồm:
-- ít nhất là 2 thuộc tính <là 2 khóa chính đồng thời là 2 khóa ngoại liên kết đến 2 bảng N-N>
-- và các thuộc tính khác
