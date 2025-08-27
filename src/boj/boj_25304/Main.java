package boj.boj_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < num; i++) {
            int product = sc.nextInt();
            int num2 = sc.nextInt();

            sum = sum + (product * num2);
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
