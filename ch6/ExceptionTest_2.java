package a.b.c.ch6;

public class ExceptionTest_2 {
	// �⺻ ������
	public ExceptionTest_2 () {
		System.out.println("ExceptionTest_2 ()  ������ >>> : ");
	}
	
	public void aM() throws ArithmeticException {
		System.out.println("aM() �Լ�  >>> : ");				
		bM(); // bM() �Լ��� ȣ���Ѵ�(invoke).
	}

	public void bM() throws ArithmeticException {
		System.out.println("bM() �Լ�  >>> : ");				
		cM(); // cM() �Լ��� ȣ���Ѵ�(invoke).
	}
	
	public void cM() throws ArithmeticException{
		System.out.println("cM() �Լ�  >>> : ");		
		//������ �߻��Ǹ� ����ó���ؾ��Ѵ� :: throws, try catch ����
		//throws Ű���带 ���� ����ó���ϰ� ���� �ڵ� �����Ѵ�
		System.out.println( 1 / 0);	// java.lang.ArithmeticException ���� �߻�
		
		dM(); // dM() �Լ��� ȣ���Ѵ�(invoke).
	}
	
	public void dM() {		
		System.out.println("dM() �Լ�  >>> : ");		
	}

	// �����ڰ� �ڵ�� ������ ���� main() �Լ��� ���������� �����̴�.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("main() �Լ� ����  >>> : ");
		
		try {
			
			ExceptionTest_2 et = new ExceptionTest_2();	// new Ű���� ����ؿ� ExceptionTest_2() �ν��Ͻ� �ϰ� �ּҰ� ��  ExceptionTest_2 Ÿ�� it ���������� ��´�	
			et.aM(); // et �������� �� ExceptionTest_2() �ν��Ͻ� �����Ͽ� aM()�� ȣ���Ѵ�
					// ExceptionTest_2() �Ǹ޼��� ���� throws ����ó���Ѵٸ� ȣ���� �޼���(main)���� try catch���� ����Ѵ�
			
		}catch (ArithmeticException e) {
			System.out.println("e >>> : " + e);
		}
		
		System.out.println("main() �Լ� �� >>> : ");
	}


}
