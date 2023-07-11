package a.b.c.com.kos.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.kos.board.sql.BoardSqlMap;
import a.b.c.com.kos.board.vo.BoardVO;
import a.b.c.com.kos.common.KosConnectivity;

public class BoardDAOImpl implements BoardDAO {

	// �Է� 
	@Override
	public int boardInsert(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardInsert() �Լ� ���� ���� >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		// 2. JDBC ����̹� ����, ����Ŭ ����
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
			System.out.println("BoardDAOImpl.boardInsert() �Լ� :::: " + nCnt + "�� �Է� ���� >>> : ");			
			
			KosConnectivity.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("��� ������ �Է��� ������ �߻� ��  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		return nCnt;
	}

	// ��ü ��ȸ
	@Override
	public ArrayList<BoardVO> boardSelectAll(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardSelectAll() �Լ� ���� ���� >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<BoardVO> aList = null;
		
		// 2. JDBC ����̹� ����, ����Ŭ ����
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
			System.out.println("��� ������ ��ü ��ȸ �� ������ �߻� ��  >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	// ���� ��ȸ
	@Override
	public ArrayList<BoardVO> boardSelect(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardSelect() �Լ� ���� ���� >>> : ");
		System.out.println("bvo.getBnum() >>> : " + bvo.getBnum());
		
		// 1. ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<BoardVO> aList = null;
		
		// 2. JDBC ����̹� ����, ����Ŭ ����
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
			System.out.println("��� ������ ���� ��ȸ �� ������ �߻� ��  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	// ���� 
	@Override
	public int boardUpdate(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardUpdate() �Լ� ���� ���� >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		// 2. JDBC ����̹� ����, ����Ŭ ����
		try {		
			conn = KosConnectivity.getConnection();			
			String sql = BoardSqlMap.getBoardUpdateQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("UPDATE QUERY \n" + sql);
			
			pstmt.clearParameters();									
			pstmt.setString(1, bvo.getBmemo());
			pstmt.setString(2, bvo.getBnum());
			
			nCnt = pstmt.executeUpdate();					
			System.out.println("BoardDAOImpl.boardUpdate() �Լ� :::: " + nCnt + "�� ���� ���� >>> : ");			
			
			KosConnectivity.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("��� ������ �Է��� ������ �߻� ��  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		return nCnt;
	}

	// ����
	@Override
	public int boardDelete(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardInsert() �Լ� ���� ���� >>> : ");
		System.out.println("bvo >>> : " + bvo);
		
		// 1. ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		// 2. JDBC ����̹� ����, ����Ŭ ����
		try {		
			conn = KosConnectivity.getConnection();			
			String sql = BoardSqlMap.getBoardDeleteQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("DELETE QUERY \n" + sql);
			
			pstmt.clearParameters();			
			pstmt.setString(1, bvo.getBnum());
			
			nCnt = pstmt.executeUpdate();					
			System.out.println("BoardDAOImpl.boardDelete() �Լ� :::: " + nCnt + "�� ���� ���� >>> : ");			
			
			KosConnectivity.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("��� ������ ������ ������ �߻� ��  >>> : " + e);
		} finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		return nCnt;
	}
}
