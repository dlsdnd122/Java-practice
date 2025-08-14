package inherit;

public class AnimalExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.breath();
        dog.sound();
        cat.breath();
        cat.sound();
    }
}
