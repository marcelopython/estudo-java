package ByteBank;

public class CriaConta {

	public static void main(String[] agrs) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
		
		System.out.println("Saldo da segundaconta " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.number);
		
		segundaConta.agencia = 146;
		
		System.out.println(" agora a segunda conta esta na a " + segundaConta.agencia);
		
		
		
	}
	
}
