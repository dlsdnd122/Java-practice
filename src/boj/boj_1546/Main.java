package boj.boj_1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();

        double[] arr = new double[sub];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열에서 최대값 구하기
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

//        System.out.println("최댓값 : " + max);

        // 점수 주작하기
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < max) {
                arr[i] = arr[i] / max * 100;
//            }
//            System.out.println(i + "번째 인덱스 주작 점수 : " + arr[i]);
        }

        // 평균 구하기
        double avg = 0;
        for (int i = 0; i < sub; i++) {
            avg = avg + arr[i];
        }
        avg = avg / sub;

        System.out.println(avg);
    }
}
