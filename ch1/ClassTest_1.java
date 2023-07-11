package a.b.c.ch1;

public class ClassTest_1 {
	
	// ������ �����ϴ� ����
	
	// ��� Constant 
	public static final String BIZ_GUBUN_M = "M"; // ȸ�� �Խ��� 
	public static final String BIZ_GUBUN_B = "B"; // �Ϲ� �Խ��� 
	
	// ����ƽ ���� 
	static int static_val = 120;
	
	// ��� ���� 
	// ��� ������ �ʱ�ȭ �ؼ� ������� �ʴ´�. ���� �������� �ʴ´�.
	// �� Ŭ������ �ִ� ��Ű�� �ȿ��� ������ �ҷ��� ����� �� �ִ�.
	int member_val;

	// ���� ���� 
	// ������ �ҷ��� ����� �����ϴ�.
	public int global_val;

	// �����̺� ����
	// Ŭ���� ���ο����� ����� �� �ִ� ���� 
	private int encapsulation_val; 	
	
	public static void main(String[] args) 
	{
		//1.���
		System.out.println("��� >>> : " + ClassTest_1.BIZ_GUBUN_M);
		//2. ����ƽ ���� 
		System.out.println("����ƽ ���� >>> : " + ClassTest_1.static_val);
		// 3, 4, 5 ������ Ŭ������ �޸𸮿� �÷��� ������ �޸𸮿� �ø���.
		//�ش� ���������� �̿��Ͽ� ����Ѵ�
		ClassTest_1 ct = new ClassTest_1();
		System.out.println("�ɹ� ���� >>> : " + ct.menber_val);
		System.out.println("���� ���� >>> : " + ct.global_val);
		System.out.println("�����̺� ���� >>> : " + ct.encapsulation_val);
		
	} //end of main function
} //end of ClassTest_1
