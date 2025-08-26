package boj.boj_11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();

        long result = 0;
        result = a + b + c;
        System.out.println(result);

    }
}
