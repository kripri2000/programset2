package searching;

import java.util.Scanner;

public class LinearSearchInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elts : ");
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		System.out.println("Enter the item : ");
		int item = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i] == item) {
				int index = i;
				System.out.println("Item found at position "+(index+1));
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Item not found");
	}

}
