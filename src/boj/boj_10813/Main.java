package boj.boj_10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int m = sc.nextInt();

        // 바구니를 만들고 바구니에 적힌 번호와 같은 값이 들어가있음
        int[] arr = new int[n];
        for (int i = 1; i < n + 1; i++) {
            arr[i - 1] = i;
        }

        // m번 공을 바꿀려고한다.
        // 바구니를 2개 선택하고 들어있는 공을 서로 교환

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = 0;

            // 0번째 인덱스가 첫번째 바구니 이므로 -1을 빼준다.
            temp = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = temp;
        }

        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }






    }
}
