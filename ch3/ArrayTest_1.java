package a.b.c.ch3;
	/** 
	int �� ������ Ÿ���� �� ���� 3���� ������ּ��� 
	*/
public class ArrayTest_1 {
	public static void main(String[] args) {
		// int �� �迭 ���� �� �ν��Ͻ� 
		int[] i = new int[3];
	
		System.out.println("i �������� >>> : "+ i);
		/*C:\00.KOSMO129\10.JExam\ch3>java a.b.c.ch3.ArrayTest
		i �������� >>> : [I@15db9742 */
		//�Ϲݺ��� int �� i_0 ����
		// int �� ����Ÿ �� ����Ű�� ���� ���� i 
		int []i = i[0];
		System.out.println("i[0] >>> : " + i[0]);
		i[0] = 100;
		System.out.println("i[0] >>> : " + i[0]);
		i[0] = 1000;
		System.out.println("i[0] >>> : " + i[0]);
		
		System.out.println("i[1] >>> : " + i[1]);
		i[1] = 200;
		System.out.println("i[1] >>> : " + i[1]);
		i[1] = 2000;
		System.out.println("i[1] >>> : " + i[1]);

		System.out.println("i[2] >>> : " + i[2]);
		i[2] = 300;
		System.out.println("i[2] >>> : " + i[2]);
		i[2] = 3000;
		System.out.println("i[2] >>> : " + i[2]);
	
	} // end of main function
} //end of ArrayTest class