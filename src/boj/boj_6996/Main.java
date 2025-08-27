package boj.boj_6996;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 일단 두 단어에 서로 같은 문자들로만 이루어져있는지 확인을 해야한다.
        // 배열에 있는 인덱스를 다 비교하나?
        // 이런 방법도 있지만 정렬을 하고 비교를 한다면?
        // 어차피 둘다 같은 길이에 같은 문자들로 이루어져있으므로
        // 정렬을 해서 비교를 해주면되는 간단한 문제이다.

        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            if (arr1.length != arr2.length) {
                System.out.println(s1 + " & " + s2 + " are NOT anagrams.");
            } else{
                // 정렬을 하고 비교를 한다.
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    System.out.println(s1 + " & " + s2 + " are anagrams.");
                } else {
                    System.out.println(s1 + " & " + s2 + " are NOT anagrams.");
                }
            }
        }




    }
}
