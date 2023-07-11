package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.ch4.MemberVO;

public class TestArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "name";
		String email = "email";
		String hp = "010";
		String addr = "서울시";
		
		ArrayList<MemberVO> aList = new ArrayList<MemberVO>();
		// ArrayList aList = new ArrayList();
		
		for (int i=0; i < 10; i++) {  // DB 데이타를 담을 MemberVO 인스턴스를 10개 생성하기 위해 순회 한다
			MemberVO mvo = new MemberVO();  // 새로운 MemberVO 인스턴스 가르키는 지역변수 mvo(참조변수)에 새로운 주소값를 담는다  
			// 순회하면서 i값이 누적연산
			mvo.setName(name + "_" + i); // MemberVO 클래스 의 멤버필드 name 에 문자열 name_i 초기화
			mvo.setEmail(email + "_" + i);//MemberVO 의 멤버필드 email 에 문자열 name_i 초기화
			mvo.setHp(hp + "_" + i);//MemberVO 의 멤버필드 hp 에 문자열 hp_i 초기화
			mvo.setAddr(addr + "_" + i); //MemberVO 의 멤버필드 addr 에 문자열 addr_i 초기화
			
			aList.add(mvo);// 새로운 MemberVO 인스턴스 를 가리키는 참조변수의 주소값를  ArrayList의 요소에 바인딩한다
			System.out.println(aList);//디버깅
		}
		
		for (int i=0; i < aList.size(); i++) {
		MemberVO m1 = aList.get(i);
		System.out.println(" >>> : "+ m1.getName());
		System.out.println(" >>> : "+ m1.getEmail());
		System.out.println(" >>> : "+ m1.getHp());
		System.out.println(" >>> : "+ m1.getAddr());
		}// end for
		//System.out.println("hm.get(/"이름/") >>> : "+ hm.get("이름"));
		//System.out.println("hm.get(\"이름\") >>> : "+ hm.get("이름"));
//		System.out.println("hm.get/(이름/)"+ hm.get("이름"));

	//	System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		//hm.put("이름", hm.get("이름"))

		
//		String name = hm.get("이름");
//		String age = hm.get("나이");
		

			
	}//end of main
}// end of ArrayListTset1 class

