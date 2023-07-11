package a.b.c.ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();			
		list.add("홍준표");
		list.add("강호경");
		list.add("윤영기");
		
		System.out.println("정렬 전 : 소트 전 >>> : " + list);
		// sort(List<T> list, Comparator<? super T> c)
		//public static void sort(List list) 1.4jdk
		Collections.sort(list);		
		System.out.println("정렬 후 : 소트 후 >>> : " + list);
		
		Collections.reverse(list);		
		System.out.println("역순 >>> : " + list);
	}//end of main
}// end of ArrayListTset1 class

