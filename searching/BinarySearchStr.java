package searching;

import java.util.Scanner;

public class BinarySearchStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,mid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		int n = sc.nextInt();
		int low=0,high=n-1;
		mid = (low+high)/2;
		String arr[] = new String[n];
		System.out.println("Enter the elts in sorted order : ");
		for(int i=0;i<n;i++) 
			arr[i] = sc.next();
		System.out.println("Enter the item : ");
		String item = sc.next();
		
		while(low<=high) {
			if(arr[mid].equals(item)) {
				System.out.println("Item found at position "+(mid+1));
				flag++;
				break;
			}
			else if(arr[mid].compareTo(item) < 0)
				low = mid+1;
			else
				high = mid-1;
			mid = (low+high)/2;
		}
		if(flag==0)
			System.out.println("Item not found");

	}

}
