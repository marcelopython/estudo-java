package ByteBankComposto;


public class Conta {

	private double saldo;
	
	int agencia ;
	
	int number;
	
	Cliente titular;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
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





