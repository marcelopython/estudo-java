package variaveisEFluxos;

public class Caracteres {

	public static void main(String[] args) {
		
//		char guarda uma unica letra
		char letra = 'a';
		
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);

//		Como o tipo do valor e char ao somar com um inteiro e o inteiro e maior que o char deve ser feito o casting
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Alua curso online de tecnologia -> ";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
		
	}
	
}
