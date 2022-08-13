package ArraysMain;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre = scanner.nextLine();
		System.out.println("El nombre introducido es " + nombre);
		
		System.out.println("Introduce un numero");
		int numero1 = scanner.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = scanner.nextInt();
		System.out.println("La suma es " + (numero1 + numero2));
		
		
		
		
	}

}
