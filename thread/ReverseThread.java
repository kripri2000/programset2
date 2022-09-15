package thread;
import java.util.*;
public class ReverseThread extends Thread{

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the limit : ");
		int n = sc.nextInt();
		while(n>0){
			System.out.print(n+" ");
			n--;
		}
	}

}
