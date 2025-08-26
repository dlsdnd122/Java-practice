package boj.boj_1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[n][m];
        String[] arr1 = new String[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            String number = arr1[i];
            for (int j = 0; j < m; j++) {
                arr[i][j] = number.charAt(j) - '0';
            }
        }
        // 2차원 배열에 다 들어간거 확인

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }





        // 세로길이 n
        // 가로길이 m
        // 직사각형이
        // 각 칸에는 한자리 숫자가 적혀있음
        // 이 직사각형에서 꼭짓점에 쓰여있는 수가 모두 같은 가장 큰 정사각형을 찾는 프로그램
        // 정사각형은 행 또는 옆에 평행해야함

        // 정사각형
        // 가장 큰 정사각형 찾기
        // n, m 을 비교했을때 가장 작은수가 정사각형의 한변이다.
        // 3, 5라고 했을때 찾을 수 있는 가장 큰 정사각형의 변의 길이는 3이다.
        // n,n을 기준으로 n,n+2 n+2,n n+2,n+2 이렇게 4개가 정사각형의 꼭짓점이 된다.
        // 위에서 2는 3-1이다.

        // 꼭짓점의 수가 모두 같아야한다.
        // n, m 중에 작은 수를 고른 뒤, 그 작은 수를 변으로 가지고 있는 정사각형이 있는지 조사
        // n-1로 계속 줄여주면서 찾기





    }
}
