package generic.class_interface;

public class K21GenericClassInterface {
	
	public static void main(String[] args) {
		K21List<String> sequences = new K21CustomList<>();
		
		sequences.add("a");
		sequences.add("b");
		sequences.add("c");
		sequences.add("d");
		sequences.add("e");
		
		System.out.println("size --> " + sequences.size());
		System.out.println("capacity --> " + sequences.capacity());
		
		sequences.forEach(seq -> {
			System.out.println(seq);
		});
	}
}