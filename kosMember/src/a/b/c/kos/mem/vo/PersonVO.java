package a.b.c.kos.mem.vo;

public class PersonVO {
      
	private String name;
	private String age;

	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public PersonVO(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
