package exercise05;

public class Ex05SellingBookDemo {

	public static void main(String[] args) {
		SchoolBook s1 = new SchoolBook("SGK1", 30d, "Giao Duc", false);
		SchoolBook s2 = new SchoolBook("SGK2", 70d, "Nhi Dong", true);
		SchoolBook s3 = new SchoolBook("SGK3", 120d, "Nhi Dong", true);
		ReferenceBook r1 = new ReferenceBook("STK4", 40d, "Giao Duc", 0.1f);
		ReferenceBook r2 = new ReferenceBook("STK5", 150d, "Giao Duc", 0.5f);

		Book[] books = { s1, s2, s3, r1, r2 };
		System.out.println("Sach nha xuat ban Nhi Dong:");
		findPublisher(books);
		
		System.out.println("Sach co gia nho hon 50:");
		salesPriceLessThan50(books);
		
		System.out.println("Sach giao khoa co gia tu 100 den 200:");
		schoolBookSalesPricefrom100to200(books);
		
		
		
		
	}

	private static void findPublisher(Book[] books) {
		for (Book b : books) {
			if (b.getPublisher() == "Nhi Dong") {
				System.out.println(b);
			}
		}
	}

	private static void salesPriceLessThan50 (Book[] books) {
		for (Book b : books) {
			if (b.getSalesPrice() < 50) {
			System.out.println(b);
			}
	}
	}

	private static void schoolBookSalesPricefrom100to200 (Book[] books) {
		for (Book b : books) {
			if (b.getIdBook() == "SGK" && b.getSalesPrice() >= 100 && b.getSalesPrice() <= 200) {
				System.out.println(b);
			}
	}
	}

}
