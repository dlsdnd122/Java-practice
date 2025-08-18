package ch8_interface;

interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card : " + amount);

    }
}

class Paypal implements Payment {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal : " + amount);
    }
}

public class PaymentExample {
    public static void main(String[] args) {
        Payment payment = new CreditCard("1234-5678");
        Payment payPal = new Paypal("dlsdnd122@naver.com");
        CreditCard creditCard = new CreditCard("1234-5678");
        Paypal payPal2 = new Paypal("dlsdnd122@naver.com");

        payment.processPayment(150.00);
        payPal.processPayment(10.00);

        creditCard.processPayment(150.00);
        payPal2.processPayment(150.00);
    }
}
