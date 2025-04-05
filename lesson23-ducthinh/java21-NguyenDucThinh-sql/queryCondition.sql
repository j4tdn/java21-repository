
-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều thời gian nhất từ 02.2014 đến 02.2015
SELECT 
    p.MaPhong,
    p.MoTa AS TenPhong,
    SUM(TIMESTAMPDIFF(HOUR, h.ThoiGianBatDauSD, h.ThoiGianKetThucSD)) AS TongGioSuDung
FROM HOADON h
JOIN PHONG p ON h.MaPhong = p.MaPhong
WHERE h.ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
    AND h.ThoiGianKetThucSD IS NOT NULL
GROUP BY p.MaPhong
ORDER BY TongGioSuDung DESC;


-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều thời gian nhất trong mỗi tháng từ 01.2014 đến 12.2014
WITH ThongKeDichVu AS (
    SELECT 
        MONTH(h.ThoiGianBatDauSD) AS Thang,
        YEAR(h.ThoiGianBatDauSD) AS Nam,
        dv.MaDV,
        dv.TenDV,
        SUM(ct.SoLuong) AS TongSoLuong,
        RANK() OVER (
            PARTITION BY MONTH(h.ThoiGianBatDauSD) 
            ORDER BY SUM(ct.SoLuong) DESC
        ) AS XepHang
    FROM CHITIET_SUDUNGDV ct
    JOIN HOADON h ON ct.MaHD = h.MaHD
    JOIN DICHVU dv ON ct.MaDV = dv.MaDV
    WHERE YEAR(h.ThoiGianBatDauSD) = 2014
    GROUP BY Thang, dv.MaDV
)
SELECT 
    Thang,
    MaDV,
    TenDV,
    TongSoLuong
FROM ThongKeDichVu
WHERE XepHang <= 2
ORDER BY Thang, XepHang;

-- Cau 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP" 
SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';
