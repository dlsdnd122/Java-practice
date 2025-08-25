package ch13_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "java", "go", "lambda", "js");

        List<String> wordsExample = words.stream()
                .filter(n -> n.length() >= 3)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(wordsExample);


    }
}
