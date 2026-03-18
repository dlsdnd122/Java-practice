package boj.boj_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 문자 입력 후 가장 많이 사용된 알파벳 대문자로 출력하기
        // 문자를 받고 배열에 넣는다
        // 그리고 문자를 전부 대문자로 변경
        // 알파벳 개수를 저장할 카운팅 배열을 하나 만든다
        // 그리고 해당 배열에서 가장 큰 값을 찾는다 (만약 큰값이 2개이상일 경우 ?를 출력한다.)

        Scanner sc = new Scanner(System.in);
        // 입력값 대문자로 변경
        String str = sc.nextLine().toUpperCase();

        // 문자를 배열에 넣기
        char[] arr = str.toCharArray();

        // 알파벳 개수를 저장할 카운팅 배열 생성
        int[] count = new int[26];

        // 배열 순환
        for (int i = 0; i < arr.length; i++) {
            // 배열 안에 있는 값 인덱스값으로 변경
            int temp = arr[i] - 'A';
            // 알파벳 배열 카운팅
            count[temp]++;
        }

        // 알파벳 배열안에서 최대값 찾기
        int max = 0;
        int index = 0;
        boolean isDuplicate = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                index = i;
                isDuplicate = false;
            }
            // 최대값이 2개이상일 경우
            else if (count[i] == max) {
            isDuplicate = true;
            }
        }

        // 문자로 변환
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println((char)(index + 'A'));
        }
    }
}
