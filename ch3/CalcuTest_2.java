public class CalcuTest_2 { 

	// ���ϱ� �Լ�	
	// param int x,y
	// return int Ÿ��
	public int addCalcu(int x, int y) {				
		int addSum = x + y;		
		return addSum;
	}

	// ���� �Լ�
	// param int x,y
	// return int Ÿ��
	public int subCalcu(int x, int y) {		
		return x - y;
	}

	// ���ϱ� �Լ�
	// param int x,y
	// return int Ÿ��
	public static int mulCalcu(int x, int y) {	
		int mulSum = x * y;	
		return mulSum;
	}

	// ������ �Լ�
	// param int x,y
	// return int Ÿ��
	public static int divCalcu(int x, int y) {		
		return x / y;
	}

	// main() �Լ��� �ܼ� ������ ���������� �����̴�. 
	public static void main(String[] args) {
		System.out.println("main() 1111 �Լ� ���� >>> : ");

		int x = 10;
		int y = 20;
		//
		CalcuTest_2 ct_2 = new CalcuTest_2();
		System.out.println("main() 2222 �Լ� �������� ct_2 >>> : " + ct_2);

		// public int addCalcu(int x, int y)
		int addSum = ct_2.addCalcu(x, y);
		System.out.println("main() 3333 �Լ� addSum >>> : " + addSum);
		
		// public int subCalcu(int x, int y) 
		int subSum = ct_2.subCalcu(x, y);
		System.out.println("main() 4444 �Լ� subSum >>> : " + subSum);
		
		// public static int mulCalcu(int x, int y)
		int mulSum = CalcuTest_2.mulCalcu(x, y);
		System.out.println("main() 5555 �Լ� mulSum >>> : " + mulSum);

		// public static int divCalcu(int x, int y)
		int divSum = CalcuTest_2.divCalcu(x, y);
		System.out.println("main() 6666 �Լ� divSum >>> : " + divSum);

		System.out.println("main() 7777 �Լ� �� >>> : ");
	} //end of main() function
} //end of CalcuTest_2 class
