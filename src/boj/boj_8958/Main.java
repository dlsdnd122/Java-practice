package boj.boj_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String answer = sc.next();
            char[] arr = answer.toCharArray();  // String으로 받아온 값들을 char 배열로 문자하나하나 받기

            int score = 0;
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'O') {
                    score++;
                    sum = sum + score;
                } else {
                    score = 0;
                }
            }
            System.out.println(sum);

        }
    }
}
