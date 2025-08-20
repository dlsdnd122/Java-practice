package boj.boj_28278;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int command = sc.nextInt();
            if (command == 1) {
                int value = sc.nextInt();
                stack.push(value);
            } if (command == 2) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } if (command == 3) {
                System.out.println(stack.size());
            } if (command == 4) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } if (command == 5) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}


// 백준이 프린트로 찍어주면 시간초과가 나서 지피티에게 버퍼로 바꿔달라고 하였음

//package boj.boj_28278;
//
//import java.io.*;
//        import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> stack = new Stack<>();
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int command = sc.nextInt();
//            if (command == 1) {
//                int value = sc.nextInt();
//                stack.push(value);
//            }
//            if (command == 2) {
//                if (stack.isEmpty()) {
//                    bw.write("-1\n");
//                } else {
//                    bw.write(stack.pop() + "\n");
//                }
//            }
//            if (command == 3) {
//                bw.write(stack.size() + "\n");
//            }
//            if (command == 4) {
//                bw.write(stack.isEmpty() ? "1\n" : "0\n");
//            }
//            if (command == 5) {
//                bw.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
//            }
//        }
//
//        bw.flush();  // 버퍼에 쌓인 내용 한 번에 출력
//        bw.close();  // 스트림 닫기
//    }
//}






