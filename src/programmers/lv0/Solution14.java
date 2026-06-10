package programmers.lv0;

// 더 크게 합치기
public class Solution14 {
    public int solution(int a, int b) {
        int answer = 0;

        // 2개의 수를 가지고올때, ex) a= 2, b= 23
        // a + b = 223, b + a = 232 232가 크니까 232 출력하도록하는 로직

        String num1 = Integer.toString(a); // 문자열로 변환
        String num2 = Integer.toString(b);

        String result1 = num1 + num2;   // 더하기
        String result2 = num2 + num1;

        int answer1 = Integer.parseInt(result1); // int형으로 변환
        int answer2 = Integer.parseInt(result2);

        // 결과 비교
        if (answer1 > answer2) {
            answer = answer1;
        } else if (answer2 > answer1) {
            answer = answer2;
        } else if (answer1 == answer2) {
            answer = answer1; // 두 수가 같은 경우에는 걍 1번을 해준다
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.solution(3, 3));
    }
}
