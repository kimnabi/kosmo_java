package a.b.c.ch3;

public class IfTest_3 {

	

	public static void main(String args[]) {

		// java.lang.String equals() �Լ� ���ڿ��� ���ϴ� �Լ� 
		
		// == : ������, ������� 
		//	  : ���ڸ� ���ϴ� ������ 
		//		����� true false ���� 		
		System.out.println("+ 16���� >>> : 0x" + Integer.toHexString('+'));
		System.out.println("- 16���� >>> : 0x" + Integer.toHexString('-'));
		System.out.println("* 16���� >>> : 0x" + Integer.toHexString('*'));
		System.out.println("/ 16���� >>> : 0x" + Integer.toHexString('/'));

		boolean b1 = '+' == 0x2b;
		System.out.println("b1 >>> : " + b1);
		// if (b1)
		if ('+' == 0x2b)
		{
			System.out.println( 1 + 2 );
		}
		
		char c = '+';
		boolean b2 = c == 0x2b;
		System.out.println("b2 >>> : " + b2);
		if (c == 0x2B)
		{
			System.out.println( 1 + 2 );
		}
		
		String s = "+";
		// public char charAt(int index)
		char cS = s.charAt(0); // ���ڿ�s ���� '+'
		boolean b3 = cS == 0x2b;
		System.out.println("b3 >>> : " + b3);
		if (cS == 0x2b)
		{
			//System.out.println( 1 + 2 );
			System.out.printf("1 + 2 = %d �Դϴ�.%n",1 + 2);
		} //end of if
		
		//����
		String s1 = "-";
		// public char charAt(int index)
		char cS_1 = s1.charAt(0); // ���ڿ��迭 "-"�� 0��° index�� ���ڸ� ��ȯ�Ѵ� 
		//char ���� '-' �� �ƽ�Ű�ڵ� 16���� 0x2d(0x2B)
		//char cS_1 ('-') �� 16���� 0x2d ���ٴ� ����
		// �������� boolean �� b4 �� cS_1 == 0x2d ������ ������� �����Ѵ�
		boolean b4 = cS_1 == 0x2d; 
		// �ֿܼ� b4�� ȣ���Ͽ� ����Ѵ�
		System.out.println("b4 >>> : " + b4);
		if (b4)
		{
			// �ֿܼ� ���ͷ� ���� 1 - 2 �� ȣ���Ͽ� ����Ѵ�
			//System.out.println(1 - 2);
			System.out.printf("1 - 2 = %d �Դϴ�.%n",1 - 2);
		} //end of if
		//���ϱ�
		String s2 = "*";
		// public char charAt(int index)
		char cS_2 = s2.charAt(0); // ���ڿ��迭 "-"�� 0��° index�� ���ڸ� ��ȯ�Ѵ� 
		//char ���� '*' �� �ƽ�Ű�ڵ� 16���� 0x2a(0x2A)
		//char cS_2 ('*') �� 16���� 0x2d ���ٴ� ����
		// �������� boolean �� b5 �� cS_2 == 0x2a ������ ������� �����Ѵ�
		boolean b5 = cS_2 == 0x2a; 
		if(b5)
		{
			// �ֿܼ� ���ͷ� ���� 1 * 2�� ȣ���Ͽ� ����Ѵ�
			//System.out.println(1 * 2);
			System.out.printf("1 * 2 = %d �Դϴ�.%n",1 * 2);
		}// end if
		//������
		String s3 = "/";
		// public char charAt(int index)
		char cS_3 = s3.charAt(0); // ���ڿ��迭 "-"�� 0��° index�� ���ڸ� ��ȯ�Ѵ� 
		//char ���� '/' �� �ƽ�Ű�ڵ� 16���� 0x2f(0x2F)
		//char cS_3 ('/') �� 16���� 0x2d ���ٴ� ����
		// �������� boolean �� b6 �� cS_3 == 0x2f ������ ������� �����Ѵ�
		boolean b6 = cS_3 == 0x2f; 
		// 
		if(b6)
		{
			// �ֿܼ� ���ͷ� ���� 1 / 2�� ȣ���Ͽ� ����Ѵ�
			//System.out.println(1 / 2);
			System.out.printf("1 / 2 = %d �Դϴ�.%n",1 / 2);
		}// end if 
	
	} //end of main
} //end of IfTest_3 class