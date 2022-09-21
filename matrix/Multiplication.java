package matrix;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix A");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter row and column for matrix B");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		if(col1 != row2)
			System.out.println("Not possible");
		else
		{
			int a[][] = new int[row1][col1];
			System.out.println("Elements for A : ");
			
			for(int i=0;i<row1;i++)
				for(int j=0;j<col1;j++)
					a[i][j] = sc.nextInt();
		
			int b[][] = new int[row2][col2];
			System.out.println("Elements for B : ");
			
			for(int i=0;i<row2;i++)
				for(int j=0;j<col2;j++)
					b[i][j] = sc.nextInt();
			
			int c[][] = new int[row1][col1];
			for(int i=0;i<row1;i++)
				for(int j=0;j<col2;j++)
					c[i][j] = 0;
			
			for(int i=0;i<row1;i++)
				for(int j=0;j<col2;j++)
					for(int k=0;k<col1;k++)
						c[i][j] += a[i][k]*b[k][j];
			System.out.println("Product : ");
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++)
					System.out.print(c[i][j]+ " ");
				System.out.println();
			}
			
		}
	}

}
