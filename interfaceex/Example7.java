package interfaceex;

interface Showable1{
	void show();
	interface Message{
		void msg();
	}
}
class NestedInterface implements Showable1.Message{
	public void msg() {
		System.out.println("Hello Nested Interface");
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable1.Message m = new NestedInterface();
		m.msg();
			
			

	}

}
