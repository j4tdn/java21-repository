package view.inheritance.cclass;

import java.math.BigDecimal;

public class BookApp {

	public static void main(String[] args) {
		
		/*
		 cho ứng dụng quản lý thông tin sách trong cửa hàng
		 thông tin sách:
		 	+ sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế
		 	+ sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
		 
		 KDL --> enum(enumeration):
		 	 --> khi muốn lưu trữ tập hợp các giá trị là hằng số, bất biến(immutable)
		 	 --> KDL đối tượng
		 	 	 Lưu trữ tập các đối tượng là immutable bên trong nó
		 	 --> default empty constructor --> private
		 	 
		 Tạo danh sách N cuốn sách(mảng)
		 --> Thực hiện việc mua k trong n cuốn sách và tính tổng tiền phải chi trả
		 */
		
		
		Book[] books = mockBooks();
		
		Book[] salesBooks = {books[0], books[1], books[2], books[4], books[6]};
		
	 	//+ sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)(Integer)
		//+ sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế(%) (BigDecimal)
		
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		
		for(Book book : salesBooks) {
			
			// book != null && book.getClass() == TextBook.class
			// book instanceof TextBook
			
			BigDecimal salesPrice = book.getSalesPrice();
			
			if(book instanceof TextBook) {
				TextBook tb = (TextBook)book;
				salesPrice = salesPrice.multiply(bd(100).subtract(bd(tb.getDiscount())));
			}else if(book instanceof ReferentBook) {
				ReferentBook ref = (ReferentBook)book;
				salesPrice = salesPrice.multiply(bd(1).add(ref.getTax().divide(bd(100))));
			}
			totalOfMoney = totalOfMoney.add(salesPrice);
		}
		System.out.println("Tổng Tiền: " + totalOfMoney);
	}
	
	private static Book[] mockBooks() {
		return new Book[] {
				new TextBook("SGK-291", 	"Toán 7", 		bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-718", 	"Hóa 8", 		bd(30), "Nhi Đồng", BookStatus.NEW, 2),
				new TextBook("SGK-111", 	"Văn 12", 		bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-091", 	"Địa 9", 		bd(30), "Việt Nam", BookStatus.OLD, 5),
				new ReferentBook("STK-23", 	"Sử 7", 		bd(20), "Nhi Đồng", bd(2)),
				new ReferentBook("STK-77", 	"Sinh 7", 		bd(30), "Nhi Đồng", bd(4)),
				new ReferentBook("STK-55", 	"Lý 10", 		bd(20), "Nhi Đồng", bd(2)),
				new ReferentBook("STK-44", 	"Công Nghệ 12", bd(30), "Nhi Đồng", bd(2)),
				new ReferentBook("STK-22", 	"Sử 8", 		bd(30), "Nhi Đồng", bd(4)),
		};
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
