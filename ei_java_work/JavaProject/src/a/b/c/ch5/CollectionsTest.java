package a.b.c.ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();			
		list.add("ȫ��ǥ");
		list.add("��ȣ��");
		list.add("������");
		
		System.out.println("���� �� : ��Ʈ �� >>> : " + list);
		// sort(List<T> list, Comparator<? super T> c)
		//public static void sort(List list) 1.4jdk
		Collections.sort(list);		
		System.out.println("���� �� : ��Ʈ �� >>> : " + list);
		
		Collections.reverse(list);		
		System.out.println("���� >>> : " + list);
	}//end of main
}// end of ArrayListTset1 class

