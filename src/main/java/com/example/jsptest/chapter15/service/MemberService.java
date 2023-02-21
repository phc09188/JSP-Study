package com.example.jsptest.chapter15.service;

import com.example.jsptest.chapter15.dao.MemberDAO;
import com.example.jsptest.chapter15.model.Member;

public class MemberService {
    MemberDAO dao = new MemberDAO();
    public void memberInsert(Member member){
        dao.insertMember(member);
    }
}
