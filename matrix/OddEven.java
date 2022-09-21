package matrix;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0,even=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int b[][] = new int[row][col];
		System.out.println("Elements : ");		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j] = sc.nextInt();
				if(b[i][j] %2 == 0)
					even++;
				else
					odd++;
			}
		}
		System.out.println("Odd Frequency : "+odd);
		System.out.println("Even frequency : "+even);
					
		

	}

}
