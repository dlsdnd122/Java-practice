package boj.boj_1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int m = num.nextInt();

        int result = n - m;
        System.out.println(result);
    }
}
