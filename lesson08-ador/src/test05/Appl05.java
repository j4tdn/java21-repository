package test05;

public class Appl05 {
	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";
		findSubSameChar(s1, s2);
	}
	private static String findSubSameChar(String s1, String s2) {
		String subStrIs = "";
		
		boolean compareLen = s1.length() > s2.length() ? true : false;
		String thisSubStr = s1;
		String findInStr = s2;
		
		
		if (compareLen) {
			thisSubStr = s2;
			findInStr = s1;
		}
		int findInStrOfLen = thisSubStr.length();
		System.out.println("findInStrOfLen: " + findInStrOfLen);
//		int[] lagerSize = new int[findInStrOfLen];
		String[] sameStr = new String[findInStrOfLen];
		int charAt = 0;
		int index = 0;
		
		subStrIs = thisSubStr.charAt(charAt)+"";
		do {
			boolean isContain = findInStr.contains(subStrIs);
			if (isContain) {
				sameStr[index] = subStrIs;
				subStrIs += thisSubStr.charAt(charAt);
			} else {
				index++;
				subStrIs = thisSubStr.charAt(charAt) + "";
			}
			charAt++;
			System.out.println("subStrIs: " + subStrIs);
		} while(charAt < findInStrOfLen);
		
		String chekLagerString = sameStr[0];
		for(String str:sameStr) {
			if( str != null && str.length() > chekLagerString.length() ) {
				chekLagerString = str;
			}
		}
		
		System.out.println("Xâu chung con của xâu s1 và s2 là: " + chekLagerString);
		return "";
	}
}
