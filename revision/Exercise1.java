package revision;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter sex(M or F) : ");
		char sex = sc.next().charAt(0);
		System.out.println("Enter marital status(Y or N) : ");
		char mar = sc.next().charAt(0);
		if(sex == 'F')
			System.out.println("Work in urban areas only");
		if(sex == 'M') {
			if(age>=20 && age<40)
				System.out.println("Work anywhere");
			else if(age>=40 && age<=60)
				System.out.println("Work in urban areas only");
		}
		else
			System.out.println("Age error");
		
		
	}

}
