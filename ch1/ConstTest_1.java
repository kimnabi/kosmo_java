package a.b.c.ch1;

public class ConstTest_1 {
	
	// �ɹ����� ����
	int i; // int �ڷ��� i �� �ν��Ͻ� ��  0 ����Ʈ ������ ������
	String s; // String �ڷ����� �ν��Ͻ� �� null ����Ʈ������ ����
	// �⺻ �������� �ڵ尡 ������� �ʾҴ�
	/*
	public ConstTest_1() {
		System.out.println("ConstTest_1() ������ ���� >>> : ");
	}
	*/
	// �ڹ� ��ö�ӽ��� �⺻ �����ڸ� ����� �ش�
	public static void main(String[] args) 
	{
		System.out.println("main() �Լ� ���� >>> : ");

		ConstTest_1 ct_1 = new ConstTest_1(); // �⺻������ ConstTest_1() ã�Ƽ� �ν��Ͻ��� ����� �ش�
		System.out.println("cj_1 �������� >>> : " + ct_1);
		System.out.println("cj_1.i >>> : " + ct_1.i);
		System.out.println("cj_1.s >>> : " + ct_1.s);
	} //end of main() function
} // end of ConstTest_1 class
