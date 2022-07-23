
public class Polymorphism {
	public int add(int x) {
		return x;
	}
	public int add(int x,int y) {
		return (x+y);
	}
	public float add(int x,float y) {
		return (x+y);
	}

	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		System.out.println(p.add(3));
		System.out.println(p.add(5,9));
		System.out.println(p.add(7,5.7f));
		 

	}

}
