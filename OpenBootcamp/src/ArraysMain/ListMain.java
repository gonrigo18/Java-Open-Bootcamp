package ArraysMain;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Gonzalo");
		nombres.add("Delfina");
		nombres.add("Benjamin");
		nombres.add("Ciro");
		System.out.println(nombres);
		
		// for each() - 
		for (String nombre : nombres) { 
			System.out.println(nombre);
		}
		
		List<Coche> coches = new ArrayList<>();
		coches.add(new Coche("Honda"));
		coches.add(new Coche("Fiat"));
		coches.add(new Coche("Renault"));
		coches.add(new Coche("Ford"));
		System.out.println(coches);
		
		for (Coche coche : coches) {
			System.out.println(coche);
		}
	}

}


// int size() - devuelve numero de elementos de una lista
// contains() - comprueba si existe un elemento dentro de una lista
// toArray() - para convertir a un string statico 
// add() - agregar elementos
// remove() - borrar elementos