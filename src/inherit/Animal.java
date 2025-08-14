package inherit;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("부모 생성자 호출 이름 : " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(this.name + " Zzz......");
    }
}
