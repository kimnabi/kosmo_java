package a.b.c.ch4;

import java.util.ArrayList;

/** 
 * ȸ�� ������ Ű������ �̸� ���� ���� ��û�Ͽ� ���� �̸����� ���ؼ� �ű⿡ �ش�Ǵ� �÷��� �����ֱ�
 * ȸ�� ���� : �̸�, �̸���, ��ȭ��ȣ, �ּ� 
 * */
public class TestMember5 {
	
	// �⺻������
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
		// DB ��� �ӽ� ���� ����Ÿ��
		// ������ Ű���� DB ȸ������ �ʵ��̸��� ���ؼ� List Ŭ���� ��Ƽ� �����Ѵ�
		//
		public ArrayList<MemberVO> memSelect(MemberVO mvo)  {
			System.out.println("TestMember5.memSelect mvo.getName() >>> : " 	+ mvo.getName());
			
			//���� ����Ÿ
			String s0[] = {"ȫ�Ѽ�","hhs@naver.com","01098750000","��⵵ ������ ������"};
			
			ArrayList<MemberVO> alist = null;
			//MemberVO�� ����ʵ� name �� null Ȥ�� ���� üũ
			try {
				// �ι��� ����ó��
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
				System.out.println("MemberVO�� ����ʵ� name �� null  �Դϴ�");
			
			}catch(Exception e){
				System.out.println("MemberVO�� ����ʵ� name ��  ���鹮�� �Դϴ�" );
			}
			
//			}else {
//				System.out.println("MemberVO�� ����ʵ� name �� null �̰ų� ���鹮�� �Դϴ�");
//			}
			
			return alist;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in); // ���� �Է��ϱ����� Scanner Ŭ���� �̿�
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ��ȸ");
		System.out.println("5. ���α׷� ����");
	
	//String name = null; // ���ڿ��� �������� name �����ؼ� ���� 
		String name = ""; // ���ڿ��� �������� name �����ؼ� ���� 
		
		MemberVO mvo = null;
		mvo = new MemberVO();	
		mvo.setName(name); // MemberVO() �ν��Ͻ��� ����ʵ� name�� setter �Լ� ���� �ʱ�ȭ
		
		TestMember5 tm_5 = new TestMember5();
		// ������ �������� �� ���� ����Ÿ�� �޾ƿͼ�
		//List �� ��ҵ��� ���׸�Ÿ�� MemberVO���� �ʱ�ȭ ����
		ArrayList<MemberVO> aList = tm_5.memSelect(mvo);
        // ���� ó�� �� ���� üũ
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
