abstract class Animal {
	public abstract void animals();
}
class Lion extends Animal {

	@Override
	public void animals() {
		System.out.println("Lion roars.....");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		 Lion l=new Lion();
		 l.animals();
		 

	}

}
