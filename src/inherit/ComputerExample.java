package inherit;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calc = new Calculator();
        System.out.println("원면적 : " + calc.areaCircle(r));
        System.out.println();

        Computer com = new Computer();
        System.out.println("원면적 : " + com.areaCircle(r));
        System.out.println("계산기 객체에서 받아온 원면적 : " + com.parentAreaCircle(r));
    }
}

