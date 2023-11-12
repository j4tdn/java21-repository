package ex02;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

  public static boolean isHappyNumber(int n) {
    List<Integer> cycle = new ArrayList<>();

    while (n != 1 && !cycle.contains(n)) {
      cycle.add(n);
      n = getNext(n);
    }

    return n == 1;
  }

  public static int getNext(int n) {
    int totalSum = 0;

    while (n > 0) {
      int d = n % 10;
      n = n / 10;
      totalSum += d * d;
    }

    return totalSum; 
  }

  public static void main(String[] args) {
    int n = 44;
    
    if (isHappyNumber(n)) {
      System.out.println(n + " là số hạnh phúc"); 
    } else {
      System.out.println(n + " không phải là số hạnh phúc");
    }
  }

}