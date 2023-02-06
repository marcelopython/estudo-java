package model.services;

public class BrazilTaxService implements TaxService {
	
	public double tax(double amount) {
		
		if(amount <= 100.0){
			return 0.2 * amount;
		}
		
		return 0.15 * amount;
		
	}

}
