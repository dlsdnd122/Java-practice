package ch8_interface.Ex1;

interface Alert {
    void notif();
    void method();
}

class Email implements Alert {
    private String email;

    public Email(String emailName) {
        this.email = emailName;
    }

    @Override
    public void method() {
        System.out.println("(메일 서버를 통하여)");
    }

    @Override
    public void notif() {
        System.out.println(email + " 님 에게 이메일로 알림을 보냈습니다.");
    }
}

class Sms implements Alert {
    private String phoneNumber;

    public Sms(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void method() {
        System.out.println("(문자 발송 API를 통해)");
    }

    @Override
    public void notif() {
        System.out.println(phoneNumber +" 번호로 문자 알림을 보냈습니다.");
    }
}

class Push implements Alert {
    private String appUserName;

    public Push(String appUserName) {
        this.appUserName = appUserName;
    }

    @Override
    public void method() {
        System.out.println("(앱을 통해)");
    }

    @Override
    public void notif() {
        System.out.println(appUserName + " 님 에게 푸시 알림을 보냈습니다.");
    }
}

public class AlertExample {
    public static void main(String[] args) {
        Alert alert1 = new Email("dlsdnd122@naver.com");
        Alert alert2 = new Sms("010-1234-1234");
        Alert alert3 = new Push("정인웅");

        alert1.method();
        alert1.notif();
        alert2.method();
        alert2.notif();
        alert3.method();
        alert3.notif();
    }
}