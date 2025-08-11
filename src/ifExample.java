import java.util.Scanner;

public class ifExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("등급은 A입니다.");
        } else if (score >= 80) {
            System.out.println("등급은 B입니다.");
        } else if (score >= 70) {
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("등급은 D입니다.");
        }
    }
}
