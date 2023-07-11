package a.b.c.ch5;

import java.util.HashMap;

public class HashMapTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		// public boolean add(E e) : jdk 1.8
		// public boolean add(Object o) : jdk 1.4 
		hm.put("이름","정수민");
		hm.put("나이",28);
		
		System.out.println("hm >>> : "+hm);
		//System.out.println("hm.get(/"이름/") >>> : "+ hm.get("이름"));
		System.out.println("hm.get(\"이름\") >>> : "+ hm.get("이름"));
//		System.out.println("hm.get/(이름/)"+ hm.get("이름"));
		String s1 =(String)hm.get("이름");
		String s1_1 =String.valueOf(hm.get("이름"));
		String s1_2 =hm.get("이름")+"";
		System.out.println("hm.get(\"이름\") >>> : " + s1);
		int i =(Integer)hm.get("나이"); //jvm이 컴파일시 Integer 랩퍼클래스 로써 자동 언박싱
//		Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//		at a.b.c.ch5.HashMapTest.main(HashMapTest.java:21)
		System.out.println("hm.get(\"나이\") >>> : " + i);
		System.out.println("hm.get(\'나이\') >>> : " + i);
		
	//	System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		//hm.put("이름", hm.get("이름"))
		
			
	}//end of main
}// end of ArrayListTset1 class

