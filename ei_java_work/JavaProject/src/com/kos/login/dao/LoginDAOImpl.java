package com.kos.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kos.common.KosConnectivity;
import com.kos.login.sql.LoginSqlMap;
import com.kos.mem.sql.MemberSqlMap;
import com.kos.mem.vo.MemberVO;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public ArrayList<MemberVO> loginCheck(MemberVO mvo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
	    ResultSet rs =null;
	    ArrayList<MemberVO> aList = null;
		MemberVO res = null;
			     //
			     
						try {
							//DB 연결 객체가 메모리에 할당한다
							conn =KosConnectivity.getConnection();
							//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
							//prepareStatement 인스턴스를 만들고
							ps = conn.prepareStatement(LoginSqlMap.getLoginCheckQuery());
							ps.setNString(1, mvo.getMid());
							ps.setNString(2, mvo.getMpw());
							rs = ps.executeQuery();
							//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
							//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
							//rs 참조변수에 할당한다
							rs = ps.executeQuery();
									if(rs != null) {
									// rs 가 null이 아닐때  콘솔에 rs 을 호출하여 출력해본다
										System.out.println("LoginDAOImpl loginCheck(MemberVO mvo) >>>"+rs);
										// 일련번호 를 통해 받아온 row은 한개이기때문에 while 반복문 할필요없다
										while(rs.next()) {
											   // ResultSet의 쿼리결과값를 담을 VO객체를 인스턴스한다
											   aList = new ArrayList<MemberVO>();
											   res = new MemberVO();
											   
											   res.setMid(rs.getString(1));
											   res.setMpw(rs.getString(2));
										
											   aList.add(res);
											   // res 객체의 재정의된 toString() 호출되어 멤버필드값들을 콘솔에 출력한다
											   System.out.println("memSelect res >>> : "+res);
										}
									}// end if
							//Connection conn ,PreparedStatement 
						   // ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
							KosConnectivity.conClose(conn, ps, rs);
								
							} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						
							}finally {
							//예외처리가 된 경우을 대비
							//Connection conn ,PreparedStatement 
							// ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
							KosConnectivity.conClose(conn, ps, rs);
							}
					return aList; 
	}
	// 로그인이 되었으면 로그인 결과를 띄운다
	@Override
	public ArrayList<MemberVO> loginResult(MemberVO mvo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
	    ResultSet rs =null;
	    ArrayList<MemberVO> aList = null;
		MemberVO res = null;
			     //
			     
						try {
							//DB 연결 객체가 메모리에 할당한다
							conn =KosConnectivity.getConnection();
							//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
							//prepareStatement 인스턴스를 만들고
							ps = conn.prepareStatement(LoginSqlMap.getLoginResultQuery());
							ps.setNString(1, mvo.getMno());
							ps.setNString(2, mvo.getMpw());
							rs = ps.executeQuery();
							//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
							//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
							//rs 참조변수에 할당한다
							rs = ps.executeQuery();
									if(rs != null) {
									// rs 가 null이 아닐때  콘솔에 rs 을 호출하여 출력해본다
										System.out.println("LoginDAOImpl loginResult(MemberVO mvo) >>>"+rs);
										// 일련번호 를 통해 받아온 row은 한개이기때문에 while 반복문 할필요없다
										if(rs.next()) {
											   // ResultSet의 쿼리결과값를 담을 VO객체를 인스턴스한다
											   res = new MemberVO();
											   aList = new ArrayList<MemberVO>();
											   res.setMno(rs.getString(1));
											   res.setMid(rs.getString(2));
											   res.setMpw(rs.getString(3));
											   res.setMname(rs.getString(4));
											   res.setMhp(rs.getString(5));
											   res.setMemail(rs.getString(6));
											   res.setMaddr(rs.getString(7));
											   res.setDeleteyn(rs.getString(8));// DELETEYN
											   res.setInsertDate(rs.getString(9));// 
											   res.setUpdateDate(rs.getString(10));// 
											   aList.add(res);
											   // res 객체의 재정의된 toString() 호출되어 멤버필드값들을 콘솔에 출력한다
											   System.out.println("memSelect res >>> : "+res);
										}
									}// end if
							//Connection conn ,PreparedStatement 
						   // ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
							KosConnectivity.conClose(conn, ps, rs);
								
							} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						
							}finally {
							//예외처리가 된 경우을 대비
							//Connection conn ,PreparedStatement 
							// ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
							KosConnectivity.conClose(conn, ps, rs);
							}
					return aList; 
	}

}
