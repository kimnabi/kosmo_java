package a.b.c.ch3;
/**
 �ֿܼ��� ���� main �Լ� �μ� �Ѱ��� �޾� ����ϱ�
*/
public class IfTest_1 
{
	public static void main(String[] args) 
	{
		// ���� ���ϱ� 
		// String s = "54321";

		
		// c:\00.KOSMO129\10.JExam\ch3>java a.b.c.ch3.IfTest 54321 
		// main(String args[] = {"54321")

		boolean bool = args.length == 1 //��ɾ� �� �μ� ����Ÿ �� �Ѱ��� ������ true �� ��ȯ�ȴ�
		// Boolean Short Circuiting
		if (bool)
		{
			// if ���� true �϶�
			System.out.println("args[0] >>> : "+ arg[0]);
		
		} else {
			// if ���� false �϶�
			System.out.println("���ϱ��� ����Ÿ�� �Է��Ͻÿ�");
		} //end of if else
	} //end of main
} // end of IfTest_1 class
