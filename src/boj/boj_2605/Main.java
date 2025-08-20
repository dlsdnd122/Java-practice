package boj.boj_2605;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0번은 그 자리 그대로
        // 1번은 현재 자리보다 1칸 앞으로
        // 2번은 현재 자리보다 2칸 앞으로
        // 3번은 현재 자리보다 3칸 앞으로
        // 4번은 현재 자리보다 4칸 앞으로

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        // 학생 수 = n
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                list.add(i + 1);
            } else {
                list.add(list.size() - num, i + 1);
            }
        }

        for (Integer num : list) {
            System.out.print(num + " ");
        };











    }
}
