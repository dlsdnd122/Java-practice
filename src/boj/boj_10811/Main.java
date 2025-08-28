package boj.boj_10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 바구니 생성
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // 바구니를 역순으로 만든다.
        // a번째부터 b번째까지
//        1 2 3 4 5
//        2 1
//            4 3
//        3 4 1 2
//          4
//        3 4 1 2 5

        // 이런식으로 바구니가 된다.
        // a번째부터 b번째를 역순으로 가는걸 어떻게 구현해야하나..
        // 생각해보면 결국 역순은 끝의 인덱스 들이 바뀌는 것이다.
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            int temp = 0;

            while (a < b) {
                temp = arr[a];
                arr[a] =  arr[b];
                arr[b] = temp;
                a++;
                b--;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
