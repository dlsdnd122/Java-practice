package ch13_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P8 {
    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                // 1행
                Arrays.asList(1, 2, 3),
                // 2행
                Arrays.asList(2, 3, 4),
                // 3행
                Arrays.asList(3, 4, 5)
        );

        List<Integer> list = matrix.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(list);


    }
}
