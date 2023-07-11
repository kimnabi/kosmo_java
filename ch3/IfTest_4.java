package a.b.c.ch3;
	//����� �μ� 
	//String args[] ={"54321","111","222"}
	//��Ÿ�ӽ� ���ڸ� ������ java.lang.ArrayIndexOutOfBoundsException: 0 ����ó���� �߻��ȴ�
	// ���α׷��Ӱ� ���� �����Ͽ� ���� �� �ִ� ó�������� ���� VS ����
	/*c:\kosmo\ch3>java a.b.c.ch3.IfTest_4
	main() �Լ� ���� >>> :
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at a.b.c.ch3.IfTest_4.main(IfTest_4.java:8) */
public class IfTest_4 {
	public static void main(String[] args) {
		System.out.println("main() �Լ� ���� >>> : ");
		
		/*c:\kosmo\ch3>java a.b.c.ch3.IfTest_4 32 12 123
		main() �Լ� ���� >>> :
		main() �Լ� >>> : 32
		main() �Լ� >>> : 12
		main() �Լ� >>> : 123 */
		System.out.println("main() �Լ� >>> : " + args[0]);
		System.out.println("main() �Լ� >>> : " + args[1]);
		System.out.println("main() �Լ� >>> : " + args[2]);

		String s0 = args[0];
		String s1 = args[1];
		String s2 = args[2];

		System.out.println("s0 >>> : " + s0);
		System.out.println("s1 >>> : " + s1);
		System.out.println("s2 >>> : " + s2);
		
		char s0C = s0.charAt(0); // char charAt(0) ���ڿ����� char �� (�Ѱ��ǹ���)�� �����Ѵ�
		System.out.println("s0 charAt(0) >>> : " + s0C);
		System.out.println("s0 charAt(0) >>> : " + (int)s0C);
				
		System.out.println("s1 >>> : " + (int) s1.charAt(0)); //�ƽ�Ű�ڵ�
		System.out.println(String.valueOf(s1));
	} //end of main
} //end of IfTest_4 class
