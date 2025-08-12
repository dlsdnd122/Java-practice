package boj.boj_14626;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
        char[] chars = isbn.toCharArray();

        int[] arr = new int[chars.length];
        int sum = 0;
        int x = (int)chars[chars.length -1] - '0';
        // 10으로 둔 이유는 모든 값들은 1의 자리 숫자이기 때문에 10으로 두면 차별성을 줄 수 있다.
        int m = 10;
        // 곱한 숫자, *기호 찾는 로직
        for (int i = 0; i < chars.length - 1; i++) {
            if (i % 2 != 0) {
                arr[i] = (int)chars[i] - '0';
            } else if (i % 2 == 0) {
                arr[i] = ((int)chars[i] - '0' ) * 3;
            } else if (chars[i] == '*' && i % 2 != 0) {
                arr[i] = m;
            } else if (chars[i] == '*' && i % 2 == 0) {
                arr[i] = m;
            }
        }

        int answer = 0;
        // -2인 이유는 마지막 인덱스는 체크 기호이기 때문에 더해주면 안된다.
        for (int j = 0; j < chars.length - 2; j++) {
            sum = sum + arr[j];
            // arr[j]에 들어간 값이 10이고, j가 홀수 일때,
            if (arr[j] == 10 && j % 2 != 0) {
                arr[j] =
            }
        }
    }
}
