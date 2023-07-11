package a.b.c.ch3;
import org.apache.log4j.*;
// �ܼ� ���ø����̼����� ��Ģ���� ���α׷� ����� 
// �����ʹ� ���� �� ���
// ����� �����Լ����� �ֿܼ� ����ϱ� 
public class CalcuTest_1 {
	
	static Logger logger = Logger.getLogger(CalcuTest_1.class);
	// ��������� Ŭ���� CalcuTest_1�� �ν��Ͻ� �ϱ����� ȣ��ɶ�
	// �ѹ� ȣ��Ǿ����� �ɹ����� �ʱ�ȭ �Ѵ�
	// �����ڰ� ��������� �����ڸ� �����ȵɶ� �Ű����� ���� �⺻ ������ �����
	//
	public CalcuTest_1() {
		logger.trace("������ CalcuTest_1() �Լ� ���� >>> : ");	
		logger.info("������ CalcuTest_1() �Լ� �� >>> : ");	
		
		//System.out.println(" ������ CalcuTest_1() �Լ� ���� >>> : ");
		//System.out.println(" ������ CalcuTest_1() �Լ� �� >>> : ");
	}// end of constructor 
	// ���ϱ� �Լ�
	public int addCalcu(int x, int y) {
		System.out.println(" addCalcu(x,y) �Լ� ���� >>> : ");
		System.out.println(" addCalcu(x,y)  >>> : " +x +" : "+ y);
		System.out.println(" addCalcu(x,y) �Լ� �� >>> : " );
		return x + y;
	} // end of addCalcu function

	// ���� �Լ�
	// ���������� ����ؾ� �ϴ� �Լ�
	// �Ķ���Ͱ� ���� int x, y
	// ���� ���� int ��
	public int subCalcu(int x, int y) {
		System.out.println(" subCalcu(x,y) �Լ� ���� >>> : ");
		System.out.println(" subCalcu(x,y)  >>> : �Ķ����" +x +" : "+ y);
		System.out.println(" subCalcu(x,y) �Լ� �� >>> : " );
		//���� ���� ����� �Լ������� ���� �Ѵ�
		return x - y;
	} // end of subCalcu function


	// ���ϱ� �Լ�
	// ���������� ����ؾ� �ϴ� �Լ�
	// �Ķ���Ͱ� ���� int x, y
	// ���� ���� int ��
	public int mulCalcu(int x, int y) {
		System.out.println(" mulCalcu(x,y) �Լ� ���� >>> : ");
		System.out.println(" mulCalcu(x,y)  >>> : �Ķ����" +x +" : "+ y);
		System.out.println(" mulCalcu(x,y) �Լ� �� >>> : " );
		//���ϱ� ���� ����� �Լ������� �����Ѵ�
		return x * y;
	} // end of mulCalcu function

	// ������ �Լ�
	// ���������� ����ؾ� �ϴ� �Լ�
	// �Ķ���Ͱ� ���� int x, y
	// ���� ���� int ��
	public int divCalcu(int x, int y) {
		System.out.println(" divCalcu(x,y) �Լ� ���� >>> : ");
		System.out.println(" divCalcu(x,y)  >>> : �Ķ����" +x+" : "+ y);
		System.out.println(" divCalcu(x,y) �Լ� �� >>> : " );
		// ������ ���� ����� �Լ������� �����Ѵ�
		return x / y;
	}// end of divCalcu function


	// main() �Լ��� �ܼ� ������ ���������� �����̴�. 
	public static void main(String args[]) {
		System.out.println(" main() �Լ� ���� >>> : ");
		// ���� ���� int �ڷ��� a ����
		// int �� ���ͷ� 10 ���Եȴ�
		int a = 10;
		// ���� ���� int �ڷ��� b ����
		// int �� ���ͷ� 20 ���Եȴ�
		int b = 20;
		//�������� ct �� CalcuTest_1 �ν��Ͻ� 
		CalcuTest_1 ct = new CalcuTest_1();
		// �� ���ο��� ������ CalcuTest_1 Ŭ������ ���������� ct .(dot) �����ڷ� ��ũ�ؼ� �Լ��̸��� ������ ����Ѵ� 
		// CalcuTest_1.addCalcu(a,b) �ƱԸ�Ʈ x,y�� �ո� �����Ѵ�
		// int �ڷ��� addResult ���������� �����ϰ� ���ϰ��� �����Ͽ� �ʱ�ȭ�Ѵ� 
		int addResult = ct.addCalcu(a,b);
		//CalcuTest_1.subCalcu(a,b) �ƱԸ�Ʈ x - y�� ����� �� �����Ѵ�
		// int �ڷ��� subResult ���������� �����ϰ� ���ϰ��� �����Ͽ� �ʱ�ȭ�Ѵ� 
		int subResult = ct.subCalcu(a,b);
		////CalcuTest_1.mulCalcu(a,b) �ƱԸ�Ʈ x * y�� ����� �� �����Ѵ�
		// int �ڷ��� mulResult ���������� �����ϰ� ���ϰ��� �����Ͽ� �ʱ�ȭ�Ѵ�
		int mulResult = ct.mulCalcu(a,b);
		//CalcuTest_1.divCalcu(a,b) �ƱԸ�Ʈ x / y�� ����� �� �����Ѵ�
		// int �ڷ��� divResult ���������� �����ϰ� ���ϰ��� �����Ͽ� �ʱ�ȭ�Ѵ�
		int divResult = ct.divCalcu(a,b);
		
		// �ֿܼ� println() �Լ��� �̿��ؼ� ����Ѵ�.
		System.out.println(" main() addResult ���ϱ� >>> : " + addResult);
		
		System.out.println(" main() subResult ���� >>> : " + subResult);
		
		System.out.println(" main() mulResult ���ϱ� >>> : " + mulResult);
		
		System.out.println(" main() divResult ������ >>> : " + divResult);

		System.out.println(" main() �Լ� �� >>> : ");
	}// end of main() function
}// end of CalcuTest_1 class
	/*C:\00.KOSMO129\10.JExam\ch3>java a.b.c.ch3.CalcuTest_1
		 main() �Լ� ���� >>> :
		 ������ CalcuTest_1() �Լ� ���� >>> :
		 ������ CalcuTest_1() �Լ� �� >>> :
		 addCalcu(x,y) �Լ� ���� >>> :
		 addCalcu(x,y)  >>> : 10 : 20
		 addCalcu(x,y) �Լ� �� >>> :
		 subCalcu(x,y) �Լ� ���� >>> :
		 subCalcu(x,y)  >>> : 10 : 20
		 subCalcu(x,y) �Լ� �� >>> :
		 mulCalcu(x,y) �Լ� ���� >>> :
		 mulCalcu(x,y)  >>> : 10 : 20
		 mulCalcu(x,y) �Լ� �� >>> :
		 divCalcu(x,y) �Լ� ���� >>> :
		 divCalcu(x,y)  >>> : 10 : 20
		 divCalcu(x,y) �Լ� �� >>> :
		 main() addResult ���ϱ� >>> : 30
		 main() subResult ���� >>> : -10
		 main() mulResult ���ϱ� >>> : 200
		 main() divResult ������ >>> : 0
		 main() �Լ� �� >>> : */