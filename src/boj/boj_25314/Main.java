package boj.boj_25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String a = "int";
        String b = "long";

        for (int i = 0; i < n / 4; i++) {
            System.out.print(b + " ");
        }
        System.out.println(a);

    }
}
