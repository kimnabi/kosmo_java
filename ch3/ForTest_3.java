package a.b.c.ch3;
/* 
�䱸����  ���ڿ� 54321�� �� �� ���Ͻÿ�

*/
public class ForTest_3 {
	public static void main(String[] args) 
	{
		/* 
			"54321"
		    5 53  char '5'�� �ƽ�Ű�ڵ�
		    4 52  char '4'
			3 51  char '3'
			2 50
			1 49
		*/
		
		String s = "54321";
		int res = 0;
		for (int ii =0;ii< s.length; ii++ )
		{
			res += s.charAt(ii) - '0'; //�ƽ�Ű�ڵ� 48
		}//end of for

		char c[] = s.toCharArray(); // char �迭�� ��ȯ
		int sum =0 ; //���� �� �������� ����
		for (int i =0 ;i< c.length ; i++ )
		{
			System.out.println("c[i] >>> : "+ c[i]);
			//Integer.parseInt �̿��� ����ȯ
			/*String tem = Character.toString(c[i]);//char --> String ����ȯ
			//System.out.println(tem);
			//int ii = Integer.parseInt(tem); //String --> int ����ȯ*/
			sum+= Integer.parseInt(c[i].toString()); // String --> int ����ȯ
			

			//Character.getNumericValue(c[i]); //char --> int ����ȯ�ϴ� �Լ�
			//sum += Character.getNumericValue(c[i]);//sum = sum + Character.getNumericValue(c[i]); //char --> int ����ȯ�ϴ� �Լ�
		} // end of for
		System.out.println("sum >>> : "+ sum);
	} //end of main
} //end of ForTest_3 class
