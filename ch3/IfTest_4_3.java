package a.b.c.ch3;

import java.util.Scanner;

public class IfTest_4_3 {

	public int arithmeticOper(char c, int x, int y){
		System.out.println("	arithmeticOper() �Լ� ���� >>> : ");			
		int sum = 0;
		
		// + : ���ϱ� 
		if (c == 0x2b){	
			sum = x + y;
		}
		
		// - : ���� 
		if (c == 0x2d){
			sum = x - y;
		}

		// * : ���ϱ� 
		if (c == 0x2a){
			sum = x * y;
		}

		// / : ������ 
		if (c == 0x2f){
			sum = x / y;
		}
		System.out.println("	arithmeticOper() �Լ� �� >>> : ");			

		return sum;
	} //end of arithmeticOper

	public static void main(String[] args) {
		System.out.println("main() �Լ� ���� >>> : ");

		Scanner sc = new Scanner(System.in);

		System.out.print("	��Ģ������ �ϱ����� �����ڸ� �Է� �Ͻÿ� + - * / >>> : ");
		
		String s = sc.next(); // ������ 
		char c = s.charAt(0);
		System.out.print("		ù��° ������ �Է� �Ͻÿ� >>> : ");
		int x = sc.nextInt(); // ù��° ����			
		System.out.print("		�ι�° ������ �Է� �Ͻÿ� >>> : ");
		int y = sc.nextInt(); // �ι�° ���� 	
		sc.close();
		// IfTest_4_3 Ŭ������ int arithmeticOper(int x, int y)�� �̿��ϱ� ����
		// if �� ������ �о� ����ɶ� new Ű���带 ���� �޸𸮿� �ø���
		// ������������ ���� ���� it43 �� IfTest_4_3() Ŭ������ ��ġ���� �����Ͽ� �ʱ�ȭ�Ѵ�
		IfTest_4_3 it43 = new IfTest_4_3();
		int sum = it43.arithmeticOper(c,x,y);
		System.out.println(x + " "+ c+" "+ y +" = "+sum);
		System.out.println("main() �Լ� �� >>> : ");
	} //end of main
} // end of IfTest_4_3 class
