package boj.boj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // n개의 바구니
        // m번 공을 넣음

//        1 2 3 4 5
//        3 3
//            4 4
//        1 1 1 1
//          2
//        1 2 1 1 0
//
        // 바구니들을 만들어준다 -> n개 만큼의 배열
        // 3개의 값 a, b, c를 입력받은 뒤
        // a번 인덱스 ~ b번 인덱스에 c가 들어간다.
        // for 문으로 해당 인덱스에 c값을 넣어준다.
        // 이렇게 전부 배열에 넣어준다음
        // 조건문으로 배열이 비어있으면 0값을 넣어주고
        // 해당 배열을 출력한다.

        // 바구니들 생성
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = a - 1; j <= b - 1; j++) {
                arr[j] = c;
            }
//            System.out.println();
//            System.out.println((a-1) + "번 인덱스에 들어간 값 : " + arr[a] + ", " + (b-1) + "번 인덱스에 들어간 값 : " + arr[c]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
