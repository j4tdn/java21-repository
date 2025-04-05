SELECT 
    P.MaPhong, 
    P.SoKhachToiDa, 
    COUNT(H.MaHD) AS n
FROM 
    PHONG P
JOIN 
    HOADON H ON P.MaPhong = H.MaPhong
WHERE 
    H.ThoiGianBatDauSD >= '2024-02-01' AND H.ThoiGianBatDauSD < '2025-03-01'
GROUP BY 
    P.MaPhong, P.SoKhachToiDa
ORDER BY 
    n DESC;
