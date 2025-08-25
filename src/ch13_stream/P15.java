package ch13_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }
}

public class P15 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Effictive Java", "Bloch", 2018),
                new Book("Clean Code", "Martin", 2008),
                new Book("Lamda in Action", "Unknown", 2014),
                new Book("Modern Java in Action", "Urma", 2019),
                new Book("Java Puzzlers", "Bloch", 2005),
                new Book("Streams Deep Dive", "Kim", 2021)
        );

        List<String> recentBooks = books.stream()
                .filter(n -> n.year > 2010 && !n.getAuthor().equals("Unknown"))
                .sorted(Comparator.comparing(Book::getYear).reversed()
                        .thenComparing(Book::getTitle))
                .map(Book::getTitle)
                .collect(Collectors.toList());

        System.out.println(recentBooks);

        // map전 : Stream<Book> -> collect -> List<Book>
        // map후 : Stream<String> -> collect -> List<String>
        // 그래서 map 을 쓰면 리스트 타입도 변환한 타입에 맞춰야 오류가 없음
        // 즉, map을 사용하면서 Stream 요소 타입이 바뀌었기 때문에,
        // 리스트 타입도 그에 맞게 Book -> String으로 바꿔야 컴파일 오류가 사라진다.
    }
}
