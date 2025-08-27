package boj.boj_2578;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[][] arr = new int[5][5];
        // 철수의 빙고판
        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 사회자가 부르는 수들
        for (int i = 0; i < 25; i ++) {
            int num = sc.nextInt();
            // 빙고와 비교해서 같으면 0으로 바꿔주기
            for (int j = 0; j < 5; j ++) {
                for (int k = 0; k < 5; k ++) {
                    if (arr[j][k] == num) {
                        arr[j][k] = 0;
                        count++;
                        checkBoard(arr);

                        if (checkBoard(arr) >= 3) {
                            System.out.println(count);
                            return; // 함수 자체 탈출
                        }
                    }
                }
            }
            // 빙고판 검사하기
            // 빙고가 3개이상 나오면 프로그램 종료
            //
        }
    }

    public static int checkBoard(int[][] board ) {
        // 보드판 검사 의사코드
        // 해당 배열을 순회 후,
        // 배열에 빙고가 완성되었는지 평가
        // 밑의 조건이 될때마다 bingoCount ++
        // 1. 한 행이 전부 0
        // 2. 한 열이 전부 0
        // 3. arr[i][i] 가 전부 0
        // 4. arr[i][4 - i] 가 전부 0
        // return bingoCount 해줌

        int bingoCount = 0;
        int count = 0;
        // count = 5일때 bingCount++

        // 행을 검사하는 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    count++;
                }
            }
            if (count == 5) {
                bingoCount++;
            }
            count = 0;
        }


        // 열을 검사하는 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == 0) {
                    count++;
                }
            }
            if (count == 5) {
                bingoCount++;
            }
            count = 0;
        }

        // arr[i][i]가 전부 0일 때,
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 0) {
                count++;
            }
            if (count == 5) {
                bingoCount++;
            }
        }
        count = 0;

        // arr[i][4 - i] 가 전부 0일때,
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] == 0){
               count++;
            }
            if (count == 5) {
                bingoCount++;
            }
        }
        count = 0;

        return  bingoCount;
    }

    public static void printBoard(int[][] board) {

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
