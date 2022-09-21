package matrix;

import java.util.Scanner;

public class RowColSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int b[][] = new int[row][col];
		int rowsum=0,colsum=0;
		System.out.println("Elements : ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) 
				rowsum += b[i][j];
			
			System.out.println("Row "+i+" sum :"+rowsum);
			rowsum = 0;
		}
		System.out.println();
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++) 
				colsum += b[i][j];
			System.out.println("Column "+j+" sum :"+colsum);
			colsum = 0;
	}

}}
