package revision;

import java.util.Scanner;

public class PerfectSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		double a = sc.nextDouble();
		double sqr = Math.sqrt(a);
		if(Math.floor(sqr) == sqr)
			System.out.println("Perfect square");
		else
			System.out.println("Not perfect square");
		

	}

}
