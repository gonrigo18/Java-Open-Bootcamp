package interfaces;

import OpenBootcamp.Coche;
import OpenBootcamp.CocheElectrico;

public class InterfacesMain {

	public static void main(String[] args) {
		

		
		CocheService service1 = new CocheServiceClassicImpl();
		CocheService service2 = new CocheServiceGasoleroImpl();
		Coche coche4 = new Coche("Blanco", "fiat", "punto", 1211.22, 2.33);
		Coche coche3 = new CocheElectrico("V3");
		
		
		Coche coche1 = service1.crearCocheDemo();
		Coche coche2 = service2.crearCocheDemo();
		
		coche4.acelerar(100);
		

		service1.destruirCoche(coche3);
		service1.destruirCoche(coche4);
		
	}

	

}
