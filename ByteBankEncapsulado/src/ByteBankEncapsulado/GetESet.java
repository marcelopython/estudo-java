package ByteBankEncapsulado;

public class GetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();

		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Marcelo silva");
		
		conta.titular = cliente;
		
		System.out.println(conta.getTitular().getNome());
		
	}
	
}
