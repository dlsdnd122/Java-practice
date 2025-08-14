package inherit;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2(3);
        child.method3();
    }
}

// 빨간줄 : 완전오류
// 노란줄 : 국룰 위반
// 초록줄 : 오타난듯?