package boj.boj_11718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hasNext : 읽을 수 있는 토큰이 존재하는지 확인하는 메서드
        // 있으면 true
        // 없으면 false
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(str);
        }

    }
}
