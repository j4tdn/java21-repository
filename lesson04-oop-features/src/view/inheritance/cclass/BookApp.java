package view.inheritance.cclass;

import java.math.BigDecimal;

public class BookApp {
	
	
	public static void main(String[] args) {
		
		/*
		    Cho ung dung quan li thong tin sach trong cua hang tap hoa
		    Thong tin sach bao gom sach tham khao va sach giao khoa
		    + Sach tham khao: ma sach, ten sach, NXB, thue
		    + Sach giao khoa : ma sach, ten sach, NXB, trang thai (moi - cu), giam gia(%)
		    Tao danh sach N cuon sach (mang) --> thuc hien viec mua k/n cuon sach va tinh tong tien phai chi tra
		 */
		
		/*
		 * "trang thai" --> KDL enum(enumeration)
		 * EMUM --> khi muon luu tru tap hop cac gia tri la hang so, bat bien(imutable)
		 *      --> KDL doi tuong
		 *      --> Luu tru tap hop cac doi tuong la immutable ben trong no
		 *      --> defaule empty constructor --> private (unmodifiable)
		 */
		
		Book[] books = mockBooks();
		Book[] salesBooks = {books[0], books[1], books[2], books[4], books[6]};
		
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		
		for(Book book : saleBooks) {
			//BigDecimal salesPrice = book.getSalesPrice();
			
			BigDecimal multicand = book instanceof TextBook
					? bd(100).subtract(bd(((TextBook)book).getDiscount())).divide(bd(100))
				    : (book instanceof ReferenceBook)
				       ? bd(1).add(((ReferenceBook.getTax).divide(bd(100)))
				    		   :bd(1);
			
			
//			if(book instanceof TextBook) {
//				TextBook tb = (TextBook)book;
//				salesPrice = salesRrice.multiply(bd(100).subtract(tb.getDiscount()));
//				
//				
//			} else if (book instanceof ReferenceBook) {
//				ReferenceBook ref = (ReferenceBook)book;
//				salesPrice = salesPrice.multiply(bd(1).add(ref.getTax().divide(bd(100))));
//			}
			//totalOfMoney = totalOfMoney.add(book.getSalePrice());
			
		}
		

	}

	private static Book[] mockBooks() {
		return new Book[] { 
				new TextBook("SGK-291", "Toán 7", bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-718", "Hoa 8", bd(30), "Nhi Đồng", BookStatus.NEW, 2),
				new TextBook("SGK-111", "Văn 12", bd(20), "Việt Nam", BookStatus.NEW, 2),
				new TextBook("SGK-091", "Địa 9", bd(30), "Việt Nam", BookStatus.OLD, 5),
				new ReferenceBook("STK-23", "Sử 7", bd(30),"Nhi Đồng", bd(2)),
				new ReferenceBook("STK-77", "Sinh 7", bd(20), "Nhi Đồng", bd(4)),
				new ReferenceBook("STK-55", "lí 10", bd(30), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-44", "Công nghệ 12", bd(20), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-22", "Sử 8", bd(30), "Nhi Đồng", bd(4)) };
	}

	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}

}
