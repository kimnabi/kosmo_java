package a.b.c.ch4;

import java.util.Scanner;

/** 
 * ȸ�� ������ Scanner Ŭ�����̿��ؼ� �Է� �޾Ƽ� �ֿܼ� ��� �ϱ�
 * ȸ�� ���� : �̸�, �̸���, ��ȭ��ȣ, �ּ� 
 * */
public class TestMember4 {
	
	// �⺻������
		public TestMember4() {
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // ���� �Է��ϱ����� Scanner Ŭ���� �̿�
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ��ȸ");
		System.out.println("5. ���α׷� ����");
		String str = sc.next(); //�����Ѱ���
		System.out.println("main() :: sc.next() >>> : " + str );

		// �̸� : �ѱ�
		// �̸��� : ����
		// ��ȭ��ȣ : �ڵ��� ��ȣ
		// �ּ� : �õ�, �� �̸��� 
		// String Ÿ�� �������� s0 ��  ���ڿ� �迭�Ǳ��� 4�� �Ҵ��ϰ� ���ͷ� ���ڿ� 4���� �ʱ�ȭ�Ѵ�
	//	String s0[] = {"����ȯ","kij@naver.com","01100020000","����ñ�õ�� ���굿"};
		// String Ÿ�� �������� s1 �� ���ڿ� �迭�Ǳ��� 4�� �Ҵ��ϰ�  ���ͷ� ���ڿ� 4�� �� �ʱ�ȭ�Ѵ�
	//	String s1[] = {"ȫ�Ѽ�","hhs@naver.com","01098750000","��⵵ ������ ������"};
		// ��������� TestMember2 Ŭ���� �������� tm_0 �� ������ TestMember2Ŭ����  �ν��Ͻ� �ϰ�
		// �������� s0 ����Ű�� ��ü ���ڿ� ��ҵ��� ���� ȣ���Ͽ� TestMember2  �������� �Ű������鿡 ���ε� �Ѵ�
//		TestMember3 tm_2 = new TestMember3();
//		MemberVO mvo = null; // GC ���к��� ���ҽ� ���� ����ϱ����� �ڵ� 
//		// ���ڿ��� ������� ��ü ���� 
//		mvo = new MemberVO(); // MemberVO mvo = new MemberVO();
//		mvo.setName(s0[0]); // ��������s0 ����Ű�� ���ڿ� ��ҵ� �� index�� 0��° ����� �������� �ʱ�ȭ  
//		mvo.setEmail(s0[1]);// ��������s0 ����Ű�� ���ڿ� ��ҵ� �� index�� 1��° ����� �������� �ʱ�ȭ  
//		mvo.setHp(s0[2]);
//		mvo.setAddr(s0[3]);
//		tm_2.memInsert(mvo);
//		//MemberVO mvo1 = new MemberVO();
//		//TestMember2 tm1_2 = new TestMember2();
//		mvo.setName(s1[0]);
//		mvo.setEmail(s1[1]);
//		mvo.setHp(s1[2]);
//		mvo.setAddr(s1[3]);
//		tm_2.memInsert(mvo);
		//�б� �÷��� 
		String isudFlag = str;               //��ɾ����μ� �Ѱ� �޾� �ʱ�ȭ �Ѵ�	
		// public String toUpperCase()
		isudFlag = isudFlag.toUpperCase(); // ���� ����
		System.out.println("isudFlag >>> : " + isudFlag);
		
		if ("I".equals(isudFlag)) {
			System.out.println("�Է� isudFlag >>> : " + isudFlag);
			
			String s0[] = {"ȫ�Ѽ�", "hhs@naver.com", "01098750000", "��⵵ ������ ������"};
//			String s1[] = {"�̹�ȣ", "lmh@gmail.com", "01096980000", "����� ��õ�� ���굿"};
		
			MemberVO mvo = null;
			mvo = new MemberVO();	
			mvo.setName(s0[0]);
			mvo.setEmail(s0[1]);
			mvo.setHp(s0[2]);
			mvo.setAddr(s0[3]);
			
			TestMember4 tm_3 = new TestMember4();
			tm_3.memInsert(mvo);
		}
		if ("S".equals(isudFlag)) {
			System.out.println("��ȸ isudFlag >>> : " + isudFlag);
		}
		if ("U".equals(isudFlag)) {
			System.out.println("���� isudFlag >>> : " + isudFlag);
		}
		if ("D".equals(isudFlag)) {
			System.out.println("���� isudFlag >>> : " + isudFlag);
		}
	}

}
