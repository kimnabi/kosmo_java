package a.b.c.ch1;

public class StaticTest {
	
	public static final String BIZ_GUBUN_MEMBER = "M";
	
	
	int i;
	// static ����(Ŭ���� ����), �Ϲ� ����, �ڷ��� ���� int
	static int ii;

	public static void main(String[] args) {
		System.out.println("main() �Լ� ���� >>> : ");

		StaticTest st = new StaticTest();
		System.out.println("st �������� >>> : " + st );
		System.out.println("st.i >>> : " + st.i);
		// static ���� ���� ����ϱ�
		// ��Ű���� + Ŭ�����̸� + ���� �̸� = a.b.c.ch1.StaticTest.ii
		System.out.println("a.b.c.ch1.StaticTest.ii >>> : " + a.b.c.ch1.StaticTest.ii);
		System.out.println("StaticTest.ii >>> : " + StaticTest.ii);
		System.out.println("ii >>> : " + ii);

		// ����� ȣ���ϴ� ��� 
		System.out.println("StaticTest.BIZ_GUBUN_MEMBER >>> : " 
								+ StaticTest.BIZ_GUBUN_MEMBER);
	}// end of main() function
} //end of StaticTest class
