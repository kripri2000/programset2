package thread;

public class ThreadByThread extends Thread{
	public void run() {
		System.out.println("Running thread....");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadByThread tt = new ThreadByThread();
		tt.start();
		

	}

}
