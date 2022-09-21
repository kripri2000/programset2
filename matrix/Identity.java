package matrix;

import java.util.Scanner;

public class Identity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
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
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i == j && b[i][j] != 1)    //check diagonal elt=1
				{
					flag = false;
					break;
				}
				if(i !=j && b[i][j] !=0) { //check non-diagonal elt=0
					flag = false;
					break;
				}
			}	
		}
		if(flag == true)
			System.out.println("Identity matrix");
		else
			System.out.println("Not an identity matrix");

	}

}
