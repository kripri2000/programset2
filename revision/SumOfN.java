package revision;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
			sum += i;
		System.out.println("Sum of first "+n+" natural numbers is "+sum);
		

	}

}
