package a.b.c.ch6;

/*

����ó�� ����
------------------------
try {} catch() {} finally {} ���� : ���� ó���ϱ� : ������ �߻��ص� ����ó���ؼ� ���α׷��� ���� �����ϱ� 
throws Ű���� : ���� ó�� �̷�� : ȣ���� �Լ��� ���� ������ : �ܼ� ���ø����̼ǿ����� main() �Լ����� ���� ó���ϱ� 
throw Ű���� : ����� ���� ���� : �����ڰ� ���� Ŭ���� ���� ����� 

Exception : ���� Ŭ������ �ֻ��� Ŭ���� 
	Checked Exception					UnChecked Exception
	-----------------------				-----------------------
	������ �� �� 							������ ��
	�ݵ�� ���� ó���� �ؾ� �Ѵ�. 				��������� ���� �ʾƵ� �ȴ�.
	���� �߻��� �ѹ��� ���� ����					���� �߻��� �ѹ��� �ؾ� �Ѵ�.
	IOException							NullPointerException
	ClassNotFoundException etc. 		ClassCastException  etc.
	 
*/

public class ExceptionTest_5 {
	//
	public ExceptionTest_5 () {
		System.out.println("ExceptionTest_5 ()  ������ >>> : ");
	}	

	// �����ڰ� �ڵ�� ������ ���� main() �Լ��� ���������� �����̴�.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("main() �Լ� ����  >>> : ");
		
		try {
			throw new Exception("���� �޽��� <<<>>> : ");	//�����ڰ� ��Ÿ�� �� ��������� ����ó�� ������ ��� �Լ� �� ������ ����ȴ�
		}catch(Exception e) {
			//������ ����ó���������� �ַܼ� ����Ѵ�
			System.out.println("e >>> : " + e);
			System.out.println("e.getMessage() >>> : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("main() �Լ� �� >>> : ");
	}

}
/*
main() �Լ� ����  >>> : 
e >>> : java.lang.Exception: ���� �޽��� <<<>>> : 
e.getMessage() >>> : ���� �޽��� <<<>>> : 
java.lang.Exception: ���� �޽��� <<<>>> : 
main() �Լ� �� >>> : 
	at a.b.c.ch6.ExceptionTest_5.main(ExceptionTest_5.java:34) */