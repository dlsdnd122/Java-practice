package boj.boj_11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 붙어 있는 숫자를 받아와서 뽑아야 하기 때문에 String으로 받는다.
        String nums = sc.next();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            // 0이 아스키 코드 값 48이라서 이걸 빼주고 나머지 값을 뽑으면 해당 숫자가 나온다.
            sum = sum + nums.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
