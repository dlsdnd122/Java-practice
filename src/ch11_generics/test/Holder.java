package ch11_generics.test;

public class Holder<T> {
    T value;

    public T getOrDefault(T value) {
        // 만약 this.value가 null 이라면
        if (this.value == null) {
            // empty를 리턴해준다.
            return value;
        } else {
            // null이 아니면 들어있는 값을 리턴해준다.
            return this.value;
        }
    }

    public T set(T value) {
        this.value = value;
        return this.value;
    }


    public static void main(String[] args) {
        Holder<String> h = new Holder<>();
        System.out.println(h.getOrDefault("empty"));
        h.set("Hello");
        System.out.println(h.getOrDefault("empty"));
    }
}
