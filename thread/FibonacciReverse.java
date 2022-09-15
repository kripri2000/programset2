package thread;
import thread.FibonacciThread; 
import thread.ReverseThread;


public class FibonacciReverse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FibonacciThread ft = new FibonacciThread();
			ft.start();
			ft.sleep(4000);
			ReverseThread rt = new ReverseThread();
			rt.start();
			rt.sleep(4000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}

	}

}
