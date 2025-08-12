package boj.boj_3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i] % 42;
        }
        Arrays.sort(arr2);

        int count = 1;  // 첫 숫자는 무조건 다르다고 생각해야하므로 1이 들어가야한다.
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] != arr2[i + 1]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
