package boj.boj_2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int[] num = {num1, num2, num3, num4, num5};

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + (num[i] * num[i]);
        }
        int result = sum % 10;
        System.out.println(result);
    }
}
