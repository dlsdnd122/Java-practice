package boj.boj_27866;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        int num = sc.nextInt();

        System.out.println(arr[num - 1]);
    }
}
