package ch7_problem.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.move();
        bicycle.move();
    }
}
