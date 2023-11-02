package bai1;

public class Main {
	public static void main(String[] args) {
			
		String chuoi = "Đặng Hữu Thanh";
		System.out.println("---------------------");
		System.out.println("In ra kí tự trên mỗi dòng. ");
		for (char c : chuoi.toCharArray()) {
			System.out.println(c);
		}
		
		System.out.println("---------------------");
		System.out.println("In ra mỗi từ trên mỗi dòng. ");
		String[] arr = chuoi.split(" ");
		for (String word : arr) {
			System.out.println(word);
		}
		
		System.out.println("---------------------");
		System.out.println("In ra chuỗi đảo ngược theo kí tự. ");
		StringBuilder chuoiDaoNguoc = new StringBuilder(chuoi).reverse();
		System.out.println(chuoiDaoNguoc);
		
		System.out.println("---------------------");
		System.out.println("In ra chuỗi đảo ngược theo từ. ");
		String[] reverse = chuoi.split(" ");
		StringBuilder stringReverse = new StringBuilder();
		for (int i = reverse.length - 1; i >= 0; i--) {
			stringReverse.append(reverse[i]);
			if (i > 0) {
				stringReverse.append(" ");
			}
		}
		System.out.println(stringReverse);
	}
}
