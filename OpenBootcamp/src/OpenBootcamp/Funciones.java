package OpenBootcamp;

public class Funciones {

	public static void main (String[] args){
	      
		  //clima("nublado");
		 
	    }
	
	public static void holaMundo() {
		System.out.println("Hola mundo");
	}
	
	public static void holaMundo(String name) {
		System.out.println("Hola " + name);
	}
		
	public static void bucle(int a) {
		for(int i = 0; i <= a; i++) {
			System.out.println("i: " + i);
		}
	}
	
	public static void clima(String a) {
		switch (a) {
			case "nublado":
				System.out.println("Esta nublado, puede llover");
				break;
			case "soleado":
				System.out.println("Hay sol, no va a llover");
				break;
			default:
				System.out.println("No sabemos como esta el dia");	
		}
	}
	
	
	
}
