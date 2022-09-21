package revision;

class Stud{
	int rollno;
	String name;
	static String company = "ust";
	Stud(int r,String n){
		this.rollno = r;
		this.name = n;
	}
	static void change() {   //static methods change static var
		company = "ust global";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+company);
	}
}

public class StaticVar {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1 = new Stud(12,"Kp");
		s1.display();
		Stud s2 = new Stud(13,"Kurian");
		Stud.change();//static method
		s2.display();
		Stud s3 = new Stud(14,"Lakshmi");
		s3.display();
	}

}
