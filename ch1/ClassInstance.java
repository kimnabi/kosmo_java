package a.b.c.ch1;


public class ClassInstance extends Object {
	
	public static void main(String[] args) {
		System.out.println("main() �Լ� ���� >>> ");
		// new : ���ʿ� ������ ����� ���� Ŭ������ �޸𸮿� �÷��ּ��� ��û�ϴ� Ű���� �̴�.
		// ClassInstance() : ������ ClassInstance() �� ã�Ƽ� �ν��Ͻ�(��ü ����) ��û �Ѵ�
		// ClassInstance() : �����ڰ� �޸𸮿� �ø��� ��������� Ŭ���� �� �⺻������ object Ŭ������ ����ϰ� �־�
	    // JVM�� object Ŭ������ ���� �޸𸮿� �ø��� �״��� ClassInstance() ��ü�� �޸𸮿� �ö󰣴�
		ClassInstance ci = new ClassInstance();
		System.out.println("ci >>>"+ ci);
	}//end of main function
} //end of ClassInstance
