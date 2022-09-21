package matrix;

import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		if(row != col)
			System.out.println("Not a square matrix");
		else
		{
			int b[][] = new int[row][col];
			System.out.println("Elements : ");
			
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
					b[i][j] = sc.nextInt();
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i>j)
						System.out.print(0+" ");
					else
						System.out.print(b[i][j]+" ");
				}
				System.out.println();
				
			}
			
		}

	}
}
