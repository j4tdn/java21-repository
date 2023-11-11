package ex03;

public class Ex03 {

	public static void main(String[] args) {
		String s = "   Welcome  to  JAVA10   class   ";
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println(s);
	}
}
