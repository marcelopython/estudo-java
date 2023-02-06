package services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	
	double paymentinterest(double amount, int months);
	
}
