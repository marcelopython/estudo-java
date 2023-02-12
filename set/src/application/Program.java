package application;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
//		e mais rapido so que Não ordena os dados
//		Set<String> set = new HashSet<>();
		
//		E mais lento so que ordena os dados
//		Set<String> set = new TreeSet<>();
		
//		Mante a ordem que foi inserido
//		Set<String> set = new LinkedHashSet<>();
//		
//		set.add("TV");
//		set.add("Tablet");
//		set.add("Notebook");
//		
////		set.remove("Tablet");
////		set.removeIf(x -> x.length() >= 3);
//		set.removeIf(x -> x.charAt(0) == 'T');
//		
//		System.out.println(set.contains("Notebook"));
//		
//		for (String p : set) {
//			
//			System.out.println(p);
//			
//		}
		//COnjuntos
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		
//		Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
//		intersection (são somente os elementos que tem em comun no elemento)
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
//		Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}

}
