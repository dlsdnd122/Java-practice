package ch11_generics;

class Book<T> {
    T data;

    public T getBook() {
        return this.data;
    }

    public void setBook(T data) {
        this.data = data;
    }
}


public class GenericsExample3 {
    public static void main(String[] args) {
        Book<String> book1 = new Book<>();
        book1.setBook("나의 오렌지 나무");
        System.out.println(book1.getBook());

        ///////////////////////////////////////

        Book<Integer> book2 = new Book<>();
        book2.setBook(123);
        System.out.println(book2.getBook());
    }
}
