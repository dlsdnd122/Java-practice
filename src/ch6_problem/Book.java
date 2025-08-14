package ch6_problem;

public class Book {

    private String name;
    private String author;
    private int price;

    // 생성자 생성
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int setPrice(int price) {
        if (price <= 0) {
            price = 0;
            return price;
        } else {
            return price;
        }
    }

    void printInfo() {
        System.out.println("제목 : " + this.name + ", 저자 : " + this.author + ", 가격 : " + setPrice(this.price) + "원");
    }

    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성", 35000);
        Book book2 = new Book("Clean Code", "로버트 마틴", -10000);

        book1.printInfo();
        book2.printInfo();

    }
}
