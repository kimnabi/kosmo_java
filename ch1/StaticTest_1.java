package a.b.c.ch1;

public class StaticTest_1 {
	
	public static int aM(int x,int y) {
	//aM �Լ��� �Ű����� x,y �����ϰ� int �ڷ��� x+y �ո� ��ȯ�Ѵ� 
	return x + y;
	}
	public static void bM(int x,int y) {
	//bM �Լ��� �Ű����� x,y �����ϰ� x+y �ո� ȣ���Ͽ� �ֿܼ� ����Ѵ� 
		System.out.println(x + y);
	}
	public static void main(String[] args) {
		System.out.println("main() �Լ� ���� >>> :");
		int am = StaticTest_1.aM(1, 2);
		System.out.println("am �Լ� ���� >>> :" + am);
		//StaticTest_1.aM �Լ��� �ƱԸ�Ʈ 1,2�� �޾� int �ڷ��� ���ϰ��� ȣ���Ͽ� �ֿܼ� ����Ѵ� 
		System.out.println("StaticTest_1.aM(1, 2) �Լ� ���� >>> : " + StaticTest_1.aM(1, 2));
		StaticTest_1.aM(11, 22);
	} // end of main() function	
} // end of StaticTest_1 class
