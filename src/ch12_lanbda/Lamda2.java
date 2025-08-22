package ch12_lanbda;

@FunctionalInterface
interface MyFunctionalInterface {
    void method();
}

@FunctionalInterface
interface MyFunctionalInterface2 {
    void method(int x);
}

@FunctionalInterface
interface MyFunctionalInterface3 {
    int method(int x, int y);
}

public class Lamda2 {
    public static void main(String[] args) {
        // 객체 생성
        MyFunctionalInterface finter;

        // 1
        finter = () -> {
            String str = "method call 1";
            System.out.println(str);
        };
        finter.method();

        // 2
        finter = () -> {
            System.out.println("method call 2");
        };
        finter.method();

        // 3
        finter = () -> System.out.println("method call 3");
        finter.method();


        // 객체 생성 2
        MyFunctionalInterface2 finter2;

        // 1
        finter2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        finter2.method(2);

        // 2
        finter2 = (x) -> {
            System.out.println(x * 5);
        };
        finter2.method(2);

        // 3
        finter2 = x -> System.out.println(x * 5);
        finter2.method(2);


        // 객체 생성 3
        MyFunctionalInterface3 finter3;

        // 1
        finter3 = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(finter3.method(2, 5));

        // 2
        finter3 = (x, y) -> {
            return x + y;
        };
        System.out.println(finter3.method(2, 5));

        // 3
        finter3 = (x, y) -> x + y;
        System.out.println(finter3.method(2, 5));



    }
}
