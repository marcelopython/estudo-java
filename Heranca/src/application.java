import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class application {

	public static void main(String[] args) {
		
//		Account acc = new Account(1001, "Marcelo", 0.0);
//		
//		BusinessAccount bacc = new BusinessAccount(1002, "Sueide", 0.0, 500.0);
		
//		UPCASTING
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		DOWNCASTING
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
		
//		ERRO		
//		BusinessAccount acc5 = (BusinessAccount) acc3;			
		
//		if(acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount) acc3;
//			acc5.loan(200.0);
//			System.out.println("Loan!");
//		}
//		
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount) acc3;
//			acc5.updateBalance();
//			System.out.println("update!");
//
//		}
		
		
		Account acc1 = new Account(1001, "Marcelo", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		

		Account acc3 = new BusinessAccount(1003, "Maria", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
		
		
	}

}
