package a.b.c.ch1;

public class ConstTest_2 {
	
	// �ɹ����� ����
	int i; // int �ڷ��� i �� �ν��Ͻ� ��  0 ����Ʈ ������ ������
	String s; // String �ڷ����� �ν��Ͻ� �� null ����Ʈ������ ����
	// �����ڰ� �⺻ �������� �ڵ带 ���
	
	public ConstTest_2() {
		System.out.println("ConstTest_2() ������ ���� >>> : ");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main() �Լ� ���� >>> : ");

		ConstTest_2 ct_2 = new ConstTest_2(); // �⺻������ ConstTest_2() ã�Ƽ� �ν��Ͻ��� ����� �ش�
		System.out.println("cj_2 �������� >>> : " + ct_2);
		System.out.println("cj_2.i >>> : " + ct_2.i);
		System.out.println("cj_2.s >>> : " + ct_2.s);
	} //end of main() function
} // end of ConstTest_2 class
/*
C:\00.KOSMO129\10.JExam\ch1>javap a.b.c.ch1.ConstTest_2
Compiled from "ConstTest_2.java"
public class a.b.c.ch1.ConstTest_2 {
  int i;
  java.lang.String s;
  public a.b.c.ch1.ConstTest_2();
  public static void main(java.lang.String[]);
}

C:\00.KOSMO129\10.JExam\ch1>
*/