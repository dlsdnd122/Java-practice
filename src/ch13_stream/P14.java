package ch13_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    List<Integer> scores;

    Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    String getName() {
        return name;
    }

    double getAvg() {
        // score 를 기반으로 평균 가져오는 코드
        int scoreAvg = scores.stream()
                .mapToInt(n -> n)
                .sum()/scores.size();
        return scoreAvg;

    }
}

public class P14 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Kim", Arrays.asList(80, 70, 90)),
                new Student("Lee", Arrays.asList(60, 65, 70)),
                new Student("Park", Arrays.asList(75, 75, 70)),
                new Student("Choi", Arrays.asList(90, 88, 92)),
                new Student("Jung", Arrays.asList(70, 70, 70))
        );

        List<String> students2 = students.stream()
                .filter(n -> n.getAvg() >= 75)
                .sorted(Comparator.comparing(Student::getAvg).reversed()
                        .thenComparing(Student::getName))
                .map(n -> n.getName())
                .collect(Collectors.toList());

        System.out.println(students2);
    }
}
