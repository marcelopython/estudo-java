package entities;

public class SavingsAccount extends Account {

	private Double interesetRate;
	
	public SavingsAccount() {}

	public SavingsAccount(Integer number, String holder, Double balance, Double interesetRate) {
		super(number, holder, balance);
		this.interesetRate = interesetRate;
	}

	public Double getInteresetRate() {
		return interesetRate;
	}

	public void setInteresetRate(Double interesetRate) {
		this.interesetRate = interesetRate;
	}
	
	public void updateBalance() {
		this.balance += balance * interesetRate;
	}
	
	@Override
	public void withdraw(Double amount) {
		this.balance -= amount;
	}	
}
