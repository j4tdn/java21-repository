package ex05;

import java.util.ArrayList;

class Number {

  private int value;

  public Number(int value) {
    this.value = value;
  }

  public int getValue() {
    return value; 
  }

  // Tính level cho các số nhập vào
  public int getLevel() {
    int count = 0;
    for (int i = 1; i <= value; i++) {
      if (value % i == 0) {
        count++;
      }
    }
    return count;
  }

  // Sắp xếp các số theo thứ tự yêu cầu
  public static void sortByLevel(ArrayList<Number> numbers) {
    
    for (int i = 0; i < numbers.size() - 1; i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
      
        Number num1 = numbers.get(i);
        Number num2 = numbers.get(j);
      
        if (num1.getLevel() > num2.getLevel()) {
        
          numbers.set(i, num2);
          numbers.set(j, num1);
      
        }
      }
    }
  
  }

}