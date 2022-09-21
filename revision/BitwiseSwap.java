package revision;

import java.util.Scanner;

public class BitwiseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap : a="+a+" b="+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swap : a="+a+" b="+b);

	}

}
