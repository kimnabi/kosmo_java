package a.b.c.ch5;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// null, "", 0.12d, "a", "삼" ..... etc
//		String s = "";
		String s = "12";
		
		try {
			
			if (s !=null &&s.length() > 0) {
				//문자열 숫자 가 Int 타입으로 변환하는  Integer.parseInt(String s)
				int iV = Integer.parseInt(s);
				System.out.println("iv >>> : "+ iV);
			} //end if
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러가 >>> : e :: " + e);
			e.printStackTrace();
		/*	java.lang.NumberFormatException: For input string: "12ㄷㅏ"
				at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
				at java.lang.Integer.parseInt(Integer.java:580)
				at java.lang.Integer.parseInt(Integer.java:615)
				at a.b.c.ch5.ExceptionTest.main(ExceptionTest.java:14) */
		}
	}

}
