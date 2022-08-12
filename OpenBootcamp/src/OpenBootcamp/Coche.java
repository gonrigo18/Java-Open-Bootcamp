package OpenBootcamp;

public class Coche {
	
	// atributos
	
	String color;
	String fabricante;
	String modelo;
	Double peso;
	Double largo;
	int velocidad =0;
	
	// constructor
	public Coche() {
		
	}
	
	public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
		this.color = color;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.peso = peso;
		this.largo = largo;
	}
	
	
	// comportamiento
	
	public void acelerar ( int cantidad) {
		this.velocidad += cantidad;
	}


	@Override
	public String toString() {
		return "Coche [color=" + color + ", fabricante=" + fabricante + ", modelo=" + modelo + ", peso=" + peso
				+ ", largo=" + largo + ", velocidad=" + velocidad + "]";
	}



	


	

	
	
	
	
}
