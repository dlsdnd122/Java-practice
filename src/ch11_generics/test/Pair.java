package ch11_generics.test;

public class Pair<T, U> {
    T fistData;
    U secondData;

    Pair(T fistData, U secondData) {
        this.fistData = fistData;
        this.secondData = secondData;
    }

    public T getFirst() {
        return fistData;
    }

    public U getSecond() {
        return secondData;
    }

    public void setSecond(U secondData) {
        this.secondData = secondData;
    }


    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("age", 30);
        System.out.println(p.getFirst() + ": " + p.getSecond());
        p.setSecond(31);
        System.out.println(p.getFirst() + ": " + p.getSecond());

        Pair<Double, Float> p2 = new Pair<>(5.0, 5.0f);
        System.out.println(p2.getFirst() + ": " + p2.getSecond());
    }
}
