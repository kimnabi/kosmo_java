package a.b.c.common;

public class MonthDay {

	private MonthDay(){
		System.out.println("	MonthDay() ������>>> ���� :");
		System.out.println("	MonthDay() ������>>> �� :");
	} //  end of Monday() �⺻������ 
	// �� �� ��� ���� �����Ͽ� �˷��ִ� �Լ�
	// parm : int
	// return :int
	public static int month_day(int month) {
		System.out.println("	month_day(int month) >>> ���� :");
		int day = 0; 
		switch (month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
					break;
			case 4: case 6: case 9: case 11: day = 30;
					break;
			case 2: day = 28;
					break;
		}//end of switch
		System.out.println("	month_day(int month) >>> �� :");
		return day;
	} //end of static month_day
} // end of Monthday class
