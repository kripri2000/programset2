package revision;
import java.util.*;

public class Exercise5 {
	public static boolean isPalindrome(String str)
	{
		if(str.length()==1)
			return false;
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev += str.charAt(i);
			
		if(str.equals(rev))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		String newstr = "";
		//System.out.println(arr.length);
		
		int pos;
		for(int i=0;i<arr.length;i++) {
			if(isPalindrome(arr[i])) {
				//System.out.println(arr[i]);
				//pos = str.indexOf(arr[i]);
				newstr += " ";
				for(int j=0;j<arr[i].length();j++)
					newstr += "*";
				//newstr += " ";
			}
			
			else
				newstr += " "+arr[i];
			
		}
		System.out.println("New String : "+newstr);
	}

}
