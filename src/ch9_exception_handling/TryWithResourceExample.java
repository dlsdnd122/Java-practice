package ch9_exception_handling;

class FileInputStream implements AutoCloseable {
    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + " 을 읽습니다.");
    }

    public void close() {
        System.out.println(file + " 을 닫습니다.");
    }
}

public class TryWithResourceExample {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            System.out.println("file 읽는 중입니다.");
            throw new Exception();  // 강제적으로 예외 발생시킴}
            // 예외 뒤에는 코드가 읽히지 않음
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
