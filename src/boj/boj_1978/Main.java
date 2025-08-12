package boj.boj_1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        double[] arr2 = new double[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = Math.sqrt(arr[i]);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2) continue;

            boolean num = true;
            int root = (int) arr2[i];
            for (int j = 2; j <= root; j++) {
                if (arr[i] % j == 0) {
                    num = false;
                    break;
                }
            }
            if (num) {count++;}
        }
        System.out.println(count);
    }
}
