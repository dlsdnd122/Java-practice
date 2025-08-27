package boj.boj_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next() -> 공백, 탭, 줄바꿈을 기준으로 한 토큰만 읽음(공백이나 줄바꿈 전까지만 입력받음)
        // nextLine() -> 줄 전체를 읽음
        // 이 문제같은 경우는 공백을 기준으로 2개의 문자열을 읽는 것이므로 next가 맞음
        String n1 = sc.next();
        String n2 = sc.next();
        sc.close();

        StringBuilder n1Str = new StringBuilder(n1);
        StringBuilder n2Str = new StringBuilder(n2);

        n1Str.reverse();
        n2Str.reverse();

        // 스트링 버퍼는 파싱으로 문자열을 숫자로 바꿔야한다.
        // 또한 스트링버퍼 타입이므로 안에 toString으로 문자열로 변환해준다.
        int num1 = Integer.parseInt(n1Str.toString());
        int num2 = Integer.parseInt(n2Str.toString());

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
