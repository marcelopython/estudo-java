package ByteBankEncapsulado;


public class Conta {

	private double saldo;
	
	private int agencia ;
	
	private int number;
	
	Cliente titular;
	
	private static int total;
	
	public Conta(int agencia, int number) {
		
		Conta.total ++;
		
//		System.out.println("O total de contas e -> " + Conta.total);
		
		this.agencia = agencia;
		this.number = number;
		
//		System.out.println("Estou crinado uma conta");
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

	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		
		this.agencia = agencia;
	}	

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.number;
	}
	
	public void setNumero(int number) {
		if(number <= 0) {
			System.out.println("Não pode number menor ou igual a 0");
			return;
		}
		
		this.number = number;

	}
	
	public Cliente getTitular() {
		return this.titular;
	}

	public void setNumero(Cliente titular) {
				
		this.titular = titular;

	}
	
	public static int getTotal() {
				
		return Conta.total;

	}

}





