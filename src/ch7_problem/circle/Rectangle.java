package ch7_problem.circle;

public class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;

    }
    @Override
    public double getArea() {
        int area = x * y;
        return area;
    }
}
