package boj.boj_3003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받은 체스판 말들
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 체스판의 말들
        int[] arr2 = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
                // 입력받은 값이 더 클때
                if (arr[i] > arr2[i]) {
                    arr2[i] = arr2[i] -  arr[i];
                }
                // 입력받은 값이 더 작을때
                else if (arr[i] < arr2[i]) {
                    arr2[i] = arr2[i] - arr[i];
                }
                // 입력받은 값이 같을때
                else if (arr[i] == arr2[i]) {
                    arr2[i] = arr2[i] - arr[i];
                }

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
