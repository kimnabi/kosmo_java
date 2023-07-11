package a.b.c.kos.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import a.b.c.com.kosmem.common.KosConnectivity;
import a.b.c.kos.mem.sql.MemQueryMap;
import a.b.c.kos.mem.vo.MemVO;

public class MemDAOImpl implements MemDAO {
	  private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public ArrayList<MemVO> memSelectAll() {
		// TODO Auto-generated method stub
		  Connection conn =null;
		   PreparedStatement ps = null;
		   ResultSet rs=null;
		   ArrayList<MemVO> aList =null;
		    aList =new ArrayList<MemVO>();
		   MemVO mvo = null;
		   Boolean result = false;
			try {
				conn =KosConnectivity.getConnection();
				ps = conn.prepareStatement(MemQueryMap.getMemSelectAllQuery());
		
				ps.clearParameters();
				//채번 얻어오기
			//	String mnum = ChabunUtils.getMemChabun();

			
				//System.out.println("mnum key >>> : "+mnum);
//				ps.setString(1, mnum);
				rs= ps.executeQuery();
				while(rs.next()) {
                    mvo = new MemVO();
					 mvo.setMnum(rs.getString(1));
					 mvo.setMname(rs.getString(2));
				     mvo.setMid(rs.getString(3));
				     mvo.setMpw(rs.getString(4));
				     mvo.setMhp(rs.getString(5));
				     mvo.setMemail(rs.getString(6));
				     mvo.setMgender(rs.getString(7));
				     mvo.setMhobby(rs.getString(8));
				     mvo.setMzone(rs.getString(9));
				     mvo.setMroad(rs.getString(10));
				     mvo.setMjibun(rs.getString(11));
				     mvo.setMmsg(rs.getString(12));
				     mvo.setDeleteyn(rs.getString(13));
				     mvo.setInsertdate(rs.getString(14));
				     mvo.setUpdatedate(rs.getString(15));

				     aList.add(mvo);
					
				}
			
				logger.debug("aList >>> :{}",aList);
				KosConnectivity.conClose(conn, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return aList;
	}

	@Override
	public ArrayList<MemVO> memSelect(MemVO mvo) {
		// TODO Auto-generated method stub
		Connection conn =null;
		   PreparedStatement ps = null;
		   ResultSet rs=null;
		   ArrayList<MemVO> aList =null;
		    aList =new ArrayList<MemVO>();
			try {
				conn =KosConnectivity.getConnection();
				String sql =MemQueryMap.getMemSelectQuery();
				sql=sql.replace("#1","\'"+mvo.getMnum().trim()+"\'");		
				//"\'"+keyword.trim()+"\'"
				ps = conn.prepareStatement(sql);
		
				ps.clearParameters();
				//채번 얻어오기
			//	String mnum = ChabunUtils.getMemChabun();

			
				//System.out.println("mnum key >>> : "+mnum);
//				ps.setString(1, mnum);
				rs= ps.executeQuery();
				while(rs.next()) {
                 mvo = new MemVO();
					 mvo.setMnum(rs.getString(1));
					 mvo.setMname(rs.getString(2));
				     mvo.setMid(rs.getString(3));
				     mvo.setMpw(rs.getString(4));
				     mvo.setMhp(rs.getString(5));
				     mvo.setMemail(rs.getString(6));
				     mvo.setMgender(rs.getString(7));
				     mvo.setMhobby(rs.getString(8));
				     mvo.setMzone(rs.getString(9));
				     mvo.setMroad(rs.getString(10));
				     mvo.setMjibun(rs.getString(11));
				     mvo.setMmsg(rs.getString(12));
				     mvo.setDeleteyn(rs.getString(13));
				     mvo.setInsertdate(rs.getString(14));
				     mvo.setUpdatedate(rs.getString(15));

				     aList.add(mvo);
					
				}
			
				logger.debug("aList >>> :{}",aList);
				KosConnectivity.conClose(conn, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return aList;
	}

	@Override
	public boolean memInsert(MemVO mvo) {
		// TODO Auto-generated method stub
		
		   Connection conn =null;
		   PreparedStatement ps = null;
		   Boolean result = false;
			try {
				conn =KosConnectivity.getConnection();
				ps = conn.prepareStatement(MemQueryMap.getMemInsertQuery());
		
			  //System.out.println("OracleTest_2_1.t1_Insert():"+ovo.toString());
				ps.clearParameters();
				//채번 얻어오기
			//	String mnum = ChabunUtils.getMemChabun();

			
				//System.out.println("mnum key >>> : "+mnum);
//				ps.setString(1, mnum);
				ps.setString(1, mvo.getMnum());
				ps.setString(2, mvo.getMname());
				ps.setString(3, mvo.getMid());
				ps.setString(4, mvo.getMpw());
				ps.setString(5, mvo.getMhp());
				ps.setString(6, mvo.getMemail());
				ps.setString(7, mvo.getMgender());
				ps.setString(8, mvo.getMhobby());
				ps.setString(9, mvo.getMzone());
				ps.setString(10, mvo.getMroad());
				//ps.setString(11, mvo.getMroaddetail());
				ps.setString(11, mvo.getMjibun());
				ps.setString(12, mvo.getMmsg());
			
				int cnt = ps.executeUpdate();
				if(!conn.getAutoCommit()) conn.commit(); //트랙젝션 발생후 커밋한다
				result = cnt > 0 ? true:false;
				//logger.debug("")
				KosConnectivity.conClose(conn, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean memUpdate(MemVO mvo) {
		// TODO Auto-generated method stub
		Connection conn =null;
		PreparedStatement ps = null;
		boolean result = false;
		int cnt = -1;
		
			try {
					conn =KosConnectivity.getConnection();
					ps = conn.prepareStatement(MemQueryMap.getMemUpdateQuery());
			
				   // System.out.println("BoardDAOImpl.boardUpdate(BoardVO bvo):"+bvo);
					ps.clearParameters();
			
					ps.setString(1, mvo.getMname());
					ps.setString(2, mvo.getMhp());
					ps.setString(3, mvo.getMemail());
					ps.setString(4, mvo.getMhobby());
					ps.setString(5, mvo.getMgender());
					ps.setString(6, mvo.getMzone());
					ps.setString(7, mvo.getMroad());
					ps.setString(8, mvo.getMjibun());
					ps.setString(9, mvo.getMmsg());
					ps.setString(10, mvo.getMnum());
//					
					cnt = ps.executeUpdate();
					if(!conn.getAutoCommit()) conn.commit(); //트랙젝션 발생후 커밋한다
					result = cnt > 0 ? true:false;
					KosConnectivity.conClose(conn, ps);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return result;
	}

	@Override
	public boolean memDelete(MemVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<MemVO> memSearchBykeyword(String keyword,String searchfilter,String fromDate,String toDate) {
		// TODO Auto-generated method stub
		 Connection conn =null;
		   PreparedStatement ps = null;
		   ResultSet rs=null;
		   ArrayList<MemVO> aList =null;
		    aList =new ArrayList<MemVO>();
		   MemVO mvo = null;
		   String sql ="";
		   try {
			   conn =KosConnectivity.getConnection();
			   boolean bool = !"".equals(keyword) && !"".equals(searchfilter);
			   if(bool) {
				   logger.debug("  if !\"\".equals(keyword) && !\"\".equals(searchfilter) 블록진입");
					sql =MemQueryMap.getMemSearchQuery();
					sql = sql.replace("#searchfilter", searchfilter);
					sql = sql.replace("#keyword", "\'"+keyword.trim()+"\'");
					ps = conn.prepareStatement(sql);
			   }
			   bool = !"".equals(fromDate) && !"".equals(toDate);
			   if(bool) {
				   logger.debug(" if !\"\".equals(fromDate) && !\"\".equals(toDate) 블록진입");
				   sql="";
				   sql =MemQueryMap.getMemSearchByDateQuery();
				   sql = sql.replace("#fromDate", "\'"+fromDate+"\'");
				   sql = sql.replace("#toDate", "\'"+toDate+"\'");
				   ps = conn.prepareStatement(sql);
			   }
				//채번 얻어오기
			//	String mnum = ChabunUtils.getMemChabun();

			
				//System.out.println("mnum key >>> : "+mnum);
//				ps.setString(1, mnum);
				rs= ps.executeQuery();
				while(rs.next()) {
					 mvo = new MemVO();
					 mvo.setMnum(rs.getString(1));
					 mvo.setMname(rs.getString(2));
				     mvo.setMid(rs.getString(3));
				     mvo.setMpw(rs.getString(4));
				     mvo.setMhp(rs.getString(5));
				     mvo.setMemail(rs.getString(6));
				     mvo.setMgender(rs.getString(7));
				     mvo.setMhobby(rs.getString(8));
				     mvo.setMzone(rs.getString(9));
				     mvo.setMroad(rs.getString(10));
				     mvo.setMjibun(rs.getString(11));
				     mvo.setMmsg(rs.getString(12));
				     mvo.setDeleteyn(rs.getString(13));
				     mvo.setInsertdate(rs.getString(14));
				     mvo.setUpdatedate(rs.getString(15));

				     aList.add(mvo);
					
				}
			
				logger.debug("aList >>> :{}",aList);
				KosConnectivity.conClose(conn, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return aList;
	}
}
