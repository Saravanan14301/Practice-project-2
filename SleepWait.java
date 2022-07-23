
public class SleepWait {
	private static Object o=new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		long start=System.currentTimeMillis();
		Thread.sleep(3000);
		System.out.println("Sleep time = "+(System.currentTimeMillis()-start));
		synchronized(o) {
			o.wait(3000);
			System.out.println(o+"   Waiting State.");
		}
	}

}
