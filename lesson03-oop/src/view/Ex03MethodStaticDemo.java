package view;

public class Ex03MethodStaticDemo {
	   /*
    [static] vs [non- static]
    đặt ở đâu:
    + attribute
    ---> thuộc tính mang giá trị chung cho tất cả các đối tượng của class ---> static
    * không phụ thuộc vào đối tượng đang gọi nó
    --->thuộc tính mà mỗi đối tượng lưu trữ 1 giá trị không ---> non-static
    * phụ thuộc vào đối tượng đang gọi nó
    VD: Car: id, model ---> static
    
    + method: 
    ----> không phụ thuộc vào đối tượng đang gọi ---> static
    ----> phụ thuộc vào đối tượng đang gọi       ---> non-static
    
    Class:
    non- static : thuộc phạm vi của đối tượng
                : phải có đối tượng mới gọi được
    
    static      : thuộc phạm vi của class
                : nên gọi từ class ---> class.
    */
    public static void main(String[] args) {
        int m = 9;
        int n =10;
        System.out.println("ms1-->"+sum(m, n));
        Tuple tuple1 = new Tuple(3, 2);
        System.out.println("tp1--->"+tuple1.sum());
                
    }
    // hàm sum chỉ phụ thuộc vào tham số truyền vào a, b
    // không phụ thuộc vào đối tượng đang gọi ---> static
    private static int sum(int a, int b){
        return a + b;
}
}


