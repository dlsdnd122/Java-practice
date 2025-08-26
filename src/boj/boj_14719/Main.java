package boj.boj_14719;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열에서 가장큰 수를 찾아 그 인덱스 까지는 arr[0]을 왼쪽 기둥으로 삼고 water을 구한다.
        int max = 0;

        for (int i = 0; i < m; i++) {
            // 가장 큰 수가 있는 인덱스 찾기
            if (max < arr[i]) {
                max = i;
            }
        }

        // max 전까지의 area 범위
        int water = 0;
        int area = 0;
        for (int i = 1; i < max; i++) {
            water = arr[0] - arr[i];
            area = area + water;
            water = 0;
        }

        // max 후의 area 범위
        for (int i = max + 1; i < m; i++) {
            water = arr[m-1] - arr[i];
            area = area + water;
            water = 0;
        }

        System.out.println(area);



    }
}
