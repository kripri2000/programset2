package interfaceex;

interface Print{
	void print();
}
interface Show extends Print{
	void show();
}
public class Example5  implements Show{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example5 e = new Example5();
		e.print();
		e.show();
	}

}
