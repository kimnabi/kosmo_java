package a.b.c.ch1;

public class VarTest_2 {

	//�Ű����� int �� x �� y �� �޾� int �� �� ��ȯ�ϴ� �Լ��̴�
	public static int add(int x, int y) {
		// int �ڷ����� ������ i �����ϰ� �Ķ���� ���� x �� �ʱ�ȭ �Ѵ�.
		int i = x;
		// int �ڷ����� ������ ii �����ϰ� �Ķ���� ���� y �� �ʱ�ȭ �Ѵ�.
		int ii = y;
		// int �ڷ����� ������ sum �����Ѵ� i�� ii (����)�� ���ϱ� �����Ͽ� �ʱ�ȭ �Ѵ�
		int sum = i + ii;
		//return Ű���带 ����Ͽ� sum �� �Լ��� ��� �� �� �����Ͽ� ��ȯ�Ѵ� 
		return sum;
	} //end of add() function

	public static void main(String[] args) {
		// int �ڷ����� ������ a �����ϰ� ���ͷ� �� 1 �� �ʱ�ȭ �Ѵ�.
		int a = 1;
		// int �ڷ����� ������ b �����ϰ� ���ͷ� �� 2 �� �ʱ�ȭ �Ѵ�
		int b = 2;
		// VarTest_2 Ŭ���� ���ο� �ִ� add(int x, int y) 
		// �Լ��� ȣ��(invoke, call, �ҷ���)�ؼ� �ʱ�ȭ �ߴ�.
        // add �Լ����� ���ͷ� 1, 2�� ���ڷ� �޾� int �� x,y�� �����Ͽ� ��ȯ�� int ���ϰ��� int �� sum�� �ʱ�ȭ�Ѵ�
		int sum = add(1, 2);
		// int sum �� ����� ���� ȣ���ؼ� �ֿܼ� ����Ѵ�.
		System.out.println("sum >>> : " + sum);
		// add (int x, int y)�Լ����� �ƱԸ�Ʈ�� �������� a,b �� �� �����Ͽ� 
		// int �ڷ��� sum_1�� add(a, b) ȣ�� �� �Լ��� ������ �ʱ�ȭ �Ѵ�
		int sum_1 = add(a, b);
		System.out.println("sum_1 >>> : " + sum_1);
		
	} //end of main() function
} //end of VarTest_2
