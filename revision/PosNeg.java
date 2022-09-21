package revision;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		if(a>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}

}
