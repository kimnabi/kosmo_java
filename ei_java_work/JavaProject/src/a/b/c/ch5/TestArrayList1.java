package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestArrayList1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "name";
		String email = "email";
		String hp = "010";
		String addr = "�����";
		//���׸�Ÿ�� : String HashMap<String, String>
		ArrayList<HashMap<String, String>> aList 
			= new ArrayList<HashMap<String, String>>(); // ArrayList<HashMap<String, String>> Ŭ���� �ν��Ͻ� �����ϰ� �������� aList �� ����Ų��
	
		for (int i=0; i < 10; i++) { // HashMap<String, String> �ν��Ͻ��� 10�� �����ϱ� ���� �ݺ��� �Ѵ�
			//���׸� Ÿ��:String hashMap {Ű ,Value} �����ε� Ű�� Value Ÿ���� String ���� ����
			HashMap<String, String> hm = new HashMap<String, String>();// HashMap<String, String>Ŭ���� �ν��Ͻ� �����ϰ� �������� hm�� ����Ų��
			hm.put("�̸�", name + "_" + i); // {Ű ,Value} = {"�̸�","name_i"} �� �ʱ�ȭ
			hm.put("�̸���", email + "_" + i);// {Ű ,Value} ={"�̸���","email_i"}
			hm.put("hp", hp + "_" + i); // {Ű ,Value} ={"hp","hp_i"}
			hm.put("�ּ�", addr + "_" + i); // {Ű ,Value} ={"�ּ�","addr_i"}
			
			aList.add(hm); //
			System.out.println(aList);
		} //end for
		
		for (int i=0; i < aList.size(); i++) {
			
			HashMap<String, String> _hm = aList.get(i);
			
			Iterator<String> keys = _hm.keySet().iterator();
			while (keys.hasNext()) {
				String key = keys.next();
				System.out.print(key + "=" + _hm.get(key) + " ");			
			}//end while	
			System.out.print("\n");
		}//end for	
	}//end of main
}// end of ArrayListTset1 class

