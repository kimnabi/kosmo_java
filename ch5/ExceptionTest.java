package a.b.c.ch5;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// null, "", 0.12d, "a", "��" ..... etc
//		String s = "";
		String s = "12";
		
		try {
			
			if (s !=null &&s.length() > 0) {
				//���ڿ� ���� �� Int Ÿ������ ��ȯ�ϴ�  Integer.parseInt(String s)
				int iV = Integer.parseInt(s);
				System.out.println("iv >>> : "+ iV);
			} //end if
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("������ >>> : e :: " + e);
			e.printStackTrace();
		/*	java.lang.NumberFormatException: For input string: "12����"
				at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
				at java.lang.Integer.parseInt(Integer.java:580)
				at java.lang.Integer.parseInt(Integer.java:615)
				at a.b.c.ch5.ExceptionTest.main(ExceptionTest.java:14) */
		}
	}

}
