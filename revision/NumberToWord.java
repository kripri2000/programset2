package revision;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String num = sc.next();
		char numArray[] = num.toCharArray();
		//System.out.println(numArray[0]);
		int len = numArray.length; //no of digits
		if(len>2)
			System.out.println("Invalid");
		else 
		{
			String oneDigit[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
			String twoDigit[] = { "","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String tensOnly[] = { "","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
			if(len == 1) //one digit number
				System.out.println(oneDigit[numArray[0]-'0']);
			if(len == 2) {
				if(numArray[0] == '1')
					System.out.println(twoDigit[numArray[0]-'0']);
				else if(numArray[1] == '0')
					System.out.println(tensOnly[numArray[0]-'0']);
				else
					System.out.println(tensOnly[numArray[0]-'0']+oneDigit[numArray[1]-'0']);
		}
		
	}
	}
}
