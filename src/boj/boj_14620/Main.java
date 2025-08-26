package boj.boj_14620;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // 2차원배열에 값들 넣기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }







        // 2차 배열로 값들을 받는다.
        // 우선 태두리에 있는 칸들은 꽃을 심을 수가 없다.
        // 2,2 ~ n-1, n-1 까지가 꽃을 심을 수 있는 칸
        // 꽃 하나가 차지하는 칸의 수는 4칸이고
        // n,n칸에 씨앗을 심었다고 하면
        // n-1,n  n,n-1  n+1,n  n,n+1 n,n 이렇게 5칸의 가격이 필요함

        // 조건1
        // 3개의 꽃이 차지하는 칸의 수 = 15칸
        // 차지하는 칸이 '15칸이 아니라면 안됨

        // 조건2
        // 씨앗을 심는 곳이 테두리 칸이면 안됨

        // 조건3
        // 5개의 칸의 합이 최소여야함

        // 2,1 부터 다 돌리고 받은 칸이 15개인지 카운트
        // 15개가 아니면 뽑았던 씨앗을 심는 칸 중에 가장 큰 칸을 변경하는식으로


        // 2차원 배열 순회
        // 함수를 적극적으로 만들어서 사용하자
        // 함수에서 쓰는 배열이나 변수들을 static으로 값으로 선언해줘서 모든 함수에서 다 쓰게하기




    }
}
