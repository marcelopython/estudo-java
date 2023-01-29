package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
//		Bidimencional
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scanner.nextInt();
			}
			
		}
		
		System.out.println("Main diagonal:");
		
		for (int i = 0; i <  mat.length; i ++) {
			System.out.println(mat[i][i]+" ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i <  mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j] < 0) {
					count++;
				}
				
			}
			
		}
		
		System.out.println("Negative number = "+count);
		
		scanner.close();

	}

}
