package matrix;

import java.util.Scanner;

public class MatrixEqual {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix A");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("Enter row and column for matrix B");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		if (row1 != row2 && col1 !=col2)
			System.out.println("Not equal");
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
			for(int i=0;i<row1;i++)
				for(int j=0;j<col1;j++)
					if(a[i][j] == b[i][j])
						flag++;
			if(flag == (row1*col1))
				System.out.println("Equal");
			else
				System.out.println("Not equal");
		}
	}
}


