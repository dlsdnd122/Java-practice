package programmers.lv0;

// 문자열 섞기
public class Solution11 {
    public String solution(String str1, String str2) {
        String answer = "";
        // 문자열 2개를 입력받고 해당 문자열을 번갈아가면서 출력
        // 받은 문자열 2개를 char배열로 넣기
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        // 결과 값 넣어놓을 배열 선언하기
        char[] result = new char[arr1.length + arr2.length];

        // 번갈아 가면서 찍기 (str1, str2 문자열의 길이는 같다고한다)
        for (int i = 0; i < arr1.length; i++) {
            result[i*2] = arr1[i];
            result[i*2+1] = arr2[i];
        }

        answer = String.valueOf(result);

        return answer;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();

        String result = s.solution("aaaaa", "bbbbb");

        System.out.println(result);
    }
}
