package a.b.c.ch3;
public class ForTest {
	public static void main(String[] args) 
	{
	/*
			1. for �� �⺻������ ������ ���� ����Ǿ� �ִ�.
			2. ���ǽ��� true �� �� �� for ���� ���� �ȴ�.

		for ( �ʱ�ȭ; ���ǽ�; ������ )
		{
			System.out.println(">>> : ");
			
		}
		*/

		/*
		for (; ; )
		{
			System.out.println(">>> : ");
			
		}
		*/

		/*
		for (; true; )
		{
			System.out.println(">>> : ");
		}
		*/
		//���ѷ���
		/*for (; false; ) {
			System.out.println(">>> : ");
		} */
		for (int i = 0; i< 10; i++){
			System.out.println(">>> : " + i); 
		}// end for int i
	}
} //end of ForTest class
