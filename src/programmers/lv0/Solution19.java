package programmers.lv0;
// 조건 문자열
public class Solution19 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        // ineq에는 < , > 기호가 올 수 있고
        // eq dpsms =, ! 기호가 올 수 있다
        // ineq, eq 안에 들어가있는 문자를 파악한다

        if (ineq == ">" && eq == "=") {
            if (n >= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if (ineq == "<" && eq == "=") {
            if (n <= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if (ineq == ">" && eq == "!") {
            if (n > m) {
                answer = 1;
            } else  {
                answer = 0;
            }
        } else if (ineq == "<" && eq == "!") {
            if (n < m) {
                answer = 1;
            } else   {
                answer = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution19 s = new Solution19();
        System.out.println(s.solution("<", "=", 20, 50));
    }
}
