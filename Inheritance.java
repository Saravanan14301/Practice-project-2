class Person {
	String name="Jawan";
	double salary=55000;
}
public class Inheritance extends Person {
	int bonus=7500;
	int id=4579390;

	public static void main(String[] args) {
		Inheritance n=new Inheritance();
		System.out.println("Employee Name= "+n.name);
		System.out.println("Employee Id= "+n.id);
		System.out.println("Employee Salary= "+n.salary);
		System.out.println("Employee Bonus= "+n.bonus);
	}

}
