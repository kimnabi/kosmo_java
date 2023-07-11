package com.kos.mem.vo;

public class MemberVO extends MemberInfo{
	
	 private String deleteyn;	
	 private String insertDate;	
	 private String updateDate;
	
	 public MemberVO() {
		 // TODO Auto-generated constructor stub
		 super();
	 }

	public MemberVO(String mno, String mid, String mname,
					String mhp, String mpw,String memail, 
					String maddr, String deleteyn,String insertDate,
					String updateDate) {

		super(mno, mid,  mname,
			  mhp,mpw,  memail, maddr);
		this.deleteyn = deleteyn;
		this.insertDate = insertDate;
		this.updateDate = updateDate;
	}

	public String getDeleteyn() {
		return deleteyn;
	}

	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", mid=" + mid + ", mname=" + mname + ", mhp=" + mhp + ", memail=" + memail
				+ ", maddr=" + maddr + ", deleteyn=" + deleteyn + ", insertDate=" + insertDate + ", updateDate="
				+ updateDate + "]";
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("삭제여부 : " + deleteyn);
		System.out.println("등록일 : " + insertDate);
		System.out.println("갱신일 : " + updateDate);
	}
	@Override
	public void showBasicData() {
		// TODO Auto-generated method stub
		System.out.println("번호 : " + mno);
		System.out.println("아이디 : " + mid);
		System.out.println("이름 : " + mname);
		System.out.println("핸드폰 : " + mhp);
		System.out.println("이메일 : " + memail);
		System.out.println("주소 : " + maddr);
	}	
	
}
