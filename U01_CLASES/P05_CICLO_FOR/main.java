import java.util.Scanner;

class main {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		int limite;
		System.out.print("Repeticiones\nIngrese una cantidad de Repeticiones: ");
		limite = lector.nextInt();

		for (int i = 0; i < limite; i++) {
			System.out.println("Repetición " + (i+1));
		}

	}

}