package a.b.c.ch3;

public class IfTest_2 
{
	public static void main(String[] args) 
	{
		// ======================================
		//  if ���� ���ǽ��� ture �� �� if ���� ���� �ȴ�.
		// ======================================

		/*
		if (true)
		{
			System.out.println(">>>");
		}
		*/
		// if �� ������ �� true�̰ų� false�� �°� �б��Ѵ�
		// ?? ���ǽ��� ���� ��� if ���� true ���� �б��Ѵ� default 
		if (false)
		{
			// if �� 
			System.out.println(">>>");
		}else{
			// else �� 
			System.out.println("<<<>>>");
		}

		boolean bool = true;
		System.out.println("bool >>> : " + bool);
		//���ǽİ���� true �϶��� if �� ���� �б��Ѵ� 
		//���ǽİ���� false �϶��� else �� ���� �б��Ѵ� 
		if (bool)
		{
			System.out.println("if �� :: bool >>> : " + bool);
			// if �� 
			System.out.println(">>>");
		}else{
			// else �� 
			System.out.println("<<<>>>");
		}

	}
}
