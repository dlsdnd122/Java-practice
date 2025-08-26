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
                    }
                }


            }
        }











        // 사회자가 부르는 수들
//        int[][] arr2 = new int[5][5];
//        for (int i = 0; i < 5; i ++) {
//            for (int j = 0; j < 5; j ++) {
//                arr2[i][j] = sc.nextInt();
//            }
//        }

        // 2차원배열을 순회를 돌리면서 서로 같은 값들을 0으로 바꿔준다.
        // count 를 +1 계속 시켜준다. (여기서 카운트는 심판이 부른 수의 횟수)
        // 조건문
        // 빙고일때마다 bingo 변수를 +1 해주고 3이 되면 break 해준다.
        // 한 행이 다 0일때 -> 빙고
        // 한 열이 다 0일때 -> 빙고
        // (0,0) (1,1) (2,2) (3,3) (4,4) 이 0일때 -> 빙고
        // (4,0) (3,1) (2,2) (1,3) (0,4) 이 0일때 -> 빙고

        // 값 비교 후 0값으로 변경하기
        // 4중 포문 말고 뭔가 방법이 없을까.. 고민해봤는데..
        // 암만생각해도 2차원배열을 다 돌면서 값을 비교할려면 이거말고는 생각나지 않는다.
//        for (int i = 0; i < 5; i ++) {
//            for (int j = 0; j < 5; j ++) {
//                for (int k = 0; k < 5; k ++) {
//                    for (int l = 0; l < 5; l ++) {
//                        if (arr[i][j] == arr2[k][l]) {
//                          arr[i][j] = 0;
//                          count++;
//                        }
//                    }
//                }
//            }
//        }






    }
}
