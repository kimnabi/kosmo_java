package a.b.c.ch1;
import a.b.c.ch1.aa.*;

public class VarTest_6 {

	int i;
	String str;

	public static void main(String[] args) {
		
		VarClass vc = new VarClass();
		System.out.println("vc �������� �ּҰ� >>> : " + vc);
		System.out.println("vc.i >>> : " + vc.i);
		System.out.println("vc.str >>> : " + vc.str);
		vc.i = 32;
		vc.str = "�̹�ȣ";
		System.out.println("vc.i >>> : " + vc.i);
		System.out.println("vc.str >>> : " + vc.str);
		
		//���� ��Ű������ �ִ� Ŭ���� VarClass_1
		// VarTest6 �� VarClass_2 ����ҷ��� *.class ���Ϸ� �������Ͽ� �����´�
		VarClass_1 vc_1 = new VarClass_1(); 
		vc_1.i = 10;
		vc_1.str = "ī��ġ";
		System.out.println("vc_1 �������� �ּҰ� >>> : " + vc_1);
		System.out.println("vc_1.i >>> : " + vc_1.i);
		System.out.println("vc_1.str >>> : " + vc_1.str);
		//�ٸ� ��Ű���� �ִ� Ŭ���� VarClass_2
		//�������Ҷ� import �ؼ� �ڹ������� �������ų� 
		// ��������� a.b.c.ch1.aa.VarClass_2 vc_2 = new a.b.c.ch1.aa.VarClass_2(); �����ؾ� �Ѵ�
		VarClass_2 vc_2 = new VarClass_2();
		vc_2.i = 40;
		vc_2.str = "����ġ";
		System.out.println("vc_2 �������� �ּҰ� >>> : " + vc_2);
		System.out.println("vc_2.i >>> : " + vc_2.i);
		System.out.println("vc_2.str >>> : " + vc_2.str);
	}//end of main function
} //end of VarTest_6 class

// VarTest_6.java ���� ���ο� �ִ� Ŭ���� 
class VarClass{

	int i;
	String str;

} // end of VarClass class