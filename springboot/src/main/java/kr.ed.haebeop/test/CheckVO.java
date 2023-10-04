package kr.ed.haebeop.test;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class CheckVO {
    @NotNull
    @Null(message = "아이디는 필수 항목임")
    @Size(min = 5, max = 12, message = "아이디는 5~12자로 작성 필요합니다.")
    @Pattern(regexp="^[a-z0-9]+$", message = "영문 소문자와 숫자 입력이 필요")
    String id;

    @NotNull
    @Null(message = "비밀번호는 필수 항목임")
    @Size(min = 8, max = 12, message = "비밀번호는 8~12자로 작성 필요합니다.")
    @Pattern(regexp="^[a-zA-Z0-9]+$", message = "영문 대소문자와 숫자 입력이 필요")
    String pw;
}
