package ch13_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1, 2, 3, 4, 2);


        List<Integer> distinctList = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctList);
    }
}
