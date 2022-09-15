package searching;

import java.util.Scanner;

public class LinearSearchStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		System.out.println("Enter the elts : ");
		for(int i=0;i<n;i++) 
			arr[i] = sc.next();
		System.out.println("Enter the item : ");
		String item = sc.next();
		for(int i=0;i<n;i++) {
			if(arr[i].equals(item)) {
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


