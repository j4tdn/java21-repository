package Test03;

public class Main {

	public static void main(String[] args) {

		String ip = "Welcome   to JAVA10  class";
		String op = revert(ip);
		System.out.println(op);

	}

	public static String revert(String s) {
		String[] words = s.split("\\s+");
		StringBuilder sb = new StringBuilder();

		for (String word : words) {
			sb.append(new StringBuilder(word).reverse()).append(" ");
		}
		return sb.toString().trim();
	}

}
