package a.b.c.ch4;

public class E_interfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �θ� Ŭ������ �������̽� Ŭ���� ����
		// 2. ���� ���� ����
		// 3. = ���� ������
		// 4. new �ν��Ͻ� Ű����(������) ����
		// 5. �θ� �������̽��� ����� �ڽ� Ŭ���� ������ ���� 
		E_interface ei = new E_interfaceImpl();
		 ei.e_interfaceMethod();
		// �θ�Ŭ���� �������� ����ȯ�ؼ� �ڽ�Ŭ���� �ڿ� ����ϱ�
		E_interfaceImpl eii = (E_interfaceImpl)ei;
			eii.eM();
			
			// �ڽ�Ŭ���� �ν��Ͻ��ؼ� �ڽ�Ŭ���� �ڿ�����ϱ� 
			E_interfaceImpl ei_1 = new E_interfaceImpl();
			ei_1.eM();
	}

}
