import java.util.HashSet;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		
		Ponto2D p1 = new Ponto2D(1, 2);
		Ponto2D p2 = new Ponto2D(1, 2);
		Ponto2D p3 = new Ponto2D(2, 3);
		
		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);
		System.out.println("p3 " + p3);
		System.out.println();

		System.out.println("p1 == p2 -> " + (p1 == p2));
		System.out.println("p1 == p3 -> " + (p1 == p3));
		System.out.println();
		
		System.out.println("p1.equals(p2) -> " + p1.equals(p2));
		System.out.println("p1.equals(p3) -> " + p1.equals(p3));
		System.out.println();
		
		//A classe LinkedList é usada para criar objetos que representam listas
		LinkedList<Ponto2D> lista = new LinkedList<Ponto2D>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		System.out.println("lista" + lista);
		System.out.println("lista.contains(p2) -> " + lista.contains(p2));
		System.out.println("lista.contains(new Ponto2D(1, 2)) -> " + lista.contains(new Ponto2D(1, 2)));
		System.out.println();
		
		//A classe HashSet é usada para criar objetos que representam conjuntos
		//Uma das caracteristicas de um conjunto é que ele não pode conter 
		//elementos repetidos (definição matemática)
		HashSet<Ponto2D> conjunto = new HashSet<Ponto2D>();
		conjunto.add(p1);
		conjunto.add(p2);
		conjunto.add(p3);
		System.out.println("conjunto" + conjunto);
		System.out.println("conjunto.contains(p2) -> " + conjunto.contains(p2));
		System.out.println("conjunto.contains(new Ponto2D(1, 2)) -> " + conjunto.contains(new Ponto2D(1, 2)));
		
	}

}
