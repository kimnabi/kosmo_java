package a.b.c.ch4;

import java.util.ArrayList;
// �� �������̽� Ŭ���� MemberDAO
// ����Ÿ���̽� ���� �� CRUD �Լ�  ����
public interface MemberDAO {
      
	public int memInsert(MemberVO mvo);
	public ArrayList memSelect(MemberVO mvo);
	public int memUpdate(MemberVO mvo);
	public int memDelete(MemberVO mvo);
}
