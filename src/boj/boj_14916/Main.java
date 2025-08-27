package boj.boj_14916;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 5;
        int b = 2;
        int count = 0;

        // n이 5보다 크만 우선 5를 빼준다.
        // 근데 13같은 경우는 5를 빼주면 8이 남는데
        // 여기서 5를 또 빼버리면 3이 남아 거스름돈을 줄 수 없게 된다.
        // 만약 5로 나눴을때 나머지가 남는다면
        // 2로 나눠주는걸로 가자

        // 5의 배수일 경우
        // 2의 배수일 경우


        while (n > 0) {
            if (n > a) {
                if (n % a == 0) {
                    count = count + n / a;
                    n = 0;
                } else {
                    n = n -2;
                    count++;
                }
            } if (n < a && n > b) {
                if (n % b == 0) {
                    count = count + n / b;
                    n = 0;
                } else {
                    count = count + n / a;
                    n = n % a;
                }
            }
        }

        if (n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }


        System.out.println(count);
    }
}
