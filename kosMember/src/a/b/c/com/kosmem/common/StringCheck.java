package a.b.c.com.kosmem.common;

import java.util.Scanner;

public class StringCheck{
	
	// ���� ī��Ʈ
	public static int[] checkChar(String str){
		System.out.println("checkChar() >>> : " + str);
	
		// ���� ī��Ʈ ����
		int nCnt0 = 0;
		
		// ������ �ҹ��� ī��Ʈ ����
		int nCnt1 = 0;
		
		// ������ �빮�� ī��Ʈ ����
		int nCnt2 = 0;
		
		// ī��Ʈ�� ���ڸ� ���� �迭�� �����ؼ� �ʱ�ȭ �ߴ� 
		int nChar[] = new int[3];
		// char �����ڵ�� �ʱ�ȭ 
		char cIn = '\u0000';

		if (str !=null && str.length() > 0)
		{
			System.out.println("if() >>> : " + str);
			
			for (int i=0; i < str.length(); i++)
			{
				cIn = str.charAt(i);
				
				// ���� ī��Ʈ
				if (cIn >= 0x30 && cIn <= 0x39)
				{
//					System.out.println("cIn >>> : " + cIn);
					nCnt0++;
				}
				// ������ �ҹ��� ī��Ʈ
				if (cIn >= 0x61 && cIn <= 0x7a)
				{
//					System.out.println("cIn >>> : " + cIn);
					nCnt1++;
				}
				// ������ �빮�� ī��Ʈ
				if (cIn >= 0x41 && cIn <= 0x5a)
				{
//					System.out.println("cIn >>> : " + cIn);
					nCnt2++;
				}	
			}
			
			// ������ �迭�� ī��Ʈ �����ϱ� 
			nChar[0] = nCnt0;
			nChar[1] = nCnt1;
			nChar[2] = nCnt2;
		}
		else{
			System.out.println("else >>> : �����Ͱ� ����� >>> : ");
		}

		return nChar;
	}
	
	public static void main(String args[]){	
		
		// ���Խ� : Reqular Expression
		// Validateion
		
//		String str = "124ABcDekdkdkdkdfDDDD67";		
		System.out.println("ID �Ǵ� PW �� �Է����̼� >>> : ");
		Scanner sc = new Scanner(System.in);
		String sV = sc.next();
		System.out.println("�Է��� ID �Ǵ� PW >>> : " + sV);
		
		int cNum[] = StringCheck.checkChar(sV);
		System.out.println("���� >>> : " + cNum[0]);		
		System.out.println("������ �ҹ��� >>> : " + cNum[1]);		
		System.out.println("������ �빮�� >>> : " + cNum[2]);
		
		sc.close();
	}
}
