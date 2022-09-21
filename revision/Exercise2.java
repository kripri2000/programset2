/*if divisible by 4 and not divisible by 100,leap year
  divisible by 400,leap year */


package revision;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 400 == 0)
			System.out.println("Leap year");
		else if(year % 4 == 0) {
			if(year%100 == 0)
				System.out.println("Not Leap year");
			else
				System.out.println("Leap year");
		}
		else
			System.out.println("Not Leap year");
		
	}

}
