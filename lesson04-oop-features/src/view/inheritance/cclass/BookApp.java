package view.inheritance.cclass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class BookApp {
	public static void main(String[] args) {
		/*
		 *  cho ứng dụng quản lý thông tin sách trong cửa hàng
		 *  Thông tin sách:
		 *   + Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế
		 *   + Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
		 *  
		 *  MOI/CU/TRA_LAI/HU_HONG
		 *  INTERNAL_ERROR/RESUORCE_NOT_FOUND
		 *  
		 *  KLD --> enum(enumeration)
		 *  ->Khi muốn lưu trữ tập hợp các giá trị là hằng số, bất biến(immutable: Heap)
		 *    --> KLD đối tượng
		 *        Lưu trữ tập các đối tượng là immutable bên trong nó
		 *    --> default empty constructor --> private (unmodifiable)
		 *  
		 *  
		 *  Tạo danh sách N cuốn sách
		 *  --> Thực hiện vien mua k/n cuốn sách và tính tổng tiền phải chi trả
		 */
		
		Book[] books = mockBook();
		Book[] salesBook = {books[0], books[1], books[4], books[5]};
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		
		for(Book book: salesBook) {
			BigDecimal multicand = book instanceof TextBook
					? bd(100).subtract(bd(((TextBook)book).getDiscount())).divide(bd(100))
					: (book instanceof ReferenceBook) 
						? bd(1).add(((ReferenceBook)book).getBookTax().divide(bd(100)))
						: bd(1);
			
			BigDecimal salesPrice = book.getSalesPrice().setScale(2, RoundingMode.HALF_UP);
			
			salesPrice = salesPrice.multiply(multicand);
			
			totalOfMoney = totalOfMoney.add(salesPrice);
		}
		
		System.out.println("All book\n" + Arrays.toString(books));
		System.out.println("Số sách mượn:\n" + Arrays.toString(salesBook));
		System.out.println("Tổng tiền: " + totalOfMoney);
	}
	
	private static Book[] mockBook() {
		return new Book[] {
				new TextBook("SGK-291", "Toán 7", "VN", BigDecimal.valueOf(20),  BookStatus.OLD, 2),
				new TextBook("SGK-345", "Toán 8", "NB", BigDecimal.valueOf(10), BookStatus.NEW, 2),
				new TextBook("SGK-456", "Toán 9", "TQ", BigDecimal.valueOf(20), BookStatus.NEW, 5),
				new TextBook("SGK-789", "Toán 10", "Nhi Đồng", BigDecimal.valueOf(10),  BookStatus.OLD, 2),
				new ReferenceBook("STK-1112", "Toán 10", BigDecimal.valueOf(30), "Nhi Đồng", BigDecimal.valueOf(2)),
				new ReferenceBook("STK-1314", "Toán 11", BigDecimal.valueOf(20), "Nhi Đồng", BigDecimal.valueOf(2)),
				new ReferenceBook("STK-1516", "Tin 12", BigDecimal.valueOf(30), "Nhi Đồng", BigDecimal.valueOf(2)),
				new ReferenceBook("STK-1718", "Hóa 12", BigDecimal.valueOf(20), "Nhi Đồng", BigDecimal.valueOf(2)),
		};
	}
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
