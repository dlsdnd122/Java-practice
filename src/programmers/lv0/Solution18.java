package programmers.lv0;

//홀짝에 따라 다른 값 반환하기
public class Solution18 {
    public int solution(int n) {
        int answer = 0;

        // n이 짝수인지 홀수인지 파악 후
        // 홀수라면 n이하의 홀수를 다 더한 값을 return
        // 짝수라면 n이하의 짝수를 제곱 후 더한 값을 return

        // 짝수일 때
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                if ((n - i) % 2 == 0) {
                    answer = answer + (n - i) * (n - i);
                }
            }
        } else {
            for (int i = 0; i <= n; i++) {
                if ((n - i) % 2 != 0) {
                    answer = answer + (n - i);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution18 s = new Solution18();
        System.out.println(s.solution(10));
    }
}
