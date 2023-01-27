package variaveisEFluxos;

public class EscopoVariaveis {

	public static void main(String[] args) {

		System.out.println("Testando condicional");

		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhando = false;
		
		if(quantidadePessoas >= 2) {
			acompanhando = true;
		}

		if (idade >= 18 && acompanhando) {

			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");

		} else {
			System.out.println("Infelizmente você não pode entrar");
		}

	}

}
