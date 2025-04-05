-- Tạo database
CREATE DATABASE QuanLyKaraoke;

USE QuanLyKaraoke;

-- Tạo bảng KHACHHANG
CREATE TABLE KHACHHANG (
    MaKH VARCHAR(10) PRIMARY KEY,
    TenKH VARCHAR(255),
    DiaChi VARCHAR(255),
    SoDT VARCHAR(20),
    MaSoThue VARCHAR(20)
);

-- Tạo bảng PHONG
CREATE TABLE PHONG (
    MaPhong VARCHAR(10) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(50),
    MoTa TEXT
);

-- Tạo bảng DICHVU
CREATE TABLE DICHVU (
    MaDV VARCHAR(10) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(50),
    DonGia DECIMAL(10, 2)
);

-- Tạo bảng MUCTIENGIOR
CREATE TABLE MUCTIENGIOR (
    MaTienGio VARCHAR(10) PRIMARY KEY,
    DonGia DECIMAL(10, 2),
    MoTa TEXT
);

-- Tạo bảng HOADON
CREATE TABLE HOADON (
    MaHD VARCHAR(10) PRIMARY KEY,
    MaKH VARCHAR(10),
    MaPhong VARCHAR(10),
    MaTienGio VARCHAR(10),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiHD VARCHAR(50),
    FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
    FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
    FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIOR(MaTienGio)
);

-- Tạo bảng CHITIET_SUDUNGDV
CREATE TABLE CHITIET_SUDUNGDV (
    MaHD VARCHAR(10),
    MaDV VARCHAR(10),
    SoLuong INT,
    PRIMARY KEY (MaHD, MaDV),
    FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
    FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

---------------------------------------------------
-- Chèn dữ liệu vào bảng
INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679'),
('KH003', 'Phan Hoai Lan Khue', 'Hoa Vang', '0905123458', '12345680');

INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES
('VIP01', 5, 'Duoc su dung', 'phong vip'),
('P02', 10, 'Duoc su dung', 'phong binh thuong'),
('P03', 15, 'Duoc su dung', 'phong binh thuong');

INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES
('VIP04', 15, 'Duoc su dung', 'phong binh thuong'),
('P05', 15, 'Duoc su dung', 'phong binh thuong');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES
('DV01', 'Hat Dua', 'Bao', 5000),
('DV02', 'Trai cay', 'Dia', 30000),
('DV03', 'Bia', 'Lon', 35000),
('DV04', 'Nuoc Ngot', 'Chai', 10000),
('DV05', 'Ruou', 'Chai', 200000);

INSERT INTO MUCTIENGIOR (MaTienGio, DonGia, MoTa) VALUES
('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
('MT02', 80000, 'Ap dung sau 17 gio den 22 gio'),
('MT03', 100000, 'Ap dung tu 22 gio den 6 gio sang');

INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD) VALUES
('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15:00', '2015-11-20 12:30:00', 'Da thanh toan'),
('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10:00', '2015-12-12 17:20:00', 'Chua thanh toan'),
('HD003', 'KH001', 'P02', 'MT01', '2015-10-15 12:12:00', '2015-10-15 16:30:00', 'Da thanh toan'),
('HD004', 'KH003', 'VIP01', 'MT02', '2015-09-20 18:30:00', '2015-09-20 21:00:00', 'Chua thanh toan'),
('HD005', 'KH001', 'P03', 'MT02', '2014-11-25 20:00:00', '2014-11-25 21:45:00', 'Thanh toan mot phan'),
('HD006', 'KH002', 'VIP01', 'MT01', '2014-09-12 09:20:00', '2014-09-12 10:45:00', 'Da thanh toan'),
('HD007', 'KH001', 'VIP04', 'MT01', '2014-12-22 11:00:00', '2014-12-22 14:20:00', 'Da thanh toan'),
('HD008', 'KH002', 'VIP04', 'MT02', '2014-08-23 20:10:00', '2014-08-23 22:00:00', 'Chua thanh toan'),
('HD009', 'KH003', 'P05', 'MT03', '2015-12-20 22:30:00', '2015-12-21 01:15:00', 'Chua thanh toan'),
('HD010', 'KH003', 'VIP01', 'MT03', '2015-10-10 01:30:00', '2015-10-10 03:15:00', 'Da thanh toan');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong) VALUES
('HD001', 'DV01', 5),
('HD002', 'DV01', 8),
('HD002', 'DV02', 5),
('HD002', 'DV03', 2),
('HD003', 'DV04', 1),
('HD003', 'DV05', 6),
('HD004', 'DV01', 5),
('HD005', 'DV02', 3),
('HD005', 'DV03', 10),
('HD005', 'DV04', 2),
('HD006', 'DV01', 5),
('HD007', 'DV03', 8),
('HD007', 'DV04', 10),
('HD007', 'DV05', 4),
('HD010', 'DV02', 9),
('HD009', 'DV02', 8);

----------------------------------------------------------------------------------------------------------------
-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều thời gian nhất từ 02.2014 đến 02.2015
SELECT
    p.MaPhong,
    SUM(TIMESTAMPDIFF(MINUTE, h.ThoiGianBatDauSD, h.ThoiGianKetThucSD)) AS TongThoiGianSuDung_Phut
FROM
    PHONG p
JOIN
    HOADON h ON p.MaPhong = h.MaPhong
WHERE
    h.ThoiGianBatDauSD >= '2014-02-01' AND h.ThoiGianBatDauSD < '2015-02-01'
GROUP BY
    p.MaPhong
ORDER BY
    TongThoiGianSuDung_Phut DESC;
    
-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều thời gian nhất trong mỗi tháng từ 01.2014 đến 12.2014
    WITH TongThoiGianDichVuTheoThang AS (
    SELECT
        DATE_FORMAT(h.ThoiGianBatDauSD, '%Y-%m') AS ThangSuDung,
        dv.TenDV,
        SUM(TIMESTAMPDIFF(MINUTE, h.ThoiGianBatDauSD, h.ThoiGianKetThucSD)) AS TongThoiGianSuDung_Phut
    FROM
        HOADON h
    JOIN
        CHITIET_SUDUNGDV ct ON h.MaHD = ct.MaHD
    JOIN
        DICHVU dv ON ct.MaDV = dv.MaDV
    WHERE
        h.ThoiGianBatDauSD >= '2014-01-01' AND h.ThoiGianBatDauSD <= '2014-12-31'
    GROUP BY
        ThangSuDung, dv.TenDV
),
RankDichVuTheoThang AS (
    SELECT
        ThangSuDung,
        TenDV,
        TongThoiGianSuDung_Phut,
        ROW_NUMBER() OVER (PARTITION BY ThangSuDung ORDER BY TongThoiGianSuDung_Phut DESC) AS RankTrongThang
    FROM
        TongThoiGianDichVuTheoThang
)
SELECT
    ThangSuDung,
    TenDV,
    TongThoiGianSuDung_Phut
FROM
    RankDichVuTheoThang
WHERE
    RankTrongThang <= 2
ORDER BY
    ThangSuDung, RankTrongThang;
    
-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT
    MaPhong,
    SoKhachToiDa,
    TrangThai,
    MoTa
FROM
    PHONG
WHERE
    MaPhong LIKE 'VIP%';






















