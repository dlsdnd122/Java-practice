package programmers.lv0;

// 공 배수
public class Solution17 {

    public int solution(int number, int n, int m) {
        int answer = 0;
        // number가 n의 배수이면서 m의 배수이면 1 리턴 아니면 0 리턴
        if (number % n ==0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution17 s = new Solution17();
        System.out.println(s.solution(21, 3, 8));
    }

}
