package ch7_problem.circle;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(4, 5); // 4, 5는 가로 세로 길이
        Shape circle = new Circle(3);

        System.out.println("사각형 면적 : " + (int)rect.getArea());
        System.out.println("원 면적 : " + circle.getArea());


    }
}
