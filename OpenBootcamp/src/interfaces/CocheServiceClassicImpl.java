package interfaces;

import OpenBootcamp.Coche;
import OpenBootcamp.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {

	@Override
	public Coche crearCocheDemo() {
		System.out.println("Creando coche clasico");
		return new CocheElectrico();
	}

	@Override
	public void destruirCoche(Coche coche) {
		System.out.println("Destruyendo " + coche);
		
	}

}
