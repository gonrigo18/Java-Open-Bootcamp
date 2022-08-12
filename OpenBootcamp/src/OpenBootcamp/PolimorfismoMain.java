package OpenBootcamp;

public class PolimorfismoMain {

	public static void main(String[] args) {


		Coche coche3 = new CocheElectrico("V.7.8");
		coche3.color = "Gris";
		coche3.fabricante = "Fiat";
		coche3.modelo = "147";
		coche3.largo = 2.45;
		coche3.peso = 1245.22;
		System.out.println(coche3);
		coche3.acelerar(123);
		System.out.println(coche3);
		
		Coche coche4 = new CocheElectrico("V.7.8");
		coche3.color = "Gris";
		coche3.fabricante = "Fiat";
		coche3.modelo = "147";
		coche3.largo = 2.45;
		coche3.peso = 1245.22;
		System.out.println(coche3);
		coche3.acelerar(123);
		System.out.println(coche3);
		
		
		

		// instanceof sirve para identificar a que clase de tipo de auto corresponde conche3
		
		if (coche3 instanceof CocheGasolero) {
			System.out.println("Es gasolero");
		}else if (coche3 instanceof CocheElectrico) {
			System.out.println ("Es electrico");
		}else
			System.out.println("No se identifica el tipo de coche");
		
		if (coche4 instanceof Coche) {
			System.out.println("Es coche");
		}
		
		if (coche4 instanceof CocheGasolero) {
			System.out.println("Es gasolero");
		}
		
		
	}

}
