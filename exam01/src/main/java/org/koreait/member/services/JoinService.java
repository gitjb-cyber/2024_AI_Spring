package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validator.AdvancedJoinValidator;
import org.koreait.member.validator.JoinValidator;

/*
* 회원 가입기능
* */
public class JoinService {
    // 구성
    private Validator<RequestJoin> validator;

    /**
     * 의존관계
     * @param validator
     * - JoinService 객체 생성을 위해서는 joinValidator 가 필수
     */
    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }


    /**
    * 연관관계
    * JoinService 객체를 생성할 때 필수는 아님, 연관성이 있다.
    * @param validator
    *
    */
/*
    public void setValidator(Validator<RequestJoin> validator) {
        this.validator = validator;
    }
*/

    /*
     * 가입 처리
     *
     * RequestJoin - DTO(Data Transfer Object) : 사용자가 입력한 값을 전달
     * */
    public void process(RequestJoin form) {
        validator.check(form);
    }
}
