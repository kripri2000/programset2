package revision;
import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter substring : ");
		String substr = sc.nextLine();
		System.out.println("Enter substring to replace : ");
		String newsubstr = sc.nextLine();
		String newstr = "";
		if(str.contains(substr))
			newstr += str.replaceAll(substr,newsubstr);
		System.out.println("New string : "+newstr);
		
		
		

	}

}
