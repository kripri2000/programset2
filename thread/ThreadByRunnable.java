package thread;

public class ThreadByRunnable implements Runnable{
	public void run() {
		System.out.println("Running thread....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadByRunnable tr = new ThreadByRunnable();
		Thread t = new Thread(tr); //Thread(Runnable run)
		t.start();

	}

}
