package OpenBootcamp;

public class CocheMain {

	public static void main(String[] args) {
		
		// String coche = "Alfa Romeo";
		// Coche cocheObj = new Coche();
		
		Coche cocheObj2 = new Coche ("Negro", "VW", "Fox", 1340.34 , 4.88);
		
		cocheObj2.acelerar(50);
		
		// System.out.println(cocheObj2);
		
		CocheElectrico cocheElectrico = new CocheElectrico();
		cocheElectrico.motorElectrico = "Motor V.1";
		cocheElectrico.color = "Rojo";
		cocheElectrico.fabricante = "Tesla";
		cocheElectrico.peso = 2100.47;
		cocheElectrico.largo = 1.78;
		cocheElectrico.modelo = "Tesla V.1";
		cocheElectrico.acelerar(50);
		System.out.println(cocheElectrico);
		
		CocheGasolero cocheGasolero = new CocheGasolero();
		cocheGasolero.motorGasolero = "Motor V.5";
		cocheGasolero.color = "Blanco";
		cocheGasolero.fabricante = "Renault";
		cocheGasolero.peso = 2100.47;
		cocheGasolero.largo = 1.58;
		cocheGasolero.modelo = "Sandero";
		cocheGasolero.acelerar(150);
		System.out.println(cocheGasolero);
		
	
	}
}

