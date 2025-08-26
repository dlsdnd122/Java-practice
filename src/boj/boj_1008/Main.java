package boj.boj_1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m =  sc.nextInt();
        sc.close();

        double result = 0;
        result = (double) n / m;
        System.out.println(result);
    }
}
