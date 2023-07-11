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
	/* ��ü��ȸ */
	@Override
	public ArrayList<BoardVO> boardSelectAll() {
		// TODO Auto-generated method stub
		 //DB ������ Ŭ���� �ʱ�ȭ
		 Connection conn = null;
		 PreparedStatement ps = null;
	     ResultSet rs =null;
	     ArrayList<BoardVO> alist = null;
	     //
	     alist = new ArrayList<BoardVO>();
	     
				try {
					//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
					//prepareStatement �ν��Ͻ��� �����
					ps = conn.prepareStatement(BoradSqlMap.getBoardSelectAllQuery());
					//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
					//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
					//rs ���������� �Ҵ��Ѵ�
					rs = ps.executeQuery();
					if(rs != null) {
					// rs �� null�� �ƴҶ�  �ֿܼ� rs �� ȣ���Ͽ� ����غ���
						System.out.println("BoardDAOImpl boardSelectAll() >>>"+rs);
						while(rs.next()) {
							   BoardVO bvo = null;
							   // ResultSet�� ����������� ���� VO��ü�� �ν��Ͻ��Ѵ�
							   bvo = new BoardVO();
							   
							   bvo.setBnum(rs.getString(1)); // �ε��� 1 ��° ���� ����Ÿ�� �� bvo �ν��Ͻ��� Bnum �ɹ������� �Ҵ��Ѵ�
							   bvo.setBsubject(rs.getString(2));
							   bvo.setBwriter(rs.getString(3));
							   bvo.setBpw(rs.getString(4));
							   bvo.setBmemo(rs.getString(5));
							   bvo.setDeleteyn(rs.getString(6));// DELETEYN
							   bvo.setInsertdate(rs.getString(7));// 
							   bvo.setUpdatedate(rs.getString(8));// 
							   // bvo ��ü�� �����ǵ� toString() ȣ��Ǿ� ����ʵ尪���� �ֿܼ� ����Ѵ�
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
				    // ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
					KosConnectivity.conClose(conn, ps, rs);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return alist;
	}
	/* �۹�ȣ�� ���ؼ�  �ش� �۹�ȣ row �� �� ��ȸ */
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
	/* �Է��� �÷��� ���εǴ� ����Ÿ ���ε��Ͽ�  row �� �����Ѵ�*/
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
	/* �Է��� �÷��� ���εǴ� ����Ÿ ���ε��Ͽ�  row �� �����Ѵ�*/
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
	/*  DELETEYN = 'Y'�ش� �÷��� �������� ����Ÿ�� ��  table�� �ش� row �������ϰ� DELETEYN = 'N' �� �����Ѵ�*/
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
