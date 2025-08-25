package ch13_stream;

import java.util.List;
import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park");

        names.forEach(name -> System.out.println("Hello, " + name));
    }
}
