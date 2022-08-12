package OpenBootcamp;

public class CocheGasolero extends Coche{
	
	String motorGasolero;
	
	public CocheGasolero() {
		
	}
	
	public CocheGasolero (String motorGasolero) {
		this.motorGasolero = motorGasolero;
	}

	@Override
	public String toString() {
		return "CocheGasolero {motorGasolero=" + motorGasolero + ", color=" + color + ", fabricante=" + fabricante
				+ ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + "}";
	}
	
	
	
	
}
