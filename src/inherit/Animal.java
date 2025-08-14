package inherit;

public abstract class Animal {
//    String name;
    public String kind;

    public void breath() {
        System.out.println("숨쉬기");
    }

    public abstract void sound();

//    public Animal(String name) {
//        this.name = name;
//        System.out.println("부모 생성자 호출 이름 : " + name);
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void sleep() {
//        System.out.println(this.name + " Zzz......");
//    }
}
