package thread;
import java.util.*;
public class FibonacciThread extends Thread{
	public void run() {
		try {
			int f=0,s=1,t;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no of terms : ");
			int n = sc.nextInt();
			if(n==1)
				System.out.print(f);
			else if(n==2)
				System.out.print(f+" "+s);
			else {
				System.out.print(f+ " "+s+" ");
				while(n-2>0) {
					t = f+s;
					System.out.print(t+" ");
					f = s;
					s = t;
					n--;
				}
			}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

	

}
