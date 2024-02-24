package exam01;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex01 {
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử thứ a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            add(map, arr[i]);
        }
        System.out.print("Các phần tử xuất hiện 1 lần: ");
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        System.out.print("\nCác phần tử xuất hiện nhiều hơn lần: ");
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
	  public static void add(Map<Integer, Integer> map, int element) {
	        if (map.containsKey(element)) {
	            int count = map.get(element) + 1;
	            map.put(element, count);
	        } else {
	            map.put(element, 1);
	        }
	    }
}
