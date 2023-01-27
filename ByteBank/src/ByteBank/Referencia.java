package ByteBank;

public class Referencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
//		Codia a referencia da conta
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		System.out.println("Referencia da primeira: " + primeiraConta);
		System.out.println("Referencia da segunda: " + segundaConta);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
	}
	
}
