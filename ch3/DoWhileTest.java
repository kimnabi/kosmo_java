package a.b.c.ch3;

public class DoWhileTest {
	public static void main(String[] args) {
	System.out.println(">>>> main() �Լ� ���� : ");
		int i = 1;
		int sum = 0;
		do 
		{
			sum += i; //���� �ؼ� sum �� �����Ѵ� 
			System.out.println("	while i >>> " + i);
			System.out.println("	while sum >>>"+ sum);
			i++;
		} while (i<= 10); // end of Dowhile
		System.out.println("	>>>>>>> : "+ sum);
		System.out.println(">>>> main() �Լ� �� : ");
	}//end of main
} //end of whileTest
