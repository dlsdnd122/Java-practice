package boj.boj_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (x < 45) {
            if (n == 0) {
                n = 24;
            }
            n = n - 1;
            x = 60 + (x - 45) ;
            System.out.println(n + " " + x);
        } else if (x > 45) {
            x = x - 45;
            System.out.println(n + " " + x);
        } else if (x == 45) {
            x = 0;
            System.out.println(n + " " + x);
        }
    }
}
