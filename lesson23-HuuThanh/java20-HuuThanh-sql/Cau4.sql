SELECT 
    MONTH(H.ThoiGianBatDauSD) AS Thang,
    D.TenDV,
    SUM(CS.SoLuong) AS n
FROM 
    CHITIET_SUDUNGDV CS
JOIN 
    HOADON H ON CS.MaHD = H.MaHD
JOIN 
    DICHVU D ON CS.MaDV = D.MaDV
WHERE 
    H.ThoiGianBatDauSD >= '2024-01-01' AND H.ThoiGianBatDauSD < '2025-01-01'
GROUP BY 
    MONTH(H.ThoiGianBatDauSD), D.TenDV
ORDER BY 
    Thang, n DESC;
