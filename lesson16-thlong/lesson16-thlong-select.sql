-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
-- --
	select *
    from t03_project
    where YEAR(t03_startdate) = 2022
			and t03_revenue > 50000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
-- --
	with cte_t04_employee_id as (
	select t04_employee_id, sum(t04_hourwork) as sumhour
    from t04_projectapp
    group by t04_employee_id)
    
    select a.t04_employee_id, a.t04_project_id, a.t04_hourwork
    from t04_projectapp a join cte_t04_employee_id b
		on a.t04_employee_id = b.t04_employee_id
    where b.sumhour > 150;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
-- --
SELECT a.t01_name AS Employee, b.t01_name AS Supervisor
FROM t01_employee a
LEFT JOIN t01_employee b ON a.t01_supervisor = b.t01_employee_id
where a.t01_salary > b.t01_salary

	

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
-- --
select a.t02_department_id, count(a.t02_department_id)
from t02_department a
group by a.t02_department_id
having count(a.t02_department_id)>2

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
-- -- 
	select * 
    from t01_employee
    where YEAR(CURDATE()) - YEAR(t01_datestartwork) > 2;
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
-- --
	select * 
    from t01_employee a 
		join t02_department b on a.t01_employee_id = b.t02_manager_id
        join t03_project c on a.t01_employee_id = c.t03_project_id

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
-- --
	select a.t03_manager_id, count(a.t03_project_id)
    from t03_project a
    group by a.t03_manager_id
    having count(a.t03_project_id) > 1

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật