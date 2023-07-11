package com.kos.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kos.board.sql.BoradSqlMap;
import com.kos.board.vo.BoardVO;
import com.kos.common.KosConnectivity;

public class BoardDAOImpl implements BoardDAO {
	/* 전체조회 */
	@Override
	public ArrayList<BoardVO> boardSelectAll() {
		// TODO Auto-generated method stub
		 //DB 연결할 클래스 초기화
		 Connection conn = null;
		 PreparedStatement ps = null;
	     ResultSet rs =null;
	     ArrayList<BoardVO> alist = null;
	     //
	     alist = new ArrayList<BoardVO>();
	     
				try {
					//DB 연결 객체가 메모리에 할당한다
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) 함수에 문자열형태의 쿼리 를 파라메타로 받아 
					//prepareStatement 인스턴스를 만들고
					ps = conn.prepareStatement(BoradSqlMap.getBoardSelectAllQuery());
					//쿼리문을 미리컴파일하여 DB 서버로 연결하여요청한다 
					//다시 한번 DB 서버로 미리컴파일된 쿼리 날려 서버로 요청해서 ResultSet 인스턴스(결과값)를반환하여
					//rs 참조변수에 할당한다
					rs = ps.executeQuery();
					if(rs != null) {
					// rs 가 null이 아닐때  콘솔에 rs 을 호출하여 출력해본다
						System.out.println("BoardDAOImpl boardSelectAll() >>>"+rs);
						while(rs.next()) {
							   BoardVO bvo = null;
							   // ResultSet의 쿼리결과값를 담을 VO객체를 인스턴스한다
							   bvo = new BoardVO();
							   
							   bvo.setBnum(rs.getString(1)); // 인덱스 1 번째 열의 데이타를 얻어서 bvo 인스턴스의 Bnum 맴버변수에 할당한다
							   bvo.setBsubject(rs.getString(2));
							   bvo.setBwriter(rs.getString(3));
							   bvo.setBpw(rs.getString(4));
							   bvo.setBmemo(rs.getString(5));
							   bvo.setDeleteyn(rs.getString(6));// DELETEYN
							   bvo.setInsertdate(rs.getString(7));// 
							   bvo.setUpdatedate(rs.getString(8));// 
							   // bvo 객체의 재정의된 toString() 호출되어 멤버필드값들을 콘솔에 출력한다
							   System.out.println("boardSelectAll bvo >>> : "+bvo);
						       alist.add(bvo);
						}
					}// end if
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					//Connection conn ,PreparedStatement 
				    // ResultSet 객체 자원들를 메모리 누수방지하기 null 값으로 처리
					KosConnectivity.conClose(conn, ps, rs);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return alist;
	}
	/* 글번호를 통해서  해당 글번호 row 을 얻어서 조회 */
	@Override
	public ArrayList<BoardVO> boardSelect(BoardVO bvo) {
		// TODO Auto-generated method stub
		 Connection conn =null;
		 PreparedStatement ps = null;
	     ResultSet rs =null;
	     ArrayList<BoardVO> alist = null;
	     alist = new ArrayList<BoardVO>();
				try {
					conn =KosConnectivity.getConnection();
					ps = conn.prepareStatement(BoradSqlMap.getBoardSelectQuery());
					ps.setNString(1, bvo.getBnum());
					rs = ps.executeQuery();
					if(rs != null) {
						while(rs.next()) {
							   BoardVO _bvo = null;
							   _bvo = new BoardVO();
							   
							   _bvo.setBnum(rs.getString(1));
							   _bvo.setBsubject(rs.getString(2));
							   _bvo.setBwriter(rs.getString(3));
							   _bvo.setBpw(rs.getString(4));
							   _bvo.setBmemo(rs.getString(5));
							   _bvo.setDeleteyn(rs.getString(6));// Deleteyn
							   _bvo.setInsertdate(rs.getString(7));// Insertdate
							   _bvo.setUpdatedate(rs.getString(8));// Updatedate
							   
							   System.out.println("boardSelectAll bvo >>> : "+_bvo);
						       alist.add(_bvo);
						} // end while
					}// end if
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					KosConnectivity.conClose(conn, ps, rs);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return alist;
	}
	/* 입력할 컬럼에 매핑되는 데이타 바인딩하여  row 을 생성한다*/
	@Override
	public int boardInsert(BoardVO bvo){

		// TODO Auto-generated method stub
		
	   Connection conn =null;
	   PreparedStatement ps = null;
	   int cnt = -1;
		try {
			conn =KosConnectivity.getConnection();
			ps = conn.prepareStatement(BoradSqlMap.getBoardInsertQuery());
	
		  //System.out.println("OracleTest_2_1.t1_Insert():"+ovo.toString());
			ps.clearParameters();
			
			ps.setString(1, bvo.getBnum());
			ps.setString(2, bvo.getBsubject());
			ps.setString(3, bvo.getBwriter());
			ps.setString(4, bvo.getBpw());
			ps.setString(5, bvo.getBmemo());
			
			cnt = ps.executeUpdate();
			KosConnectivity.conClose(conn, ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		 pstmt = conn.prepareStatement(sb.toString());
//		//pstmt = new LoggableStatement(conn, sb.toString());
//		//pstmt = conn.prepareStatement(sb.toString(),Statement.RETURN_GENERATED_KEYS);
//		//System.out.println("INSERT QUERY :: \n" + sb);
//		//System.out.println("OracleTest_2_1.t1_Insert():"+ovo);
//		//stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

	return cnt;
	}
	/* 입력할 컬럼에 매핑되는 데이타 바인딩하여  row 을 갱신한다*/
	@Override
	public int boardUpdate(BoardVO bvo) {
		// TODO Auto-generated method stub
		Connection conn =null;
		PreparedStatement ps = null;
		int cnt = -1;
		
			try {
					conn =KosConnectivity.getConnection();
					ps = conn.prepareStatement(BoradSqlMap.getBoardUpdateQuery());
			
				    System.out.println("BoardDAOImpl.boardUpdate(BoardVO bvo):"+bvo);
					ps.clearParameters();
					
					ps.setString(1, bvo.getBsubject());
					ps.setString(2, bvo.getBmemo());
					ps.setString(3, bvo.getBnum());
					
					cnt = ps.executeUpdate();
					KosConnectivity.conClose(conn, ps);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return cnt;
	}
	/*  DELETEYN = 'Y'해당 컬럼에 조건절로 데이타를 얻어서  table의 해당 row 삭제안하고 DELETEYN = 'N' 만 갱신한다*/
	@Override
	public int boardDelete(BoardVO bvo) {
		// TODO Auto-generated method stub
		Connection conn =null;
		PreparedStatement ps = null;
		int cnt = -1;
		
			try {
					conn =KosConnectivity.getConnection();
					ps = conn.prepareStatement(BoradSqlMap.getBoardDeleteQuery());
			
				    System.out.println("BoardDAOImpl.boardDelete(BoardVO bvo):"+bvo);
					ps.clearParameters();
					
					ps.setString(1, bvo.getBnum());
					
					cnt = ps.executeUpdate();
					KosConnectivity.conClose(conn, ps);
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return cnt;
	}

}
