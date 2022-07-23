
class Encapsulation {
	private long accno;
	private String name;
	private float amount;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}

	public static void main(String[] args) {
		 Encapsulation e=new Encapsulation();
		 e.setAccno(34567894305412L);
		 e.setAmount(40000);
		 e.setName("Yash");
		 System.out.println("Account Number = "+e.getAccno());
		 System.out.println("Account Holder Name = "+e.getName());
		 System.out.println("Balance Amount = "+e.getAmount());

	}

}
