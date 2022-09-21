package revision;

import java.util.Scanner;

/* First finds largest among a and b,then compare it with c*/


public class LargestTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = a>b?a:b; //temp contains largest among a and b
		int largest = c>temp?c:temp;
		System.out.println(largest+" is the largest");
		

	}

}

