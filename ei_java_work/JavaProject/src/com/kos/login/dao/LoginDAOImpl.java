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
							//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
							conn =KosConnectivity.getConnection();
							//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
							//prepareStatement �ν��Ͻ��� �����
							ps = conn.prepareStatement(LoginSqlMap.getLoginCheckQuery());
							ps.setNString(1, mvo.getMid());
							ps.setNString(2, mvo.getMpw());
							rs = ps.executeQuery();
							//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
							//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
							//rs ���������� �Ҵ��Ѵ�
							rs = ps.executeQuery();
									if(rs != null) {
									// rs �� null�� �ƴҶ�  �ֿܼ� rs �� ȣ���Ͽ� ����غ���
										System.out.println("LoginDAOImpl loginCheck(MemberVO mvo) >>>"+rs);
										// �Ϸù�ȣ �� ���� �޾ƿ� row�� �Ѱ��̱⶧���� while �ݺ��� ���ʿ����
										while(rs.next()) {
											   // ResultSet�� ����������� ���� VO��ü�� �ν��Ͻ��Ѵ�
											   aList = new ArrayList<MemberVO>();
											   res = new MemberVO();
											   
											   res.setMid(rs.getString(1));
											   res.setMpw(rs.getString(2));
										
											   aList.add(res);
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
					return aList; 
	}
	// �α����� �Ǿ����� �α��� ����� ����
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
							//DB ���� ��ü�� �޸𸮿� �Ҵ��Ѵ�
							conn =KosConnectivity.getConnection();
							//prepareStatement(String sql) �Լ��� ���ڿ������� ���� �� �Ķ��Ÿ�� �޾� 
							//prepareStatement �ν��Ͻ��� �����
							ps = conn.prepareStatement(LoginSqlMap.getLoginResultQuery());
							ps.setNString(1, mvo.getMno());
							ps.setNString(2, mvo.getMpw());
							rs = ps.executeQuery();
							//�������� �̸��������Ͽ� DB ������ �����Ͽ���û�Ѵ� 
							//�ٽ� �ѹ� DB ������ �̸������ϵ� ���� ���� ������ ��û�ؼ� ResultSet �ν��Ͻ�(�����)����ȯ�Ͽ�
							//rs ���������� �Ҵ��Ѵ�
							rs = ps.executeQuery();
									if(rs != null) {
									// rs �� null�� �ƴҶ�  �ֿܼ� rs �� ȣ���Ͽ� ����غ���
										System.out.println("LoginDAOImpl loginResult(MemberVO mvo) >>>"+rs);
										// �Ϸù�ȣ �� ���� �޾ƿ� row�� �Ѱ��̱⶧���� while �ݺ��� ���ʿ����
										if(rs.next()) {
											   // ResultSet�� ����������� ���� VO��ü�� �ν��Ͻ��Ѵ�
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
					return aList; 
	}

}
