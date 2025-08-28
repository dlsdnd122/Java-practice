package boj.boj_5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 제출자
        int[] arr = new int[28];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 출석부
        int[] arr2 = new int[30];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }

        // 두 배열을 비교한다.
        // 만약 arr[i]가 arr2[j]와 같다면,
        // arr2[j]에 0을 넣어줘서 값을 지워준다.
        // 이렇게 해주면 결국 arr에 없는 값만 arr2 배열에 남게된다.
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    arr2[j] = 0;
                }
            }
        }

        // 그리고 0이 아닌값만 배열에서 출력하게 하면 된다.
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                System.out.println(arr2[i]);
            }
        }

        // 30명 중에 문제를 안푼 사람을 찾는거
        // 제출한 사람들을 제외시키고 나머지 번호를 구한다.
        // 이중반복문으로 비교를한다면?
        // 30사이즈 짜리 배열을 하나 만들고 1~30까지의 값을 넣은 뒤
        // 인덱스 하나하나씩 다 비교하는 거임

    }
}
