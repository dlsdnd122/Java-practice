package Ch6_problem;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        if (balance < 0) {
            balance = 0;
        }
        this.balance = balance;
    }

    public int deposit(int deposit) {
        if (deposit < 0) {
            System.out.println("음수는 입금할 수 없습니다.");
            return balance;
        } else {
            balance = balance + deposit;
            System.out.println("입금 완료 : " + deposit + ", 잔액 : " + balance + "원");
        }
        return balance;
    }

    public int withdraw(int withdraw) {
        if ( withdraw < 0) {
            System.out.println("음수는 출금할 수 없습니다.");
            return balance;
        } if (balance < withdraw) {
            System.out.println("잔액이 부족합니다. 잔액 : " + balance + "원");
            return balance;
        } if (balance > withdraw) {
            balance = balance - withdraw;
            System.out.println("출금 완료 : " + withdraw + ", 잔액 : " + balance + "원");
        }
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // 생성자의 인자는 최초 금액
        BankAccount account = new BankAccount(5000);

        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(10000); // 잔액 부족

        System.out.println("최종 잔액: " + account.getBalance() + "원");
        System.out.println();

        // 마이너스 통장은 고려하지 말고.. 음수가 들어오면 0원으로 초기화
        BankAccount account2 = new BankAccount(-10000);

        System.out.println("최종 잔액: " + account2.getBalance() + "원");
        System.out.println();

        BankAccount account3 = new BankAccount(0);
        account3.deposit(-5000); // 음수 입금 불가
        account3.deposit(2000);
        account3.withdraw(-5000); // 음수 출금 불가
        account3.withdraw(500);

        System.out.println("최종 잔액: " + account3.getBalance() + "원");
    }
}
