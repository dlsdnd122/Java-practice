package ch13_stream;

import java.util.Arrays;
import java.util.List;

public class P7 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5);

        int sumOfList = nums.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(sumOfList);
    }
}
