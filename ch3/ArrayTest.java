package a.b.c.ch3;
	/** 
	int �� ������ Ÿ���� �� ���� 3���� ������ּ��� 
	*/
public class ArrayTest {
	public static void main(String[] args) {
		// int �� �迭 ���� �� �ν��Ͻ� 
		int[] i = new int[3];
		//int[] i = new int[]; //�迭��ũ�⸦ ��������������  ���� �߻�
		/*C:\00.KOSMO129\10.JExam\ch3>javac -d . ArrayTest.java
		ArrayTest.java:8: error: array dimension missing
                int[] i = new int[];
                                   ^
		1 error */
		System.out.println("i �������� >>> : "+ i);
		/*C:\00.KOSMO129\10.JExam\ch3>java a.b.c.ch3.ArrayTest
		i �������� >>> : [I@15db9742 */
		//�Ϲݺ��� int �� i_0 ����
		// int �� ����Ÿ �� ����Ű�� ���� ���� i 
		int i_0 = i[0];
		System.out.println("i_0 >>> : " + i_0);
		int i_1 = i[1];
		System.out.println("i_1 >>> : " + i_1);
		int i_2 = i[2];
		System.out.println("i_2 >>> : " + i_2);
	} // end of main function
} //end of ArrayTest class
