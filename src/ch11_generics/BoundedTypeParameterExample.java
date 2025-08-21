package ch11_generics;

public class BoundedTypeParameterExample {
    public static <T extends Number> int compare(T a, T b) {
        double v1 = a.doubleValue();
        double v2 = b.doubleValue();
        return Double.compare(v1, v2);
    }


    public static void main(String[] args) {
        System.out.println(BoundedTypeParameterExample.compare(2, 2));

    }
}
