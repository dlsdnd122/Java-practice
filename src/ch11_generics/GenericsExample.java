package ch11_generics;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}


class Box<T> {
    private T data;

    public T get() {
        return this.data;
    }
    public void set(T data) {
        this.data = data;
    }

}

public class GenericsExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("Hello");

        System.out.println(box1.get());

        //////////////////////////////////

        Box<Integer> box2 = new Box<>();
        box2.set(100000);
        System.out.println(box2.get());

        /////////////////////////////////

        Person p1 = new Person("정인웅", 26);
        Box<Person> box3 = new Box<>();
        box3.set(p1);
        System.out.println(box3.get());

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
