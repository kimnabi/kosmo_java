package a.b.c.com.kos.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.kos.board.sql.BoardSqlMap;
import a.b.c.com.kos.board.vo.BoardVO;
import a.b.c.com.kos.common.KosConnectivity;

public class BoardDAOImpl implements BoardDAO {

	// 입력 
	@Override
	public int boardInsert(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardInsert() 함수 진입 성공 >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		// 2. JDBC 드라이버 연결, 오라클 연결
		try {		
			conn = KosConnectivity.getConnection();			
			String sql = BoardSqlMap.getBoardInsertQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("INSERT QUERY \n" + sql);
			
			pstmt.clearParameters();			
			pstmt.setString(1, bvo.getBnum());
			pstmt.setString(2, bvo.getBsubject());
			pstmt.setString(3, bvo.getBwriter());
			pstmt.setString(4, bvo.getBpw());
			pstmt.setString(5, bvo.getBmemo());
			
			nCnt = pstmt.executeUpdate();					
			System.out.println("BoardDAOImpl.boardInsert() 함수 :::: " + nCnt + "건 입력 성공 >>> : ");			
			
			KosConnectivity.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("디비에 데이터 입력중 에러가 발생 함  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		return nCnt;
	}

	// 전체 조회
	@Override
	public ArrayList<BoardVO> boardSelectAll(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardSelectAll() 함수 진입 성공 >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<BoardVO> aList = null;
		
		// 2. JDBC 드라이버 연결, 오라클 연결
		try {
			
			conn = KosConnectivity.getConnection();
			
			String sql = BoardSqlMap.getBoardSelectAllQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("SELECT ALL \n" + sql);
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				
				aList = new ArrayList<BoardVO>();
				
				while (rsRs.next()) {
					
					BoardVO _ovo = new BoardVO();
					
					_ovo.setBnum(rsRs.getString(1));
					_ovo.setBsubject(rsRs.getString(2));
					_ovo.setBwriter(rsRs.getString(3));
					_ovo.setBpw(rsRs.getString(4));					
					_ovo.setBmemo(rsRs.getString(5));
					_ovo.setDeleteyn(rsRs.getString(6));
					_ovo.setInsertdate(rsRs.getString(7));
					_ovo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_ovo);
				}
			}
			
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("디비에 데이터 전체 조회 중 에러가 발생 함  >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	// 조건 조회
	@Override
	public ArrayList<BoardVO> boardSelect(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardSelect() 함수 진입 성공 >>> : ");
		System.out.println("bvo.getBnum() >>> : " + bvo.getBnum());
		
		// 1. 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<BoardVO> aList = null;
		
		// 2. JDBC 드라이버 연결, 오라클 연결
		try {
			
			conn = KosConnectivity.getConnection();
			
			String sql = BoardSqlMap.getBoardSelectQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("SELECT SEARCH \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				
				aList = new ArrayList<BoardVO>();
				
				while (rsRs.next()) {
					
					BoardVO _ovo = new BoardVO();
					
					_ovo.setBnum(rsRs.getString(1));
					_ovo.setBsubject(rsRs.getString(2));
					_ovo.setBwriter(rsRs.getString(3));
					_ovo.setBpw(rsRs.getString(4));					
					_ovo.setBmemo(rsRs.getString(5));
					_ovo.setDeleteyn(rsRs.getString(6));
					_ovo.setInsertdate(rsRs.getString(7));
					_ovo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_ovo);
				}
			}
			
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("디비에 데이터 조건 조회 중 에러가 발생 함  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	// 수정 
	@Override
	public int boardUpdate(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardUpdate() 함수 진입 성공 >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		// 2. JDBC 드라이버 연결, 오라클 연결
		try {		
			conn = KosConnectivity.getConnection();			
			String sql = BoardSqlMap.getBoardUpdateQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("UPDATE QUERY \n" + sql);
			
			pstmt.clearParameters();									
			pstmt.setString(1, bvo.getBmemo());
			pstmt.setString(2, bvo.getBnum());
			
			nCnt = pstmt.executeUpdate();					
			System.out.println("BoardDAOImpl.boardUpdate() 함수 :::: " + nCnt + "건 수정 성공 >>> : ");			
			
			KosConnectivity.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("디비에 데이터 입력중 에러가 발생 함  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		return nCnt;
	}

	// 삭제
	@Override
	public int boardDelete(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardInsert() 함수 진입 성공 >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		// 2. JDBC 드라이버 연결, 오라클 연결
		try {		
			conn = KosConnectivity.getConnection();			
			String sql = BoardSqlMap.getBoardDeleteQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("DELETE QUERY \n" + sql);
			
			pstmt.clearParameters();			
			pstmt.setString(1, bvo.getBnum());
			
			nCnt = pstmt.executeUpdate();					
			System.out.println("BoardDAOImpl.boardDelete() 함수 :::: " + nCnt + "건 삭제 성공 >>> : ");			
			
			KosConnectivity.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("디비에 데이터 삭제중 에러가 발생 함  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		return nCnt;
	}
}
