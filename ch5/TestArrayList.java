package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.ch4.MemberVO;

public class TestArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "name";
		String email = "email";
		String hp = "010";
		String addr = "�����";
		
		ArrayList<MemberVO> aList = new ArrayList<MemberVO>();
		// ArrayList aList = new ArrayList();
		
		for (int i=0; i < 10; i++) {  // DB ����Ÿ�� ���� MemberVO �ν��Ͻ��� 10�� �����ϱ� ���� ��ȸ �Ѵ�
			MemberVO mvo = new MemberVO();  // ���ο� MemberVO �ν��Ͻ� ����Ű�� �������� mvo(��������)�� ���ο� �ּҰ��� ��´�  
			// ��ȸ�ϸ鼭 i���� ��������
			mvo.setName(name + "_" + i); // MemberVO Ŭ���� �� ����ʵ� name �� ���ڿ� name_i �ʱ�ȭ
			mvo.setEmail(email + "_" + i);//MemberVO �� ����ʵ� email �� ���ڿ� name_i �ʱ�ȭ
			mvo.setHp(hp + "_" + i);//MemberVO �� ����ʵ� hp �� ���ڿ� hp_i �ʱ�ȭ
			mvo.setAddr(addr + "_" + i); //MemberVO �� ����ʵ� addr �� ���ڿ� addr_i �ʱ�ȭ
			
			aList.add(mvo);// ���ο� MemberVO �ν��Ͻ� �� ����Ű�� ���������� �ּҰ���  ArrayList�� ��ҿ� ���ε��Ѵ�
			System.out.println(aList);//�����
		}
		
		for (int i=0; i < aList.size(); i++) {
		MemberVO m1 = aList.get(i);
		System.out.println(" >>> : "+ m1.getName());
		System.out.println(" >>> : "+ m1.getEmail());
		System.out.println(" >>> : "+ m1.getHp());
		System.out.println(" >>> : "+ m1.getAddr());
		}// end for
		//System.out.println("hm.get(/"�̸�/") >>> : "+ hm.get("�̸�"));
		//System.out.println("hm.get(\"�̸�\") >>> : "+ hm.get("�̸�"));
//		System.out.println("hm.get/(�̸�/)"+ hm.get("�̸�"));

	//	System.out.println("aList.get(" + i + ") >>> : " + aList.get(i));
		//hm.put("�̸�", hm.get("�̸�"))

		
//		String name = hm.get("�̸�");
//		String age = hm.get("����");
		

			
	}//end of main
}// end of ArrayListTset1 class

