package a.b.c.ch4;

import a.b.c.common.MonthDay;
/**
����� �μ� �� �Է¹޾� ����ϼ���
*/
public class SwitchTest_4_1 {
	
	public static void main(String[]args) {
		System.out.println(">>>> main() �Լ� ���� : ");
		boolean bool = args.length == 1;
		
		if(bool)
		{
			System.out.println("	>>>> bool : "+ bool);
			int month = Integer.parseInt(args[0]);
			//int month = 1;
			if(0 < month && month < 13){
				int day =MonthDay.month_day(month);
				System.out.println(month + "�� ��¥ ����  " + day + "�Դϴ�.");
			} //end of if 

			System.out.println("	>>>> �Է��Ͻ� ����Ÿ�� �߸��Ǿ����ϴ�");
		} // end of if
			System.out.println(">>>> main() �Լ� �� : ");
	}//end of main
} //end of SwitchTest_4_1
