package utils;

public class CurrencyConversion {

	static final double IOF = 0.06;
	
	public static double addIof(double amount) {
		
		return (IOF * amount) + amount;
		
	}
		
	public static double conversionToBRL(double quotation, double amount) {
		
		return addIof(amount) * quotation;
		
	}
	
	
}
