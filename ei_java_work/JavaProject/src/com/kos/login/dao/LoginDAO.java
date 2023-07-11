package com.kos.login.dao;

import java.util.ArrayList;

import com.kos.mem.vo.MemberVO;

public interface LoginDAO {
   public ArrayList<MemberVO> loginCheck(MemberVO mvo);
   
   public ArrayList<MemberVO> loginResult(MemberVO mvo);
   
  // public MemberVO searchId(MemberVO mvo); //아이디를 찾는다.
   
  // public MemberVO getLoginUserInfo(String mid); //
   
  // public int actionLoginEmailCount(MemberVO mvo);
   
  // public int changePassword(MemberVO mvo);
             
 //  public int changePasswordDate(MemberVO mvo);
             
  // public int deleteUser(String mid);
   
}
