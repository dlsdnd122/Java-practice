package boj.boj_18108;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 서기연도 = 불기연도 - 543

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        sc.nextLine();

        result = n - 543;
        System.out.println(result);

    }
}
