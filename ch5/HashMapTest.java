package a.b.c.ch5;

import java.util.HashMap;

public class HashMapTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		// public boolean add(E e) : jdk 1.8
		// public boolean add(Object o) : jdk 1.4 
		hm.put("�̸�","������");
		hm.put("����",28);
		
		System.out.println("hm >>> : "+hm);
		//System.out.println("hm.get(/"�̸�/") >>> : "+ hm.get("�̸�"));
		System.out.println("hm.get(\"�̸�\") >>> : "+ hm.get("�̸�"));
//		System.out.println("hm.get/(�̸�/)"+ hm.get("�̸�"));
		String s1 =(String)hm.get("�̸�");
		String s1_1 =String.valueOf(hm.get("�̸�"));
		String s1_2 =hm.get("�̸�")+"";
		System.out.println("hm.get(\"�̸�\") >>> : " + s1);
		int i =(Integer)hm.get("����"); //jvm�� �����Ͻ� Integer ����Ŭ���� �ν� �ڵ� ��ڽ�
//		Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//		at a.b.c.ch5.HashMapTest.main(HashMapTest.java:21)
		System.out.println("hm.get(\"����\") >>> : " + i);
		System.out.println("hm.get(\'����\') >>> : " + i);
		
	//	System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		//hm.put("�̸�", hm.get("�̸�"))
		
			
	}//end of main
}// end of ArrayListTset1 class

