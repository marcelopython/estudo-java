package variaveisEFluxos;

public class PontoFlutuante {

	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Meu salario e " + salario);
		
		double idade = 37;
		
		System.out.println(idade);
		
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
//		O Java vai fazer a divisão de int com int		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);

//		O Java vai saber reconhecer que tem um double para ser considerado na operação 
//		Trazendo assim a conta correta
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
		
	}
}
