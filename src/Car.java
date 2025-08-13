public class Car {
    String company; // 객체 본인의 company
    String model;
    int maxSpeed;

    void setModel (String model) {
        this.model = model;
    }

    Car() {}    // default 생성자

    // 1번째 생성자
    Car(String company) { // 클래스명을 메서드 명으로 똑같이 넣어야 한다.(생성자 생성)
        this.company = company; // 파라미터로 들어온 company
    }

    // 2번째 생성자
    Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    // 3번째 생성자
    Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
//        Car car = new Car("현대자동차");    // 객체 생성자

//        Car sonata = new Car("현대");
//        Car sportage = new Car("기아", "sportage");
//        Car gv80 = new Car("제네시스", "GV80", 300);
        Car sonata = new Car();
        sonata.setModel("Sonata123");
        System.out.println(sonata.model);


    }
}
