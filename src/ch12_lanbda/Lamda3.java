package ch12_lanbda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamda3 {
    public static void main(String[] args) {

        // Runabel
        // 매겨변수와 리턴 값 모두 없는 경우
        // run 메서드만 가지고 있다.
        Runnable r = () -> {
            System.out.println("출력문 테스트");
        };
        r.run();

        // Supplier<T>
        // 매개변수는 없고, 리턴값(타입)만 있는 경우
        // T get 메서드를 가지고 있다.
        Supplier<String> s = () -> {
            return "리턴되는 값";
        };
        String result = s.get();
        System.out.println(s.get());

        // Consumer<T>
        // 매개변수는 있지만 리턴 타입이 없다.
        // void accept(T t) 메서드 존재
        Consumer<String> c = (a) -> {
            System.out.println(a);
        };
        c.accept("consumer");

        // Function<T, R>
        // 하나의 매개변수를 받아서 하나의 값을 리턴한다.
        // Integer을 매개변수로 받아서 String으로 리턴
        // R apply(T t)메서드
        Function<Integer, String> f = (a) -> {
            return String.valueOf(a);
        };
        System.out.println(f.apply(123));

        // Predicate<T>
        // 조건식을 표현하는데 사용된다.
        // 하나의 매개변수를 받아서 boolean 타입을 리턴하는 함수형 인터페이스
        // boolean test(T t) 메서드
        Predicate<String> isEmptyStr = abc -> {return abc.length() == 0;};
        String str = "";

        if (isEmptyStr.test(str)) {
            System.out.println("공백입니다.");
        }
    }
}
