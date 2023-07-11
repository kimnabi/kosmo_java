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
	     
	     System.out.println("MemberDAOImpl memSelectAll() >>> ����");
				try {
					//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
					//prepareStatement �ν��Ͻ��� �����
					ps = conn.prepareStatement(MemberSqlMap.getMemSelectAllQuery());
					//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
					//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
					//rs ���������� �Ҵ��Ѵ�
					rs = ps.executeQuery();
							if(rs != null) {
							// rs �� null�� �ƴҶ�  �ֿܼ� rs �� ȣ���Ͽ� ����غ���
								System.out.println("MemberDAOImpl memSelectAll() >>>"+rs);
								while(rs.next()) {
									   MemberVO mvo = null;
									   // ResultSet�� ����������� ���� VO��ü�� �ν��Ͻ��Ѵ�
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
									   // mvo ��ü�� �����ǵ� toString() ȣ��Ǿ� ����ʵ尪���� �ֿܼ� ����Ѵ�
									   System.out.println("memSelectAll mvo >>> : "+mvo);
								       alist.add(mvo);
								}
							}// end if
					KosConnectivity.conClose(conn, ps, rs);
						
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//Connection conn ,PreparedStatement 
				    // ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
				
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
							//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
							conn =KosConnectivity.getConnection();
							//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
							//prepareStatement �ν��Ͻ��� �����
							ps = conn.prepareStatement(MemberSqlMap.getMemSelectQuery());
							ps.setNString(1, mno);
							rs = ps.executeQuery();
							//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
							//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
							//rs ���������� �Ҵ��Ѵ�
							rs = ps.executeQuery();
									if(rs != null) {
									// rs �� null�� �ƴҶ�  �ֿܼ� rs �� ȣ���Ͽ� ����غ���
										System.out.println("MemberDAOImpl memSelect() >>>"+rs);
										// �Ϸù�ȣ �� ���� �޾ƿ� row�� �Ѱ��̱⶧���� while �ݺ��� ���ʿ����
										if(rs.next()) {
											   // ResultSet�� ����������� ���� VO��ü�� �ν��Ͻ��Ѵ�
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
											   // res ��ü�� �����ǵ� toString() ȣ��Ǿ� ����ʵ尪���� �ֿܼ� ����Ѵ�
											   System.out.println("memSelect res >>> : "+res);
										}
									}// end if
							//Connection conn ,PreparedStatement 
						   // ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
							KosConnectivity.conClose(conn, ps, rs);
								
							} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						
							}finally {
							//����ó���� �� ����� ���
							//Connection conn ,PreparedStatement 
							// ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
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
		 int cnt = -1; // �����ǰ�����θ� ��´�
			try {
				conn =KosConnectivity.getConnection();
				ps = conn.prepareStatement(MemberSqlMap.getMemInsertQuery());
		
			  //System.out.println("OracleTest_2_1.t1_Insert():"+ovo.toString());
//				String mno =MemberSqlMap.chabun_query[MemberSqlMap.CHABUN_MEMBER];
				//ChabunUtils Ŭ������ ���� ������� �Ϸù�ȣ
				String mno =ChabunUtils.getMemChabun(); // mno ���������� �Ҵ��Ѵ�  
				
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
				
				if(!conn.getAutoCommit()) conn.setAutoCommit(true); //Ʈ������ ��������
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

	    int cnt = -1; // �����ǰ�����θ� ��´�
			     
				try {
					//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
					//prepareStatement �ν��Ͻ��� �����
					ps = conn.prepareStatement(MemberSqlMap.getMemUpdateQuery());
					ps.setNString(1, mvo.getMemail());
					ps.setNString(2, mvo.getMaddr());
					ps.setNString(3, mvo.getMno());
					
					cnt = ps.executeUpdate();
					//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
					//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
					//rs ���������� �Ҵ��Ѵ�
					if(!conn.getAutoCommit()) conn.setAutoCommit(true); //Ʈ������ Ŀ�Ը� ���������� ������ �ȵȴ�
					        KosConnectivity.conClose(conn, ps, rs);
								
					} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							//Connection conn ,PreparedStatement 
						    // ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
						
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
	    
	    int cnt = -1; // �����ǰ�����θ� ��´�
			     
				try {
					//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
					conn =KosConnectivity.getConnection();
					//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
					//prepareStatement �ν��Ͻ��� �����
					ps = conn.prepareStatement(MemberSqlMap.getMemDeleteQuery());
					//�÷� �ε��� 1�� �ش�Ǵ� mno�� ���ε��Ѵ�
					ps.setNString(1, mno);
					
					cnt = ps.executeUpdate();
					//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
					//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
					//rs ���������� �Ҵ��Ѵ�
					//
					if(!conn.getAutoCommit()) conn.setAutoCommit(true); //Ʈ������ ��������
					
					// Connect,PreparedStatement,ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
					        KosConnectivity.conClose(conn, ps, rs);
								
					} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							//Connection conn ,PreparedStatement 
						   
						
					}finally {
						 // Connect,PreparedStatement,ResultSet ��ü �ڿ��鸦 �޸� ���������ϱ� null ������ ó��
							KosConnectivity.conClose(conn, ps, rs);
					}
		
		return cnt;
	}

}
