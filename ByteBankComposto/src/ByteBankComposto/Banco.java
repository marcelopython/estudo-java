package ByteBankComposto;

public class Banco {

	public static void main(String[] args) {
		
		Cliente marcelo = new Cliente();
		
		marcelo.nome = "Marcelo silva";
		marcelo.cpf = "222.222.222-22";
		marcelo.profissao = "Desenvolvedor de sistemas";
		
		Conta contaDoMarcelo = new Conta();

		contaDoMarcelo.titular = marcelo;
		
		contaDoMarcelo.deposita(100);
		
		System.out.println(contaDoMarcelo.titular.nome);
		
	}
	
}
