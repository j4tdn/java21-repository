package bai5;

public class tesst {
	public static void find(String s1, String s2) {
		int test = 0;
		int tam = 0;
		int tams2=0;
		boolean bl=true;
		while (bl) {
			String s = "";
			for (int i = tam; i < s1.length() && s.length() < s1.length() - test; i++) {
				char kyTu = s1.charAt(i);
				String chuoi = String.valueOf(kyTu);
				s = s.concat(chuoi);
			}
			String ss2 ="";
			for(int i=tams2 ;i < s.length()+tams2;i++) {
				char kyTu = s2.charAt(i);
				String chuoi = String.valueOf(kyTu);
				ss2 = ss2.concat(chuoi);
				if(s.equals(ss2)) {
					System.out.println(s);
					bl=false;
				}
				tams2+=1;
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		find(s1, s2);
		
	}
}
