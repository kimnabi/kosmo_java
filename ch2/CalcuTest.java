package a.b.c.ch3;

public class CalcuTest {

	public int addSum(int x, int y) {
		System.out.println(" addSum(x,y) �Լ� ���� >>> : ");
		System.out.println(" addSum(x,y)  >>> : " +(x+y));
		System.out.println(" addSum(x,y) �Լ� �� >>> : " );
		return x+y; 
	} //end of addSum

	// main() �Լ��� �ܼ� ������ ���������� �����̴�. 
	public static void main(String[] args) {
		 // main �Լ� ����� �ҷ����� �ƱԸ�Ʈ�� ���ڰ� 2�� �̻��� �ȵǸ�
		 // ��ť��Ʈ�� ���� ���Ҷ� java.lang.ArrayIndexOutOfBoundsException ���������� ����
		 // main �Լ��� �ƹ� �б���� ����ȴ�

		if (args.length == 2) {
		
			System.out.println("main() 1111 main() �Լ� ���� >>> : ");
			int i = Integer.parseInt(args[0]);
			int ii = Integer.parseInt(args[1]);
			
			// �������� �ʱ�ȭ ���� int �ڷ��� 
			int a = 10;
			int b = 16;
		   /*
			C:\00.KOSMO129\10.JExam\ch2>java a.b.c.ch3.CalcuTest
			main() 1111 main() �Լ� ���� >>> :
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
			at a.b.c.ch3.CalcuTest.main(CalcuTest.java:13) */
			//int ii = args[1];

			// CalcuTest Ŭ������ �ִ� �ڿ��� ����Ϸ��� CalcuTest Ŭ������
			// �������� ct �� �ν��Ͻ� 
			CalcuTest ct = new CalcuTest();
			// ct ���������� addSum �Լ� ȣ�� 
			System.out.println("main() 3333 ct �������� �� addSum() �Լ� ȣ��  >>> : ");
			//int sum = ct.addSum(i ,ii);
			int sum = ct.addSum(a,b);
			System.out.println("main() 4444 sum >>> : "+ sum);
			System.out.println("main() 5555 main() �Լ� �� >>> : ");
		}// end of if
	} //end of main() function
} //end of CalcuTest class

