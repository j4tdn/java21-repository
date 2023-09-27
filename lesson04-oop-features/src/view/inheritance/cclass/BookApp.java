package view.inheritance.cclass;

import java.math.BigDecimal;

import view.inheritance.inteface.Shape;
import view.inhertance.astrastclass.EmailService;

public class BookApp {

	Shape shape = null;
	
	
	
	/*
	 	cho ứng dụng quản lí thông tin sách trong cửa hàng
	 	Thông tin sách
	 		+ Sách tham khảo: Mã sách, tên sách, nhà xuat bản, thuế
	 		+ Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
	 		
	 		+True/ False 
	 		+ Mới / Cũ / Trả lại
	 		+ INTERNAL, ERROL/ RESOURECE_NOT_FOUND/FILE_NOT_FILE
	 		+ INSIDE/OUTSIDE/ONSIDE
	 		 KDL -->enum(enumeration)
	 		 	 --> Khi muốn lưu trữ tập hpự các giá trị là hằng số, bát biến(imutable)
	 		
	 		Tạo danh sách N cuón sách
	 		--> Thực hiện việc mua k/n cuốn sách và tính tổng tiề phải chi tiêu
	 */
	Book[] books = mockBooks();
	Book[] salesBooks = {books[0],books[1],books[2],books[4], books[6]};
	
	
	
	private static Book[] mockBooks() {
		return new Book[] {
				new TextBook("SGK-201", "IT 7", bd(10) ,"VN", Bookstatus.NEW , bd(2.2)),
				new TextBook("SGK-202", "Toan 8T" ,bd(20) , "Nhi Dong " , Bookstatus.NEW,bd(2)),
				new TextBook("SGK-203", "Hoa 9" ,bd(15) , "VN " , Bookstatus.NEW,bd(2)),
				new TextBook("SGK-204", "Anh 10", bd(25) ,"VN " , Bookstatus.NEW,bd(5)),
				new ReferenceBook("STK-23"," su ",bd(23) ,"NHi dong", bd(4)),
				new ReferenceBook("STK-24"," sinh ",bd(12) ,"NHi dong", bd(4)),
				new ReferenceBook("STK-25"," ly ",bd(10) ,"NHi dong", bd(4)),
				new ReferenceBook("STK-26"," cong nghe ",bd(5) ,"NHi dong", bd(4)),
				new ReferenceBook("STK-27"," toan ",bd(7) ,"NHi dong", bd(4))};
		}
		
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}

}
