package com.example.jsptest.chapter13;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;

public class MyCustomTagTEI extends TagExtraInfo {
    public boolean isValid(TagData data){
        String color = data.getAttributeString("color");
        return color.equals("blue");
    }
}
