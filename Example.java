class Example implements Runnable{
	public void run() {
		System.out.println("Implementing Runnable interface...");
	}

	public static void main(String[] args) {
	 Example e1=new Example();
	 Thread m1=new Thread(e1);
	 m1.start();

	}

}
