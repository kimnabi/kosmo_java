package a.b.c.ch3;
/**
  Scanner Ŭ�����̿��Ͽ� �Է¹޾� ����ϼ���
*/
import java.util.Scanner;

public class SwitchTest_2 {

	public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
 
	public static void main(String[] args) {
		System.out.println(">>>> main() �Լ� ���� : ");
		// java.util.Scanner ��Ű���� Scanner Ŭ���� �̿��ؼ�
		// �ܺη� ���� ����Ÿ�� �Է¹ޱ� ���� 
		Scanner sc = new Scanner(System.in);
		System.out.print(">>>> ���� �Ѱ��� �Է��ϼ��� : ");
		String input = sc.nextLine(); //���ڿ� �����Է¹޾� ���鹮��, �������� �ƴ��� 
		boolean bool = !"".equals(input) && isNumeric(input) && input.length() == 1;
		if(bool)
		{
			System.out.println("	>>>> bool : "+ bool);
			int rank = Integer.parseInt(input);
			switch (rank)
			{
				case 1:		System.out.println("	>>>> rank : " + rank); break;
				case 2: 	System.out.println("	>>>> rank : " + rank); break;
				case 3: 	System.out.println("	>>>> rank : " + rank); break;
				case 4: 	System.out.println("	>>>> rank : " + rank); break;
				default :   System.out.println("	>>>> default : ");

			} //end of switch
		} // end of if
		sc.close();
		System.out.println(">>>> main() �Լ� �� : ");
	} //end of main
} // end of SwitchTest_2 class
/**
C:\kosmo\ch3>java a.b.c.ch3.SwitchTest_2
	>>>> main() �Լ� ���� :
	>>>> ���� �Ѱ��� �Է��ϼ��� : 3
                >>>> rank : 3
	>>>> main() �Լ� �� : */