
public class Throw {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException("Hi..");
		}
		catch(ArithmeticException e) {
			System.out.println("How are you");
		}

	}

}
