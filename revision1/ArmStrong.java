package revision1;
import java.util.*;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup = num,actual = num,count=0,sum=0;
		while(num>0) {
			count++;
			num /= 10;
		}
		while(dup>0)
		{
			sum += Math.pow(dup%10,count);
			dup /= 10;			
		}
		//System.out.println(count);
		if(sum == actual)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
