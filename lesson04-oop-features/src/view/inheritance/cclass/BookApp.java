package view.inheritance.cclass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Ref;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class BookApp {
public static void main(String[] args) {
	/*
	 * Cho ứng dụng quản lý thông tin sách trong cửa hàng
	 * Thồn tin sách:
	 * + Sách tham khảo: mã sách, tên sách, nhà xuất bản, thuế
	 * + Sách giáo khoa: mã sách, tên sách, nhà xuất bản, trạng thái, giảm giá(%)
	 * 
	 * Tạo danh sách N cuốn sách
	 * ---> Thực hiện viện mua k/n cuốn sách và tính tổng tiền phải chi trả*/
	/*
	 * KDL enum(enumeration)
	 * --> muốn lưu tập hằng số
	 * kdl đối tượng
	 * default empty constructor ---> private
	 * */
	Book[] books = mockBooks();
	Book[] saleBooks = {books[0], books[1], books[2], books[4], books[6]};
	BigDecimal totalOfMoney = BigDecimal.ZERO;
	for( Book book : saleBooks) {

//		Class <?> bookRuntime = book.getClass();
//		BigDecimal salesPrice = book.getSalesPrice();	
		BigDecimal multicand = book instanceof TextBook 
				? bd(100).subtract(bd(((TextBook)book).getDiscount())).divide(bd(100))
						:book instanceof ReferenceBook
						?bd(1).add(((ReferenceBook)book).getTax().divide(bd(100))):
							bd(1);
		BigDecimal selesPrice = book.getSalesPrice().multiply(multicand).setScale(2, RoundingMode.HALF_UP);
		System.out.println("book " + book.getId() + " has price is " + selesPrice);
		
		System.out.println("book " + book.getId() + " has price is(real) " + selesPrice);
		
		totalOfMoney = totalOfMoney.add(selesPrice);
				
	}
		System.out.println("Tổng tiền: "+totalOfMoney);
}
private static Book[] mockBooks() {
	return new Book[] {
			new TextBook("SGK-291", "Toán 7", bd(20), "Việt Nam", BookStatus.NEW,2),
			new TextBook("SGK-718", "Hóa 8", bd(20), "Nhi Đồng", BookStatus.NEW,2),
			new TextBook("SGK-111", "Địa 9", bd(30), "Việt Nam", BookStatus.NEW,2),
			new TextBook("SGK-091", "Sử 7", bd(20), "Nhi Đồng", BookStatus.NEW,5),
			new ReferenceBook("STK-23", "Sử 7", bd(30), "Việt Nam", bd(2)),
			new ReferenceBook("STK-77", "Sinh 7", bd(20), "Việt Nam", bd(2)),
			new ReferenceBook("STK-55", "Lý 10", bd(30), "Nhi Đồng", bd(2)),
			new ReferenceBook("STK-22", "Công nghệ 8", bd(30), "Nhi Đồng", bd(2)),
			
	};
}
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	
}

