package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestArrayList1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "name";
		String email = "email";
		String hp = "010";
		String addr = "서울시";
		//제네릭타입 : String HashMap<String, String>
		ArrayList<HashMap<String, String>> aList 
			= new ArrayList<HashMap<String, String>>(); // ArrayList<HashMap<String, String>> 클래스 인스턴스 생성하고 참조변수 aList 가 가리킨다
	
		for (int i=0; i < 10; i++) { // HashMap<String, String> 인스턴스를 10개 생성하기 위해 반복문 한다
			//제네릭 타입:String hashMap {키 ,Value} 형태인데 키와 Value 타입이 String 으로 선언
			HashMap<String, String> hm = new HashMap<String, String>();// HashMap<String, String>클래스 인스턴스 생성하고 참조변수 hm가 가르킨다
			hm.put("이름", name + "_" + i); // {키 ,Value} = {"이름","name_i"} 값 초기화
			hm.put("이메일", email + "_" + i);// {키 ,Value} ={"이메일","email_i"}
			hm.put("hp", hp + "_" + i); // {키 ,Value} ={"hp","hp_i"}
			hm.put("주소", addr + "_" + i); // {키 ,Value} ={"주소","addr_i"}
			
			aList.add(hm); //
			System.out.println(aList);
		} //end for
		
		for (int i=0; i < aList.size(); i++) {
			
			HashMap<String, String> _hm = aList.get(i);
			
			Iterator<String> keys = _hm.keySet().iterator();
			while (keys.hasNext()) {
				String key = keys.next();
				System.out.print(key + "=" + _hm.get(key) + " ");			
			}//end while	
			System.out.print("\n");
		}//end for	
	}//end of main
}// end of ArrayListTset1 class

