package a.b.c.ch3;

public class WhileTest {

	public static void main(String args[]) {
		System.out.println(">>>> main() �Լ� ���� : ");
		int i = 1;
		int sum = 0;
		while (i<= 10)
		{
			sum += i; //���� �ؼ� sum �� �����Ѵ� 
			System.out.println("	while i >>> " + i);
			System.out.println("	while sum >>>"+ sum);
			i++;
		} //end of while
		System.out.println("	>>>>>>>"+ sum);
		System.out.println(">>>> main() �Լ� �� : ");

	}//end of main
} //end of whileTest


/**
���� �ڵ�: main �޼��� ��ã���� �������� ���������� ��Ÿ�� ������ ���´�
�޼��� �̸� ö�ڸ� �߸�ĥ�� :man
C:\kosmo\ch3>java a.b.c.ch3.WhileTest
����: a.b.c.ch3.WhileTest Ŭ�������� �⺻ �޼ҵ带 ã�� �� �����ϴ�. ���� �������� �⺻ �޼ҵ带 �����Ͻʽÿ�.
   public static void main(String[] args)
�Ǵ� JavaFX ���ø����̼� Ŭ������ javafx.application.Application��(��) Ȯ���ؾ� �մϴ�.


*/