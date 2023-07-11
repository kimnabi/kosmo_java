package a.b.c.kos.mem.vo;

public class EL_MemberVO {
private String irum;
private String id;
private String pw;
private String age;
private String addr;
private String tel;
public EL_MemberVO() {
	super();
	// TODO Auto-generated constructor stub
}


public EL_MemberVO(String irum, String id, String pw, String age, String addr, String tel) {
	super();
	this.irum = irum;
	this.id = id;
	this.pw = pw;
	this.age = age;
	this.addr = addr;
	this.tel = tel;
}


public String getIrum() {
	return irum;
}
public void setIrum(String irum) {
	this.irum = irum;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}


}
