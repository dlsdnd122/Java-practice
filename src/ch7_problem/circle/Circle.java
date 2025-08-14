package ch7_problem.circle;

public class Circle extends Shape {
    final static double PI = 3.14;

    public Circle(int x) {
        super(x, 0);       // y는 0으로 고정시킨다.(매개변수가 2개인데 1개를 받아야만 하는 상황이라서)
        this.x = x;
    }

    @Override
    public double getArea() {
        double area = x * x * PI;
        return area;
    }
}
