package thread;

public class ThreadPriority extends Thread{
	public void run() {
		String threadname = Thread.currentThread().getName();
		int tp = Thread.currentThread().getPriority();
		System.out.println(threadname+" has priority "+tp);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t0 = new ThreadPriority();
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		t0.setPriority(4);
		t1.setPriority(3);
		t2.setPriority(1);
		t3.setPriority(2);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
