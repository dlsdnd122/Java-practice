package boj.boj_10951;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hasNext() -> 읽을 토큰이 있으면 true, 없으면 EOF -> false
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int result = 0;
            result = n + m;
            System.out.println(result);

        }
    }
}
