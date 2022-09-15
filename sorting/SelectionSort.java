package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,n;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elts : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		System.out.println("The sorted array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");	

	}

}}
