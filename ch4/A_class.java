package a.b.c.ch4;

/**
 * @author kasmo
 *
 */
public class A_class implements A_interface {
	// @ : ��������̼� : �ڹٿ��� ����ϴ� ��� �̸� 
	// 1. �ּ� : �ش� ����� �����ϴ� ��Ȱ 
	// 2. ����� ���� : ������ Ŭ���� �� �������̽��� �̿��ؼ� ����� ���� �ȴ�.
	@Override // �������̵� ������̼� Annotation : �θ�(����)Ŭ�������� ������ �Լ��̴�.
	public void b_interfaceMethod() {
		// TODO Auto-generated method stub
          System.out.println("b_interfaceMethod() >>> : ");
	}

	@Override
	public void ba_interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("ba_interfaceMethod() >>> : ");
		
	}

	@Override
	public void bb_interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("bb_interfaceMethod() >>> : ");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	A_class ac = new A_class();
	ac.b_interfaceMethod();
	ac.ba_interfaceMethod();
	ac.bb_interfaceMethod();
	
	}//end of main

} //end of A_class

