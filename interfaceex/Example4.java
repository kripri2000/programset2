package interfaceex;

interface Printable{
	void print();
}
interface Showable{
	void print();
}

class Test implements Printable,Showable{
	public void print() {
		System.out.println("Hello");
	}
}


public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.print();

	}

}
