package boj.boj_2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int money = 0;
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int max = 0;

        if (a == b && b == c) {
            money = 10000 + (a * 1000);
        } else if (a == b || b == c || a == c) {
            if (a == b) {
                money = 1000 + (a * 100);
            } else if (b == c) {
                money = 1000 + (b * 100);
            } else if (a == c) {
                money = 1000 + (a * 100);
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            money = max * 100;
        }

        System.out.println(money);
    }
}
