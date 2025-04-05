-- Bảng KHACHHANG
INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0987654321', '12345679');

-- Bảng MUCTIENGIO (bổ sung thêm)
INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa) VALUES
('MTG3', 100000, 'Ap dung tu 6 gio den 17 gio'),
('MTG4', 120000, 'Ap dung sau 17 gio den 22 gio');

-- Bảng PHONG
INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MaTienGio, MoTa) VALUES
('VIP01', 5, 'Duoc Su Dung', 'MTG3', 'phong vip'),
('P02', 25, 'Dang su dung', 'MTG4', 'phong binh thuong');

-- Bảng DICHVU
INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES
('DV01', 'Snack khoai tay', 'Bao', 35000),
('DV02', 'Hat Dua', 'Goi', 15000);

-- Bảng HOADON
INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD) VALUES
('HD001', 'KH001', 'VIP01', 'MTG3', '2024-04-05 14:00:00', '2024-04-05 17:30:00', 'Da thanh toan'),
('HD002', 'KH002', 'P02', 'MTG4', '2024-04-06 20:00:00', '2024-04-08 20:00:00', 'Chua Thanh Toan'),
('HD003', 'KH001', 'VIP01', 'MTG3', '2015-01-05 14:00:00', '2015-01-07 17:30:00', 'Da thanh toan'),
('HD004', 'KH002', 'P02', 'MTG4', '2014-05-05 14:00:00', '2014-05-07 17:30:00', 'Da thanh toan'),
('HD006', 'KH001', 'VIP01', 'MTG3', '2014-04-05 14:00:00', '2014-04-06 17:30:00', 'Chua thanh toan');

-- Bảng CHITIET_SUDUNGDV
INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong) VALUES
('HD001', 'DV01', 3),
('HD001', 'DV02', 5),
('HD002', 'DV01', 2),
('HD003', 'DV02', 5),
('HD004', 'DV01', 6),
('HD006', 'DV02', 4);