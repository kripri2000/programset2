package revision;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b) {
			if(a>c)
				System.out.println(a+" is the largest");
			else
				System.out.println(c+" is the largest");
		}
		else if(b>a && b>c)
				System.out.println(b+ " is the largest");
		else
			System.out.println(c+" is the largest");
				
		

	}

}
