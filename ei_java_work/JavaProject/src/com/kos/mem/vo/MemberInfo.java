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

	// ��ü ���� ���
	public void showData() {
		System.out.println("��ȣ: " + mno);
		System.out.println("���̵�: " + mid);
		System.out.println("�̸�: " + mname);
		System.out.println("�ڵ���: " + mhp);
		System.out.println("�н�����: " + mpw);
		System.out.println("�̸���: " + memail);
		System.out.println("�ּ�: " + maddr);
	}
	// �߻� �޼���
	// �����δ� �������� �ʰ� ���� �����ϴ� �޼���
	// �ڽ��� �����޾Ƽ� �������ϴ� �������� ����
	public abstract void showBasicData();

}
