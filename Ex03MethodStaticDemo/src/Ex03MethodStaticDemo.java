
public class Ex03MethodStaticDemo {
	public static void main(String[] args) {
		//static :thuộc phạm vi của lớp
		//non-static : thuộc phạm vi của đối tượng
		
		tuple tuple1 = new tuple(3, 2);
		System.out.println("tuple1 sum --> " + tuple1.sum());
	}
}
