package boj.boj_10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 단어를 입력하면 그 단어의 알파벳이
        // a~z까지에 포함되어 있는가를 판단하는 문제
        // 배열1 -> string으로 받은 단어를 char 형태로 넣어넣는 배열
        // 배열2 -> a ~ z까지 입려되어있는 배열
        // 2중 반복문 사용하면 될꺼같음
        // 있으면 포문에서 브레이크 걸어줘서 탈출시키고 값 할당하고

        // 받은 단어 배열에 넣기
        char[] arr1 = str.toCharArray();
        // a~z 까지 배열에 넣기
        // 소문자 a는 유니코드가 97이다.
        char[] arr2 = new char[26];
        int temp = 0;
        for (int i = 0; i < arr2.length; i++) {
             temp = 97 + i;
             arr2[i] = (char)temp;
        }

        // 결과값을 담을 배열
        int[] result = new int[26];

        // 문자 비교 반복문
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    result[i] = j;
                    break;
                } else {
                    result[i] = -1;
                }
            }
        }

        // 결과값 들어있는 배열 출력
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }







    }
}
