package view.inheritance.cclass;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class BookApp {

	public static void main(String[] args) {
		
		/*
		 * Cho ứng dụng quản lý thông tin sách trong cửa hàng 
		 * Thông tin sách 
		 * + Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế 
		 * + Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
		 * 
		 * + true/false + MOI/CU/TRA_LAI +
		 * INTERNAL_ERROR/RESOURCE_NOT_FOUND/FILE_NOT_FILE + INSIDE/OUTSIDE/ONSIDE KDL
		 * --> enum(enumeration) --> khi muốn lưu trữ tập hợp các giá trị là hằng số,
		 * bất biến(immutable) --> KDL đối tượng Lưu trữ tập các đối tượng là immutable
		 * bên trong nó --> default empty constructor --> private(unmodifiable)
		 * 
		 * Tạo danh sách N cuốn sách(mảng) --> Thực hiện viên mua k/n cuốn sách và tính
		 * tổng tiền phải chi trả
		 * 
		 */
		
		Book[] books = mockBooks();
		
		Book[] salesBooks = {books[0], books[1], books[2], books[4], books[6]};
		
		// Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)(Integer)
		// Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế(%)(BigDecimal)
		
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		
		// book != null && book.getClass() == TextBook.class
		// book instanceof TextBook
		
		for (Book book: salesBooks) {
			BigDecimal multicand = book instanceof TextBook
					? bd(100).subtract(bd(((TextBook)book).getDiscount())).divide(bd(100))
					: (book instanceof ReferenceBook) 
						? bd(1).add(((ReferenceBook)book).getTax().divide(bd(100)))
						: bd(1);
			
			BigDecimal salesPrice = book.getSalesPrice().setScale(2, RoundingMode.HALF_UP);
			System.out.println("book " + book.getId() + " has price is --> " + salesPrice);
			
			salesPrice = salesPrice.multiply(multicand);
			System.out.println("book " + book.getId() + " has price is(real) --> " + salesPrice);
			
			totalOfMoney = totalOfMoney.add(salesPrice);
		}
		
		System.out.println("Tổng tiền: " + totalOfMoney);
		
	}

	private static Book[] mockBooks() {
		return new Book[] { 
				new TextBook("SGK-291",     "Toán 7",       bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-718",     "Hóa 8",        bd(30), "Nhi Đồng", BookStatus.NEW, 2),
				new TextBook("SGK-111",     "Văn 12",       bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-091",     "Địa 9",        bd(30), "Việt Nam", BookStatus.OLD, 5),
				new ReferenceBook("STK-23", "Sử 7",         bd(20), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-77", "Sinh 7",       bd(30), "Nhi Đồng", bd(4)),
				new ReferenceBook("STK-55", "Lý 10",        bd(20), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-44", "Công nghệ 12", bd(30), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-22", "Sử 8",         bd(30), "Nhi Đồng", bd(4)) };
	}

	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}

}
