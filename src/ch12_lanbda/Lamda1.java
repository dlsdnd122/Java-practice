package ch12_lanbda;

interface Compare {
    public int max(int a, int b);
}

interface Xrint {
    public void print(String name, int i);
}

public class Lamda1 {
    public static void main(String[] args) {
        Compare c = (a, b) -> {
            return a > b ? a : b;
        };

        System.out.println(c.max(4, 5));

        Xrint x = (name, i) -> {
            System.out.println(name + " = " + i);
        };

        x.print("정인웅", 3);
    }



}
