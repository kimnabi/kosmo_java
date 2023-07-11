package a.b.c.ch6;

/*

예외처리 구문
------------------------
try {} catch() {} finally {} 구문 : 예외 처리하기 : 에러가 발생해도 예외처리해서 프로그램을 정상 수행하기 
throws 키워드 : 예외 처리 미루기 : 호출한 함수에 예외 던지기 : 콘솔 어플리케이션에서는 main() 함수에서 예외 처리하기 
throw 키워드 : 사용자 정의 예외 : 개발자가 예외 클래스 직접 만들기 

Exception : 예외 클래스의 최상위 클래스 
	Checked Exception					UnChecked Exception
	-----------------------				-----------------------
	컴파일 할 때 							실행할 때
	반드시 예외 처리를 해야 한다. 				명시적으로 하지 않아도 된다.
	예외 발생시 롤백을 하지 않음					예외 발생시 롤백을 해야 한다.
	IOException							NullPointerException
	ClassNotFoundException etc. 		ClassCastException  etc.
	 
*/

public class ExceptionTest_5 {
	//
	public ExceptionTest_5 () {
		System.out.println("ExceptionTest_5 ()  생성자 >>> : ");
	}	

	// 개발자가 코드로 수행할 때는 main() 함수가 시작점이자 끝점이다.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("main() 함수 시작  >>> : ");
		
		try {
			throw new Exception("오류 메시지 <<<>>> : ");	//개발자가 런타임 시 명시적으로 오류처리 던지고 계속 함수 블럭 끝까지 진행된다
		}catch(Exception e) {
			//던져진 예외처리가있을때 콘솔로 출력한다
			System.out.println("e >>> : " + e);
			System.out.println("e.getMessage() >>> : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("main() 함수 끝 >>> : ");
	}

}
/*
main() 함수 시작  >>> : 
e >>> : java.lang.Exception: 오류 메시지 <<<>>> : 
e.getMessage() >>> : 오류 메시지 <<<>>> : 
java.lang.Exception: 오류 메시지 <<<>>> : 
main() 함수 끝 >>> : 
	at a.b.c.ch6.ExceptionTest_5.main(ExceptionTest_5.java:34) */