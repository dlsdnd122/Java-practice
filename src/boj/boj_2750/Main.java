package boj.boj_2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // 오름차순으로 정렬
        Collections.sort(list);

        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
