package programmers.lv0;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] arr = a.toCharArray();

        // 소문자 = 대문자, 대문자 = 소문자
        for (int i = 0; i < arr.length; i++) {
            if(Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            } else  {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
