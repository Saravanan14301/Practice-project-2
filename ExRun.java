
public class ExRun implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable Interface executed successfully..");	
	}
	public static void main(String[] args) {
		ExRun e=new ExRun();
		Thread t=new Thread(e);
		t.start();
		System.out.println("Thread Starts....");
	}
}
