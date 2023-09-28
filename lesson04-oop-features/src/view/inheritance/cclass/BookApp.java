package view.inheritance.cclass;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.ButtonGroup;

import view.inheritance.abstractclass.EmailService;

public class BookApp {
	public static void main(String[] args) {
		
		/*
		 Cho ứng dụng quản lý thông tin sách trong cửa hàng
		 Thông tin sách
		 + Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế
		 + Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
		 
		 + true/false
		 + MOI/CU/TRA_LAI
		 + INTERNAL_ERROR/RESOURCE_NOT_FOUND/FILE_NOT_FILE
		 + INSIDE/OUTSIDE/ONSIDE
		  KDL 	--> enum(enumeration)
		  		--> Khi muốn lưu trữ tập hợp các giá trị là hằng số, bất biến (immutable)
		 		--> KDL đối tượng
		 			Lưu trữ tập hợp các đối tượng là immutable bên trong nó
		 		--> default empty constructor --> private(unmodifiable)
		 
		 Tạp danh sách N cuốn sách(mảng) --> Thực hiện việc mua k/n cuốn sách và tính tổng tính tiền phải chi trả
		 tổng tiền phải chi trả
		 */
		
		Book[] books = mockBooks();
		
		Book[] salesBook = {books[0], books[1], books[2], books[4], books[6]};
		
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		
		for(Book book: salesBook) {
			
			BigDecimal multicicand = book instanceof TextBook
					? bd(100).subtract(bd(((TextBook)book).getDiscount())).divide(bd(100))
					: (book instanceof ReferennceBook)
						? bd(1).add(((ReferennceBook)book).getTax().divide(bd(100)))
								: bd(1);
			
			BigDecimal salesPrice = book.getSalesPrice().setScale(2, RoundingMode.HALF_UP);
			System.out.println("book " + book.getId() + "has price is -->" + salesPrice);
			
			salesPrice = salesPrice.multiply(multicicand);
			System.out.println("book " + book.getId() + "has price is (real) --> " + salesPrice);
			
			totalOfMoney = totalOfMoney.add(salesPrice);
			
			
			// totalOfMoney = totalOfMoney.add(book.getSalesPrice());
		}
		System.out.println("Tong tien: " + totalOfMoney);
		
	}
	
	private static Book[] mockBooks() {
		return new Book[] {
				new TextBook("SGK-291"	, "Toán 7"	, bd(20) , "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-718"	, "Hoá 8"	, bd(30) , "Nhi Đồng", BookStatus.NEW, 2),
				new TextBook("SGK-111"	, "Văn 12"	, bd(20) , "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-0911"	, "Địa 9"	, bd(30) , "Việt Nam", BookStatus.OLD, 5),
				new ReferennceBook("STK-23", "Sử 7"			, bd(20), "Nhi Đồng", bd(2)),
				new ReferennceBook("STK-77", "Sinh 7"		, bd(30), "Nhi Đồng", bd(4)),
				new ReferennceBook("STK-55", "Lý 10"		, bd(20), "Nhi Đồng", bd(2)),
				new ReferennceBook("STK-44", "Công nghệ 12"	, bd(30), "Nhi Đồng", bd(2)),
				new ReferennceBook("STK-22", "Sử 8"			, bd(30), "Nhi Đồng", bd(4)),
		};
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
