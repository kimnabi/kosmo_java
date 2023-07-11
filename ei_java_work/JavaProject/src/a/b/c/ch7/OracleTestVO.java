package a.b.c.ch7;

public class OracleTestVO {
	
	private String col_1;
	private String col_2;
	private String col_3;
	private String col_4;
	private String col_5;
	private boolean col_6;
	public OracleTestVO() {
		super();
	}
	public OracleTestVO(String col_1, String col_2, String col_3, String col_4, String col_5, boolean col_6) {
		super();
		this.col_1 = col_1;
		this.col_2 = col_2;
		this.col_3 = col_3;
		this.col_4 = col_4;
		this.col_5 = col_5;
		this.col_6 = col_6;
	}
	public String getCol_1() {
		return col_1;
	}
	public void setCol_1(String col_1) {
		this.col_1 = col_1;
	}
	public String getCol_2() {
		return col_2;
	}
	public void setCol_2(String col_2) {
		this.col_2 = col_2;
	}
	public String getCol_3() {
		return col_3;
	}
	public void setCol_3(String col_3) {
		this.col_3 = col_3;
	}
	public String getCol_4() {
		return col_4;
	}
	public void setCol_4(String col_4) {
		this.col_4 = col_4;
	}
	public String getCol_5() {
		return col_5;
	}
	public void setCol_5(String col_5) {
		this.col_5 = col_5;
	}
	public boolean getCol_6() {
		return col_6;
	}
	public void setCol_6(boolean col_6) {
		this.col_6 = col_6;
	}
	@Override
	public String toString() {
		return "OracleTestVO [col_1=" + col_1 + ", col_2=" + col_2 + ", col_3=" + col_3 + ", col_4=" + col_4
				+ ", col_5=" + col_5 + ", col_6=" + col_6 + "]";
	}

	
	
	
	

}
