package boj.boj_21608;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n * n][5];

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i < n*n; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 학생의 수 = n * n
        // 교실의 크기도 n * n
        // 교실의 가장 윗칸 = 1,1
        // 교실의 가장 아랫 칸 = n,n
        // 학생이 좋아하는 학생 4명 조사







    }
}
