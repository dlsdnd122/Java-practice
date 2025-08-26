package boj.boj_20053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (count < n) {
            int max = 0;
            int min = 0;
            int testNum = sc.nextInt();
            int[] arr = new int[testNum];
            for (int i = 0; i < testNum; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = new int[2];
            for (int i = 0; i < testNum; i++) {
                if (i == 0) {
                    max = arr[0];
                    min = arr[0];
                }
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            result[0] = min;
            result[1] = max;
            System.out.println(result[0] + " " + result[1]);
            count++;
        }



    }
}
