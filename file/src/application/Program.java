package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//      Ler arquivo
//		readFile();
		
//		Escrever aqruivo
//		fileWriter();
		
//		Pasta
		folder();
		
		
	}
	
	public static void folder() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS");
		
		for (File folder : folders) {
			
			System.out.println(folder);
			
		}
//		/home/msr/estudo/java/file/src/application/

		
		File[] files = path.listFiles(File::isFile);
		System.out.println();
		System.out.println("FILES");
		System.out.println();
		for(File file : files) {
			System.out.println(file);
			System.out.println("name: "+file.getName());
			System.out.println("parent: "+file.getParent());
		}
		
		boolean success = new File(strPath + "/subdir").mkdir();
		
		System.out.println("Diretorio created successfully: " +success);
		
		sc.close();
		
	}
	
	public static void fileWriter() {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "/home/msr/estudo/java/file/src/application/out.txt";

//		Try-with-resources
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	
	public static void readFile() {
//		VERSÃO RUIM
//		File file = new File("/home/msr/estudo/java/file/src/application/in.txt");
//		Scanner sc = null;
//		
//		try {
//			sc = new Scanner(file);
//			
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//					
//		}catch(IOException e) {
//			System.out.println("Error: "+e.getMessage());
//			
//		}finally{
//			if(sc != null) {
//				sc.close();	
//			}
//		}
//		
//		VERSÃO MAIS OU MENOS
//		String path = "/home/msr/estudo/java/file/src/application/in.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//			
//			String line = br.readLine();
//			
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//			
//			
//		}catch(IOException e) {
//			System.out.println("Error: "+ e.getMessage()); 
//			
//		}finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//				
//				if(fr != null) {
//					fr.close();
//				}	
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		
//		MELHOR VERSÃO
		String path = "/home/msr/estudo/java/file/src/application/in.txt";

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		}catch(IOException e) {
			System.out.println("Error: "+ e.getMessage()); 
			
		}
	}

}















