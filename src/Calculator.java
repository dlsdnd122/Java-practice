public class Calculator {
    int a;

    void postfixOperator() {
        this.a++;

    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        cal1.a = 1;
        cal2.a = 15;

        cal1.postfixOperator();
        cal2.postfixOperator();

        System.out.println(cal1.a);
        System.out.println(cal2.a);

        // 위에서 a변수는 메서드 안에서만 쓰이는 변수이지, 메서드 밖의 변수 이름이 같더라도 서로 전혀 영향을 주지 않는다.
        // 그렇기에 int로 타입을 바꿔주고 반환해준 다음, a변수에다가 그 반환값을 저장시켜주고 a를 출력해야 한다.
    }
}
