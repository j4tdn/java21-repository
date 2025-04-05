DROP DATABASE karaoke;
CREATE DATABASE karaoke;
USE karaoke;

-- Câu 1: Tạo đầy đủ lược đồ cơ sở dữ liệu quan hệ như mô tả ở trên. Sinh viên tự định nghĩa kiểu dữ liệu cho các cột

CREATE TABLE KHACHHANG(
	MaKH VARCHAR(20) PRIMARY KEY,
    TenKH VARCHAR(200) NOT NULL,
    DiaChi VARCHAR(200),
    SoDT VARCHAR(15) NOT NULL,
    MaSoThue VARCHAR(15) NOT NULL
);

CREATE TABLE PHONG(
	MaPhong VARCHAR(20) PRIMARY KEY,
    SoKhachHangToiDa INT CHECK(SoKhachHangToiDa > 0),
    TrangThai VARCHAR(50),
    MoTa VARCHAR(255)
);

CREATE TABLE DICHVU(
	MaDV VARCHAR(15) PRIMARY KEY,
    TenDV VARCHAR(100) NOT NULL,
    DonViTinh VARCHAR(50) NOT NULL,
    DonGia INT
);

CREATE TABLE MUCTIENGIO(
	MaTienGio VARCHAR(15) PRIMARY KEY,
    DonGia INT NOT NULL CHECK(DonGia > 0),
    MoTa VARCHAR(255)
);

