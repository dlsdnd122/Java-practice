package inherit;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("자식 생성자 호출 이름 : " + name);
    }

    void sleep(int times) {
        System.out.println(this.name + " Zzz... " + times + " hours");
    }
}
