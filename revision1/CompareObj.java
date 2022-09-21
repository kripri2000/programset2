package revision1;
class Emp{
	 int empno;
	 String name;
	 Emp(int e,String s){
		 this.empno = e;
		 this.name = s;
		 
	 }
	 
}
public class CompareObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1,"Seetha");
		int a = e1.hashCode();
		Emp e2 = new Emp(2,"Anu");
		int b = e2.hashCode();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		System.out.println(e1.equals(e2));
		
	}

}
