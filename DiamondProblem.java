interface Tamilnadu{
	public default void display() {
		System.out.println("At Present there are 38 districts in Taminadu..");
	}
}
interface India{
	public default void display() {
		System.out.println("At Present there are 28 States in India......");
	}
}
public class DiamondProblem implements Tamilnadu,India{
	
	@Override
	public void display() {
		Tamilnadu.super.display();
		India.super.display();
	}
	public static void main(String[] args) {
		DiamondProblem ob=new DiamondProblem();
		ob.display();
	

	}

	

}
