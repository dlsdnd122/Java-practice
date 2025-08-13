public class Person {
    // 어지간 하면은 여기다가 선언을 해주는게 젤 좋다.
    final String nation = "Korea";
    String name;
    static String age;  // 클래스에 속하게 하는 필드
//    default String man;

    public Person(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        // final 변수이기 때문에 바뀌지 않는다.
        Person man1 = new Person("계백");
        System.out.println(man1.name);
        System.out.println(man1.nation);

//        man1.nation = "을지문덕";
    }
}
