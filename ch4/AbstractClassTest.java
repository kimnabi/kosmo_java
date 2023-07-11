/**
 * 
 */
package a.b.c.ch4;

import java.text.SimpleDateFormat;
import java.util.Date;

import a.b.c.common.DateFormatUtil;

/**
 * @author kasmo
 *
 */
public class AbstractClassTest extends AbstractClass {

	public AbstractClassTest() {
		System.out.println("AbstractClassTest() ������ >>> : ");
	}
	// �߻� Ŭ������ �߻��Լ��� 
	// �߻�Ŭ������ extends Ű����� ����ؼ� 
	// �߻��Լ��� override �ؼ� ����Ѵ�. 
	
	// @ : ��������̼� : �ڹٿ��� ����ϴ� ��� �̸� 
	// 1. �ּ� : �ش� ����� �����ϴ� ��Ȱ 
	// 2. ����� ���� : ������ Ŭ���� �� �������̽��� �̿��ؼ� ����� ���� �ȴ�.
	@Override // �������̵� ������̼� Annotation : �θ�(����)Ŭ�������� ������ �Լ��̴�.
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstractMethod() >>> : �θ� Ŭ���� ������ ");
	} //end of abstractMethod
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �߻�Ŭ������ new �����ڷ� ����� �� ����.
		// �߻�Ŭ������ new �����ڷ� �ν��Ͻ��� �� �� ����.
		// AbstractClass ab = new AbstractClass();
		// AbstractClassTest Ŭ���� �ν��Ͻ� ���� �ϰ� 
		// AbstractClassTest ����� ���� Ÿ�� act ���� ������  �ּҰ� �Ҵ�
		AbstractClassTest act = new AbstractClassTest();
		// �������� act�� ���ٿ����� �� abstractMethod() ȣ���Ѵ� 
		act.abstractMethod();
		// ȸ����ȣ ����� 
		//Date �ν��Ͻ� �����ϰ� �������� d�� new Ű���带 ���� �޸𸮿� ���ο� ��������� �Ҵ��ϰ� �ּ�
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		String ymd = sdf.format(d);
		System.out.println("ymd >>> : " + ymd);
		String mnum = AbstractClass.BIZ_GUBUN_MEMBER + ymd + "0001";
		System.out.println("mnum >>> : " + mnum);
//			String mnum = AbstractClass.BIZ_GUBUN_MEMBER + "20230310" + "0001";
		// �Խ��� ��ȣ ����� 
				String bnum = AbstractClass.BIZ_GUBUN_BORDER 
								+ DateFormatUtil.ymdFormat()
								+ "0001";
				System.out.println("bnum >>> : " + bnum);
	} //end of main
} //end of AbstractClassTest class
		

			
			
		

