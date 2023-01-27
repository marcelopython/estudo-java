package BytBankHerdado;

public class Teste {

	public static void main(String[] args) {

		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setNome("Nico santos");
		f1.setCpf("222.222.222-22");
		f1.setSalario(3000.0);
		f1.setTipo(0);
		
		System.out.println(f1.getBonificacao());
		

		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setNome("Nico santos");
		f2.setCpf("222.222.222-22");
		f2.setSalario(5000.0);
		f2.setTipo(1);
		
		System.out.println(f2.getBonificacao());
		

		FuncionarioTeste f3 = new FuncionarioTeste();
		f3.setNome("Nico santos");
		f3.setCpf("222.222.222-22");
		f3.setSalario(50000.0);
		f3.setTipo(2);
		
		System.out.println(f3.getBonificacao());
	}

}
