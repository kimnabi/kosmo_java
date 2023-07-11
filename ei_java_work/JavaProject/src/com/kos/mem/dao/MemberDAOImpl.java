package com.kos.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kos.common.ChabunUtils;
import com.kos.common.KosConnectivity;
import com.kos.mem.sql.MemberSqlMap;
import com.kos.mem.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public ArrayList<MemberVO> memSelectAll() {
		// TODO Auto-generated method stub
		 Connection conn = null;
		 PreparedStatement ps = null;
	     ResultSet rs =null;
	     ArrayList<MemberVO> alist = null;
	     //
	     alist = new ArrayList<MemberVO>();
	     
	     System.out.println("MemberDAOImpl memSelectAll() >>> 진입");
				try {
					//DB 연결 객체가 메모리에 할당한다
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
					//prepareStatement 인스턴스를 만들고
					ps = conn.prepareStatement(MemberSqlMap.getMemSelectAllQuery());
					//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
					//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
					//rs 참조변수에 할당한다
					rs = ps.executeQuery();
							if(rs != null) {
							// rs 가 null이 아닐때  콘솔에 rs 을 호출하여 출력해본다
								System.out.println("MemberDAOImpl memSelectAll() >>>"+rs);
								while(rs.next()) {
									   MemberVO mvo = null;
									   // ResultSet의 쿼리결과값를 담을 VO객체를 인스턴스한다
									   mvo = new MemberVO();
									   
									   mvo.setMno(rs.getString(1));
									   mvo.setMid(rs.getString(2));
									   mvo.setMpw(rs.getString(3));
									   mvo.setMname(rs.getString(4));
									   mvo.setMhp(rs.getString(5));
									   mvo.setMemail(rs.getString(6));
									   mvo.setMaddr(rs.getString(7));
									   mvo.setDeleteyn(rs.getString(8));// DELETEYN
									   mvo.setInsertDate(rs.getString(9));// 
									   mvo.setUpdateDate(rs.getString(10));// 
									   // mvo 객체의 재정의된 toString() 호출되어 멤버필드값들을 콘솔에 출력한다
									   System.out.println("memSelectAll mvo >>> : "+mvo);
								       alist.add(mvo);
								}
							}// end if
					KosConnectivity.conClose(conn, ps, rs);
						
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//Connection conn ,PreparedStatement 
				    // ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
				
					}finally {
					KosConnectivity.conClose(conn, ps, rs);
					}
			return alist; 
	} // end memSelectAll

	@Override
	public MemberVO memSelect(String mno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
	    ResultSet rs =null;
		MemberVO res = null;
			     //
			     
						try {
							//DB 연결 객체가 메모리에 할당한다
							conn =KosConnectivity.getConnection();
							//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
							//prepareStatement 인스턴스를 만들고
							ps = conn.prepareStatement(MemberSqlMap.getMemSelectQuery());
							ps.setNString(1, mno);
							rs = ps.executeQuery();
							//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
							//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
							//rs 참조변수에 할당한다
							rs = ps.executeQuery();
									if(rs != null) {
									// rs 가 null이 아닐때  콘솔에 rs 을 호출하여 출력해본다
										System.out.println("MemberDAOImpl memSelect() >>>"+rs);
										// 일련번호 를 통해 받아온 row은 한개이기때문에 while 반복문 할필요없다
										if(rs.next()) {
											   // ResultSet의 쿼리결과값를 담을 VO객체를 인스턴스한다
											   res = new MemberVO();
											   
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
					return res; 
	}

	@Override
	public int memInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		 Connection conn =null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 int cnt = -1; // 쿼리의결과여부를 담는다
			try {
				conn =KosConnectivity.getConnection();
				ps = conn.prepareStatement(MemberSqlMap.getMemInsertQuery());
		
			  //System.out.println("OracleTest_2_1.t1_Insert():"+ovo.toString());
//				String mno =MemberSqlMap.chabun_query[MemberSqlMap.CHABUN_MEMBER];
				//ChabunUtils 클래스를 통해 만들어진 일련번호
				String mno =ChabunUtils.getMemChabun(); // mno 참조변수에 할당한다  
				
				//ps_1 = conn.prepareStatement(mno);
				//rs = ps_1.executeQuery();
				System.out.println(">>>>>>>>>>>>>>>>>>>>"+mno);
				ps.clearParameters();
//				ps.setString(1, mvo.getMno());
				ps.setString(1, mno); 
				ps.setString(2, mvo.getMname());
				ps.setString(3, mvo.getMpw());
				ps.setString(4, mvo.getMid());
				ps.setString(5, mvo.getMhp());
				ps.setString(6, mvo.getMaddr());
				ps.setString(7, mvo.getMemail());
				
				cnt = ps.executeUpdate();
				
				if(!conn.getAutoCommit()) conn.setAutoCommit(true); //트랜젝션 파일저장
				KosConnectivity.conClose(conn, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				KosConnectivity.conClose(conn, ps);
			}
			
		return cnt;
	}

	@Override
	public int memUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
	    ResultSet rs =null;

	    int cnt = -1; // 쿼리의결과여부를 담는다
			     
				try {
					//DB 연결 객체가 메모리에 할당한다
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
					//prepareStatement 인스턴스를 만들고
					ps = conn.prepareStatement(MemberSqlMap.getMemUpdateQuery());
					ps.setNString(1, mvo.getMemail());
					ps.setNString(2, mvo.getMaddr());
					ps.setNString(3, mvo.getMno());
					
					cnt = ps.executeUpdate();
					//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
					//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
					//rs 참조변수에 할당한다
					if(!conn.getAutoCommit()) conn.setAutoCommit(true); //트랜젝션 커밋를 하지않으면 갱신이 안된다
					        KosConnectivity.conClose(conn, ps, rs);
								
					} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							//Connection conn ,PreparedStatement 
						    // ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
						
					}finally {
							KosConnectivity.conClose(conn, ps, rs);
					}
		
		return cnt;
	}

	@Override
	public int memDelete(String mno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
	    ResultSet rs =null;
	    
	    int cnt = -1; // 쿼리의결과여부를 담는다
			     
				try {
					//DB 연결 객체가 메모리에 할당한다
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
					//prepareStatement 인스턴스를 만들고
					ps = conn.prepareStatement(MemberSqlMap.getMemDeleteQuery());
					//컬럼 인덱스 1에 해당되는 mno를 바인딩한다
					ps.setNString(1, mno);
					
					cnt = ps.executeUpdate();
					//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
					//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
					//rs 참조변수에 할당한다
					//
					if(!conn.getAutoCommit()) conn.setAutoCommit(true); //트랜젝션 파일저장
					
					// Connect,PreparedStatement,ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
					        KosConnectivity.conClose(conn, ps, rs);
								
					} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							//Connection conn ,PreparedStatement 
						   
						
					}finally {
						 // Connect,PreparedStatement,ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
							KosConnectivity.conClose(conn, ps, rs);
					}
		
		return cnt;
	}

}
