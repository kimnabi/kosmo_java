package a.b.c.ch6;

public class InvoketionTest {
	
	//기본 생성자
	public InvoketionTest() {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자 InvoketionTest() >>>");
	}
	
	public void aM() {
		System.out.println("	aM() >>>");
		
	}//end of aM()
	public void bM() {
		System.out.println("	bM() >>>");
		
	}//end of bM()
	// main() 함수 : 자바 Console Application 시작점이다.
	// 개발자가 코드로 수행할 때는 main() 함수가 시작점이자 끝점이다.
	// ClassLoader 클래스의 init() 함수와 main() 함수가 자동으로 링킹된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoketionTest it = new InvoketionTest();	// new 키워드 사용해여 InvoketionTest() 인스턴스 하고 주소값 를  InvoketionTest 타입 it 참조변수에 담는다
		System.out.println("it 참조 변수 >>> : " + it); //  it 참조 변수 >>> : a.b.c.ch6.InvoketionTest@15db9742
		new InvoketionTest(); // new 키워드 사용해여 InvoketionTest() 인스턴스 하고 주소값 를this에 담는다	
		System.out.println("-----------------------------"); //  it 참조 변수 >>> : a.b.c.ch6.InvoketionTest@15db9742
		System.out.println(" 참조 변수 >>> : " + it); //  a.b.c.ch6.InvoketionTest@15db9742
		
	}

}
