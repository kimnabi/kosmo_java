package a.b.c.ch5;

import java.util.ArrayList;

public class ArrayListTset2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList = new ArrayList(3);
		// public boolean add(E e) : jdk 1.8
		// public boolean add(Object o) : jdk 1.4 
		aList.add("abc");
		aList.add('a');
		aList.add(3);
		aList.add("4��° ������");
		for (int i=0; i < aList.size(); i++) {
			System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		}

		// public E get(int index) : jdk 1.8
		// public Object get(int index) : jdk 1.4
		//Object o = aList.get(0);
		String o = (String) aList.get(0); //������ ���� : aList.get(0)�� ���� ����ŸŸ���� Object�̴�
		String s = (String)o;    //Object Ŭ������ String Ŭ������ �θ�Ŭ�������� ��Ӱ���ν�  String �ڽ�Ŭ������ �ٿ�ĳ���� �ؾ��Ѵ�
								 //���� ����ȯ�� ������Ѵ�  :: Sting �ڷ��� s�� �����ϱ����� ����Ÿ���� ���ƾ� �Ѵ�						
		System.out.println("s >>> : " + s); // �ݸ� �ڽ�Ŭ������ �θ�Ŭ������ ��ĳ���� �Ѵ� (����ȯ �����ʾƵ� �ȴ�)
		String s1 = (String)aList.get(0);
		System.out.println("s1 >>> : " + s1);
		//========================================================================
//		������ ���� ���� 
//		String s = aList.get(0);
//		0. java.lang.Object �� java.lang.String �� �ٸ� ������ ���̴�.
//		1. aList.add("abc") : 
//			"abc" ���ڿ� String �� ArrayList �� �־���.	
//		   	"abc" ���ڿ� String �����Ͱ� Object �� ����ȴ�.?? 
//		2. aList.get(0) �� ����Ű�� �����ʹ� "abc"  �̴�. 
//			�������� Object  
//		 	get() �Լ��� �������� Object �̴�. 
//		3. String �ڷ����� Object ���� ���� �Ϸ��� �ϴµ� ���������� �޶� ���� �� ����.
//      4. �����͸� ���� �� String ���� �����ϰ� ����ȯ �Ѵ�.		
//		String s = (String)aList.get(0);		
//========================================================================
		// 'a' �ֿܼ� ����Ʈ �ϱ�
//		char c = aList.get(1); // char �� ���� �ڷ��� ����Ÿ�̹Ƿ� Ŭ���� �ڷ����� �ƴϴ� �׷��� char�� Wapper Ŭ������ Character�� Boxing�ؼ� ��ȯ�Ѵ�
		Object aList1_Object = aList.get(1); // Object Ŭ������ Character Ŭ������ �θ�Ŭ�������� ��Ӱ���ν�  Character �ڽ�Ŭ������ �ٿ�ĳ���� �ؾ��Ѵ�
		Character aList1_Character = (Character)aList1_Object; // ���� ����ȯ�� ������Ѵ�  :: Character �ڷ��� aList1_Character �� �����ϱ����� ����Ÿ���� ���ƾ� �Ѵ�
		//char c = (char)aList1_Character;                       // �׸��� �����Ϸ��� ���������� ���� upBoxing�ؼ� char �����ڷ������� ����ȯ�Ѵ� 
		char c1 =  aList1_Character;                       // �׸��� �����Ϸ��� ���������� ���� upBoxing�ؼ� char �����ڷ������� ��ȯ�ؼ� 
		System.out.println("c >>> : " + c1);				// char c1 �� �����Ѵ�		
		//public static String valueOf(Object obj) 
		String cV = String.valueOf(aList1_Object); //Character aList1_Character Ŭ������ valueOf��  �Ű����� Object �� �� �ڽ�Ŭ�����̹Ƿ� �ڵ� ����ȯ �ȴ�
		System.out.println("cV >>> : " + cV);
		
		// 3 �ֿܼ� ����Ʈ �ϱ�
		// int i = aList.get(2); //int �� ���� �ڷ��� ����Ÿ�̹Ƿ� Ŭ���� �ڷ����� �ƴϴ� �׷��� int�� Wapper Ŭ������ Integer�� Boxing�ؼ� ��ȯ�Ѵ�
		Object aList2_Object = aList.get(2); // ���� Object Ŭ������  Ŭ������ �θ�Ŭ�������� ��Ӱ���ν�  Integer �ڽ�Ŭ������ �ٿ�ĳ���� �ؾ��Ѵ�
		Integer aList2_Integer = (Integer)aList2_Object; // ���� ����ȯ�� ������Ѵ�  :: Sting �ڷ��� s�� �����ϱ����� ����Ÿ���� ���ƾ� �Ѵ�
		//int i = (int)aList2_Integer;
		int ii = aList2_Integer; // �׸��� �����Ϸ��� ���������� ���� upBoxing�ؼ� int �����ڷ������� ��ȯ�ؼ� int ii�� �����Ѵ� 
		System.out.println("i >>> : " + ii);
		
		String iV = String.valueOf(aList2_Object);//String Ŭ���� ���� valueOf �Լ� �Ű�������
												  // Integer Ŭ���� Ÿ�� aList2_Object Ŭ������ ���� ���ڿ��� ��ȯ
		System.out.println("iV >>> : " + iV);
	//	valueOf
		// "4��° ������" �ֿܼ� ����Ʈ �ϱ�
//		String s1 = aList.get(3);
		Object aList3_Object = aList.get(3);
		String aList3_String = (String)aList3_Object; 
		System.out.println("aList3_String >>> : " + aList3_String);
		
		String s1V = String.valueOf(aList3_Object);   // String Ŭ���� Ÿ�� aList3_Object Ŭ������ ���� ���ڿ��� ��ȯ
		System.out.println("s1V >>> : " + s1V);		
	}//end of main
}// end of ArrayListTset1 class

