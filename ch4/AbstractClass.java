/**
 * 
 */
package a.b.c.ch4;

/**
 * 
 * 
 * @author ����ȯ
 *
 */
// class Ű���� �տ� abstract Ű���带 ���̸� �߻� Ŭ������� �Ѵ�.
// �߻�Ŭ����������
// �߻��Լ�, �Ϲ��Լ��� ���� ����� �� �ִ�.
public abstract class AbstractClass extends java.lang.Object {

	// ��� 
	public static final String BIZ_GUBUN_MEMBER = "M"; // ȸ����ȣ ������
	public static final String BIZ_GUBUN_BORDER = "B"; // �Խ��� ������	
	

	/**
	 * 
	 * ������ 
	 */
	public AbstractClass() {
		// TODO Auto-generated constructor stub
		System.out.println("AbstractClass() ������ >>> : ");
	}
		
	public abstract void abstractMethod();
		
		// �Ϲ��Լ�
	public static void aM() {
			System.out.println("�߻� Ŭ������ �ִ� aM() �Ϲ��Լ� ");
	} // end of aM
} //end of AbstractClass class


