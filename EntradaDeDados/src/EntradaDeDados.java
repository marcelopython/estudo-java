
import java.util.Scanner;
import java.util.Locale;

/**
 * @author msr
 *
 */
public class EntradaDeDados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
//		Scanner sc = new Scanner(System.in);
//		
//		String x ;
//		x = sc.next();
//		
//		System.out.println("Você digitou: " + x);
//		
//		sc.close();
//		
//		Scanner sc = new Scanner(System.in);
//		int x;
//		x = sc.nextInt();
//		System.out.println(x);
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		double x;
//		x = sc.nextDouble();
//		System.out.println(x);
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println(x);
//		sc.close();
		
//		Ler a te a quebra de linha
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.println("Digite os dados abaixo");
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados");
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		

	}

}
