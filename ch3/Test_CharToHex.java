package a.b.c.ch3;

import java.util.Scanner;

/*

���ĺ� �빮�� 26��
���ĺ� �ҹ��� 26��
���� 0 1 2 3 4 5 6 7 8 9 
��Ģ ������ + - * /
Ư����ȣ ! @ # $ % ^ & * ( ) ~

���� �Լ��� ���� �ֿܼ� ���� �� 16������ ��� �Ͻÿ� 

*/
public class Test_CharToHex {
	
	// ���: ������ �빮�ڵ� �� ���ڿ� �� ������ char���ڷ� 16���� ���·� ����ϴ�  �Լ�
	public static void alMethod(String aL) {
		System.out.println("  Test_CharToHex_1.alMethod() �Լ� ���� >>> : ");
		System.out.println("  aL >>> : " + aL);
		// ������ ���ڿ� �迭 ���ڿ� al �� null �ƴҶ� if ���� �����Ѵ�
		if (aL !=null && aL.length() > 0) {
			// ���ڿ��� �� char���ڵ�� �ٲ㼭 ��ȸ�Ͽ� �Ѱ��� 16�������·� ����Ѵ�
			Test_CharToHex.toHex(aL);	
		}
		
		System.out.println("  Test_CharToHex_1.alMethod() �Լ� �� >>> : ");
	}

	// ���: ������ �ҹ��ڵ� �� ���ڿ� ��  ������ char���ڷ� 16���� ���·� ����ϴ�  �Լ�
	public static void aSMethod(String aS) {		
		System.out.println("  Test_CharToHex_1.aSMethod() �Լ� ���� >>> : ");
		System.out.println("  aS >>> : " + aS);
		// ������ ���ڿ� �迭 ���ڿ� aS�� null �ƴҶ� if ���� �����Ѵ�
		if (aS !=null && aS.length() > 0) {
			// ���ڿ��� �� char���ڵ�� �ٲ㼭 ��ȸ�Ͽ� �Ѱ��� 16�������·� ����Ѵ�
			Test_CharToHex.toHex(aS);	
		}
		
		System.out.println("  Test_CharToHex_1.aSMethod() �Լ� �� >>> : ");		
	}
	
	// ���: ���� �� ���ڿ��迭 ��  ������ char���ڷ� 16���� ���·� ����ϴ�  �Լ�����
	public static void numMethod(String num) {		
		System.out.println("  Test_CharToHex_1.numMethod() �Լ� ���� >>> : ");
		System.out.println("  num >>> : " + num);
		// ������ ���ڿ� �迭 ���ڿ� num�� null �ƴҶ� if ���� �����Ѵ�
		if (num !=null && num.length() > 0) {
			// ���ڿ��� �� char���ڵ�� �ٲ㼭 ��ȸ�Ͽ� �Ѱ��� 16�������·� ����Ѵ�
			Test_CharToHex.toHex(num);	
		}
		
		System.out.println("  Test_CharToHex_1.numMethod() �Լ� �� >>> : ");				
	}
	
	// ���: ��Ģ������ ���ڿ��迭 ��  ������ char���ڷ� 16���� ���·� ����ϴ�  �Լ�����
	public static void operMethod(String oper) {
		System.out.println("  Test_CharToHex_1.operMethod() �Լ� ���� >>> : ");
		System.out.println("  oper >>> : " + oper);
		// ������ ���ڿ� �迭 ���ڿ� num�� null �ƴҶ� if ���� �����Ѵ�
		if (oper !=null && oper.length() > 0) {
			// ���ڿ��� �� char���ڵ�� �ٲ㼭 ��ȸ�Ͽ� �Ѱ��� 16�������·� ����Ѵ�
			Test_CharToHex.toHex(oper);	
		}
		
		System.out.println("  Test_CharToHex_1.operMethod() �Լ� �� >>> : ");				
	}
	
	//���: Ư����ȣ �� ���ڿ��迭 ��  ������ char���ڷ� 16���� ���·� ����ϴ�  �Լ�����
	public static void ksxMethod(String ksx) {
		System.out.println("  Test_CharToHex_1.ksxMethod() �Լ� ���� >>> : ");
		System.out.println("  ksx >>> : " + ksx);
		// ������ ���ڿ� �迭 ksx�� ���ڿ� ksx�� null �ƴҶ� if ���� �����Ѵ�
		if (ksx !=null && ksx.length() > 0) {
			// ���ڿ��� �� char���ڵ�� �ٲ㼭 ��ȸ�Ͽ� �Ѱ��� 16�������·� ����Ѵ�
			Test_CharToHex.toHex(ksx);	
		}
		
		System.out.println("  Test_CharToHex_1.ksxMethod() �Լ� �� >>> : ");			
	}
	
	// ���ڿ��� 16���� ����(��:0x2b)�� ����Ѵ�
	public static void toHex(String h) {
		
		for (int i=0; i < h.length(); i++) {
			char hHex = h.charAt(i);
			System.out.print("  " + hHex + " : ");
			System.out.println("0x" + Integer.toHexString(hHex));
		}					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Test_CharToHex_1.main() �Լ� ���� >>> : ");
		
		// ���� ���� 
		String aL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String aS = aL.toLowerCase();
		String num = "0123456789";
		String oper = "+-*/";
		String ksx = "!@#$%^&*()~";
		
		System.out.println("ASCII CODE ���� >>> : ");
		System.out.println("1 : ������ �빮��");
		System.out.println("2 : ������ �ҹ���");
		System.out.println("3 : ����");
		System.out.println("4 : ��Ģ������");
		System.out.println("5 : Ư����ȣ !@#$%^&*()~ ");
		
		Scanner sc = new Scanner(System.in);
		int sNum = 0;
		
		while (true) {
			
			sNum = sc.nextInt();
			
			switch (sNum) {
				case 1: Test_CharToHex.alMethod(aL);
					break;
				case 2: Test_CharToHex.aSMethod(aS);
					break;
				case 3: Test_CharToHex.numMethod(num);
					break;
				case 4: Test_CharToHex.operMethod(oper);
					break;
				case 5: Test_CharToHex.ksxMethod(ksx);
					break;			
			}
			if (sNum == 9) {
				sc.close();
				System.out.println("Test_CharToHex_1.main() �Լ� �� >>> : ");
				System.out.println("���α׷��� ���� �մϴ� >>> : ");
				System.exit(0);
			} // end of if
		} //end of while	
	} // end of main

} // end of Test_CharToHex
