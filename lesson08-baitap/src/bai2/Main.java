package bai2;

public class Main {
	public static String convertToTitle(String string) {
		StringBuilder string1 = new StringBuilder();
		String[] tokens = string.split(" ");
		for (String token : tokens) {

			if (token.length() > 0) {
				String titleCaseWord = token.substring(0, 1).toUpperCase();
				String titleUpperCase = token.substring(1).toLowerCase();
				string1.append(titleCaseWord).append(titleUpperCase).append(" ");

			}
		}
		return string1.toString().trim();
	}

	public static void main(String[] args) {

		String chuoi = "đặng Hữu thaNh 23";

		System.out.println("Doi cac ki tu dau tien thành chu hoa: " + convertToTitle(chuoi));

	}
}
