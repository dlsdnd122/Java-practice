package ch11_generics;

class Util {

    // 말 그대로 Number인 애들만 가능
    // String은 들어올 수 없게된다
    // 말 그대로 일부만 올 수 있게 제한하는것이 extends 이다.
    // public static <T extends Number> Box<T> data(T data)


    public static <T> Box<T> data(T data) {
        Box<T> box = new Box<>();
        box.set(data);
        return box;
    }
}

public class GenericsMethodExample {
    public static void main(String[] args) {
        Box<String> box1 = Util.data("정인웅");
        System.out.println(box1.get());
    }
}
