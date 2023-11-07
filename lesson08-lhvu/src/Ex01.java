import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập chuỗi ký tự bất kỳ:");
		String input = ip.nextLine().strip().replaceAll("\\s+", " ");
		System.out.println("input -->:" +input);
		
		//in ra mỗi ký tự trên 1 dòng
		System.out.println("\nMỗi ký tự trên 1 dòng:");
				for (int i = 0; i<input.length(); i++) {
					System.out.println(input.charAt(i) + "");
				}
				
		//in ra mỗi từ trên 1 dòng:
		
		System.out.println("\nMỗi từ trên 1 dòng:");
		String [] words = input.strip().split("\\s+");
		for (String word:words) {
			System.out.println( "|" +word + "|");
		}
		
		//in ra chuỗi đảo ngược theo ký tự
		String reserved = "";
		  for (int i=0; i<input.length(); i++)
	      {
	       char ch= input.charAt(i);
	       reserved= ch+reserved; 
	      }
	      System.out.println("\nChuỗi đảo ngược theo ký tự: "+ reserved);
	      
	    //in ra chuỗi đảo ngược theo từ
	      
	     	
	     StringBuffer s = new StringBuffer();
	     for (int i = words.length - 1; i >= 0; i--) {
				s.append(words[i]);
				if (i > 0) {
					s.append(" ");
				}
			}
			System.out.println("\nChuỗi đảo ngược theo theo từ:" + s);
	      
	    
	      
	}
}
