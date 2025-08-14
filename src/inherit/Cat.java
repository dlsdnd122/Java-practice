package inherit;

public class Cat extends Animal {
    public Cat() {
        this.kind = "Cat";
    }
    @Override
    public void sound() {
        System.out.println("cat sound");
    }
}
