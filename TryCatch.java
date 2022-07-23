
public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=0;
			 int b=7/a;
			 System.out.println(b);

		}
		catch(ArithmeticException e) {
			System.out.println("Welcome...");
		}
		finally {
			System.out.println("Finally automatically executes....");
		}
		 
	}
}
