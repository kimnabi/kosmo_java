package com.kos.common;

import java.util.Scanner;

public class StringCheck{
	
	// 숫자 카운트
	public static int[] checkChar(String str){
		System.out.println("checkChar() >>> : " + str);
	
		// 숫자 카운트 변수
		int nCnt0 = 0;
		
		// 영문자 소문자 카운트 변수
		int nCnt1 = 0;
		
		// 영문자 대문자 카운트 변수
		int nCnt2 = 0;
		
		// 카운트할 숫자를 담을 배열을 선언해서 초기화 했다 
		int nChar[] = new int[3];
		// char 유니코드로 초기화 
		char cIn = '\u0000';

		if (str !=null && str.length() > 0)
		{
			System.out.println("if() >>> : " + str);
			
			for (int i=0; i < str.length(); i++)
			{
				cIn = str.charAt(i);
				
				// 숫자 카운트
				if (cIn >= 0x30 && cIn <= 0x39)
				{
//					System.out.println("cIn >>> : " + cIn);
					nCnt0++;
				}
				// 영문자 소문자 카운트
				if (cIn >= 0x61 && cIn <= 0x7a)
				{
//					System.out.println("cIn >>> : " + cIn);
					nCnt1++;
				}
				// 영문자 대문자 카운트
				if (cIn >= 0x41 && cIn <= 0x5a)
				{
//					System.out.println("cIn >>> : " + cIn);
					nCnt2++;
				}	
			}
			
			// 선언한 배열에 카운트 세팅하기 
			nChar[0] = nCnt0;
			nChar[1] = nCnt1;
			nChar[2] = nCnt2;
		}
		else{
			System.out.println("else >>> : 데이터가 없어요 >>> : ");
		}

		return nChar;
	}
	
	public static void main(String args[]){	
		
		// 정규식 : Reqular Expression
		// Validateion
		
//		String str = "124ABcDekdkdkdkdfDDDD67";		
		System.out.println("ID 또는 PW 를 입력하이소 >>> : ");
		Scanner sc = new Scanner(System.in);
		String sV = sc.next();
		System.out.println("입력한 ID 또는 PW >>> : " + sV);
		
		int cNum[] = StringCheck.checkChar(sV);
		System.out.println("숫자 >>> : " + cNum[0]);		
		System.out.println("영문자 소문자 >>> : " + cNum[1]);		
		System.out.println("영문자 대문자 >>> : " + cNum[2]);
		
		sc.close();
	}
}
