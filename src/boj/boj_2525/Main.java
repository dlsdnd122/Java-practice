package boj.boj_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        // m + time 이 60분을 안넘을때

        // m + time 이 60을 넘으면 -> m + 1 해주기
        // m + 1 이 23을 넘으면 1로 바꿔주기
        // m + time 이 120을 넘으면 -> m + 2 해주기
        // 120을 넘었을때로 계산해주면 안됨
        // 반복문으로 넘겨주자


        if (m + time < 60) {    // m + time 이 60을 안넘었을때
            m = m + time;
            System.out.println(n + " " + m);
        } else if (m + time >= 60) { // m + time 이 60분을 넘을 때
            n = n + ((m + time) / 60);
            if (n >= 24) {          // n을 더한값이 24이상인 경우
                n = n - 24;
            }
            m = (m + time) % 60;
            System.out.println(n + " " + m);
            // 여기서 오류 발생함.
        }
    }
}
