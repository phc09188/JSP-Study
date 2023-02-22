package com.example.jsptest.chapter16.service;

import com.example.jsptest.chapter16.dao.MemberDAO;
import com.example.jsptest.chapter16.model.MemberVO;

import java.util.List;

public class MemberService {
    private static MemberService service = new MemberService();
    public MemberDAO dao = MemberDAO.getInstance();
    private MemberService(){}
    public static MemberService getInstance(){
        return service;
    }
    public void memberInsert(MemberVO member){
        dao.memberInsert(member);
    }
    public MemberVO memberSearch(String id){
        MemberVO member = dao.memberSearch(id);
        return member;
    }
    public void memberUpdate(MemberVO member){
        dao.memberUpdate(member);
    }

    public void memberDelete(String id) {
        dao.memberDelete(id);
    }

    public List<MemberVO> memberList() {
        return dao.memberList();
    }
}
