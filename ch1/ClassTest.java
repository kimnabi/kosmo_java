package a.b.c.ch1;
public class ClassTest {

	// i : �ɹ�����
	// ClassTest �� �ȿ��� ��� ����Ҽ��ִ�

	static int i = 10;
	
	public static int aMethod() {
		// i : ��������
		// �Լ��ȿ��� ������ ���� �� ���������� �θ���
		// ���������� �Լ��ȿ��� �¾�� �Լ� �ȿ��� �״´�
		// ���������� �Լ������� ������ ����
		// ���������� �Լ� ������ �������� return Ű���带 �̿��ؾ� �Ѵ�
		int i = 100;
		return i;
	} //end of aMethod function

	public static void main(String[] args) {

		// i : ��������
		// i �� main() �Լ� ������ ���� ���� ����.
		// void Ű����� ���ϰ��� ���ٴ� ���̴�. 
		int i = 1;
		System.out.println(i);
		System.out.println(ClassTest.i);
		System.out.println(ClassTest.aMethod());
	} // end of main function
} //end of ClassTest
