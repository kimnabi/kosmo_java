package a.b.c.ch2;

public class InterpritTest {

	int i;
	String s;
	
	// �⺻ ������ : �����ڿ� �Ű������� ���� ������ 
	public InterpritTest() {
		System.out.println("1111 InterpritTest() ������ ���� >>> : ");

		System.out.println("2222 InterpritTest() ������ �� >>> : ");
	} 
	
	
	public int aM() {
		System.out.println("1111 aM() �Լ� ���� >>> : ");

		System.out.println("2222 aM() �Լ� �� >>> : ");
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("1111 main() �Լ� ���� >>> : ");

		InterpritTest it = new InterpritTest();
		System.out.println("2222 main() �Լ� :: it >>> : "+ it);

		int sum = it.aM();
		System.out.println("3333 main() �Լ� :: sum >>> : " + sum);

		System.out.println("4444 main() �Լ� �� >>> : ");
	} //end of main function
} //end of InterpritTest class
