package a.b.c.ch4;

import java.util.ArrayList;

/** 
 * 회원 정보를 키값으로 이름 으로 서버 요청하여 같은 이름인지 비교해서 거기에 해당되는 컬럼을 보여주기
 * 회원 정보 : 이름, 이메일, 전화번호, 주소 
 * */
public class TestMember5 {
	
	// 기본생성자
		public TestMember5() {
			
		}
		
		public int memInsert(MemberVO mvo) {
			System.out.println("TestMember_2.memInsert mvo.getName() >>> : " 	+ mvo.getName());
			System.out.println("TestMember_2.memInsert mvo.getEmail() >>> : " 	+ mvo.getEmail());
			System.out.println("TestMember_2.memInsert mvo.getHp() >>> : "	 	+ mvo.getHp());
			System.out.println("TestMember_2.memInsert mvo.getAddr() >>> : " 	+ mvo.getAddr());
			
			MemberDAO mdao = new MemberDAOImpl();//
			mdao.memInsert(mvo);
			
			return 0;
		}
		// DB 대신 임시 덤프 데이타를
		// 임의의 키값과 DB 회원정보 필드이름와 비교해서 List 클래스 담아서 응답한다
		//
		public ArrayList<MemberVO> memSelect(MemberVO mvo)  {
			System.out.println("TestMember5.memSelect mvo.getName() >>> : " 	+ mvo.getName());
			
			//더미 데이타
			String s0[] = {"홍한솔","hhs@naver.com","01098750000","경기도 김포시 양촌읍"};
			
			ArrayList<MemberVO> alist = null;
			//MemberVO의 멤버필드 name 이 null 혹은 빈문자 체크
			try {
				// 널문자 예외처리
				//if(mvo.getName() != null && mvo.getName().length() > 0 ) {
//				if(mvo.getName().length() == 0) {
//					throw new Exception(mvo.getName());
//				}
					alist =new ArrayList<MemberVO>();
				    if(mvo.getName().equals(s0[0]))
				    {
				    	MemberVO vo = new MemberVO();
				    	vo.setName(s0[0]);
				    	vo.setEmail(s0[1]);
				    	vo.setHp(s0[2]);
				    	vo.setAddr(s0[3]);
				    	alist.add(vo);
				    	
				    } //end if
				//}// end if
			}catch(NullPointerException e){
				System.out.println("MemberVO의 멤버필드 name 가 null  입니다");
			
			}catch(Exception e){
				System.out.println("MemberVO의 멤버필드 name 가  공백문자 입니다" );
			}
			
//			}else {
//				System.out.println("MemberVO의 멤버필드 name 가 null 이거나 공백문자 입니다");
//			}
			
			return alist;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in); // 문자 입력하기위해 Scanner 클래스 이용
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 조회");
		System.out.println("5. 프로그램 종료");
	
	//String name = null; // 문자열을 지역변수 name 대입해서 선언 
		String name = ""; // 문자열을 지역변수 name 대입해서 선언 
		
		MemberVO mvo = null;
		mvo = new MemberVO();	
		mvo.setName(name); // MemberVO() 인스턴스의 멤버필드 name에 setter 함수 통해 초기화
		
		TestMember5 tm_5 = new TestMember5();
		// 서버로 부터응답 한 더미 데이타를 받아와서
		//List 의 요소들을 제네릭타입 MemberVO으로 초기화 선언
		ArrayList<MemberVO> aList = tm_5.memSelect(mvo);
        // 공백 처리 및 빈문자 체크
		if (aList !=null && aList.size() > 0) {
			System.out.println("aList.size() >>> : " + aList.size());
			
			for (int i=0; i < aList.size(); i++) {
				MemberVO _mvo = aList.get(i);
				System.out.print(_mvo.getName() + " ");
				System.out.print(_mvo.getEmail() + " ");
				System.out.print(_mvo.getHp() + " ");
				System.out.println(_mvo.getAddr());
			}
		}	//end of if	
	}

}
