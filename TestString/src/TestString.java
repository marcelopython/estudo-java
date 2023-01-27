import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String entrada = input.nextLine();
//		 String entrada = "abcde FHGIJ ABC abac DEFG	"; 

		input.close();

		String s01 = entrada.toLowerCase();
		
		String s02 = entrada.toUpperCase();
		
		String s03 = entrada.trim();
		
		String s04 = entrada.substring(2);
		
		String s05 = entrada.substring(2, 9);
		
		String s06 = entrada.replace('a', 'x');
		
		String s07 = entrada.replace("abc", "xy");
		
		int i = entrada.indexOf("ro");
		int j = entrada.lastIndexOf("ma");
		
		
		
		System.out.println("toLowerCase: "+s01);
		System.out.println("toUpperCase: "+s02);
		System.out.println("Trim: "+s03);
		System.out.println("Substring (2): "+s04);
		System.out.println("Substring (2, 9): "+s05);
		System.out.println("Replace: ('a', 'x') "+s06);
		System.out.println("indexOf (\"ro\") "+i);
		System.out.println("lastIndexOf (ma) "+j);
		System.out.println(entrada);
	}

}
