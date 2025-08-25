package ch13_stream;

import java.util.Optional;

public class P3 {
    public static void main(String[] args) {
        String maybeNull = "Java";    // "java"로 바꿔서 테스트해도 됨

        // maybeNull이 null이면 Optional.empty()가 되고,
        // null이 아니면 값을 감싸서 Optional 생성
        Optional<String> opt = Optional.ofNullable(maybeNull);
        // Optional에 값이 없으면 EMPTY 반환
        String result = opt.orElse("EMPTY");
        System.out.println(result);
    }
}
