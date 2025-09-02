package boj.boj_5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 2차원 배열을 선언 (다이얼)
        char[][] arr = {
                {'A', 'B', 'C'},    // 3초
                {'D', 'E', 'F'},    // 4초
                {'G', 'H', 'I'},    // 5초
                {'J', 'K', 'L'},    // 6초
                {'M', 'N', 'O'},    // 7초
                {'P', 'Q', 'R', 'S'},   // 8초
                {'T', 'U', 'V'},    // 9초
                {'W', 'X', 'Y', 'Z'}    // 10초
        };

        // 받은 str char 배열에 넣기
        char[] arr2 = str.toCharArray();

        // 걸리는 시간
        int time = 0;

        // arr2에 있는 값 arr에서 찾기
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (arr2[i] == arr[j][k]) {
                        time = time + j + 3;
                    }
                }
            }
        }
        System.out.println(time);



    }
}
