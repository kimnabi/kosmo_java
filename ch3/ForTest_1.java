package a.b.c.ch3;

public class ForTest_1 {
	public static void main(String[] args) {
		// �������� int �� i �� ���ͷ� 0�� �����Ͽ� ����
		// i ���� 6�̻��϶����� i = i + 1 ��ŭ ���� �Ҷ�����
		// i ���� + " " ���ڿ� �� ȣ���Ͽ� �ֿܼ� ����Ѵ� 
		for (int i= 0; i <= 6; i++ )
		{
			System.out.print(i + " ");
		} //end for	
		System.out.println();
		
		// �������� int �� i �� ���ͷ� 6�� �����Ͽ� ����
		// i ���� 0�����϶����� i = i - 1 ��ŭ ���� �Ҷ�����
		// i ���� + " " ���ڿ� �� ȣ���Ͽ� �ֿܼ� ����Ѵ� 
		for (int i=6; i >= 0; i-- )
		{
			System.out.print(i + " ");
		} //end for	
		System.out.println();
		for (int i=2; i <= 10; i += 2 )
		{
			System.out.print(i + " ");
		} //end for
	} // end of main function
} //end of ForTest_1 class
