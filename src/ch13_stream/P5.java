package ch13_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambda", "stream");

        List<String> upper = words.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upper);

    }
}
