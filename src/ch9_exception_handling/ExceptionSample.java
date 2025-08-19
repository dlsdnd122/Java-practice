package ch9_exception_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) {
        int a = 10;
        try{
            // 오류코드
            BufferedReader br = new BufferedReader(new FileReader("뺼럐럐럐럐럐럘럐럘"));
            System.out.println(br.readLine());
            br.close();
            // a 값이 10더해지지가 않음 (위에서 오류를 발견했기 때문)
            a = a + 10;
            System.out.println("위에서 오류 발생. a값은 안더해짐 : " + a);
        } catch (IOException e){
            a = a + 20;
            System.out.println("a의 값 : " + a);
            // 오류 메시지
            System.out.println("error message: " + e.getMessage());
            // 오류 원인
            System.out.println(e.getCause());
            System.out.println("오류 발생!");
        } finally {
            a = a + 30;
            System.out.println("a의 값 : " + a);
            System.out.println("이건 실행이 되어야만 해!");
        }

//        System.out.println("정상 실행 완료!");
    }
}
