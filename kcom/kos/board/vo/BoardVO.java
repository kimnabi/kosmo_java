package a.b.c.com.kos.board.vo;

public class BoardVO {
	
	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bpw;
	private String bmemo;

	// 持失切 
	public BoardVO() {
		
	}

	// 持失切 
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
	
	// setter / getter 敗呪 
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
	private String deleteyn;
	private String insertdate;
	private String updatedate;

}
