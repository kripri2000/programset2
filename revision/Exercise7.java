package revision;
import java.util.*;
public class Exercise7 {
	public static String reverse(String str) {
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		//String[] arr = str.split("?=\\.|?=\\s|?=,");
		String[] arr = str.split("((?=\\.)|(?<=\\.)|(?=\\s)|(?<=\\s))");
		//System.out.println(arr.length);
		//for(int i=0;i<arr.length;i++)
			//System.out.println(arr[i]);
		//String newstr = "";
		for(int i=0;i<arr.length;i++)
			System.out.print(reverse(arr[i]));
			//newstr += reverse(arr[i]);
		//System.out.println(newstr);
			
	}

}
