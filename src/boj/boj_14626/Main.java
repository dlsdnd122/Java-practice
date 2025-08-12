package boj.boj_14626;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
        char[] chars = isbn.toCharArray();

        int[] arr = new int[chars.length];
        int sum = 0;
        int x = (int)chars[chars.length -1] - '0';
        // 99으로 둔 이유는 모든 값들은 1의 자리 숫자이기 때문에 3을 곱해봐야 27이므로 차별성을 줄 수 있다.
        int m = 99;
        // 곱한 숫자, *기호 찾는 로직
        for (int i = 0; i <= chars.length - 1; i++) {
            // 첫번째 숫자는 따지고보면 0번째 인덱스 이기 때문에 인덱스가 하나씩 밀린다.
            if (i % 2 != 0) {
                // 짝수번째 숫자 인덱스 = 실제 수에서 홀수
                arr[i] = ((int)chars[i] - '0' ) * 3;
            } if (arr[i] % 2 == 0) {
                // 홀수 인덱스 숫자 인덱스 = 실제 수에서 짝수
                arr[i] = (int)chars[i] - '0';
            } if (chars[i] == '*') {
                if (i % 2 != 0) {
                    arr[i] = m * 3;
                    System.out.println("* : " + arr[i]);
                } else {
                    arr[i] = m;
                    System.out.println("* : " + arr[i]);
                }
            } if (arr[i] == arr[chars.length -1]) {
                arr[i] = x; // 인덱스 마지막값 x 들어가게 하기
            }
        }

        System.out.println("arr 배열 : " + Arrays.toString(arr));

        for (int i = 0; i < chars.length; i++) {
            sum += arr[i];
        }
        sum = sum - 99; // 최종 sum 값
        // 이제 여기서 (sum(106) + ?)/10 = 3



    }
}
