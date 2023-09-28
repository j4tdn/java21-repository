package view.inheritance.cclass;

import java.math.BigDecimal;

public class BookApp {
	/*
	   cho ứng dụng quản lý thông tin sách trong cửa hàng
	   Thông tin sách
	   +Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế
	   +Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
	   
	   Tạo danh sách N cuốn sách ( mảng )
	   --> Thực hiện việc mua k/n cuốn sách và tính tổng tiền phải chi trả
	   
	   + true, false
	   + MOI/CU/TRA LAI
	   + INTERNAL_ERROR/RESOURCE_NOT_FOUND/FILE_NOT_FILE
	   + INSIDE/OUTSIDE/ONSIDE
	     KDL --> enum(enumeration)
	     	 --> khi muốn lưu trữ tập hợp các giá trị là hằng số, bất biến (immutable)
	     	 --> KDL đối tượng
	     	 	 Lưu trữ tập các đối tượng là immutable bên trong nó
	     	 --> default empty constructor --> private(unmodifiable)
	 */
	public static void main(String[] args) {
		Book[] books = mockBooks();
		Book[] salesBooks = {books[0], books[1], books[2], books[3], books[5]};
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		for(Book book: salesBooks) {
			BigDecimal salesPrice = book.getSalesPrice();
			if(book instanceof TestBook) {
				TestBook tb = (TestBook)book;
				salesPrice   = salesPrice.multiply(bd(100).subtract(bd(tb.getDiscount()).divide(bd(100))));
			}else if(book instanceof ReferenceBook) {
				ReferenceBook rb = (ReferenceBook)book;
				salesPrice = salesPrice.multiply(bd(1).add(rb.getTax().divide(bd(100))));
			}
			totalOfMoney = totalOfMoney.add(salesPrice);
		}
		System.out.println(totalOfMoney);
	}

	private static Book[] mockBooks() {
		return new Book[] { new TestBook("SGK-291", "Toán 7", bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TestBook("SGK-782", "Li 7", bd(30), "Việt Nam", BookStatus.NEW, 2),
				new TestBook("SGK-312", "Toán 9", bd(40), "Việt Nam", BookStatus.NEW, 2),
				new TestBook("SGK-686", "Toán 12", bd(30), "Việt Nam", BookStatus.OLD, 5),
				new ReferenceBook("STK-123", "Sinh 7", bd(20), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-567", "hóa 7", bd(30), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-534", "sử 7", bd(20), "Nhi Đồng", bd(4)),

		};
	}

	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}