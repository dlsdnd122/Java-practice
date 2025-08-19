package ch9_exception_handling.Validator2;

import java.util.Arrays;

// 예외처리 실습
class RegisterException extends Exception {
    public RegisterException(String message) {
        super(message);
    }
}

class ValidateException extends RegisterException {
    public ValidateException(String message) {
        super(message);
    }
}

class NormalizeException extends RegisterException {
    public NormalizeException(String message) {
        super(message);
    }
}

interface Normalizer{
    void normalize(RegistrationForm form) throws NormalizeException;    // 예외 선언 추가
}

interface Rule {
    boolean validate(RegistrationForm form) throws ValidateException;  // 예외 선언 추가
}

class RegistrationForm {
    String username;
    String email;
    String password;
    String passwordConfirm;

    RegistrationForm(String username, String email, String password, String passwordConfirm) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
}

class TrimNormalizer implements Normalizer{
    @Override
    public void normalize(RegistrationForm form) throws NormalizeException {
        // 배열에 값 담아두기
        String[] arr = {form.username, form.email, form.password, form.passwordConfirm};

        // null일때 RuntimeException 예외 발생
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                // RuntimeException 발생
                if (arr[i] == form.username) {
                    throw new RuntimeException("RegistrationFrom 필드, username에 오류 발생, (null값이 입력되었습니다.)");
                } if (arr[i] == form.email) {
                    throw new RuntimeException("RegistrationFrom 필드, email에 오류 발생, (null값이 입력되었습니다.)");
                } if (arr[i] == form.password) {
                    throw new RuntimeException("RegistrationFrom 필드, password에 오류 발생, (null값이 입력되었습니다.)");
                } if (arr[i] == form.passwordConfirm) {
                    throw new RuntimeException("RegistrationFrom 필드, passwordConfirm에 오류 발생, (null값이 입력되었습니다.)");
                }
            }
        }
        // 공백일때 NormalizeException 예외 발생
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "") {
                if (arr[i] == form.username) {
                    throw new NormalizeException("RegistrationForm 필드, username에 오류 발생, (공백이 입력되었습니다.)");
                } if (arr[i] == form.email) {
                    throw new NormalizeException("RegistrationForm 필드, email에 오류 발생, (공백이 입력되었습니다.)");
                } if (arr[i] == form.password) {
                    throw new NormalizeException("RegistrationForm 필드, password에 오류 발생, (공백이 입력되었습니다.)");
                } if (arr[i] == form.passwordConfirm) {
                    throw new NormalizeException("RegistrationForm 필드, passwordConfirm에 오류 발생, (공백 입력되었습니다.)");
                }
            }
        }

        // 공백 제거
        form.username = form.username.trim();
        form.email = form.email.trim();
        form.password = form.password.trim();
        form.passwordConfirm = form.passwordConfirm.trim();

        System.out.println("Normalizer(trim) 적용 완료");

    }
}

class EmailNormalizer implements Normalizer{
    @Override
    public void normalize(RegistrationForm form) throws NormalizeException {
        // 이메일 소문자 변경
        form.email = form.email.toLowerCase();
        System.out.println("Normalizer(toLowerCase) 적용 완료");
    }
}

//////////////////////////////////////////////

class RequiredRule implements Rule{
    @Override
    public boolean validate(RegistrationForm form) throws ValidateException {

        String[] arr = {form.username, form.email, form.password, form.passwordConfirm};
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            // null, 빈문자열 확인
            if (arr[i] == null || arr[i].isEmpty()) {  // isEmpty()는 빈문자열일 경우 true
                // null 이나 빈문자열일 경우 false 리턴
                result = false;
            }
        }
        return result;
    }
}

class MinLengthRule implements Rule{
    @Override
    public boolean validate(RegistrationForm form) throws ValidateException {
        boolean result = true;
        // char 배열에 담기 (username, password)
        char[] arr1 = form.username.toCharArray();
        char[] arr2 = form.password.toCharArray();

        if (arr1.length <= 2 ) {    // 2글자 이하
            System.out.println("[ERROR] username: 최소 길이 3 이상이어야 합니다.");
            result = false;
        } if (arr2.length <= 3 ) {  // 3글자 이하
            System.out.println("[ERROR] password: 최소 길이 4 이상이어야 합니다.");
            result = false;
        }
        return result;
    }
}

class EmailFormatRule implements Rule {
    @Override
    // 이메일 형식 검증 (아이디 + @ + 도메인 + 최상위도메인)
    public boolean validate(RegistrationForm form) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        if (form.email != null && form.email.matches(regex)) {
            return true;
        } else {
            return false;
        }

