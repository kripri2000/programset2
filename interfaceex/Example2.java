//static variable is created only once in a prgm -- used to store commonly accessed data members

package interfaceex;

class Student{
	int rollno;
	String name;
	static String college = "fisat";
	Student(int r,String n){
		this.rollno = r;
		this.name = n;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12,"Krishnapriya");
		s1.display();
		Student s2 = new Student(28,"Akshay");
		s2.display();

	}

}
