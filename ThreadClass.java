
public class ThreadClass extends Thread { 
	public void display() {
		System.out.println("Extending Thread Class....");
	}

	public static void main(String[] args) {
		 ThreadClass t=new ThreadClass();
		 t.display();

	}

}
