package interfaces;

import OpenBootcamp.Coche;
import OpenBootcamp.CocheGasolero;

public class CocheServiceGasoleroImpl implements CocheService {

	@Override
	public Coche crearCocheDemo() {
		System.out.println("Creando coche clasico");
		return new CocheGasolero();
	}

	@Override
	public void destruirCoche(Coche coche) {
		System.out.println("Destruyendo " + coche);
		
	}

}
