package com.kos.board.vo;

public class BoardVO {
	
	@Override
	public String toString() {
		return "BoardVO [bnum=" + bnum + ", bsubject=" + bsubject + ", bwriter=" + bwriter + ", bpw=" + bpw + ", bmemo="
				+ bmemo + ", deleteyn=" + deleteyn + ", insertdate=" + insertdate + ", updatedate=" + updatedate + "]";
	}

	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bpw;
	private String bmemo;
	//이력관리테이블
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	public BoardVO() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	//멤버변수 초기화할수있는 생성자
	public BoardVO(String bnum, String bsubject, String bwriter, String bpw, String bmemo, String deleteyn,
			String insertdate, String updatedate) {
	
		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bwriter = bwriter;
		this.bpw = bpw;
		this.bmemo = bmemo;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}



	public String getBnum() {
		return bnum;
	}

	public void setBnum(String bnum) {
		this.bnum = bnum;
	}

	public String getBsubject() {
		return bsubject;
	}

	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBpw() {
		return bpw;
	}

	public void setBpw(String bpw) {
		this.bpw = bpw;
	}

	public String getBmemo() {
		return bmemo;
	}

	public void setBmemo(String bmemo) {
		this.bmemo = bmemo;
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
	

}
