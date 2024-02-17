package view.thread;

public class ConcatTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("java");
		for(int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + " ms");
	}
	
	// StringBuilder chạy nhanh hơn StringBuffer
	// StringBuffer: đồng bộ 	 - safety
	// StringBuider: bất đồng bộ - non-safety
}
