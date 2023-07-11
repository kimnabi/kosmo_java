package a.b.c.ch3;
/**
�ֿܼ��� ���� �Է¹޾� ��Ģ�����ϼ���

*/
public class IfTest_4_1 {
	// �� ���� �޾� ���ϱ� ���� �ϴ� �Լ�
	// param : int x ,int y
	// return : int 
	public int addSum_3(int x, int y) {
		System.out.println("	addSum_3 �Լ� ���� >>> : ");
		int sum = x + y;		
		System.out.println("	addSum_3 �Լ� �� >>> : ");
		return sum;
	}

	// �� ���� �޾� ���� ���� �ϴ� �Լ�
	// param : int x ,int y
	// return : int 
	public int subSum_3(int x, int y) {
		System.out.println("	subSum_3 �Լ� ���� >>> : ");
		int sum = x - y;
		System.out.println("	subSum_3 �Լ� ���� >>> : ");
		return sum;
	}
	// �� ���� �޾� ���ϱ� ���� �ϴ� �Լ�
	// param : int x ,int y
	// return : int 
	public int mulSum_3(int x, int y) {
		System.out.println("	mulSum_3 �Լ� ���� >>> : ");
		int sum = x * y;
		System.out.println("	mulSum_3 �Լ� ���� >>> : ");
		return sum;
	}
	// �� ���� �޾� ������ ���� �ϴ� �Լ�
	// param : int x ,int y
	// return : int 
	public int divSum_3(int x, int y) {
		System.out.println("	divSum_3 �Լ� ���� >>> : ");
		int sum = x / y;
		System.out.println("	divSum_3 �Լ� ���� >>> : ");
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("main() �Լ� ���� >>> : ");
		System.out.println("args[0] �Լ� >>> : " + args[0]);
		System.out.println("args[1] �Լ� >>> : " + args[1]);
		System.out.println("args[2] �Լ� >>> : " + args[2]);

		if (args.length == 3)
		{
			String s0 = args[0]; // ������ 
			String s1 = args[1]; // ù��° ����			
			String s2 = args[2]; // �ι�° ���� 

			System.out.println("s0 >>> : " + s0);
			System.out.println("s1 >>> : " + s1);
			System.out.println("s2 >>> : " + s2);

			// ������ 
			char s0C = s0.charAt(0);
			// ����
			int x = Integer.parseInt(s1); 
			int y = Integer.parseInt(s2);
			
			// ���ϱ� ������ ��� �Ʒ��� if ���� �����Ѵ�
			if (s0C == 0x2b){
				// IfTest_4_1 Ŭ������ int addSum_3(int x, int y)�� �̿��ϱ� ����
				// if �� ������ �о� ����ɶ� new Ű���带 ���� �޸𸮿� �ø���
				// ������������ ���� ���� it2 �� IfTest_4_1() Ŭ������ ��ġ���� �����Ͽ� �ʱ�ȭ�Ѵ�
				IfTest_4_1 it2 = new IfTest_4_1();
				
				int sum = it2.addSum_3(x, y);
				System.out.println(x + " + " + y + " = " + sum);
			} //end of if

			// ���� ������ ��� if ���� �����Ѵ�
			if (s0C == 0x2d){
				// IfTest_4_1 Ŭ������ int subSum_3(int x, int y)�� �̿��ϱ� ����
				// if �� ������ �о� ����ɶ� new Ű���带 ���� �޸𸮿� �ø���
				// ������������ ���� ���� it2 �� IfTest_4_1() Ŭ������ ��ġ���� �����Ͽ� �ʱ�ȭ�Ѵ�
				IfTest_4_1 it2 = new IfTest_4_1();
				int sum = it2.subSum_3(x, y);
				System.out.println(x + " - " + y + " = " + sum);
			}//end of if
			
			// ���ϱ� ������ ��� if ���� �����Ѵ�
			if (s0C == 0x2a){
				// IfTest_4_1 Ŭ������ int mulSum_3(int x, int y)�� �̿��ϱ� ����
				// if �� ������ �о� ����ɶ� new Ű���带 ���� �޸𸮿� �ø���
				// ������������ ���� ���� it2 �� IfTest_4_1() Ŭ������ ��ġ���� �����Ͽ� �ʱ�ȭ�Ѵ�		
				IfTest_4_1 it2 = new IfTest_4_1();
				int sum = it2.mulSum_3(x, y);
				System.out.println(x + " * " + y + " = " + sum);
			}//end of if
			
			// ������ ������ ��� if ���� �����Ѵ�
			if (s0C == 0x2f){
				System.out.println("if  >>> : " );
				// IfTest_4_1 Ŭ������ int mulSum_3(int x, int y)�� �̿��ϱ� ����
				// if �� ������ �о� ����ɶ� new Ű���带 ���� �޸𸮿� �ø���
				// ������������ ���� ���� it2 �� IfTest_4_1() Ŭ������ ��ġ���� �����Ͽ� �ʱ�ȭ�Ѵ�
				IfTest_4_1 it2 = new IfTest_4_1();
				int sum = it2.divSum_3(x, y);
				System.out.println(x + " / " + y + " = " + sum);
			} //end of if
		}//end of if
		System.out.println("main() �Լ� �� >>> : ");
	} // end of main
} //end of IfTest_4_1 class