CREATE TABLE HOADON(
	MaHD VARCHAR(15) PRIMARY KEY,
    MaKH VARCHAR(15),
    MaPhong VARCHAR(15),
    MaTienGio VARCHAR(15),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiHD VARCHAR(50),
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
    FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
    FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV(
	MaHD VARCHAR(15),
    MaDV VARCHAR(15),
    SoLuong INT,
    PRIMARY KEY (MaHD, MaDV),
    FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
    FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

-- Câu 2: Chèn tối thiểu 2 dòng dữ liệu mẫu cho mỗi bảng đã được minh họa ở trên vào tất cả các bảng một cách chính xác
-- KHACHHANG
INSERT INTO KHACHHANG(MaKH, TenKH, DiaChi, SoDT, MaSoThue) 
VALUES
('KH001', 'Trần Văn Nam', 'Hải Châu', 905123456, 12345678),
('KH002', 'Nguyễn Mai Anh', 'Liên Chiểu', 905123457, 12345679),
('KH003', 'Phan Hoài Lan Khue', 'Hòa Vang', 905123458, 12345680),
('KH004', 'Nguyễn Hoài Nguyên', 'Hòa Cẩm', 905123459, 12345681),
('KH005', 'Lê Trường Ngọc Anh', 'Hải Châu', 905123460, 12345682),
('KH006', 'Lê Văn Hòa', 'Thanh Khê', 905123461, 12345683),
('KH007', 'Nguyễn Thị Kim', 'Đà Nẵng', 905123462, 12345684),
('KH008', 'Trần Minh Tú', 'Hải Châu', 905123463, 12345685),
('KH009', 'Hoàng Văn Lợi', 'Liên Chiểu', 905123464, 12345686),
('KH010', 'Nguyễn Xuân Thủy', 'Hòa Vang', 905123465, 12345687);

-- PHONG
INSERT INTO PHONG(MaPhong, SoKhachHangToiDa, TrangThai, MoTa) 
VALUES
('VIP01', 5, 'Được sử dụng', 'Phòng VIP'),
('P02', 10, 'Được sử dụng', 'Phòng bình thường'),
('P03', 15, 'Được sử dụng', 'Phòng bình thường'),
('VIP04', 20, 'Được sử dụng', 'Phòng VIP'),
('P05', 25, 'Được sử dụng', 'Phòng bình thường'),
('P06', 12, 'Được sử dụng', 'Phòng bình thường'),
('VIP07', 8, 'Được sử dụng', 'Phòng VIP'),
('P08', 20, 'Được sử dụng', 'Phòng bình thường'),
('P09', 30, 'Được sử dụng', 'Phòng bình thường'),
('P10', 25, 'Được sử dụng', 'Phòng bình thường');

-- DICHVU
INSERT INTO DICHVU(MaDV, TenDV, DonViTinh, DonGia) 
VALUES
('DV01', 'Hạt Dưa', 'Bao', 5000),
('DV02', 'Trái Cây', 'Dĩa', 30000),
('DV03', 'Bia', 'Lon', 35000),
('DV04', 'Nước Ngọt', 'Chai', 10000),
('DV05', 'Rượu', 'Chai', 200000),
('DV06', 'Pizza', 'Chiec', 70000),
('DV07', 'Hamburger', 'Chiec', 50000),
('DV08', 'Karaoke', 'Gio', 200000),
('DV09', 'Coca Cola', 'Chai', 12000),
('DV10', 'Bánh Ngọt', 'Miếng', 15000);

-- MUCTIENGIO
INSERT INTO MUCTIENGIO(MaTienGio, DonGia, MoTa) 
VALUES
('MT01', 60000, 'Áp dụng từ 6 giờ đến 17 giờ'),
('MT02', 80000, 'Áp dụng từ 17 giờ đến 22 giờ'),
('MT03', 100000, 'Áp dụng từ 22 giờ đến 6 giờ sáng'),
('MT04', 90000, 'Áp dụng cho ngày lễ'),
('MT05', 110000, 'Áp dụng cho các dịp đặc biệt'),
('MT06', 120000, 'Áp dụng cho khách VIP'),
('MT07', 130000, 'Áp dụng cho nhóm từ 10 người trở lên'),
('MT08', 70000, 'Áp dụng cho thứ 2 đến thứ 5'),
('MT09', 50000, 'Áp dụng cho trẻ em dưới 12 tuổi'),
('MT10', 150000, 'Áp dụng cho các buổi tiệc');

-- HOA DON
INSERT INTO HOADON(MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD) 
VALUES
('HD001', 'KH001', 'VIP01', 'MT01', STR_TO_DATE('11/20/2015 08:15', '%m/%d/%Y %H:%i'), STR_TO_DATE('11/20/2015 12:30', '%m/%d/%Y %H:%i'), 'Đã thanh toán'),
('HD002', 'KH002', 'P02', 'MT01', STR_TO_DATE('12/12/2015 13:10', '%m/%d/%Y %H:%i'), STR_TO_DATE('12/12/2015 17:20', '%m/%d/%Y %H:%i'), 'Chưa thanh toán'),
('HD003', 'KH001', 'P02', 'MT01', STR_TO_DATE('10/15/2014 12:12', '%m/%d/%Y %H:%i'), STR_TO_DATE('10/15/2014 16:30', '%m/%d/%Y %H:%i'), 'Đã thanh toán'),
('HD004', 'KH003', 'VIP01', 'MT02', STR_TO_DATE('09/20/2015 18:30', '%m/%d/%Y %H:%i'), STR_TO_DATE('09/20/2015 21:00', '%m/%d/%Y %H:%i'), 'Chưa thanh toán'),
('HD005', 'KH001', 'P03', 'MT02', STR_TO_DATE('11/25/2014 20:00', '%m/%d/%Y %H:%i'), STR_TO_DATE('11/25/2014 21:45', '%m/%d/%Y %H:%i'), 'Thanh toán một phần'),
('HD006', 'KH004', 'P02', 'MT01', STR_TO_DATE('01/05/2014 10:00', '%m/%d/%Y %H:%i'), STR_TO_DATE('01/05/2014 12:00', '%m/%d/%Y %H:%i'), 'Đã thanh toán'),
('HD007', 'KH005', 'VIP01', 'MT02', STR_TO_DATE('02/10/2014 15:00', '%m/%d/%Y %H:%i'), STR_TO_DATE('02/10/2014 18:00', '%m/%d/%Y %H:%i'), 'Chưa thanh toán'),
('HD008', 'KH001', 'P02', 'MT01', STR_TO_DATE('03/20/2014 11:30', '%m/%d/%Y %H:%i'), STR_TO_DATE('03/20/2014 14:00', '%m/%d/%Y %H:%i'), 'Đã thanh toán'),
('HD009', 'KH002', 'P03', 'MT02', STR_TO_DATE('04/15/2014 17:00', '%m/%d/%Y %H:%i'), STR_TO_DATE('04/15/2014 20:00', '%m/%d/%Y %H:%i'), 'Chưa thanh toán'),
('HD010', 'KH003', 'VIP04', 'MT03', STR_TO_DATE('05/25/2014 19:30', '%m/%d/%Y %H:%i'), STR_TO_DATE('05/25/2014 21:30', '%m/%d/%Y %H:%i'), 'Đã thanh toán');

-- CHITIET_SUDUNGDV
INSERT INTO CHITIET_SUDUNGDV(MaHD, MaDV, SoLuong) 
VALUES
('HD001', 'DV01', 5),
('HD001', 'DV02', 2),
('HD002', 'DV01', 8),
('HD002', 'DV02', 5),
('HD002', 'DV03', 2),
('HD003', 'DV04', 1),
('HD004', 'DV05', 3),
('HD005', 'DV02', 4),
('HD006', 'DV03', 6),
('HD007', 'DV01', 1); 

SELECT * FROM KHACHHANG;
SELECT * FROM PHONG;
SELECT * FROM DICHVU;
SELECT * FROM MUCTIENGIO;
SELECT * FROM HOADON;
SELECT * FROM CHITIET_SUDUNGDV;

-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015
SELECT MaPhong, COUNT(*) AS SoLanSuDung
  FROM HOADON
 WHERE ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
 GROUP BY MaPhong
 ORDER BY SoLanSuDung DESC; 
 
-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014
SELECT chitiet.MaDV, SUM(chitiet.SoLuong) AS TongSoLuong
  FROM CHITIET_SUDUNGDV as chitiet
  JOIN HOADON as hd ON chitiet.MaHD = hd.MaHD
 WHERE hd.ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2014-12-01'
 GROUP BY MaDV
 ORDER BY TongSoLuong DESC
 LIMIT 2;
 
-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT * 
  FROM PHONG 
 WHERE MaPhong LIKE 'VIP%';
 