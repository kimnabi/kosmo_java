package a.b.c.ch4;
/** 
 * ȸ�� ������ �Է� �޾Ƽ� �ֿܼ� ��� �ϱ�
 * ȸ�� ���� : �̸�, �̸���, ��ȭ��ȣ, �ּ�
 * name "ȫ�Ѽ�"
 * email "hhs@naver.com"
 * hp  "01098750000"
 * addr "��⵵ ������ ������" 
 * */
public class TestMember1 {
	String name;       // ������� String Ÿ�� �������� ����
	String email;
	String hp;
	String addr;
	// �⺻ �Ű����� ���� ������
	public TestMember1() {
		
	} // end of TestMember2
	// �Ű����� �ִ� ������ �����ε� :�ν��Ͻ��� �ʱ�ȭ
	public TestMember1(String name,String email,String hp,String addr) {
		System.out.println("	TestMember1.name >>> : " +name);
		System.out.println("	TestMember1.email >>> : " +email);
		System.out.println("	TestMember1.hp >>> : " +hp);
		System.out.println("	TestMember1.addr >>> : " +addr);
				
		this.name = name; 	// this �� TestMember2 �ν��Ͻ� ����Ű�� �������� �μ�
		this.email = email; // ���� ��Ű������ TestMember2 ��������� ���ٿ����ڸ� ���� ȣ���Ͽ� 
		this.hp = hp;       // �������� �Ű������� ���ε��Ѵ�
		this.addr = addr;
	} //end of TestMember2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		// �̸� : �ѱ�
	    // �̸��� : ����
		// ��ȭ��ȣ : �ڵ��� ��ȣ
		// �ּ� : �õ�, �� �̸���
		//String Ÿ�� �������� s0 ��  ���ڿ� �迭�Ǳ��� 4�� �Ҵ��ϰ� ���ͷ� ���ڿ� 4���� �ʱ�ȭ�Ѵ�
		String s0[] = {"����ȯ","kij@naver.com","01100020000","����ñ�õ�� ���굿"};
		//String Ÿ�� �������� s1 �� ���ڿ� �迭�Ǳ��� 4�� �Ҵ��ϰ�  ���ͷ� ���ڿ� 4�� �� �ʱ�ȭ�Ѵ�
		String s1[] = {"ȫ�Ѽ�","hhs@naver.com","01098750000","��⵵ ������ ������"};
		// ��������� TestMember2 Ŭ���� �������� tm_0 �� ������ TestMember2Ŭ����  �ν��Ͻ� �ϰ�
		// �������� s0 ����Ű�� ��ü ���ڿ� ��ҵ��� ���� ȣ���Ͽ� TestMember2  �������� �Ű������鿡 ���ε� �Ѵ�
		TestMember1 tm_0 = new TestMember1(s0[0],s0[1],s0[2],s0[3]);
		
		System.out.println("main() :: tm_0.name >>>" +tm_0.name);
		System.out.println("main() :: tm_0.email >>>" +tm_0.email);
		System.out.println("main() :: tm_0.hp >>>" +tm_0.hp);
		System.out.println("main() :: tm_0.addr >>>" +tm_0.addr);
		
		// ��������� TestMember2 Ŭ���� �������� tm_1 �� ������ TestMember2Ŭ����  �ν��Ͻ� �ϰ�
		// �������� s1 ����Ű�� ���ڿ��ǹ迭 ������ ���� ȣ���Ͽ�TestMember2  �������� �Ű������鿡 ���ε� �Ѵ�
		TestMember1 tm_1 = new TestMember1(s1[0],s1[1],s1[2],s1[3]);

		System.out.println("main() :: tm_1.name >>>" +tm_1.name);
		System.out.println("main() :: tm_1.email >>>" +tm_1.email);
		System.out.println("main() :: tm_1.hp >>>" +tm_1.hp);
		System.out.println("main() :: tm_1.addr >>>" +tm_1.addr);
			
	}

}
