package programmers.lv0;

// 문자 리스트를 문자열로 변환하기
public class Solution12 {
    public String solution(String[] arr) {
        String answer = "";

        // 이거는 char[]일때만 합쳐져서 나온다. 그래서 쓰면안됨 (배열의 타입 + 메모리 주소가 출력이됨)
//        answer  = String.valueOf(arr);

        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();

        String result = s.solution(new String[]{"a","b","c"});

        System.out.println(result);
    }
}
