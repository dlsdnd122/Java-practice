package boj.boj_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int big = 0;
        int big_num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
                big_num = i + 1;
            }
        }
        System.out.println(big);
        System.out.println(big_num);

    }
}