        // ^[A-Za-z0-9+_.-]+ → 이메일 아이디 부분 (영문, 숫자, +, _, ., - 허용)
        //
        //@ → 필수 기호
        //
        //[A-Za-z0-9.-]+ → 도메인 이름 (영문, 숫자, ., - 허용)
        //
        //\\.[A-Za-z]{2,6}$ → 최상위 도메인 (예: .com, .org, .kr, .co.kr)

    }
}

class PasswordConfirmRule implements Rule{
    @Override
    // 비밀번호 확인 규칙
    public boolean validate(RegistrationForm form) throws ValidateException {
        boolean result = true;
        char[] arr1 = form.password.toCharArray();
        char[] arr2 = form.passwordConfirm.toCharArray();

        if (!Arrays.equals(arr1, arr2)) { // arr1와 arr2에 담겨있는 데이터 값이 같은지 판단
            System.out.println("[ERROR] 비밀번호와 확인 비밀번호가 일치하지 않습니다.");
            result = false;
            throw new ValidateException("RegistrationForm 필드에 입력된 password와 passwordConfirm 값 비교과정에서 오류 발생, (값이 일치하지 않습니다.)");
        }
        return result;
    }
}

class StrongPasswordRule implements Rule{
    @Override
    // 엄격 비밀번호 규칙
    public boolean validate(RegistrationForm form) {
        boolean result = true;
        // 비밀번호 char 배열에 담기
        char[] arr = form.password.toCharArray();
        // 8글자 미만일 경우 엄격 비밀번호 자격 X
            if (arr.length < 8) {
                System.out.println("[ERROR] 엄격 비밀번호의 조건을 충족하지 못했습니다.");
                result = false;
        }
        return result;
    }

}

class RegistrationService {
    private Normalizer[] normalizers;
    private Rule[] rules;

    public RegistrationService(Normalizer[] normalizers, Rule[] rules) {
        this.normalizers = normalizers;
        this.rules = rules;
    }

    // getter, setter 알아서
    // 이외 추가 메서드도 알아서

    public void register (RegistrationForm form) {
        // 규칙 교체: 엄격 비밀번호
        if (rules.length > 4) {
            System.out.println("-- 규칙 교체: 엄격 비밀번호 --");
        }

        // for 문으로
        System.out.println("== 데이터 정규화 ==");
        for (int i=0; i<normalizers.length; i++) {
            try {
                normalizers[i].normalize(form);
            } catch (Exception e) {
                System.out.println("정규화 중 예외 발생 : " + e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("<정규화" + (i + 1) + " 완료>");
            }
        }

        System.out.println("== 데이터 검증 ==");
        boolean allResult = true;
        // for 문으로
        for (int i=0; i<rules.length; i++) {
            try {
                boolean result = rules[i].validate(form);
                if (!result) {
                    allResult = false;
                }
            } catch (Exception e) {
                allResult = false;
                System.out.println("검증 중 예외 발생 : " + e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("<검증" + (i + 1) + " 완료>");
            }
        }

        // 조건문으로 성공인지 실패인지 뽑기
        if (allResult) {
            System.out.println("[등록 성공: " + form.username + " / " + form.email + "]");
        } else {
            System.out.println("[예외로 인한 등록 실패]");
        }

        System.out.println("============================================================================================================");
    }
}

public class Main {
    public static void main(String[] args) {
        Normalizer[] normalizers = {new TrimNormalizer(), new EmailNormalizer()};
        Rule[] basicRules = {new RequiredRule(), new MinLengthRule(), new EmailFormatRule(), new PasswordConfirmRule()};
        Rule[] hardRules = {new RequiredRule(), new MinLengthRule(), new EmailFormatRule(), new PasswordConfirmRule(), new StrongPasswordRule()};

        RegistrationService service = new RegistrationService(normalizers, basicRules);

        System.out.println("--- <1차 시도> ---");
        RegistrationForm form1 = new RegistrationForm("dlsdnd122", "dlsdnd122@naver.com", "dlsdnd122", "dlsdnd122");
        service.register(form1);
        System.out.println("--- <2차 시도> ---");
        RegistrationForm form2 = new RegistrationForm(" ", "Asdfasdf", "hist57", "hist");
        service.register(form2);

        service = new RegistrationService(normalizers, hardRules);
        System.out.println("--- <3차 시도> ---");
        RegistrationForm form3 = new RegistrationForm(  null , "dlsdnd122@naver.com", "awds12341234", "awds12341234");
        service.register(form3);


    }
}


// 예외 트랜잭션 처리 방법으로 뽑아볼수 있을것같다.
// NormalizeException, ValidateException을 catch 할때, RegisterException으로 catch하는 코드가 존재해야한다.
