package pattern.builder;

public class Ex01RootCase {
public static void main(String[] args) {
	
	/*
	 * Design Pattern: Là các mẫu thiết kế, được sinh/tạo ra từ các kinh nghiệm của các người đi trước
	 *               : Giúp mình giải quyết các vấn đề cụ thể.
	 *  Builder Pattern
	 *  Đặt vấn đề
	 *    Được dùng để tạo ra đối tượng cho các complex class/object
	 *    Complex class/object là class có nhiều (>=6) thuộc tính và có rất nhiều mixing constructor từ class này
	 *    A: a1, a2 , a3 ,a4 , a5 , a6
	 *    +constructor()
	 *    +constructor(a1,a2,a3,a4,a5,a6)
	 *    +constructor(a1,a2;
	 *    +cnsstructor(a1,a3,a4);
	 *    +constructor(a5,a6)
	 *    
	 *    --> cde rườm rà
	 *    --> vì constructor luôn trùng tên với class
	 *       Ví dụ : cần constructor 2 tham số a1,a2 và cần constructor a5,a6
	 *       --> nếu như a1 trung KDL với a5
	 *                   a2 trung KLD với a6 --> ko thể
	 *       public A(int a1, String a2).....
	 *       public B(int a5, String a6).....
	 *       
	 *       Xử lý --> Dùng duy nhất hàm khởi tạo rỗng , dùng setter để truyền tham só
	 *       OK
	 *       Nhưng --> Nếu required 5 tham số thì phải setter 5 lần --> code khá dài cho tạo dối tượng
	 *       
	 *       ** --> ** Builder Pattern 
	 *       Ví dụ: LocalDateTime: Date, Month, Year, Hour, Minute, Second, milliseconds, timezone,...
	 *    + Cách thực thi
	 *      Thay vì dùng setter --> 1 lần gọi xong trả về void, lấy dối tượng đó đi gọi lại --> code dài
	 *      Dùng builder style --> 1 lần gọi hàm set giá trị xong thì trả về hàm chính đối tượng hiện tại --> tiếp tục đi gọi các hàm khác
	 *      
	 *      LocalDateTime.now() //LocalDatetime
	 *      	.withHour(15)   //LocalDatetime
	 *      	.withMInute(20) //LocalDatetime
	 *      	.withSecond(30) //LocalDatetime
	 */
	
}
}
