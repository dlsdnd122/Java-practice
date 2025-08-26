package boj.boj_9012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.next();
        }

        // 문자를 괄호를 받고
        // '(' 일 때 count +1
        // ')' 일 때 count -1
        // 최종 결과가 0이 아닐 경우 NO
        // 최종 결과전에 한순간이라도 -1이 될 경우 NO
        // 최종 결과가 0일 경우만 YES

        for (int i = 0; i < t; i++) {
            char[] arr2 = arr[i].toCharArray();
            int count = 0;
            boolean result = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == ('(')) {
                    count++;
                } if (arr2[j] == (')')) {
                    count--;
                }

                if (count < 0) {
                    result = false;
                    break;
                }
            }

            if (result && count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
