package a.b.c.ch1;

public class VarTest_3 
{
	//int �ڷ��� �ɹ����� i�� �����Ѵ�
	int i; 
	
	public static void main(String[] args) 
	{
		//������Ʈ�� ���� : �������� : reference variable
		// s : ��������
		String s = "ABC"; //String �� s ��"ABC" ���ڿ� �ν��Ͻ� �� ����Ű�� ������ �ʱ�ȭ �Ѵ� 
		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		// vt : ��������
		//new Ű���带 �̿��Ͽ� ��������� VarTest_3 �� �ν��Ͻ��� ����Ű�� ������ �ʱ�ȭ �Ѵ�
		VarTest_3 vt = new VarTest_3();
		
		System.out.println(vt);
		System.out.println(System.identityHashCode(vt));
		System.out.println(vt.i);
	}// end of main function

}// end od VarTest_3
