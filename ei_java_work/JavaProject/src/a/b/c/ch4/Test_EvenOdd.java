package a.b.c.ch4;
/**
 * 
 * ¦�� Ȧ�� �� ������ ����Ͻÿ�
 * @author ����ȯ
 *
 */
public class Test_EvenOdd {
	
	public static void main(String[] args) {
		
		int evenCnt = 0; // ¦�� ���� ���� int Ÿ�� ���� ����
		int oddCnt = 0;  // Ȧ�� ���� ���� int Ÿ�� ���� ����
		// int �� Ÿ�� �������� num �� int �� �ڷ��� �迭�� �ּҸ� ����Ű�� �Ѱ��� �ּ� ���� ��´�
		int[] num = /*new int[]*/ {3, 4, 5, 6, 7, 10, 15, 16}; // int �� �迭 �ν��Ͻ��ϰ� 
		//��ü �迭  ���� ���� ������ ��������� �� index ���� �ϳ��� ���ͷ� ������ �����Ͽ� �ʱ�ȭ �Ѵ�
		
		// �ֿܼ� ¦�� even, Ȧ�� odd �� ������ ��� �Ͻÿ� 
		for (int i=0; i < num.length; i++) {
			//�迭�� ���� ��ŭ �����ǰ����� index�� i �������� ��  ���������� ������ i ���� �Ҵ��Ͽ�
            //������ ���� ȣ���Ͽ� �ֿܼ� ��� �Ѵ�
			System.out.println("num["+i+"] >>> : " + num[i]);
			// ���������� : ¦���϶� num[i]%2 == 0 
			// ¦�� �϶� if �� �� ����ȴ� 
            if (num[i]%2 == 0) {
             
                //�ֿܼ� num ���������� ����Ű�� int Ÿ�� �迭�� �ε��� i ��° int Ÿ�� ���� ����Ѵ�
				System.out.println("num["+i+"] <<<>>> : " + num[i]);
                //�迭�� ���� ��ŭ �ݺ��ϸ� ¦���ǰ����� �����Ͽ� 
                //evenCnt�� ������ �ϳ��� �����ؼ� �����Ѵ�
				evenCnt++; // evenCnt = evenCnt +1;
			}else {
                //Ȧ���϶�
                //�ֿܼ� num ���������� ����Ű�� int Ÿ�� �迭�� �ε��� i ��° int Ÿ�԰��� ����Ѵ�
				System.out.println("num["+i+"] >>><<< : " + num[i]);
				//�迭�� ���� ��ŭ �ݺ��ϸ� Ȧ���ǰ����� �����Ͽ� 
                //oddCnt�� ������ �ϳ��� �����ؼ� �����Ѵ�
                oddCnt++; // oddCnt = oddCnt +1;
			}
		}
    //for ���� ����ǰ� evenCnt ������ oddCnt ������ �ֿܼ� ����Ѵ�
		System.out.println("¦���� >>> : " + evenCnt + "�� �Դϴ�.");
		System.out.println("Ȧ���� >>> : " + oddCnt + "�� �Դϴ�.");
	} // end of main function

} //end of Test_EvenOdd class
