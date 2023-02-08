package application;

import java.util.List;

import entities.Client;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
//		List<Shape> myShapes = new ArrayList<>();
//		myShapes.add(new Rectangle(3.0, 2.0));
//		myShapes.add(new Circle(2.0));
//		
//
//		System.out.println("Total area: "+ totalArea(myShapes));
//		
//		List<Circle> myCircle = new ArrayList<>();
//		myCircle.add(new Circle(2.0));
//		myCircle.add(new Circle(3.0));
//
//		System.out.println("Total area: "+ totalArea(myCircle));
		
//		Tipos coringas

//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(10);
//		intList.add(5);
//		
//		List<? extends Number> list = intList;

		//Covariancia
//		Number x = list.get(0);
//		list.add(20);
		
//		List<Object> myObjs = new ArrayList<Object>();
//		myObjs.add("Maria");
//		myObjs.add("Alex");
		
		
//		List<? super Number> myNums = myObjs;
//		
//		myNums.add(10);
//		myNums.add(3.14);
		// Contra variancia				
//		Number x = myNums.get(0);
		
//		List<Integer> myInts = Arrays.asList(1,2,3,4);
//		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
//		List<Object> myObjes = new ArrayList<Object>();
//		
//		copy(myInts, myObjes);
//		printList(myObjes);
//		
//		copy(myDoubles, myObjes);
//		printList(myObjes);
		
		
		String a = "Maria";
		
		String b = "Alex";
		
		System.out.println("With equals -> " + a.equals(b));
		
		System.out.println("hashcode -> " + a.hashCode());
		System.out.println("hashcode -> " + b.hashCode());
		
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		//Compara as referencias de memoria e não o conteudo
		System.out.println(c1 == c2);
		
	}
	
	
	public static void copy(List<? extends Number> source, List<? super Number> destino) {
		
		for(Number number : source) {
			destino.add(number);
		}
		
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	
	
	
//	Pode ser de Shape ou de qualquer tipo que seja subtipo de shape
	public static double totalArea(List<? extends Shape> list) {
		
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
		
	}

}
