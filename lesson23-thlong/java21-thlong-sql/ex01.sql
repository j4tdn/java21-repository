create database karaoke;
use karaoke;

-- Câu 1
create table KhachHang (
	MaKH VARCHAR(20) PRIMARY KEY,
    TenKH VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(255) NOT NULL,
    SoDT VARCHAR(20) NOT NULL,
    MaSoThue VARCHAR(100) NOT NULL
);

create table MucTienGio (
	MaTienGio VARCHAR(6) PRIMARY KEY,
    DonGia float not null,
    MoTa TEXT
);

create table Phong (
	MaPhong VARCHAR(6) PRIMARY KEY,
    SoKhachToiDa tinyint not null,
    TrangThai VARCHAR(50) not null,
    MoTa TEXT
);

create table DichVu (
	MaDV VARCHAR(6) PRIMARY KEY,
    TenDV VARCHAR(255) not null,
    DonViTinh VARCHAR(50) not null,
    DonGia float
);

create table HoaDon (
	MaHD VARCHAR(6) PRIMARY KEY,
    MaKH VARCHAR(20) not null,
    MaPhong VARCHAR(6) not null,
    MaTienGio VARCHAR(6) not null,
    ThoiGianBatDauSD datetime,
    ThoiGianKetThucSD datetime,
    TrangThaiHD VARCHAR(50) not null,
    CONSTRAINT FK_KH FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_Phong FOREIGN KEY (MaPhong) REFERENCES Phong(MaPhong),
	CONSTRAINT FK_MaTienGio FOREIGN KEY (MaTienGio) REFERENCES MucTienGio(MaTienGio),
    CONSTRAINT UQ_MaHD UNIQUE (MaKH, MaPhong, MaTienGio)
);

create table ChiTiet_SuDungDV (
	MaHD VARCHAR(6),
    MaDV VARCHAR(6),
    SoLuong int not null,
    PRIMARY KEY (MaHD,MaDV),
    CONSTRAINT FK_DonHang FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_DichVu FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV),
     CONSTRAINT UQ_CTSDDV UNIQUE (MaHD, MaDV)
);

-- Câu 2

INSERT INTO KhachHang VALUES
('KH001', 'Nguyen Van Thanh', '123 Le Loi', '0909123456', '123456789'),
('KH002', 'Tran Thi Loan', '456 Nguyen Trai', '0912345678', '987654321'),
('KH003', 'Le Van Tam', '789 Cach Mang Thang 8', '0938765432', '456123789'),
('KH004', 'Pham Thi Hanh', '10 Hai Ba Trung', '0923456789', '654987321'),
('KH005', 'Hoang Van Bach', '32 Ly Thuong Kiet', '0945678910', '321654987');

INSERT INTO MucTienGio VALUES
('MT001', 150000, 'Ap dung tu 6 gio den 17 gio'),
('MT002', 200000, 'Ap dung tu 17 gio den 22 gio'),
('MT003', 180000, 'Ap dung tu 22 gio den 6 gio');

INSERT INTO Phong VALUES
('P001', 4, 'Duoc su dung', 'Phòng thường'),
('P002', 6, 'Duoc su dung', 'Phòng thường'),
('P003', 8, 'Duoc su dung', 'Phòng thường'),
('P004', 2, 'Duoc su dung', 'Phòng VIP'),
('P005', 10, 'Duoc su dung', 'Phòng VIP'),
('VIP06', 10, 'Duoc su dung', 'Phòng VIP');

INSERT INTO DichVu VALUES
('DV01', 'Nuoc suoi', 'Chai', 10000),
('DV02', 'Tra', 'Ly', 20000),
('DV03', 'banh', 'Gói', 15000),
('DV04', 'Bia', 'Lon', 25000),
('DV05', 'Trai cay', 'Phần', 40000);

INSERT INTO HoaDon VALUES
('HD001', 'KH001', 'P001', 'MT001', '2014-01-22 08:00:00', '2014-01-22 09:30:00', 'Đã thanh toán'),
('HD002', 'KH002', 'P002', 'MT002', '2014-08-05 10:00:00', '2014-08-05 12:00:00', 'Chưa thanh toán'),
('HD003', 'KH003', 'P004', 'MT003', '2015-01-04 15:00:00', '2015-01-04 17:00:00', 'Đã thanh toán'),
('HD004', 'KH004', 'P005', 'MT001', '2015-02-25 18:00:00', '2015-02-25 20:00:00', 'Chưa thanh toán'),
('HD005', 'KH005', 'P003', 'MT002', '2015-03-12 19:00:00', '2015-03-12 21:00:00', 'Đã thanh toán');

INSERT INTO ChiTiet_SuDungDV VALUES
('HD001', 'DV01', 2),
('HD001', 'DV02', 1),
('HD002', 'DV03', 3),
('HD003', 'DV01', 1),
('HD004', 'DV05', 2);

-- Câu 3
select p.MaPhong, round(sum(time_to_sec(hd.ThoiGianKetThucSD - hd.ThoiGianBatDauSD) / 3600), 2) AS TongGioSuDung
from HoaDon hd join Phong p on hd.MaPhong = p.MaPhong
where date(hd.ThoiGianBatDauSD) >= '2014-02-01' and date(hd.ThoiGianBatDauSD) < '2015-03-01'
group by p.MaPhong
order by TongGioSuDung desc;

-- Câu 4
select dv.MaDV,
    SUM(TIME_TO_SEC(hd.ThoiGianKetThucSD - hd.ThoiGianBatDauSD) / 3600) AS TongGioSuDung
from HoaDon hd
join ChiTiet_SuDungDV ctdv ON hd.MaHD = ctdv.MaHD
join DichVu dv ON ctdv.MaDV = dv.MaDV
where date(hd.ThoiGianBatDauSD) >= '2014-01-01' and date(hd.ThoiGianBatDauSD) <= '2014-12-31'
group by dv.MaDV
order by TongGioSuDung DESC
limit 2;

-- Câu 5
select *
from phong
where MaPhong like 'VIP%';


