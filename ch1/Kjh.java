package a.b.c.ch1;

public class Kjh {
	// ����� ���� class kjh�� �ɹ����� ����
	byte b;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;

	String str;

	public static void main(String[] args) {

		int i = 1;
		// ����� ���� Ŭ���� Kjh ���������̸鼭 �������� kj��  
		// new Ű���带 �̿��Ͽ� ���ʿ� ������ ����� ���� Ŭ���� Kjh�� �޸𸮿� �ø��ٰ� ��û �Ѵ�
		// ������ Kjh() �� ã�Ƽ� �ν��Ͻ�(��ü ����) �Ѵ�
		// ��ü ������ ��������� default ������ �ʱ�ȭ �Ѵ�
		Kjh kj = new Kjh();	
		// kj �� ��ġ���� ��� �Ѵ�
		System.out.println("kj >>> :" + kj);
		// kj�� �ɹ������� byte �ڷ��� b�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.b >>> :" + kj.b);
		// kj�� �ɹ������� char �ڷ��� c�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.c >>> :" + kj.c);
		// kj�� �ɹ������� short �ڷ��� s�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.s >>> :" + kj.s);
		// kj�� �ɹ������� int �ڷ��� i�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.i >>> :" + kj.i);
		// kj�� �ɹ������� long �ڷ��� l�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.l >>> :" + kj.l);
		// kj�� �ɹ������� float �ڷ��� f�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.f >>> :" + kj.f);
		// kj�� �ɹ������� double �ڷ��� d�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.d >>> :" + kj.d);
		// kj�� �ɹ������� boolean �ڷ��� bool�� ȣ���ؼ� ���� �ֿܼ� ����Ѵ�.
		System.out.println("kj.bool >>> :" + kj.bool);
		
		Kjh kj_1 = new Kjh();
		// ����� ����� ���� kjh Ŭ���� �� �ν��Ͻ� �� ���� ���� kj_1�� ȣ���ؼ� �ֿܼ� ��� �Ѵ�
		System.out.println("kj_1 ���������� �ּҰ� >>> : " + kj_1);
	} //end of main function
} // end of Kjh class
