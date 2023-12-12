package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02TransformArr {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Input row : ");
        int row = ip.nextInt();
        System.out.print("Input collumn : ");
        int collumn = ip.nextInt();
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        arrList = transform(arrList, row, collumn);
        print(arrList);
    }

    public static ArrayList<ArrayList<Integer>> transform(ArrayList<ArrayList<Integer>> arrList, int row, int collumn){
        Scanner ip = new Scanner(System.in);
        for(int i = 0; i < row; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < collumn; j++){
                System.out.print("element[" + i +"][" + j + "] : ");
                int temp = ip.nextInt();
                list.add(temp);
            }
            arrList.add(list);
        }
        for(int i = 0; i < row; i++){
            boolean check = false;
            for(int j = 0; j < collumn; j++){
                if(arrList.get(i).get(j) == 0){
                    for(int k = 0; k < collumn; k++){
                        arrList.get(i).set(k,0);
                    }
                    // System.out.println(arrList);
                    for(int l = 0; l < row; l++){
                        arrList.get(l).set(j,0);
                    }
                    check = true;
                    break;
                }
            }
            if(check == true){
                break;
            }
        }
        return arrList;
    }

    public static void print(ArrayList<ArrayList<Integer>> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}