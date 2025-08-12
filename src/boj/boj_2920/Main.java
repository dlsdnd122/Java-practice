package boj.boj_2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1] - 1) asc = false;
            if (num[i] != num[i + 1] + 1) desc = false;
        }

        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
