package ByteBank;

public class Metodo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.titular = "Sueide andrade silva";
		
		conta.deposita(5000);
		
		System.out.println(conta.saldo);
		
		double valorParaSacar = 20;
		
		boolean sacar = conta.saca(valorParaSacar);
		
		System.out.println(sacar);
		
		if(!sacar) {
			System.out.println("Não possue saldo suficiente para sacar o valor de " + valorParaSacar);
		}

		System.out.println(conta.saldo);
		

		Conta contaMarcelo = new Conta();
		contaMarcelo.titular = "Marcelo silva rodrigues";
		
		contaMarcelo.deposita(5000);
		
		double valorTranferencia = 10000;
		
		boolean tranfere = contaMarcelo.transfere(valorTranferencia , conta);
		System.out.println(tranfere);

		if(tranfere) {
			System.out.println("Transferencia no valor " + valorTranferencia + " efetuado com sucesso!");
			
			System.out.println("Saldo em conta do "+contaMarcelo.titular+": " + contaMarcelo.saldo );
			
			System.out.println("Saldo em conta da "+conta.titular+": " + conta.saldo );
		}else {
			System.out.println("Saldo insuficiente "+conta.titular+": " + conta.saldo );
		}
		
		
		
	}
	
}
