-- 1. Liệt kê các dự án diễn ra trong năm 2021 có số tiền thu được trên 500000.00 triệu VND
SELECT 
    C03_PROJECT_ID, 
    C03_PROJECT_NAME, 
    C03_START_DATE, 
    C03_END_DATE, 
    C03_REVENUE
FROM 
    t03_project
WHERE 
    YEAR(C03_START_DATE) = 2021 AND 
    YEAR(C03_END_DATE) = 2021 AND 
    C03_REVENUE > 500000.00;

-- 2. Liệt kê các nhân viên đã tham gia hơn 170 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT 
	t02.C02_EMPLOYEE_ID, t02.C02_EMPLOYEE_NAME, 
	p.ProjID, 
	p.ProjName, 
	w.HoursWorked
FROM 
	t02_employee t02
	JOIN t04_join_project t04 ON e.EmpID = w.EmpID
	JOIN t03_project p ON w.ProjID = p.ProjID
GROUP BY e.EmpID, p.ProjID
HAVING SUM(w.HoursWorked) > 170;


-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật