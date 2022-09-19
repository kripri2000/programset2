package interfaceex;

interface Drawable1{
	void draw();
	static int cube(int x) {
		return x*x*x;
	}
}
class Rectangle1 implements Drawable1{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}


public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable1 d = new Rectangle1();
		d.draw();
		System.out.println(Drawable1.cube(4));

	}

}
