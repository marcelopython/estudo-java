package ByteBankEncapsulado;

public class Valores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(450, 5480);
		
		Conta conta2 = new Conta(1450, 480);
		
		Conta conta3 = new Conta(4850, 540);
//		Conta esta inconsistente
//		conta.setAgencia(-50);
//		conta.setNumero(-150);
		
		System.out.println("O total de contas e: " + Conta.getTotal());

		
	}
	
}
