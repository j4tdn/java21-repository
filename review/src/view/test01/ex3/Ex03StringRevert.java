package view.test01.ex3;

public class Ex03StringRevert {
	public static void main(String[] args) {
		String text = "        Welcome  to   Java10  Class   ";

		System.out.println(reverse(text));
	}

	private static String reverse(String text) {
		text = text.strip().replaceAll("\\s+", " ");
		String[] words = text.split("\\s");
//		String[] z =  new String[words.length];
//		int k = 0;
//		for (String word : words) {
//			z[k++] = new StringBuilder(word).reverse().toString();
//		}
//	

		StringBuilder updateWord = new StringBuilder();
		for (String word : words) {
			updateWord.append(new StringBuilder(word).reverse()).append(" ");
		}
		return updateWord.toString().trim();

	}

}
