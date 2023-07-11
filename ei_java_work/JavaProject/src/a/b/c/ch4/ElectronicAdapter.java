package a.b.c.ch4;

public class ElectronicAdapter implements Electronic110v {
	
		//Electronic220v�� ��ü�� ������ �ְ� 
		private Electronic220v electronic220v;
		
		//��ó�� �����ڿ� Electronic220v�� �־� ������ �ִ´� 
		public ElectronicAdapter(Electronic220v electronic220v) {
			this.electronic220v = electronic220v;
		}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		electronic220v.connect();
	}

}
