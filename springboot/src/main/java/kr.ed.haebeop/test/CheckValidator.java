package kr.ed.haebeop.test;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

public class CheckValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {   //클래스에 모든 내용이 맞는가를 확인
        return Check.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors error) {        //target은 모두 받을 수 있다(Stirng이든 뭐든)
        System.out.println("springframework Validator");
        Check check = (Check) obj;
        ValidationUtils.rejectIfEmpty(error, "id", "check.id.empty", "아이디를 입력해주세요.");  //값이 비어있으면 error //message는 생략가능
        ValidationUtils.rejectIfEmpty(error, "pw", "check.pw.empty", "비밀번호를 입력해주세요.");

        //id pattern
        Pattern pat1 = Pattern.compile("^[a-z0-9]{5,12}$", Pattern.CASE_INSENSITIVE);        //compile 패턴을 만들어주는 method
        //pw pattern
        Pattern pat2 = Pattern.compile("^[a-zA-Z0-9]{8,12}$", Pattern.CASE_INSENSITIVE);

        if(!pat1.matcher(check.getId()).matches()) {          //matcher 비교식
            error.rejectValue("id", "check.id.invalid");
        }
        if(!pat2.matcher(check.getPw()).matches()) {          //matcher 비교식
            error.rejectValue("pw", "check.pw.invalid");
        }
    }


}
