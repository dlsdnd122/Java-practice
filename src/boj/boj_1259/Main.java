package boj.boj_1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            String num = Integer.toString(n);
            char[] chars = num.toCharArray();
            boolean flag = true;
            for (int i = 0; i < chars.length -1; i++) {
                if (chars[i] == chars[(chars.length - 1) - i]) {
                    flag = true;
//                    System.out.println(chars[i] + ", " + chars[(chars.length - 1) - i] + "결과 : " + flag);
                } else {
                    flag = false;
//                    System.out.println(chars[i] + "," + chars[(chars.length - 1) - i] + "결과 : " + flag);
                    break;
                }
//                System.out.println(flag);
            }
            if (n == 0) {
                break;
            } if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
