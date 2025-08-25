package ch13_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P11 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 1, 9, 3, 12, 7);

        List<Integer> maxNums = nums.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(maxNums);
    }
}
