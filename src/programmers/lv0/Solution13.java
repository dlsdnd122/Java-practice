package programmers.lv0;

// 문자열 곱하기
public class Solution13 {
    public String solution(String my_string, int k) {
        String answer = "";

        // 문자열과 수를 주면 문자열을 해당 수 곱한걸로 출력
        for(int i = 0; i < k; i++) {
            answer = answer + my_string;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution13 s = new Solution13();

        String answer = s.solution("luv", 3);
        System.out.println(answer);
    }
}
