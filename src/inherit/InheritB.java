package inherit;

public class InheritB extends InheritA {    // 상속을 의미하는 extends
    String field2;

    void method2() {
        System.out.println(field2);
        System.out.println(field1);
        System.out.println(field2);
        field1  = 1101010100;
        method1();
    }
}
