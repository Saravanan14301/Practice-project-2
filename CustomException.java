class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		super(str);
	}
}
public class CustomException {
	static void  validate(int age)throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("You are not eligible..");
		}
		else
			System.out.println("You are eligible....");
	}

	public static void main(String[] args) {
		try{
			validate(17);
		}
		catch(InvalidAgeException e){
			e.printStackTrace();
		}
		

	}

}
