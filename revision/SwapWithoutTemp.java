package revision;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b = 20;
		System.out.println("Before swap : a="+a+" b="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap : a="+a+" b="+b);
		

	}

}
