package a.b.c.com.kos.mem.vo;

public class MemberVO {
	
	private String mno;
	private String mid;
	private String mpw;
	private String mname;	
	private String mhp;	
	private String memail;
	private String maddr; // 도로명 주소 
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	
	// 생성자 
	public MemberVO() {
		
	}

	// 생성자 
	public MemberVO(String mno, String mid, String mpw, String mname, String mhp, String memail, String maddr,
			String deleteyn, String insertdate, String updatedate) {
	
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.mhp = mhp;
		this.memail = memail;
		this.maddr = maddr;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	
	// getter / setter 함수 
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMhp() {
		return mhp;
	}
	public void setMhp(String mhp) {
		this.mhp = mhp;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMaddr() {
		return maddr;
	}
	public void setMaddr(String maddr) {
		this.maddr = maddr;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	
	public static void printlnMemberVO (MemberVO mvo) {
		
		System.out.println("mno >>> : " 			+ mvo.getMno());
		System.out.println("mid >>> : " 			+ mvo.getMid());
		System.out.println("mpw >>> : " 			+ mvo.getMpw());
		System.out.println("mname >>> : " 			+ mvo.getMname());
		System.out.println("mhp >>> : " 			+ mvo.getMhp());			
		System.out.println("memail >>> : " 			+ mvo.getMemail());
		System.out.println("maddr >>> : " 			+ mvo.getMaddr());
		System.out.println("deleteyn >>> : " 		+ mvo.getDeleteyn());			
		System.out.println("insertdate >>> : " 		+ mvo.getInsertdate());
		System.out.println("updatedate >>> : " 		+ mvo.getUpdatedate());
		
	}
	
	public static void printMemberVO (MemberVO mvo) {
		
		System.out.println(		mvo.getMno() 		+ " : "
							+ 	mvo.getMid() 		+ " : "
							+ 	mvo.getMpw() 		+ " : "
							+ 	mvo.getMname() 		+ " : "
							+ 	mvo.getMhp() 		+ " : "
							+ 	mvo.getDeleteyn() 	+ " : "
							+ 	mvo.getMemail() 	+ " : "
							+ 	mvo.getMaddr() 		+ " : "
							+ 	mvo.getDeleteyn() 	+ " : "
							+ 	mvo.getInsertdate() + " : "
							+ 	mvo.getUpdatedate());															
	}

}
