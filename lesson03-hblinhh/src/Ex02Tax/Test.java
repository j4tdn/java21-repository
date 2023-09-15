package Ex02Tax;
import java.util.Scanner;
public class Test {
	 static Scanner sc = new Scanner(System.in);
	    
	      static void ipCar(Vehicle car){
	    	  	sc.nextLine();
	    	  	System.out.print("Nhập loại xe: ");
	            car.setStyle(sc.nextLine());
	            System.out.print("Nhập tên chủ xe: ");
	            car.setName(sc.nextLine());
	            System.out.print("Nhập dung tích xe: ");
	            car.setCap(sc.nextDouble());
	            System.out.print("Nhập trị giá xe: ");
	            car.setValue(sc.nextDouble());
	           
	      }
	    public static void main(String[] args) {
	        Vehicle v[]= null;
	        int a,n=0;
	        boolean flag = true;
	       
	        do{
	           
	            System.out.println("1.Tạo các đối tượng xe và nhập thông tin \n"+
	                    "2.Xuất bảng kê khai tiền thuế của các xe.\n"+
	                    "3.Thoát");
	            a =sc.nextInt();
	            switch (a){
	                case 1:
	                    System.out.print("Nhập số lượng xe muốn khai báo thuế: ");
	                    n=sc.nextInt();
	                   
	                    v= new Vehicle[n];
	                    for (int i = 0; i < n; i++) {
	                        System.out.println("Xe thứ " + (i+1));
	                        v[i] = new Vehicle();
	                        ipCar(v[i]);
	                    }
	                    break;
	                case 2:
	                    System.out.printf("\n%-15s%-20s%-15s%-15s%-15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
	            				"Thuế phải nộp");
	                    for (int i = 0; i < n; i++) {
	                        v[i].prtTax();
	                    }
	                    break;
	                default:
	                    System.out.println("bye");
	                    flag=false;
	                    break;
	            }
	        }while (flag);
	    }
	}

