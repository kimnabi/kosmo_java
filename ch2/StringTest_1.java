package a.b.c.ch2;

public class StringTest_1 {
	public static void main(String[] args) {
		//�������� String s �� ���ͷ� ���ڿ�
		//�ν��Ͻ� �ϴ� �������� �ƴ�
		String s = "";
		
		System.out.println("s >>> "+ s ); // ���� �״�� �ֿܼ� ���
		System.out.println("s.length() >>>" + s.length());//�� ���ڿ��Ǳ��̴� 0 �̴�
		//�ν��Ͻ��� �ϴ� ���������� ���ٴ� ���̴�
		// NullPointer
		String s1 = null;
		
		//System.out.println("s1 >>> "+ s1); 
		//System.out.println("s1.length() >>>" + s1.length()); //���� ������ �����Ƿ� s1���ڿ��� ���̴� �˼������� ��Ÿ�� ������ ����

		/*C:\00.KOSMO129\10.JExam\ch2>java a.b.c.ch2.StringTest_1
		s >>>
		s.length() >>>0
		s1 >>> null
		Exception in thread "main" java.lang.NullPointerException
        at a.b.c.ch2.StringTest_1.main(StringTest_1.java:14) */
		
		String s2 = null;
		//String s2 = "asd";
		//String �ڷ��� s2  �������� �� �ν��Ͻ� �ְų� ���ڿ��� ���̵� 0 �̻�
		if(s2 != null && s2.length() > 0) {
			System.out.println("s2 >>> "+ s2); 
		} // end of if  -->


	} // end of main function
} //end of StringTest_1 class
