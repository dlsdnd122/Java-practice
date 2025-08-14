package ch7_problem.animal;

public class Dog extends Animal {

    // 생성한 객체 이름 부모클래스 name으로 저장
    public Dog(String name) {
        super(name);
    }
    // makeSound 오버라이드
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}
