package boj.boj_15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 버퍼 씌우기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 버퍼 씌우기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 한줄 전체를 문자열로 읽음
        // 버퍼는 String으로 읽어야함
        String line = br.readLine();
        // 문자열을 정수로 변환
        int num = Integer.parseInt(line);

        for (int i = 0; i < num; i++) {
            String n1 = br.readLine();
            // 공백 기준으로 문자열 나누기(배열로 만들어서)
            String[] parts = n1.split(" ");
            // 파싱
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);

            int result = num1 + num2;
            // 버퍼에 문자열 쓰기 (int 형은 안들어가니 다시 String으로)
            bw.write(String.valueOf(result));
            // 줄바꿈 추가하기
            bw.newLine();
        }

        // 버퍼에 모아둔 데이터를 한 번에 출력
        bw.flush();
        // 입출력 스트림 닫기
        bw.close();
        br.close();


    }
}
