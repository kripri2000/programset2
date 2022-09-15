package sorting;

import java.util.Scanner;

public class MergeSort {
	public void merge(int arr[],int low,int mid,int high) {
		int n1,n2,i,j,k;
		n1 = mid-low+1;
		n2 = high-mid;
		int sub1[] = new int[n1];
		int sub2[] = new int[n2];
		
		for(i=0;i<n1;i++)
			sub1[i] = arr[low+i];
		for(j=0;j<n2;j++)
			sub2[j] = arr[mid+1+j];
		i=0;
		j=0;
		k=low;
		while(i<n1 && j<n2) {
			if(sub1[i]<=sub2[j]) {
				arr[k] = sub1[i];
				i++;
			}
			else {
				arr[k] = sub2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = sub1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = sub2[j];
			j++;
			k++;
		}
		
	}
	public void mergeSort(int arr[],int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
			
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
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr,0,n-1);
		System.out.println("The sorted array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");	

	}
	}
}
