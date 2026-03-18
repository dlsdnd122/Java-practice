package boj.boj_2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /*
        입력값 = 5
        빈칸 별
        4   1
        3   3
        2   5
        1   7
        0   9

        1   7
        2   5
        3   3
        4   1
         */

        // 위쪽
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i*2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
