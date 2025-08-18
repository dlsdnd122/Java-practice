package ch8_interface.Validator;

import java.util.Arrays;

interface Normalizer{
    void normalize(RegistrationForm form);
}

interface Rule {
    boolean validate(RegistrationForm form);
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
    public void normalize(RegistrationForm form) {
        // 공백 제거
        form.username = form.username.trim();
        form.email = form.email.trim();
        form.password = form.password.trim();
        form.passwordConfirm = form.passwordConfirm.trim();
        System.out.println("Normalizer(trim) 적용 완료");
    }
}

class EmailNormalizer implements Normalizer{
    public void normalize(RegistrationForm form) {
        // 이메일 소문자 변경
        form.email = form.email.toLowerCase();
        System.out.println("Normalizer(toLowerCase) 적용 완료");
    }
}

//////////////////////////////////////////////

class RequiredRule implements Rule{
    public boolean validate(RegistrationForm form) {
        String[] arr = {form.username, form.email, form.password, form.passwordConfirm};
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            // null, 빈문자열 확인
            if (arr[i] == null || arr[i].isEmpty()) {  // isEmpty()는 빈문자열일 경우 true
                // null 이나 빈문자열일 경우 false 리턴
                System.out.println("[ERROR] 입력값이 없습니다.");
                result = false;
                break;
            }
        }
        return result;
    }

}

class MinLengthRule implements Rule{
    public boolean validate(RegistrationForm form) {
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

class EmailFormatRule implements Rule{
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

class PasswordConfirmRule implements Rule{
    // 비밀번호 확인 규칙
    public boolean validate(RegistrationForm form) {
        boolean result = true;
        char[] arr1 = form.password.toCharArray();
        char[] arr2 = form.passwordConfirm.toCharArray();

        if (!Arrays.equals(arr1, arr2)) { // arr1와 arr2에 담겨있는 데이터 값이 같은지 판단
            System.out.println("[ERROR] 비밀번호와 확인 비밀번호가 일치하지 않습니다.");
            result = false;
        }
        return result;
    }
}

class StrongPasswordRule implements Rule{
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
}

    public getusername() {

    }
    // getter, setter 알아서
    // 이외 추가 메서드도 알아서

    public void register (RegistrationForm form) {
        // for 문으로
        System.out.println("== 데이터 정규화 ==");
        // trim
        Normalizer trimNomalizer = new TrimNormalizer();
        trimNomalizer.normalize(form);
        // toLowerCase
        Normalizer emailNormalizer = new EmailNormalizer();
        emailNormalizer.normalize(form);

        boolean result = true;

        System.out.println("== 데이터 검증 ==");
        // requiredRule
        Rule requiredRule = new RequiredRule();
        requiredRule.validate(form);
        Rule minLengthRule = new MinLengthRule();
        minLengthRule.validate(form);
        Rule emailFormatRule = new EmailFormatRule();
        emailFormatRule.validate(form);
        Rule passwordConfirmRule = new PasswordConfirmRule();
        passwordConfirmRule.validate(form);
        Rule strongPasswordRule = new StrongPasswordRule();
        strongPasswordRule.validate(form);

        if (!requiredRule.validate(form)) {
            result = false;
        } if (!minLengthRule.validate(form)) {
            result = false;
        } if (!emailFormatRule.validate(form)) {
            result = false;
        } if (!passwordConfirmRule.validate(form)) {
            result = false;
        } if (!strongPasswordRule.validate(form)) { // HardRule 메서드 만들어서 다시 하기
            result = false;
        }

        Result(result);
    }

    public void Result(boolean result) {
        System.out.println("=== 검증 단계 ===");
        if (result == true) {
            System.out.println("등록 성공: " + form.username + " / " + form.email);
        } else {
            System.out.println("등록 실패: 입력값을 확인하세요.");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Normalizer[] normalizers = {new TrimNormalizer(), new EmailNormalizer()};
        Rule[] basicRules = {new RequiredRule(), new MinLengthRule(), new EmailFormatRule(), new PasswordConfirmRule()};
        Rule[] hardRules = {};

        RegistrationService service = new RegistrationService(normalizers, basicRules);

        RegistrationForm form1 = new RegistrationForm();
        service.register(form1);

        RegistrationForm form2 = new RegistrationForm();
        service.register(form2);

        service = new RegistrationService(normalizers, hardRules);

        RegistrationForm form3 = new RegistrationForm();
        service.register(form3);


    }
}
