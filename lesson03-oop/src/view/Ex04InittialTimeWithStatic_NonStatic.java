package view;

public class Ex04InittialTimeWithStatic_NonStatic {
	//static : class loading time
    //non-static: objiect creating time
    private static String staticVar;
    private String nonStaticVar;
    public static void main(String[] args) {
        
    }
    //static gọi static
    // non static gọi static được, static k gọi được non static
    private static void staticMethod(){
        System.out.println(staticVar);
        System.out.println("Ex04---> Static Method");
    }
    private void nonStaticMethod(){
        System.out.println("Ex04 ---> Non Static Method");
        System.out.println(staticVar);
    }
}
