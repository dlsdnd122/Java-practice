package boj.boj_2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String str = sc.next();

            char[] arr = str.toCharArray();

            // 입력받은 숫자만큼 입력받은 단어의 알파벳을 출력하는 문제
            // 3 ABC -> AAABBBCCC
            // 배열을 하나 만들어서 입력받은 단어를 배열에 넣어준다.
            // 2중 for문으로 arr[i]를 n번 프린트찍어준다.
            // 공백으로 구분되게 하라고 하였으니
            // 공백값이라면 아무것도 안찍히게 하면된다.

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < m; k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
