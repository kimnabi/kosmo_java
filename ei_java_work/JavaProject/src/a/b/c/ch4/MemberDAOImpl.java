package a.b.c.ch4;

import java.util.ArrayList;
// MemberDAO ���� Ŭ����
public class MemberDAOImpl implements MemberDAO {

	@Override
	public int memInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl :: memInsert() �Լ� >>> :"+mvo.getName());
		System.out.println("MemberDAOImpl :: memInsert() �Լ� >>> :"+mvo.getEmail());
		System.out.println("MemberDAOImpl :: memInsert() �Լ� >>> :"+mvo.getHp());
		System.out.println("MemberDAOImpl :: memInsert() �Լ� >>> :"+mvo.getAddr());
		return 0;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ArrayList memSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("memSelect() �Լ� >>> :");
		return null;
	}

	@Override
	public int memUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("memUpdate() �Լ� >>> :");
		return 0;
	}

	@Override
	public int memDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("memDlete() �Լ� >>> :");
		return 0;
	}

}
