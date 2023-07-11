package a.b.c.ch6;

public class ExceptionTest_2 {
	// 기본 생성자
	public ExceptionTest_2 () {
		System.out.println("ExceptionTest_2 ()  생성자 >>> : ");
	}
	
	public void aM() throws ArithmeticException {
		System.out.println("aM() 함수  >>> : ");				
		bM(); // bM() 함수를 호출한다(invoke).
	}

	public void bM() throws ArithmeticException {
		System.out.println("bM() 함수  >>> : ");				
		cM(); // cM() 함수를 호출한다(invoke).
	}
	
	public void cM() throws ArithmeticException{
		System.out.println("cM() 함수  >>> : ");		
		//에러가 발생되면 예외처리해야한다 :: throws, try catch 구문
		//throws 키워드를 통해 에러처리하고 다음 코드 실행한다
		System.out.println( 1 / 0);	// java.lang.ArithmeticException 에러 발생
		
		dM(); // dM() 함수를 호출한다(invoke).
	}
	
	public void dM() {		
		System.out.println("dM() 함수  >>> : ");		
	}

	// 개발자가 코드로 수행할 때는 main() 함수가 시작점이자 끝점이다.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("main() 함수 시작  >>> : ");
		
		try {
			
			ExceptionTest_2 et = new ExceptionTest_2();	// new 키워드 사용해여 ExceptionTest_2() 인스턴스 하고 주소값 를  ExceptionTest_2 타입 it 참조변수에 담는다	
			et.aM(); // et 참조변수 로 ExceptionTest_2() 인스턴스 접근하여 aM()를 호출한다
					// ExceptionTest_2() 의메서드 에서 throws 예외처리한다면 호출한 메서드(main)에서 try catch구문 써야한다
			
		}catch (ArithmeticException e) {
			System.out.println("e >>> : " + e);
		}
		
		System.out.println("main() 함수 끝 >>> : ");
	}


}
