package a.b.c.ch5;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Class HashMap<K,V>
		
		Type Parameters:
		K - the type of keys maintained by this map
		V - the type of mapped values
		*/
		// K : String
		// V : String 
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("hm >>> : " + hm);
		System.out.println("hm >>> : " + System.identityHashCode(hm));
				
		hm.put("이름", "정수민");
		hm.put("나이", "18"); // hm.put("나이",28);
				
		String name = hm.get("이름");
		String age = hm.get("나이");

		
		
		System.out.println("hm >>> : "+hm);
		//System.out.println("hm.get(/"이름/") >>> : "+ hm.get("이름"));
		System.out.println("hm.get(\"이름\") >>> : "+ hm.get("이름"));
//		System.out.println("hm.get/(이름/)"+ hm.get("이름"));

	//	System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		//hm.put("이름", hm.get("이름"))
		hm.put("이름", "정수민");
		hm.put("나이", "18");
		hm.put("이메일", "JSM@naver.com");
		hm.put("핸드폰번호", "01036900000");
		hm.put("주소", "서울시 금천구 독산동");
		
//		String name = hm.get("이름");
//		String age = hm.get("나이");
		
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());		

		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + "=" + hm.get(key));			
		}		
		
		for (String key: hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));	
		}
			
	}//end of main
}// end of ArrayListTset1 class

