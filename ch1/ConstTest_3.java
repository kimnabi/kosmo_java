package a.b.c.ch1;

public class ConstTest_3 {
	// ConstTest_3 �� �ɹ� ���� 
	// �ν��Ͻ� �Ҷ� int �ڷ����� ����Ʈ���� ���� �Ѵ�
	// �ν��Ͻ� �Ҷ� String �ڷ����� ����Ʈ���� ���� �Ѵ�
	int i;
	String s;

	// �⺻ ������ 
	// �����ڰ� �ڵ带 ����� �� 
	// ������ �����ε�
	public ConstTest_3() {
		System.out.println("ConstTest_3() ������ ���� >>> : ");
		//�����ڰ� �ν��Ͻ� �Ҷ� ConstTest_3 �� ������� i �� s �� ����Ʈ������ �����Ѵ�
	}

	public ConstTest_3(int i) {
		System.out.println("ConstTest_3(int i) ������ ���� >>> ");
		// �Ű����� int �ڷ��� i �����ϰ� �ƱԸ�Ʈ ���ͷ� i�� �޴� ������ �Լ� �̴�
		// �����ڰ� �ν��Ͻ� �Ҷ� ConstTest_3 �� �ƱԸ�Ʈ i�� �ɹ� ���� int i�� �ʱ�ȭ �Ҽ� �ִ�
		 this.i  =  i ;
		// �ɹ����� String �ڷ��� s�� ���ε��Ǵ� �ƱԸ�Ʈ�� �����Ƿ� ����Ʈ ������ �����Ѵ�
		System.out.println("ConstTest_3(int i) �Ű����� >>> : " + i);
	}

	public ConstTest_3(String s) {
		System.out.println("ConstTest_3(String s) ������ ���� >>> : ");
		//�Ű����� String �ڷ��� s �����ϰ� �ƱԸ�Ʈ ���ڿ� s�� �޴� ������ �Լ� �̴�
		System.out.println("ConstTest_3(String s) ������ �Ű����� >>> : " + s);
	}

	public ConstTest_3(int i, String s) {
		System.out.println("ConstTest_3(int i, String s) ������ ���� >>> : ");
		//�Ű����� int �ڷ��� i, String �ڷ��� s�� �����ϰ� �ƱԸ�Ʈ ���ͷ� i , ���ڿ� s�� �޴� ������ �Լ� �̴�
		System.out.println("ConstTest_3(int i, String s) ������ �Ű����� >>> : " + i);
		System.out.println("ConstTest_3(int i, String s) ������ �Ű����� >>> : " + s);
	}

	public ConstTest_3(String s, int i) {
		System.out.println("ConstTest_3(String s, int i) ������ ���� >>> : ");
		System.out.println("ConstTest_3(String s, int i) ������ �Ű�����>>> : " + i);
		System.out.println("ConstTest_3(String s, int i) ������ �Ű����� >>> : " + s);
	}


	public static void main(String args[]) {

		System.out.println("main() �Լ� ���� >>> : ");
		
		ConstTest_3 ct_3 = new ConstTest_3();
		System.out.println("ct_3 �������� >>> : " + ct_3);
		System.out.println("ct_3.i >>> : " + ct_3.i);
		System.out.println("ct_3.s >>> : " + ct_3.s);

		ConstTest_3 ct_3_1 = new ConstTest_3(25);
		System.out.println("ct_3_1 �������� >>> : " + ct_3_1);
		System.out.println("ct_3_1.i >>> : " + ct_3_1.i);
		System.out.println("ct_3_1.s >>> : " + ct_3_1.s);
		ConstTest_3 ct_3_2 = new ConstTest_3("������");
		ConstTest_3 ct_3_3 = new ConstTest_3(28, "������");
		ConstTest_3 ct_3_4 = new ConstTest_3("�鿬��", 28);

	} // end of main() function

} // end of ConstTest_3 class