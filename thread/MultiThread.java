package thread;

class MainThread extends Thread{
	private Thread thread;
	private String threadname;
	
	MainThread(String threadname){ //creating a new thread using constructor
		this.threadname = threadname;
		System.out.println("Creating a new thread : "+this.threadname);
	}
	
	public void run() { //execute thread
		System.out.println("Running thread : "+this.threadname);
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread : "+this.threadname+" "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie) {
			System.out.println("Exception in Thread "+this.threadname);
		}
		System.out.println("Thread "+this.threadname+" continue...");
	}
	/*public void start() {
		System.out.println("Starting thread : "+this.threadname);
		if(thread == null) {
			thread = new Thread(this,threadname);
			thread.start();
		}
	}*/
}
public class MultiThread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainThread first = new MainThread("First Thread");
		first.start();
		MainThread second = new MainThread("Second Thread");
		second.start();
		

	}

}
