package ByteBankComposto;

public class SacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
		
//		Proibido
//		conta.saldo -= 101;
		System.out.println(conta.getSaldo());

		
		
	}
	
}
