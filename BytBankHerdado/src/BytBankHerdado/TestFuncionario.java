package BytBankHerdado;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico santos");
		nico.setCpf("222.222.222-22");
		nico.setSalario(2600.00);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

		
		
	}
	
}
