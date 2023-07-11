package com.kos.mem.vo;

public abstract class MemberInfo {
	
	protected String mno;	
	protected String mid;	
	protected String mname;	
	protected String mhp;	
	protected String mpw;	
	protected String memail;	
	protected String maddr;
	
	public MemberInfo() {
		
	}
	
	public MemberInfo(String mno, String mid, String mname, String mhp, String mpw, String memail, String maddr) {

		this.mno = mno;
		this.mid = mid;
		this.mname = mname;
		this.mhp = mhp;
		this.mpw = mpw;
		this.memail = memail;
		this.maddr = maddr;
	}
	
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

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
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

	// 전체 정보 출력
	public void showData() {
		System.out.println("번호: " + mno);
		System.out.println("아이디: " + mid);
		System.out.println("이름: " + mname);
		System.out.println("핸드폰: " + mhp);
		System.out.println("패스워드: " + mpw);
		System.out.println("이메일: " + memail);
		System.out.println("주소: " + maddr);
	}
	// 추상 메서드
	// 구현부는 존재하지 않고 선언만 존재하는 메서드
	// 자식이 물려받아서 구현해하는 목적으로 선언
	public abstract void showBasicData();

}
