package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,key;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elts : ");
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		
		for(int j=1;j<n;j++) {
			key = arr[j];
			int i=j-1;
			while(i>-1 && arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		System.out.println("The sorted array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
	}

}
}