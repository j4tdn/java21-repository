package pattern.builder;

import java.time.LocalDateTime;

public class Ex01RootCase {
	/*
	 * Design Pattern: Là các mẫu thiết kế, được tạo ra/ Sinh ra từ kinh nghiệm của người đi trước
	 * 				 : Giúp mình giải quyết các vấn đề cụ thể
	 *               : 
	 * Builder Pattern: 
	 * Đặt vấn đề
	 * 	+ ĐƯợc dùng để tạo ra đối tượng cho các complex class/object
	 * 	Complex class/ object là các class có nhiều (>=6) thuộc tính và có rất nhiều mixing constructure từ class này
	 * Class A : a1, a2, a3, a4, a5, a6.
	 * 	+constructor()
	 *  +   constructor(a1, a2 ,a3 ,a4 ,a5, a6)      
	 *  +   constructor(a1, ,a5, a6)    
	 *  +   constructor(a1, , a6)     
	 *  
	 *       -->code rườm rà
	 *       --> vì Constructor luôn trùng tên với class
	 *           Ví Dụ: cần constructor 2 tham số a1, a2,  và cần structor a5,a6
	 *           		--> nếu như a1 trùng KDL với a5;
	 *           					a2 trùng KDL với a6 --> không thể
	 *           public A(int a1, String a2) ...
	 *           public A(int a5, String a6) ...
	 *           Xử lý --> Dùng duy nhất hàm khởi tạo rỗ, dùng setter để truyền tham số
	 *           ok
	 *           NHƯNG: --> nếu required 5 tham số thì phải setter 5 lần --> code khá dài cho tạo đối tượng
	 *           ** ==> ** Bulder Pattern
	 *           Ví dụ: LocalDateTime: date, month, year, hour, minute, seconds, miliseccond, timezone
	 *           + Cách thực thi
	 *           Thay vì dùng setter --> 1 lần gọi xong trả về void, lấy đối tượng đó đi gọi lại  --> code dài
	 *           Dùng builder style --> 1 lần gọi hàm set giá trị xong trả về chính đối tượng hiện tại --> tiếp tục đi gọi các hàm khác
	 */		
		//LocalDateTime()
	//	.withHour(15)
		//.withMinute(20)
	//	.withSecond(30)
	
}
