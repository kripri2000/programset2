package revision;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int pdt = a*b;
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+pdt);
		System.out.println("New sum : "+(sum+pdt));
		System.out.println("New Product : "+(sum*pdt));
	}

}
