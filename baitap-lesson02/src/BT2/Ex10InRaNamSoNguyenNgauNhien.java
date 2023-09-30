package BT2;

import java.util.Random;

public class Ex10InRaNamSoNguyenNgauNhien {
  public static void main(String[] args) {
    Random random = new Random();

    // Tạo mảng nums để lưu các số ngẫu nhiên
    int[] nums = new int[5];
    
    // Lấy 5 số ngẫu nhiên trong khoảng [20,30]
    for (int i = 0; i < 5; i++) {
      int randomNum;
      
    // Kiểm tra xem các số có trùng nhau hay không
      do {
        randomNum = random.nextInt(20, 31);
      } while (contains(nums, randomNum));
      nums[i] = randomNum;
    }
    
    System.out.println(java.util.Arrays.toString(nums));
  }
  
  private static boolean contains(int[] array, int num) {
    for (int i : array) {
      if (i == num) {
        return true; 
      }
    }
    return false;
  }
}
