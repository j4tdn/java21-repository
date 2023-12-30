package ex05;

import java.util.Arrays;

public class AppDemo {
	public static void main(String[] args) {
		Book[] books = mockBooks();
		Book[] findBook = findPublisher(books);
		for (Book book : findBook) {
			System.out.println(book);
		}
	}
	
	private static Book[] mockBooks() {
		return new Book[] {
				new TextBook("SGK01", 110000f, "Giáo dục", true),
				new TextBook("SGK02", 220000f, "Giáo dục", false),
				new TextBook("SGK03", 130000f, "Giáo dục", true),
				new ReferenceBook("STK-23", 135000f, "Nhi Đồng", 5),
				new ReferenceBook("STK-25", 175000f, "Nhi Đồng", 3),
		};
	}
	
	private static Book[] findPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if("Nhi Đồng".equals(book.getPublisher())) {
				result[count] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
