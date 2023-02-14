package com.example.jsptest.chapter13;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
    @Override
    public int doStartTag() throws JspException{
        System.out.println("시작태그를 만났습니다.");
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
