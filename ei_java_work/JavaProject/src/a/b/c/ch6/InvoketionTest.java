package a.b.c.ch6;

public class InvoketionTest {
	
	//�⺻ ������
	public InvoketionTest() {
		// TODO Auto-generated constructor stub
		System.out.println("�⺻ ������ InvoketionTest() >>>");
	}
	
	public void aM() {
		System.out.println("	aM() >>>");
		
	}//end of aM()
	public void bM() {
		System.out.println("	bM() >>>");
		
	}//end of bM()
	// main() �Լ� : �ڹ� Console Application �������̴�.
	// �����ڰ� �ڵ�� ������ ���� main() �Լ��� ���������� �����̴�.
	// ClassLoader Ŭ������ init() �Լ��� main() �Լ��� �ڵ����� ��ŷ�ȴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoketionTest it = new InvoketionTest();	// new Ű���� ����ؿ� InvoketionTest() �ν��Ͻ� �ϰ� �ּҰ� ��  InvoketionTest Ÿ�� it ���������� ��´�
		System.out.println("it ���� ���� >>> : " + it); //  it ���� ���� >>> : a.b.c.ch6.InvoketionTest@15db9742
		new InvoketionTest(); // new Ű���� ����ؿ� InvoketionTest() �ν��Ͻ� �ϰ� �ּҰ� ��this�� ��´�	
		System.out.println("-----------------------------"); //  it ���� ���� >>> : a.b.c.ch6.InvoketionTest@15db9742
		System.out.println(" ���� ���� >>> : " + it); //  a.b.c.ch6.InvoketionTest@15db9742
		
	}

}
