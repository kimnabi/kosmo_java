package a.b.c.ch5;

import java.util.ArrayList;

public class ArrayListTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List ���� ��ҵ��� ���� �ٸ� ����Ÿ Ÿ�Ը�  ������ �־ ����ȯ ������ ���ü��ֱ�  ������
		//���׸� Ÿ���� �Ἥ �̸� ����ŸŸ�Ը� �˷��༭ �����Ͻ� �̳� ��Ÿ�ӽ� ���� �߻� ���
		// ���׸����� ������� ���� ��� >
		// ���Ÿ���� "add(Object)" Object������ List�� Add�� 
        // ���� �ֹǷ�, List���� �ڷḦ �����ö��� ������ �´� ����ȯ��
		// �� ���־�� �ϱ� ������ ���� �Ӵ�.
		// ������Ÿ�� ArrayList Ŭ����  aList ���������� ArrayList Ŭ���� �ν��Ͻ� ����
		// ArrayList Ŭ���� ��ҵ��� ����ŸŸ�� ���� String Ÿ������ �����Ѵ� :���׸� Ÿ��
		ArrayList<String> aList = new ArrayList<String>();
		System.out.println("aList >>> : " + aList); //����Ʈ������ �ּҰ� ��� ����Ʈ �迭���� ��ȯ
		System.out.println("aList >>> : " + System.identityHashCode(aList)); //  ArrayList() �ν��Ͻ��� �ּҰ�
		// public int size()
		System.out.println("aList.size() >>> : " + aList.size()); // aList �� ����Ű�� ArrayList() �ν��Ͻ� �� size() �����Ͽ� 
																  // ArrayList() �� ��ҵ��� ���� ��ȯ
		
		// public boolean add(E e) : jdk 1.8
		// public boolean add(Object o) : jdk 1.4 
		boolean b_0 = aList.add("�̽���");//  ArrayList() �� �Ѱ� �����  ���������� �߰��Ѵ� aList.add("�̽���") : 
//		boolean b_0 = aList.add("�̽���");       // ArrayList() �ȿ� �Ѱ��� ��ҿ�"�̽���" ���ڿ��� �߰��Ѵ�
		System.out.println("b_0 >>> : " + b_0);
		System.out.println("aList >>> : " + aList);		//  ArrayList() �ν��Ͻ��� �ּҰ�
		System.out.println("aList.size() >>> : " + aList.size());  // ArrayList() �� ��ҵ��� ���� ��ȯ
		

//		boolean b_1 = aList.add(31); // ArrayList() �ȿ� �Ѱ��� ��ҿ� ���ͷ� Int �� 31�� �߰��Ѵ�
//		System.out.println("b_1 >>> : " + b_1);
//		System.out.println("aList >>> : " + aList);		
//		System.out.println("aList.size() >>> : " + aList.size());
//		
//		boolean b_2 = aList.add('L');// ArrayList() �ȿ� �Ѱ��� ��ҿ� ���ͷ� char �� 'L'�� �߰��Ѵ�
//		System.out.println("b_2 >>> : " + b_2);
//		System.out.println("aList >>> : " + aList);		
//		System.out.println("aList.size() >>> : " + aList.size());
//		
//		boolean b_3 = aList.add(3.2);
//		System.out.println("b_3 >>> : " + b_3);
//		System.out.println("aList >>> : " + aList);		
//		System.out.println("aList.size() >>> : " + aList.size());
//		
//		boolean b_4 = aList.add(new Integer(35000000));
//		System.out.println("b_4 >>> : " + b_4);
//		System.out.println("aList >>> : " + aList);		
//		System.out.println("aList.size() >>> : " + aList.size());
		
		boolean b_5 = aList.add(new String("����� ��걸 ��ȿ��"));
		System.out.println("b_5 >>> : " + b_5);
		System.out.println("aList >>> : " + aList);		
		System.out.println("aList.size() >>> : " + aList.size());
		
		for (int i=0; i < aList.size(); i++) {
			// public E get(int index) : jdk 1.8
			// public Object get(int index) : jdk 1.4
			System.out.println(i + " >>> : " + aList.get(i));
		}
	}

}
