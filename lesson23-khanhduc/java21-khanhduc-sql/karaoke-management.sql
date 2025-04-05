CREATE DATABASE karaoke_management;

-- Tạo bảng KHACHHANG
CREATE TABLE KHACHHANG (
    MaKH VARCHAR(10) PRIMARY KEY,
    TenKH VARCHAR(100),
    DiaChi VARCHAR(200),
    SoDT VARCHAR(15),
    MaSoThue VARCHAR(10)
);

-- Tạo bảng PHONG
CREATE TABLE PHONG (
    MaPhong VARCHAR(10) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(50),
    MoTa VARCHAR(200)
);

-- Tạo bảng DICHVU
CREATE TABLE DICHVU (
    MaDV VARCHAR(10) PRIMARY KEY,
    TenDV VARCHAR(100),
    DonViTinh VARCHAR(50),
    DonGia DECIMAL(15, 2)
);

-- Tạo bảng MUCTIENGIO
CREATE TABLE MUCTIENGIO (
    MaTienGio VARCHAR(10) PRIMARY KEY,
    DonGia DECIMAL(15, 2),
    MoTa VARCHAR(200)
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
    FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
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

-- Chèn dữ liệu 

INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUES
    ('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
    ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679');


INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
    ('VIP01', 5, 'Duoc su dung', 'Phong VIP'),
    ('P02', 10, 'Duoc su dung', 'Phong binh thuong');


INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia)
VALUES
    ('DV01', 'Hat Dua', 'Bao', 5000),
    ('DV02', 'Trai cay', 'Dia', 30000);


INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa)
VALUES
    ('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
    ('MT02', 80000, 'Ap dung sau 17 gio den 22 gio');


INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
    ('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15', '2015-11-20 12:30', 'Da thanh toan'),
    ('HD002', 'KH002', 'P02', 'MT02', '2015-12-12 15:10', '2015-12-12 17:20', 'Chua thanh toan');


INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
    ('HD001', 'DV01', 5),
    ('HD002', 'DV02', 8);
    

-- Q3
SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM HOADON
WHERE ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-01'
GROUP BY MaPhong
ORDER BY SoLanSuDung DESC
LIMIT 1;

-- Q4
SELECT 
    EXTRACT(MONTH FROM H.ThoiGianBatDauSD) AS Thang, 
    CT.MaDV, 
    D.TenDV, 
    SUM(CT.SoLuong) AS TongSoLuong
FROM CHITIET_SUDUNGDV CT
JOIN HOADON H ON CT.MaHD = H.MaHD
JOIN DICHVU D ON CT.MaDV = D.MaDV
WHERE H.ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2014-12-31'
GROUP BY Thang, CT.MaDV
ORDER BY Thang, TongSoLuong DESC
LIMIT 2;


-- Q5
SELECT * 
FROM PHONG
WHERE MaPhong LIKE 'VIP%';




