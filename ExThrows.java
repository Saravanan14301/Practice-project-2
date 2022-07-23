class ExThrows {
	public static void div() throws ArithmeticException {
		int n=3/0;
	}

	public static void main(String[] args) {
		try {
			div();
		} catch(ArithmeticException e) {
			System.out.println("It throws ArithmeticException...");
		} finally {
			System.out.println("Finally automatically executes after try-catch executes....");
		}

	}

}
