package inherit;

public class Dog extends Animal {

//    public Dog(String name) {
//        super(name);
//        System.out.println(name);
//        System.out.println(name);
//        System.out.println("자식 생성자 호출 이름 : " + name);
//    }

    public Dog() {
        this.kind = "Dog";
    }

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }

//    void sleep(int times) {
//        System.out.println(this.name + " Zzz... " + times + " hours");
//    }
}
