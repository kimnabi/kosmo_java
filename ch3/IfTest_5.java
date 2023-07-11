package a.b.c.ch3;

public class IfTest_5 {

	public static void main(String[] args) {

		// java.lang.String 
		// public boolean equals(Object anObject)
		// ���ڿ� ���ϴ� �Լ�

		String s0 =  /*new String(*/"abc"/*)*/; // => ���Ǯ�� ������
		String s1 = "abc";
		String s2 = new String("abc"); //��������� new Ű���带 ���� String("abc") �ν��Ͻ� ���� �ϰ� 
		//s2 ���������� �� �ν��Ͻ��� �ּҰ� �����Ͽ� ���� �Ѵ�
		String s3 = new String("abc"); //��������� new Ű���带 ���� �Ǵٸ� String("abc") �ν��Ͻ� ���� �ϰ� 
		//s2 ���������� �� �ν��Ͻ��� �ּҰ� �����Ͽ� ���� �Ѵ�
		// s0 ���������� ȣ���Ͽ� �ֿܼ� ����Ѵ� -- s0�� ���Ǯ�� �ִ� �ؽ� �ּҰ��� ������ 
		System.out.println("s0 >>>: " + s0 + " :: " + System.identityHashCode(s0));
		// s1 ���������� ȣ���Ͽ� �ֿܼ� ����Ѵ� -- s1�� ���Ǯ�� �ִ� �ؽ� �ּҰ��� �����Ѵ� 
		System.out.println("s1 >>>: " + s1 + " :: " + System.identityHashCode(s1));
		// s2 ���������� ȣ���Ͽ� �ֿܼ� ����Ѵ� -- s2�� �޸𸮿� �ö�� �ν��Ͻ� �ؽ� �ּҰ��� ������ 
		System.out.println("s2 >>> : " + s2 + " :: " + System.identityHashCode(s2));
		// s3 ���������� ȣ���Ͽ� �ֿܼ� ����Ѵ� -- s3�� �޸𸮿� �ö�� �Ǵٸ� �ν��Ͻ� �ؽ� �ּҰ��� ������ 
		System.out.println("s3 >>> : " + s3 + " :: " + System.identityHashCode(s3));
		
		boolean b0 = s0 == s1; //s0 ���������� s1 ���������� �ּҰ��� ��
		System.out.println("b0 >>> : " + b0); // true

		boolean b1 = s0.equals(s1); //s0 �� ���ڿ� �� s1 ���ڿ� �� ��
		System.out.println("b1 >>> : " + b1); // true

		boolean b2 = s2 == s3; //s2 ���������� s3 ���������� �ּҰ��� ��
		System.out.println("b2 >>> : " + b2); // false

		boolean b3 = s2.equals(s3);  //s2 �� ���ڿ� �� s3 ���ڿ� �� ��
		System.out.println("b3 >>> : " + b3); // true
		
		boolean b4 = s0 == s3; //s0 ���������� s3 ���������� �ּҰ��� ��
		System.out.println("b3 >>> : " + b4); // false
		
		boolean b5 = s0.equals(s3);  //s0 �� ���ڿ� �� s3 ���ڿ� �� ��
		System.out.println("b3 >>> : " + b5); // true
		
	}// end of main
}//end of IfTest_5 class
