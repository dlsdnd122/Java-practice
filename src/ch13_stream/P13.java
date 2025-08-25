package ch13_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getStock() {
        return stock;
    }
}

public class P13 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Mouse", 25.0, 10),
                new Product("Keyboard", 55.0, 5),
                new Product("USB", 10.0, 0),
                new Product("Cable", 10.0, 20),
                new Product("Pad", 15.0, 3)
        );

        List<String> sortedProducts = products.stream()
                // 복합정렬 : price 기준 오름차순 후 중복 시 name 오름차순 정렬
                .sorted(Comparator.comparing(Product::getPrice)
                                  .thenComparing((Product::getName)))
                // 재고 1이상, 가격 10이상 50 이하
                .filter(n -> n.getStock() > 0 && n.getPrice() >= 10 && n.getPrice() <= 50)
                .map(n -> n.getName() +"(" + n.getPrice() + ")")
                .collect(Collectors.toList());

        System.out.println(sortedProducts);
    }
}
