package sorting;
import java.util.*;
public class BubbleSort {

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
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}		
		}
		System.out.println("The sorted array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");	
		
		

	}

	}
	}
