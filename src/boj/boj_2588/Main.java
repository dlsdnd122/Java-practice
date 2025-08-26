package boj.boj_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.next();
        sc.nextLine();
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int result6 = 0;

        char[] arr = m.toCharArray();
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] - '0';
        }

        result3 = n * arr2[2];
        result4 = n * arr2[1];
        result5 = n * arr2[0];
        result6 = result3 + (result4 * 10) + (result5 * 100);

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
