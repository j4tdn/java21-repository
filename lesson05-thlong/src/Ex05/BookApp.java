package Ex05;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = mocBooks();

		Book[] salesBooks = {books[0], books[1], books[2], books[3], books[4]};
	}
	
	private static Book[] mocBooks() {
		return new Book[] {
				new TextBook("SGK01", 100, "Nhi đồng", "Mới"),
				new TextBook("SGK02", 200, "Nhi đồng", "Mới"),
				new TextBook("SGK03", 300, "Nhi đồng", "Mới"),
				new ReferencesBook("STK01", 400, "Thanh niên", 0.2f),
				new ReferencesBook("STK02", 500, "Thanh niên", 0.3f),
		};
	}
}


