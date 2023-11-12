package ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
  public static int getLevel(int num) {
    int level = 0;
    for(int i = 1; i <= num; i++) {
      if(num % i == 0) {
        level++;
      }
    }
    return level;
  }

  public static void sortByLevel(List<Integer> arr) {
    Collections.sort(arr, (a, b) -> getLevel(a) - getLevel(b)); 
  }

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(8);
    arr.add(5);
    arr.add(9); 
    arr.add(20);

    sortByLevel(arr);

    System.out.println(arr); 
  }
}