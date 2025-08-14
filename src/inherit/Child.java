package inherit;

public class Child extends Parent {
    void method2(int n) {
        if (n == 1) {
            super.method2(1);
        } else {
            System.out.println("자식 메서드 2 호출");
        }
    }

    void method3() {
        System.out.println("자식 메서드 3 호출");
    }
}

