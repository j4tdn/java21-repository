package view.functional.interfacee;

public class TestfunctionalInterface {
	public static void main(String[] args) {
		// Tạo 1 đối tượng (thể hiện ) cho interface IntComparator

		// Để tạo 1 đối tượng thể hiện cho function interface
		// ==> sử dụng external class, anonymous class để tạ dối tượng cho 1 interface
		// bất kì
		// ==> sử dụng anonymous function để tạo đối tượng function interface (interface
		// có duy nhất 1 hàm trừu tượng).

		// Cách 1 : Enternal class
		// ==> Tốn thêm 1 class

		// Cách 2: Anonymous class
		IntComparator ic1 = new IntComparator() {

			@Override
			public int compare(int a, int b) {
				return a - b;
			}
		};
		System.out.println("Test anonymuous class --> " + ic1.compare(5, 7));

		// Cách 3 : Anonymous function ( Từ Java 8 trở đi )
		
		// Ko bắt buộc khai báo KDL cho các tham số
		// Nếu chỉ có 1 tham số --> có thể bỏ luôn ()
		// Nếu phần body chỉ có 1 dòng --> có thể xóa lun phần {}
		//   body return void : code như bth
		//   body return !void : xóa chữ return.
		
		IntComparator ic2 = (a, b) -> a + b;
		System.out.println("Test anonymuous function --> " + ic1.compare(5, 7));
		
		//strategy pattern
	}
}
