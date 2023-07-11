package a.b.c.ch2;

public class StringTest {
	public static void main(String[] args) {
		// String : ��Ʈ�� Ŭ���� java.lang.String
		// s �� �������� �̸� �������� �̴�
		String s = "abc";
		// �� ���ο��� ������ String Ŭ������ �������� s �� ȣ���ؼ� 
		// �ֿܼ� println() �Լ��� �̿��ؼ� ����Ѵ�. 
		System.out.println(s);
		// �� ���ο��� ������ String Ŭ������ �������� s �� ȣ���ؼ� 
		// �ֿܼ� printf() �Լ��� %s ���� ������ �̿��ؼ� ����Ѵ�.
		System.out.printf("%s", s);

		int sLen = s.length();
		System.out.println("s.length() >>> : " + sLen);
		//���ڿ����� index ������ ���ڸ� �����ϴ� �Լ� charAt(int index)
		char s_0 = s.charAt(0); // "abc"���� 'a' ��ȯ �Ѵ�
		char s_1 = s.charAt(1); // "abc"���� 'b' ��ȯ �Ѵ�
		char s_2 = s.charAt(2); // "abc"���� 'c' ��ȯ �Ѵ�

		System.out.println("char s_0 >>> : " + s_0);
		System.out.println("char s_1 >>> : " + s_1);
		System.out.println("char s_2 >>> : " + s_2);

		String ss = "  abc      ";
		System.out.println("s >>> : "+ ss);
		int ssLen = ss.length();
		System.out.println("slen >>> " + ssLen);
		
		String s1 = "abc";
		System.out.println("s1 >>> : " + s1);
		int s1Len = s1.length();
		System.out.println("s1Len >>> : " + s1Len);
		//c_0 c_1 c_2 �� 16������ �ֿܼ� ����Ͻÿ�
		char c_0 = s1.charAt(0); // ���ڿ� "abc" ����  index 0 ��ġ�� 'a'�� ��ȯ �ȴ�
		// public static String toHexString(int i)
		// return String toHexString(int i) �Ű������� int �ڷ��� i �� �޾� Int ���� 16���� ���ڰ� ��ȯ�Ǿ� ���� �ȴ�
		System.out.println("16���� c_0 >>> : 0x" + Integer.toHexString(c_0));
		char c_1 = s1.charAt(1);  // ���ڿ� "abc" ����  index 1 ��ġ�� 'b'�� ��ȯ �ȴ�
		System.out.println("16���� c_1 >>> : 0x" + Integer.toHexString(c_1));
		char c_2 = s1.charAt(2);  // ���ڿ� "abc" ����  index 2 ��ġ�� 'c'�� ��ȯ �ȴ�
		System.out.println("16���� c_2 >>> : 0x" + Integer.toHexString(c_2));
	}// end of main function
}// end of StringTest class

