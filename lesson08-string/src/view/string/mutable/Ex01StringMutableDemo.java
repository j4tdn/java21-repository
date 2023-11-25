package view.string.mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		// String Immutable : String, chỉ hỗ trợ đơn luồng
		// String Mutable : StringBuilder, StringBuffer

		StringBuilder sb1 = new StringBuilder("todo-app-2.4");
		sb1.append("-snapshort").append("-test");
		System.out.println("sb--->" + sb1);

		sb1.deleteCharAt(0).setCharAt(0, 'a');
		System.out.println("\nsb delete -->" + sb1);
	}

}
