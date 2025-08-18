package ch8_interface.Ex1;

interface AlertService {
    void notif();
    void method();
}

class EmailNotify implements AlertService {
    private String email;

    public EmailNotify(String emailName) {
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

class SMSNotify implements AlertService {
    private String phoneNumber;

    public SMSNotify(String phoneNumber) {
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

class ApplicationNotify implements AlertService {
    private String appUserName;

    public ApplicationNotify(String appUserName) {
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
        AlertService alert1 = new EmailNotify("dlsdnd122@naver.com");
        AlertService alert2 = new SMSNotify("010-1234-1234");
        AlertService alert3 = new ApplicationNotify("정인웅");

        alert1.method();
        alert1.notif();
        alert2.method();
        alert2.notif();
        alert3.method();
        alert3.notif();
    }
}