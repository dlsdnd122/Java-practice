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
        if (m + time < 60) {
            System.out.println(n + " " + (m + time));
        } else if (m + time >= 60) { // m + time 이 60분을 넘을 때
            System.out.println(n + 1 + " " + ((m + time) - 60));
            if (m + time >= 120) {

            } if (n >= 24) {   // m + time 이 60을 넘었는데
                System.out.println((n - 24) + " " + (m + time - 60));
            }
        }
    }
}
