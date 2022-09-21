package revision;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		System.out.println("Enter string : ");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
			rev += str.charAt(i);
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}

}
