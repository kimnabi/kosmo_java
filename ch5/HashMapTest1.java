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
				
		hm.put("�̸�", "������");
		hm.put("����", "18"); // hm.put("����",28);
				
		String name = hm.get("�̸�");
		String age = hm.get("����");

		
		
		System.out.println("hm >>> : "+hm);
		//System.out.println("hm.get(/"�̸�/") >>> : "+ hm.get("�̸�"));
		System.out.println("hm.get(\"�̸�\") >>> : "+ hm.get("�̸�"));
//		System.out.println("hm.get/(�̸�/)"+ hm.get("�̸�"));

	//	System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		//hm.put("�̸�", hm.get("�̸�"))
		hm.put("�̸�", "������");
		hm.put("����", "18");
		hm.put("�̸���", "JSM@naver.com");
		hm.put("�ڵ�����ȣ", "01036900000");
		hm.put("�ּ�", "����� ��õ�� ���굿");
		
//		String name = hm.get("�̸�");
//		String age = hm.get("����");
		
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

