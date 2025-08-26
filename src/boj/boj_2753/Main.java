package boj.boj_2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 윤년
        // 1. 4의 배수이면서 100의 배수가 아닐때
        // 2. 400의 배수일때

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(1);
        } else if (year % 400 == 0) {
            System.out.println(1);
        } else  {
            System.out.println(0);
        }
    }
}
