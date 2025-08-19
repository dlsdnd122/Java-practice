package ch9_exception_handling;

class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {}
    public BalanceInsufficientException(String message) { super(message); }
}

class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw (int money) throws BalanceInsufficientException {
        if (balance < money) {
            throw new BalanceInsufficientException("잔고가 부족합니다. " + (balance - money));
        }
        balance -= money;
    }
}

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        // 에금하기
        account.deposit(30000);
        System.out.println("예금액 : " + account.getBalance());
        // 출금 하기
            try {
                account.withdraw(100000);
            } catch (BalanceInsufficientException e) {
                // 예외 발생 경로를 추적
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

    }
}
