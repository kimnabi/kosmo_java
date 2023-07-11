package a.b.c.com.kos.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.kos.common.KosConnectivity;
import a.b.c.com.kos.mem.sql.MemberSqlMap;
import a.b.c.com.kos.mem.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public int memInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memInsert() �Լ����� ���� >>> : ");
		MemberVO.printlnMemberVO(mvo);
		
		int nCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);
	
			String sql = MemberSqlMap.getMemInsertQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("�Է� ���� >>> : \n"+ sql);
			
			// setter �����ؾ��Ѵ�.
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getMno());
			pstmt.setString(2, mvo.getMid());
			pstmt.setString(3, mvo.getMpw());
			pstmt.setString(4, mvo.getMname());
			pstmt.setString(5, mvo.getMhp());
			pstmt.setString(6, mvo.getMemail());
			pstmt.setString(7, mvo.getMaddr());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			System.out.println("�μ�Ʈ ����� >>> : " + nCnt);
			
			
			KosConnectivity.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memInsert() �Է� �� ������ �߻� >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	

	@Override
	public ArrayList<MemberVO> memSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memSelectAll() �Լ� ���� ���� >>> : ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try {
			
			// Ŀ�ټ� �����ϱ�
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);

			// �������̾�� ������Ʈ��Ʈ �����ϱ�
			String sql = MemberSqlMap.getMemSelectAllQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("��ü��ȸ ���� >>> : \n"+ sql);
			
			// �÷��̽� Ȧ���� �Ķ���� �����ϱ� 
			// ResultSet �� ���� �޾ƿ��� 
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				// ArrayList Ŭ���� �ν��Ͻ� �ϱ� 
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {					
					// MemberVO ���� �� �ν��Ͻ�
					MemberVO mvo = new MemberVO();					
					// ��ȸ�� �÷� MemberVO �� �����ϱ� 
					mvo.setMno(rsRs.getString(1));
					mvo.setMid(rsRs.getString(2));
					mvo.setMpw(rsRs.getString(3));
					mvo.setMname(rsRs.getString(4));					
					mvo.setMhp(rsRs.getString(5));					
					mvo.setMemail(rsRs.getString(6));
					mvo.setMaddr(rsRs.getString(7));
					mvo.setDeleteyn(rsRs.getString(8));					
					mvo.setInsertdate(rsRs.getString(9));
					mvo.setUpdatedate(rsRs.getString(10));					
					
					// MemverVO �� ArrayList �� ���  
					aList.add(mvo);			
				}				
				System.out.println("MemberDAOImpl.memSelectAll() :: aList.size() >>> : "+ aList.size());
			}
			
			KosConnectivity.conClose(conn, pstmt, rsRs);	
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memSelectAll() ��ȸ �� ������ �߻� >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public ArrayList<MemberVO> memSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memSelect() �Լ� ���� ���� >>> : ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try {
			
			// Ŀ�ټ� �����ϱ�
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);

			// �������̾�� ������Ʈ��Ʈ �����ϱ�
			String sql = MemberSqlMap.getMemSelectQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("��ȸ ���� >>> : \n"+ sql);
			
			// �÷��̽� Ȧ���� �Ķ���� �����ϱ� 
			pstmt.setString(1, mvo.getMno());
					
			// ResultSet �� ���� �޾ƿ��� 
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				// ArrayList Ŭ���� �ν��Ͻ� �ϱ� 
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {					
					// MemberVO ���� �� �ν��Ͻ�
					MemberVO _mvo = new MemberVO();					
					// ��ȸ�� �÷� MemberVO �� �����ϱ� 
					_mvo.setMno(rsRs.getString(1));
					_mvo.setMid(rsRs.getString(2));
					_mvo.setMpw(rsRs.getString(3));
					_mvo.setMname(rsRs.getString(4));				
					_mvo.setMhp(rsRs.getString(5));				
					_mvo.setMemail(rsRs.getString(6));
					_mvo.setMaddr(rsRs.getString(7));
					_mvo.setDeleteyn(rsRs.getString(8));					
					_mvo.setInsertdate(rsRs.getString(9));
					_mvo.setUpdatedate(rsRs.getString(10));								
									
					// MemverVO �� ArrayList �� ���  
					aList.add(_mvo);			
				}				
				System.out.println("MemberDAOImpl.memSelect() :: aList.size() >>> : "+ aList.size());
			}
			
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memSelect() ��ȸ �� ������ �߻� >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;	
	}

	@Override
	public int memUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memUpdate() �Լ����� ���� >>> : ");
		MemberVO.printlnMemberVO(mvo);
		
		int nCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);
	
			String sql = MemberSqlMap.getMemUpdateQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("���� ���� >>> : \n"+ sql);
			
			// setter �����ؾ��Ѵ�.
			pstmt.clearParameters();						
			pstmt.setString(1, mvo.getMemail());
			pstmt.setString(2, mvo.getMaddr());			
			pstmt.setString(3, mvo.getMno());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			System.out.println("������Ʈ ����� >>> : " + nCnt);
			
			KosConnectivity.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memUpdate() ���� �� ������ �߻� >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		
		return nCnt;
	}
}
