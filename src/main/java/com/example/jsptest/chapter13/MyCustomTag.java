package com.example.jsptest.chapter13;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
    int cnt = 0;
    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    /*
        EVAL_BODY_INCLUDE : After body를 포함한다.
        SKIP_BODY : body를 스킵한다.
        EVAL_BODY_AGAIN : body 반복(무한루프)
        EVAL_PAGE : doEndTag 메소드가 종료된 후 계속해서 jsp 페이지가 실행된다.
        SKIP_PAGE : doEndTag를 끝으로 뒤의 jsp 파일 내용을 무시한다.
    */
    @Override
    public int doStartTag() throws JspException{
        System.out.println("시작태그를 만났습니다.");
        System.out.println("color 속성 값 : " + color);
        return EVAL_BODY_INCLUDE;
    }
    @Override
    public int doAfterBody() throws JspException{
        System.out.println("body 처리가 끝났습니다.");
        return super.doAfterBody();
    }
    @Override
    public int doEndTag() throws JspException{
        System.out.println("끝태그를 만났습니다.");
        return super.doEndTag();
    }
}
