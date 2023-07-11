package a.b.c.ch1;

public class VarMaxMin {
	/*  1. int : �����ڷ��� ��Ʈ ���� ũ�Ⱑ 4byte(32bit) default value 0
			     int�� Wrapper class java.lang.Integer
			     java.lang.Intger MAX_VALUE ���(constant value)�� 
				 ��Ʈ �ƽ����� ����Ǿ� �ִ�.
				 ����� �������� �� �빮�ڸ� ����ϰ� �ռ�� ����Ϸ��� 
			     ������ھ ����Ѵ�.
				 public static final �ڷ��� ������ = ��;
		2. int_max : ������ identifier : ������ ù ��° ���ڴ� �ҹ��� �̴�.
		3. = : ���� ������
		4. Integer.MAX_VALUE : java.lang ��Ű���� �ִ� Integer Wrapper class �̴�.
							   MAX_VALUE : ��Ƽ�� Ŭ������ �ִ� ����̴�. 
			                   ���� �ڷ��� int�� MAX ���� �����ϰ� �ִ�. 
			                   MAX_VALUE �� ����� ���� 
							   Ŭ�����̸�.���(Integer.MAXVALUE) �� ����Ѵ�. 
			                   �̷��� ����ϸ� ��� �� 2147483647 �� 
			                   ���Եȴ�, �����Ѵ�, �ҷ��´�.... 
							   int int_max = Integer.MAX_VALUE;
							   int int_max = 2147483647;
							   �� �� ������ ���� �ǹ��̴�. */
	public static void main(String[] args) 
	{
		int int_max = Integer.MAX_VALUE;
		System.out.println(int_max);
		
		// 2147483647
		int i = 2147483647;
		System.out.println(i);
		// java.lang ��Ű���� �ִ� Integer Wrapper class �̴�.
		// MIN_VALUE : ��Ƽ�� Ŭ������ �ִ� ����� -2147483647 
		// ���� �ڷ��� int�� MIN ���� ���Եȴ�
		int int_min = Integer.MIN_VALUE;
		//java.lang ��Ű���� �ִ� System Ŭ������ �ִ� println �Լ����� int_min�� ȣ���Ѵ�
		System.out.println(int_min);

		// -2147483647
		int ii = -2147483647;
		//java.lang ��Ű���� �ִ� System Ŭ������ �ִ� println �Լ����� ii�� ȣ���Ѵ� 
		System.out.println(ii);
	}// end of main function
} // end of VarMaxMin class 
