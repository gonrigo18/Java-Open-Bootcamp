package interfaces;

import OpenBootcamp.Coche;

public class InterfacesMain {

	public static void main(String[] args) {
		

		
		CocheService service1 = new CocheServiceClassicImpl();
		CocheService service2 = new CocheServiceGasoleroImpl();
		
		Coche coche1 = service1.crearCocheDemo();
		Coche coche2 = service2.crearCocheDemo();
		
		service1.destruirCoche(coche1);
		service2.destruirCoche(coche2);
		
	}

	

}
