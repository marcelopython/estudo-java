package entities;

public class SavingAccountPlus extends SavingsAccount{
	
	@Override
	public void withdraw(Double amount) {
		this.balance -= amount + 2;
	}	
}
