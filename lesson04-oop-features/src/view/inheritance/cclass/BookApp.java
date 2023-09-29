package view.inheritance.cclass;

import java.math.BigDecimal;

public class BookApp {
	public static void main(String[] args) {
		
		/* 
		  Cho ứng dụng quản lý thông tin sách trong cửa hàng
		  Thông tín sách:
		  	+ Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế,
		  	+ Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
		  	
		  	+ true/false
		  	+ MOI/CU/TRA_LAI
		  	+ INSIDE, OUTSIDE, ONSIDE
		  		KDL --> enum(enumeration)
		  			--> khi muốn lưu trữ tập hợp các giá trị là hằng số, bất biến(imutable)
		  			--> KDL đối tượng
		  				lưu trữ các đối tượng là imutable bên trong nó
		  			--> default empty constructor --> private(unmodifiable)
		  	
		  	Tạo danh sách N cuốn sách
		  	--> Thực hiện việc mua k/n cuốn sách và tính tổng tiền chi trả
		
		*/
		
		Book[] books = mockBooks();
		
		Book[] salesBook = {books[0],books[1],books[2],books[4],books[6]};
		
		BigDecimal totalMoney = BigDecimal.ZERO;
		for (Book book : salesBook) {
			
			// book != null && bookRuntimeClass == TextBook.class
			// book instanceof TextBook
			
			BigDecimal salesPrice = book.getSalesPrice();
			
			if(book instanceof TextBook) {
				TextBook tb = (TextBook) book;
				salesPrice = salesPrice.multiply(bd(100).subtract(bd(tb.getDiscount())));
			} else if(book instanceof ReferenceBook) {
				ReferenceBook ref = (ReferenceBook) book;
				salesPrice = salesPrice.multiply(bd(1).add(ref.getTax().divide(bd(100))));
			}
			
			 totalMoney = totalMoney.add(salesPrice);
		}
		System.out.println(totalMoney);
	}
	
	private static Book[] mockBooks() {
		return new Book[] {
				new TextBook("SGK-291", "Toán 7",bd(20) , "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-718", "Hóa 8",bd(30) , "Nhi Đồng", BookStatus.NEW, 2),
				new TextBook("SGK-111", "Văn 12",bd(20) , "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-091", "Địa 9",bd(30) , "Việt Nam", BookStatus.NEW, 5),
				new ReferenceBook("STK-23", "Sử 7",bd(20) , "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-77", "Sinh 7",bd(30) , "Nhi Đồng", bd(4)),
				new ReferenceBook("STK-55", "Lý 10",bd(20) , "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-44", "Công Nghệ 12",bd(30) , "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-22", "Sử 8",bd(30) , "Nhi Đồng", bd(4)),
		};
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
