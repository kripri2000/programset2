package sorting;

import java.util.Scanner;

public class QuickSort {
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*Partitions array based on pivot (smaller elts to left and larger elts to right)*/
	static int partition(int arr[],int low,int high) {
		
		int pivot=arr[high]; //pivot is last elt
		int i=low-1; //initially i=-1 ; i is the index of item to be swapped with item at index j where arr[j]<=pivot
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {   //if pivot is greater,increment i,then swap
				i++;
				swap(arr,i,j);
				
			}
		}//after this loop,pivot's correct position is i+1
		swap(arr,i+1,high);
		return i+1; //index of pivot
	}
	
	static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivot_index = partition(arr,low,high);
			quickSort(arr,low,pivot_index-1);
			quickSort(arr,pivot_index+1,high);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elts : ");
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		quickSort(arr,0,n-1);
		System.out.println("The sorted array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");

	}

}
}