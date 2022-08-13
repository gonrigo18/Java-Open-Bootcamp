package ArraysMain;


public class ArraysMain {

	public static void main(String[] args) {
		
		String nombre1 = "Gonzalo";
		String nombre2 = "Delfina";
		String nombre3 = "Benjamin";
		String nombre4 = "Ciro";
		
		String[] nombres = new String[4];
		String[] nombres2 = new String[] { nombre1, nombre2, nombre3, nombre4} ;
		int[] numeros = new int[5];
		Coche[] coches = new Coche[2];
		
		
		nombres[0] = nombre1;
		nombres[1] = nombre2;
		nombres[2] = nombre3;
		nombres[3] = nombre4;
		
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		for (int j = 0; j < nombres2.length; j++) {
			System.out.println(nombres2[j]);
		}
	
		
		
		
		
		
		
	}

}
