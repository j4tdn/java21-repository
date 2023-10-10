package ex04fixbyteacher;


public class Tuple {

	private String manager;
	private int amount;
	
	public Tuple() {
	}

	public Tuple(String manager, int amount) {
		this.manager = manager;
		this.amount = amount;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void plusAmount() {
		this.amount = this.amount + 1;
	}

	@Override
	public String toString() {
		return "Tuple [manager=" + manager + ", amount=" + amount + "]";
	}
}