package ch9_exception_handling;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try 블록 실행");
            int result = divide(10, 0);
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            // 아래 주석 코드중 하나를 선택해서 실행해보시고.
            // 해당 코드가 없는 경우와 출력이 어떻게 달라지는지 확인해보세요.
            // return;
            // throw e;
        } finally {
            System.out.println("finally 실행");
        }
        System.out.println("try-catch 블록 이후의 코드 실행");
    }

    private static int divide(int i, int i1) {
        return i / i1;
    }
}
