package common;

public class CustomInteger {
	int a = 10, b = 20;
	
	public void swap(CustomInteger obj){
	    int temp;
	    temp = obj.a;
	    obj.a = obj.b;
	    obj.b = temp;
	}
	public static void main(String a[]){
		CustomInteger obj = new CustomInteger();
	    System.out.println("a --> " + obj.a);
	    System.out.println("b --> " + obj.b);
	    obj.swap(obj);
	    System.out.println("========");
	    System.out.println("a --> " + obj.a);
	    System.out.println("b --> " + obj.b);
	}
	
}
