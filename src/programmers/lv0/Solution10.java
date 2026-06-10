package programmers.lv0;

public class Solution10 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        char[] arr1 = my_string.toCharArray();
        char[] arr2 = overwrite_string.toCharArray();

        for (int i = 0; i < arr2.length; i++) {
            if (arr1[s+i] != arr2[i]) {
                arr1[s+i] = arr2[i];
            }

        }

        answer = new String(arr1);

        return answer;

    }

    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        System.out.println(new Solution10().solution(my_string, overwrite_string, s));
    }
}
