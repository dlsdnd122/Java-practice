package boj.boj_10869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a + b;
        System.out.println(add);
        int sub = a - b;
        System.out.println(sub);
        int mul = a * b;
        System.out.println(mul);
        int div = a / b;
        System.out.println(div);
        int mod = a % b;
        System.out.println(mod);

    }
}
