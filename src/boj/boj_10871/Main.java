package boj.boj_10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();

        int[] num = new int[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] < x) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
