INSERT INTO KHACHHANG VALUES 
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679'),
('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905123458', '12345680'),
('KH004', 'Nguyen Hoai Nguyen', 'Hoa Cam', '0905123459', '12345681'),
('KH005', 'Le Truong Ngoc Anh', 'Hai Chau', '0905123460', '12345682'),
('KH006', 'Ho Hoai Anh', 'Hai Chau', '0905123461', '12345683'),
('KH007', 'Pham Thi Huong', 'Son Tra', '0905123462', '12345684'),
('KH008', 'Chau Trinh Tri', 'Hai Chau', '0905123463', '12345685'),
('KH009', 'Phan Nhu Thao', 'Hoa Khanh', '0905123464', '12345686'),
('KH010', 'Tran Thi To Tam', 'Son Tra', '0905123465', '12345687');




INSERT INTO PHONG VALUES
('VIP01', 5, 'Duoc su dung', 'phong vip'),
('P02', 10, 'Duoc su dung', 'phong binh thuong'),
('P03', 15, 'Duoc su dung', 'phong binh thuong'),
('VIP04', 20, 'Duoc su dung', 'phong vip'),
('P05', 25, 'Duoc su dung', 'phong binh thuong'),
('P06', 30, 'Duoc su dung', 'phong binh thuong'),
('VIP07', 35, 'Duoc su dung', 'phong vip'),
('P08', 40, 'Duoc su dung', 'phong binh thuong'),
('VIP09', 45, 'Duoc su dung', 'phong vip'),
('P10', 50, 'Duoc su dung', 'phong binh thuong');



INSERT INTO MUCTIENGIO VALUES
('MTG01', 100000, 'Giá giờ thường'),
('MTG02', 150000, 'Giá giờ VIP'),
('MTG03', 120000, 'Giá giờ khuyến mãi');



INSERT INTO DICHVU VALUES
('DV01', 'Nước suối', 'Chai', 10000),
('DV02', 'Bia', 'Lon', 20000),
('DV03', 'Khăn lạnh', 'Cái', 5000),
('DV04', 'Trái cây', 'Dĩa', 50000);



INSERT INTO HOADON VALUES
('HD001', 'KH001', 'VIP01', 'MTG02', '2024-04-01 18:00:00', '2024-04-01 20:00:00', 'Hoan thanh'),
('HD002', 'KH002', 'P02', 'MTG01', '2024-04-01 19:00:00', '2024-04-01 21:00:00', 'Dang su dung');




INSERT INTO CHITIET_SUDUNGDV VALUES
('HD001', 'DV01', 3),
('HD001', 'DV03', 2),
('HD002', 'DV02', 5),
('HD002', 'DV04', 1);
