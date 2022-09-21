package matrix;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column for matrix ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int b[][] = new int[row][col];

		System.out.println("Elements : ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j] = sc.nextInt();
				
			}
		}
		int t[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				t[i][j] = b[j][i];
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}

	}

}
