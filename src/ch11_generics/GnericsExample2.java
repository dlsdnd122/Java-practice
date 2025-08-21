package ch11_generics;

class Boxy<T> {
    T data;

    public T get() {
        return this.data;
    }

    public void set(T data) {
        this.data = data;
    }
}

public class GnericsExample2 {
    public static void main(String[] args) {
        Boxy<String> box1 = new Boxy<>();
        box1.set("Hello");
        System.out.println(box1.get());

        /////////////////////////////////
        Boxy<Integer> box2 = new Boxy<>();
        box2.set(1);
        System.out.println(box2.get());
    }
}
