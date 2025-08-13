package Ch6_problem;

import java.util.Scanner;

public class Coffemachine {
    private int balance;

    public Coffemachine(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        System.out.println("남은 원두량 : " + balance + "g");
        return balance;
    }

    public int setAmericano(int num) {
        if (num <= 0) {
            System.out.println("제대로 주문해주셈요.");
        } if (balance < num * 10) {
            System.out.println("원두가 부족합니다. 현재 원두 : " + balance + "g");
        } else {
            balance = balance - (num * 10);
            System.out.println("아메리카노 " + num + "잔이 준비되었습니다. 남은 원두 : " + balance + "g");
            return balance;
        }
        return balance;
    }

    public int setLatte(int num) {
        if (num <= 0) {
            System.out.println("제대로 주문해주셈요.");
        } if (balance < num * 20) {
            System.out.println("원두가 부족합니다. 현재 원두 : " + balance + "g");
        } else {
            balance = balance - (num * 20);
            System.out.println("라떼 " + num + "잔이 준비되었습니다. 남은 원두 : " + balance + "g");
            return balance;
        }
        return balance;
    }

    public int setCappuccino(int num) {
        if (num <= 0) {
            System.out.println("제대로 주문해주셈요.");
        } if (balance < num * 20) {
            System.out.println("원두가 부족합니다. 현재 원두 : " + balance + "g");
        } else {
            balance = balance - (num * 20);
            System.out.println("카푸치노 " + num + "잔이 준비되었습니다. 남은 원두 : " + balance + "g");
            return balance;
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("커피 원두를 넣어주세요(단위 : g) : ");
        int balance = sc.nextInt();

        Coffemachine cfm = new Coffemachine(balance);
        cfm.setAmericano(1);
        cfm.setLatte(1);
        cfm.setCappuccino(1);
        cfm.setCappuccino(1);
        cfm.setCappuccino(1);
        cfm.setCappuccino(1);
        cfm.setCappuccino(1);
        cfm.setCappuccino(1);
        cfm.getBalance();
    }
}
