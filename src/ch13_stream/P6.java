package ch13_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "world");

        List<Integer> length = words.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());

        System.out.println(length);

    }
}
