package programmers.lv0;

// 두 수의 연산값 비교하기
public class Solution15 {
    public int solution(int a, int b) {
        int answer = 0;
        // a + b (문자열로 더한거), 2 * a * b 중 더 큰 값을 출력하는것

        // 문자열로 더한거
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);

        String num3 = num1 + num2;
        int result1 = Integer.parseInt(num3);

        int result2 = 2 * a * b;

        if (result1 > result2) {
            answer = result1;
        } else if (result2 > result1) {
            answer = result2;
        } else {
            answer = result1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.solution(3, 4));
    }
}
