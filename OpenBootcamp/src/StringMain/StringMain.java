package StringMain;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		  length() ------------------ Longitud
		 *startsWith("") ------------
		 *endsWith("")---------------
		 *indexOf("")----------------
		 *subString(1,5)-------------
		 *trim()--------------------- quita los espacios del principio y final de un string
		 *equals()------------------- compara si dos string son iguales
		 *compareTo------------------
		 */
		 
		String nombre = "    Gonzalo   ";
		System.out.println(nombre.length());
		String mensajeMay = nombre.toUpperCase();
		System.out.println(mensajeMay);
		System.out.println(nombre.trim());
		mensajeMay = nombre.trim();
		
		
		String nombre2 = "Gonzalo";
		if(mensajeMay.equals(nombre2)) {
			System.out.println("Verdadero");
		}else
			System.out.println("Falso");
		

	}

}
