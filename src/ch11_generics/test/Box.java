package ch11_generics.test;

class Box<T> {
    T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return this.data;
    }

    public static void main(String[] args) {
        Box<String> s = new Box<>();
        s.set("Hello");
        Box<Integer> i = new Box<>();
        i.set(123);

        System.out.println(s.get());
        System.out.println(i.get());
    }
}
