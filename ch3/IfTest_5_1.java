package a.b.c.ch3;

import java.util.Scanner;

public class IfTest_5_1 {
		// ���
	public static final String FEE_0 = "������ �Ƶ�";
	public static final String FEE_1 = "�ʵ��л�";
	public static final String FEE_2 = "��, ����л�";
	public static final String FEE_3 = "�Ϲ���";
	
	// �⺻ �Ű������� ���� ������
	public IfTest_5_1() {
	System.out.println(">>>> ������ IfTest_5_1() >>>");
	} //end of IfTest_5_1()

	// �Լ� 
	public void feeMethod(int age) {
		System.out.println("	$$$$ IfTest_5_1.feeMethod() ����  >>> : \n");
		System.out.println("	$$$$ age >>> : " + age);
		
		String div = "";
		int ageV = age;		
		int charge = 0;
		
		if (ageV < 8) {
			div = FEE_0;
			charge = 1000;
			
		}else if (ageV < 14) {
			div = FEE_1;
			charge = 2000;
			
		}else if (ageV < 20) {
			div = FEE_2;
			charge = 2500;
			
		}else {
			div = FEE_3;
			charge = 3000;
		}
		
		System.out.println("	$$$$ "+ div + "�Դϴ�.");
		System.out.println("	$$$$ ������ " + charge + "�� �Դϴ�.");
		System.out.println("	$$$$ IfTest_5_1.feeMethod() ��  >>> : \n");
	}


	public static void main(String[] args) 
	{
		System.out.println("IfTest_5_1.main() ����  >>> : \n");
		// ������� �Է¸� ���� int �� ����Ÿ�� �޾�
		// feeMethod �� ���� ���̿����� ����� ���� ����Ѵ�
		System.out.print("	���̸� �Է� �ϼ��� >>> : ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		IfTest_5_1 if5 = new IfTest_5_1();
		System.out.println("	���� >>> : "+ age+"\n");
		if5.feeMethod(age);
		System.out.println("IfTest_5_1.main() ��  >>> : ");
		sc.close();
	} //end of main
} //end of IfTest_5_1 class
