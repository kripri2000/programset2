package interfaceex;

interface Drawable{
	void draw();
}
class Rectangle implements Drawable{ //implemented by first user
	public void draw() {
		System.out.println("Drawing Rectangle");
}
class Circle implements Drawable{    //implemented by second user
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
}
public class Example1 {  //used by third user

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Rectangle();
		d.draw();
		

	}

}
