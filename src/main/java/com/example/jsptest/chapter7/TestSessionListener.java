package com.example.jsptest.chapter7;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class TestSessionListener implements HttpSessionListener {

    public TestSessionListener() {
        System.out.println("TestSessionListener 객체 생성");
    }
    public void sessionCreated(HttpSessionEvent e){
        System.out.println("세션 객체 생성");
    }
    public void sessionDestroyed(HttpSessionEvent e){
        System.out.println("세션 객체 해제");
    }
}
