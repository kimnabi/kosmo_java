package a.b.c.ch2;

public class CharTest_1 {
	
	public static void main(String[] args) 
	{
		String s = ""; // s�� String �ڷ��� �� ������ ����
		System.out.println("s >>> : " + s); //������ ������ �ּҰ�
		// public int length()
		// Returns the length of this string.
		System.out.println("s.length() >>> : " + s.length()); //���ڿ��Ǳ��̸� int �����Ϲ޾� �ֿܼ� ����Ѵ� 
		
		/*char sChar = s.charAt(0);
		System.out.println("sChar >>> : " + sChar);
		C:\00.KOSMO129\10.JExam\ch2>java a.b.c.ch2.CharTest_1
		s >>> :
		s.length() >>> : 0
		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 0
        at java.lang.String.charAt(String.java:658)
        at a.b.c.ch2.CharTest_1.main(CharTest_1.java:11) */

		// char �� �⺻ ��, default value 		
		char mv_1 = 0; // �ƽ�Ű�ڵ�� 10���� 0�� ���ڵ��� ���鹮��
		char mv_2 = ' ';//���� ���� 
		/* char mv_3 = '';
		C:\00.KOSMO129\10.JExam\ch2>javac -d . CharTest_1.java
		CharTest_1.java:23: error: empty character literal
                char mv_3 = '';
                            ^
		CharTest_1.java:23: error: unclosed character literal
                char mv_3 = '';
                             ^
		CharTest_1.java:23: error: ';' expected
                char mv_3 = ''; */
		char mv_3 = '\u0000'; // �����ڵ�� ���� ���ڵ��� ���鹮�� ǥ��
		System.out.println("mv_1 >>> : " + mv_1);
		System.out.println("mv_2 >>> : " + mv_2);
		System.out.println("mv_3 >>> : " + mv_3);		

		// public static final char MAX_VALUE = 65535
		// public static final char MAX_VALUE = '\uFFFF'
		// public static final char MIN_VALUE = 0
		// public static final char MIN_VALUE = '\u0000'
	}// end of main function
} // end of CharTest_1 class
