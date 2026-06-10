package programmers.lv0;

// n의 배수
public class Solution16 {
    public int solution(int num, int n) {
        int answer = 0;
        // num이 n의 배수이면 1을 리턴, 아니면 0을 리턴

        if (num % n == 0){
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution16 s = new Solution16();
        System.out.println(s.solution(22, 3));
    }
}
