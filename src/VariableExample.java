import java.util.ArrayList;
import java.util.List;

public class VariableExample {
    public static void main(String[] args) {
        // int value;   변수 초기화 안해서 오류 발생
//        int value= 10;  // 변수 초기화
//        int result = value + 10;
//        System.out.println(result);
//
//        long longValue = 300;
//        int intValue = (int)longValue;  // 강제적 타입변환 큰거에서 작은거는 묵시적 타입변환이 가능하다.
//        System.out.println(intValue);
//
//        double pi = 3.14;
//        int intPi = (int) pi;
//        System.out.println(intPi);  // 소수점 뒤에 부분이 짤려버린다
//
//        int intValue = 10;
//        double doubleValue = 5.5;
//
////        double result = intValue + doubleValue;
//        int result = intValue + (int) doubleValue;
//
//        System.out.println(result);
//
//        // int -> Integer = 박싱
//        int index =1;
////        Integer number = Integer.valueOf(index);
//        Integer number = index;
//        // number를 btye로 변환하기
//        number.byteValue();
//        // number를 문자열로 변환하기
//        number.toString();
//        // 더하기 빼기 + 특별한 기능을 더 쓸 수 있다.
//        // 이 때, 여기 넣을 수 있는 타입은 무조건 래퍼런스 타입이어야 한다.
//        List<Character> a = new ArrayList<Character>();
//        // 그러면 Integer을 쓰면 되는거 아니냐
//        // 속도가 느리다, int에서 Integer로 바꿀때도 속도가 느리다
//
//        String str = "12345";
//        String str2 = "45678";
//
//        String str3 = "123";
//
//        int num = Integer.parseInt(str);
//        int num2 = Integer.parseInt(str2);
//
//        System.out.println(str + str2);
//        System.out.println(num + num2);
//        // 레퍼런스 타입을 써야만 하는 상황이 이런식으로 나올 수 있다.

        Integer num = 12345;
        Integer num2 = 45678;
        // 숫자를 문자형으로 바꿔준다.
        String str1 = num.toString();
        String str2 = num2.toString();

        System.out.println(num + num2);
        System.out.println(str1 + str2);

        // primitive type을 reference type으로 바꾸는거는 오토박싱
        // 반대가 언박싱 -> 근데 언박싱은 잘 쓰지 않는다.

    }
    // value = value + 10; 중괄호 밖이라 변수 사용이 안됨
}


//2.1 변수의 선언과 저장
//코드에서 value2가 실행되지 않는 이유는 ?
//-> value2는 조건문의 실행부분에만 선언되었기 때문에 실행이 조건문을 밖에서는 사용할 수 없습니다.
// quiz1 -> 4
// quiz2 -> 1, 4, 5, 6

// float와 int는 같은 용량을 가지는데 왜 float이 더 많이 쓸 수 있냐?
// -> float이 그만큼 더 느리다
// 그리고 대부분은 double을 많이 쓴다
// double이 float 보다 2배 이상 정밀하다

// 2.3 타입 변환
// String -> 문자열
// quiz 풀기

// 2.4 참조 자료형

// 2.5 오토박싱과 언박싱, 문자열과 숫자열 변환
// wrap -> 감싸다, 원시타입을 감싼다
// 기본형에서 wrapper 타입으로 변환하는 것을 boxing
// 반대로 변환되는 것을 unboxing 이라고 부른다.




