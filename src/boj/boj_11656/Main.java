package boj.boj_11656;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr1 = s.toCharArray();

        // arr2에는 String 타입을 가진 문자들이 들어가진다.
        String[] arr2 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = String.valueOf(arr1[i]);
        }

        // 0 -> 0,1,2,3,4,5,6,7,8
        // 1 -> 1,2,3,4,5,6,7,8
        // 2  -> 2,3,4,5,6,7,8
        String basket = "";
        String[] arr3 = new String[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                basket = "";
                basket = basket + arr2[j];
            }
            arr3[i] = basket;
            System.out.print(arr3[i] + ", ");
        }


//        Arrays.sort(arr3);
//
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }


    }
}
