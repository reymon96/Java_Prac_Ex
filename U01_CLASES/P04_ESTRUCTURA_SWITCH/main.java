import java.util.Scanner;

class main {
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		String dato;
		System.out.print("Día(d) - Noche(n) - Tarde(t)\nEstoja una opción: ");
		dato = lector.next();

		switch(dato){
			
			case 'd':
				System.out.println("Buenos días!");
				break;

			case 'n':
				System.out.println("Buenas noches.....");
				break;

			case 't':
				System.out.println("Buenas Tardes.");
				break;

			default:
				System.out.println("Elija una opción valida.");
				break;

		}

	}

}