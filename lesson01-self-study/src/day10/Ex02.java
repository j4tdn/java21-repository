package day10;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String s = "Xin chao, tui ten la Bien";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String c = "Xin chao, minh la Bien. Minh la code dao";
		String[] d = c.split("\\,|\\.");
		System.out.println(Arrays.toString(d));
		
		String f = " Nguyen van a";
		String[] g = f.split(" ");
		System.out.println(Arrays.toString(g));
		System.out.println(g[g.length-1]);
	}
}
