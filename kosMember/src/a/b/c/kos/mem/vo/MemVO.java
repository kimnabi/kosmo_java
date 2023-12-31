package a.b.c.kos.mem.vo;

public class MemVO {
	
	private String mnum;
	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String memail;
	private String mgender;
	private String mhobby;	
	private String mzone;
	private String mroad;
//	private String mroaddetail;
	private String mjibun;	
	//private String mlocal;
	private String mmsg;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	private String searchFilter;	// 검색조건
	private String keyword;			// 검색어
	private String fromdate;		// 검색기간 시작일
	private String todate;			// 검색기간 종료일
	
	

	public MemVO() {
		// TODO Auto-generated constructor stub
	}

	public MemVO(String mnum, String mname, String mid, String mpw, String mhp, String memail, String mgender,
			String mhobby, String mzone, String mroad, String mjibun, String mmsg
			//String deleteyn, String insertdate, String updatedate
			//String searchFilter, String keyword, String fromdate,String todate
			) {
		super();
		this.mnum = mnum;
		this.mname = mname;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.memail = memail;
		this.mgender = mgender;
		this.mhobby = mhobby;
		this.mzone = mzone;
		this.mroad = mroad;
		this.mjibun = mjibun;
		this.mmsg = mmsg;
//		this.deleteyn = deleteyn;
//		this.insertdate = insertdate;
//		this.updatedate = updatedate;
//		this.searchFilter = searchFilter;
//		this.keyword = keyword;
//		this.fromdate = fromdate;
//		this.todate = todate;
    }

	public String getMnum() {
		return mnum;
	}

	public void setMnum(String mnum) {
		this.mnum = mnum;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
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

	public String getMgender() {
		return mgender;
	}

	public void setMgender(String mgender) {
		this.mgender = mgender;
	}

	public String getMhobby() {
		return mhobby;
	}

	public void setMhobby(String mhobby) {
		this.mhobby = mhobby;
	}

	public String getMzone() {
		return mzone;
	}

	public void setMzone(String mzone) {
		this.mzone = mzone;
	}

	public String getMroad() {
		return mroad;
	}

	public void setMroad(String mroad) {
		this.mroad = mroad;
	}


	public String getMjibun() {
		return mjibun;
	}

	public void setMjibun(String mjibun) {
		this.mjibun = mjibun;
	}

	public String getMmsg() {
		return mmsg;
	}

	public void setMmsg(String mmsg) {
		this.mmsg = mmsg;
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

	

	public String getSearchFilter() {
		return searchFilter;
	}

	public void setSearchFilter(String searchFilter) {
		this.searchFilter = searchFilter;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	@Override
	public String toString() {
		return "MemVO [mnum=" + mnum + ", mname=" + mname + ", mid=" + mid + ", mpw=" + mpw + ", mhp=" + mhp
				+ ", memail=" + memail + ", mgender=" + mgender + ", mhobby=" + mhobby + ", mzone=" + mzone + ", mroad="
				+ mroad  + ", mjibun=" + mjibun + ", mmsg="
				+ mmsg + ", deleteyn=" + deleteyn + ", insertdate=" + insertdate + ", updatedate=" + updatedate
				 + "]";
	}
	
	
	

}
