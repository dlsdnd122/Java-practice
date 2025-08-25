package ch13_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class P9 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7, 10, 4, 9, 12);

        Optional<Integer> nums3 = nums.stream()
                .filter(n -> n % 3 == 0)
                .findFirst();

        System.out.println(nums3);

        // findFirst()는 스트림에서 첫 번째 요소를 반환하는데
        // 첫번째 요소가 없을 수도 있으므로 그냥 값을 반환하지 않고 Optional로 감사서 반환
        // Optional로 반환하기 때문에 값이 없을 때 바로 npe가 발생하지 않음
        // 대신 Optional 메서드를 써서 안전하게 접근
        // findFirst 메서드는 Optional<Integer>을 반환한다.
        // 따라서 Optional을 꺼내서 처리해야한다.


    }
}
