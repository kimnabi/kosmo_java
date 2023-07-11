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
		System.out.println("MemberDAOImpl.memInsert() 함수진입 성공 >>> : ");
		MemberVO.printlnMemberVO(mvo);
		
		int nCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);
	
			String sql = MemberSqlMap.getMemInsertQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("입력 쿼리 >>> : \n"+ sql);
			
			// setter 세팅해야한다.
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
			System.out.println("인서트 결과는 >>> : " + nCnt);
			
			
			KosConnectivity.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memInsert() 입력 중 에러가 발생 >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	

	@Override
	public ArrayList<MemberVO> memSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memSelectAll() 함수 진입 성공 >>> : ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try {
			
			// 커넨션 연결하기
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);

			// 프리페이어드 스테이트먼트 선언하기
			String sql = MemberSqlMap.getMemSelectAllQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("전체조회 쿼리 >>> : \n"+ sql);
			
			// 플레이스 홀더에 파라미터 세팅하기 
			// ResultSet 에 파일 받아오기 
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				// ArrayList 클래스 인스턴스 하기 
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {					
					// MemberVO 선언 및 인스턴스
					MemberVO mvo = new MemberVO();					
					// 조회된 컬럼 MemberVO 에 세팅하기 
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
					
					// MemverVO 를 ArrayList 에 담기  
					aList.add(mvo);			
				}				
				System.out.println("MemberDAOImpl.memSelectAll() :: aList.size() >>> : "+ aList.size());
			}
			
			KosConnectivity.conClose(conn, pstmt, rsRs);	
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memSelectAll() 조회 중 에러가 발생 >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public ArrayList<MemberVO> memSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memSelect() 함수 진입 성공 >>> : ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try {
			
			// 커넨션 연결하기
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);

			// 프리페이어드 스테이트먼트 선언하기
			String sql = MemberSqlMap.getMemSelectQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("조회 쿼리 >>> : \n"+ sql);
			
			// 플레이스 홀더에 파라미터 세팅하기 
			pstmt.setString(1, mvo.getMno());
					
			// ResultSet 에 파일 받아오기 
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				// ArrayList 클래스 인스턴스 하기 
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {					
					// MemberVO 선언 및 인스턴스
					MemberVO _mvo = new MemberVO();					
					// 조회된 컬럼 MemberVO 에 세팅하기 
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
									
					// MemverVO 를 ArrayList 에 담기  
					aList.add(_mvo);			
				}				
				System.out.println("MemberDAOImpl.memSelect() :: aList.size() >>> : "+ aList.size());
			}
			
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memSelect() 조회 중 에러가 발생 >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt, rsRs);
		}
		
		return aList;	
	}

	@Override
	public int memUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memUpdate() 함수진입 성공 >>> : ");
		MemberVO.printlnMemberVO(mvo);
		
		int nCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = KosConnectivity.getConnection();
			System.out.println("conn >>> : " + conn);
	
			String sql = MemberSqlMap.getMemUpdateQuery();
			pstmt = conn.prepareStatement(sql);
			System.out.println("수정 쿼리 >>> : \n"+ sql);
			
			// setter 세팅해야한다.
			pstmt.clearParameters();						
			pstmt.setString(1, mvo.getMemail());
			pstmt.setString(2, mvo.getMaddr());			
			pstmt.setString(3, mvo.getMno());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			System.out.println("업데이트 결과는 >>> : " + nCnt);
			
			KosConnectivity.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("MemberDAOImpl.memUpdate() 수정 중 에러가 발생 >>> : " + e);
		}finally {
			KosConnectivity.conClose(conn, pstmt);
		}
		
		return nCnt;
	}
}
