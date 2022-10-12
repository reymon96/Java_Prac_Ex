import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		Cuenta miCuenta = new Cuenta();

		System.out.printf("El nombre inicial de la cuenta es: %s%n%n", miCuenta.ObtenerNombre());
		System.out.print("Introduzca el nombre: ");

		String strNombre = lector.nextLine();
		miCuenta.EstablecerNombre(strNombre);

		System.out.println("");
		System.out.printf("El nombre almacenado es: %n%s%n", miCuenta.ObtenerNombre());

	}

}