package matrix;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix A");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter row and column for matrix B");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		if (row1 != row2 && col1 !=col2)
			System.out.println("Addition not possible");
		else {
			int a[][] = new int[row1][col1];
			System.out.println("Elements : ");
			
			for(int i=0;i<row1;i++)
				for(int j=0;j<col1;j++)
					a[i][j] = sc.nextInt();
			
		
			int b[][] = new int[row2][col2];
			System.out.println("Elements : ");
			
			for(int i=0;i<row1;i++)
				for(int j=0;j<col1;j++)
					b[i][j] = sc.nextInt();
			int c[][] = new int[row1][col1];
			for(int i=0;i<row1;i++)
				for(int j=0;j<col1;j++)
					c[i][j] = a[i][j]+b[i][j];
			System.out.println("Sum : ");
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++)
					System.out.print(c[i][j]+" ");
				System.out.println();
			}
		}
		
	}

}
