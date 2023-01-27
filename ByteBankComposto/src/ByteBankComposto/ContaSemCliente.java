package ByteBankComposto;

public class ContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDoMarcelo = new Conta();
		
		contaDoMarcelo.titular = new Cliente();
		
		contaDoMarcelo.titular.nome = "Marcelo";
		
		System.out.println(contaDoMarcelo.titular.nome);
		
	}
	
}
