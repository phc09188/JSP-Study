package com.example.jsptest.chapter15.dao;

import com.example.jsptest.chapter15.model.Member;

import java.sql.*;
public class MemberDAO {
    //DB 연결 메소드
    public Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    //DB 인서트 메소드
    public void insertMember(Member member){
        try{
            Connection con = this.getConnection();
            PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?,?)");
            pstmt.setString(1, member.getId());
            pstmt.setString(2,member.getPassword());
            pstmt.setString(3,member.getName());
            pstmt.setString(4, member.getMail());
            pstmt.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
