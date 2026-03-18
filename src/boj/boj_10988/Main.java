package boj.boj_10988;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자 입력받기
        String str = sc.nextLine();

        // 문자 배열로 변환
        char[] arr = str.toCharArray();
        int num = arr.length;
        boolean status = true;

        for (int i = 0; i < num/2; i++) {
            if (arr[i] == arr[num - 1 - i]) {
                continue;
            } else {
                status = false;
                break;
            }
        }

        if (status) {
            System.out.println("1");
        } else  {
            System.out.println("0");
        }
    }
}
