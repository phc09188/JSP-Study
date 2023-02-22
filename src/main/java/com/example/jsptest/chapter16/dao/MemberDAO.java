package com.example.jsptest.chapter16.dao;

import com.example.jsptest.chapter16.model.MemberVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private static MemberDAO dao = new MemberDAO();
    private MemberDAO(){}
    public static MemberDAO getInstance(){
        return dao;
    }
    public Connection connect(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    public void close(Connection con, PreparedStatement ps, ResultSet rs){
        if(rs!= null){
            try{
                rs.close();
            } catch (Exception e){
                System.out.println("오류발생 : " +e );
            }
        }
        close(con,ps);
    }
    public void close(Connection con, PreparedStatement ps){
        if(ps != null){
            try{
                ps.close();
            } catch (Exception e){
                System.out.println("오류 발생 : " + e);
            }
        }
        if(con != null){
            try{
                con.close();
            } catch (Exception e){
                System.out.println("오류 발생 : " + e);
            }
        }
    }
    public void memberInsert(MemberVO member){
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = connect();
            ps = con.prepareStatement("insert into member values(?,?,?,?)");
            ps.setString(1, member.getId());
            ps.setString(2, member.getPasswd());
            ps.setString(3, member.getName());
            ps.setString(4, member.getMail());
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println("오류 발생 : " + e);
        } finally {
            close(con, ps);
        }
    }
    public MemberVO memberSearch(String id){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        MemberVO member = null;
        try{
            con = connect();
            ps = con.prepareStatement("select * from member where id=?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                member = new MemberVO();
                member.setId(rs.getString(1));
                member.setPasswd(rs.getString(2));
                member.setName(rs.getString(3));
                member.setMail(rs.getString(4));
            }
        } catch(Exception e){
            System.out.println("오류 발생 : " + e);
        } finally {
          close(con,ps,rs);
        }
        return member;
    }

    public void memberUpdate(MemberVO member) {
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = connect();
            ps = con.prepareStatement("update member set passwd=?,name=?,mail=? where id=?");
            ps.setString(1,member.getPasswd());
            ps.setString(2,member.getName());
            ps.setString(3, member.getMail());
            ps.setString(4, member.getId());
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println("오류 발생 : " + e);
        } finally{
            close(con,ps);
        }
    }

    public void memberDelete(String id) {
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = connect();
            ps = con.prepareStatement("delete from member where id=?");
            ps.setString(1,id);
            ps.executeUpdate();
        } catch(Exception e){
            System.out.println("오류 발생 : " + e);
        } finally {
            close(con,ps);
        }
    }

    public List<MemberVO> memberList() {
        List<MemberVO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        MemberVO member = null;
        try{
            con = connect();
            ps = con.prepareStatement("select * from member");
            rs = ps.executeQuery();
            while(rs.next()){
                member = new MemberVO();
                member.setId(rs.getString(1));
                member.setPasswd(rs.getString(2));
                member.setName(rs.getString(3));
                member.setMail(rs.getString(4));
                list.add(member);
            }
        } catch(Exception e){
            System.out.println("오류 발생 : " + e);
        } finally{
            close(con,ps,rs);
        }
        return list;
    }
}
