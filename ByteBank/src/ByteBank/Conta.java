package ByteBank;


public class Conta {

	double saldo;
	
	int agencia ;
	
	int number;
	
	String titular;
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		boolean sacaContaDestino = destino.saca(valor);
		
		if(sacaContaDestino) {
			this.deposita(valor);
			return true;
		}
		
		return false;
	}

}





