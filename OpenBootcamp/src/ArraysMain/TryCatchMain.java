package ArraysMain;

public class TryCatchMain {

	public static void main(String[] args) {

		// Dentro del try va la instruccion o instrucciones problematicas
		try {
			int result = 5 / 0;
			
		// Dentro de catch va el codigo que queremos llevar a cabo si se realiza la excepcion
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		// El finally siempre se va a ejecutar, deja todo como estaba al comienzo
		}finally {
			
		}
		System.out.println("fin");
		

	}

}
