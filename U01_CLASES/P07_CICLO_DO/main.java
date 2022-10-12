import java.util.Scanner;

class main {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		int limite, indice;
		System.out.print("Repeticiones\nIngrese una cantidad de Repeticiones: ");
		limite = lector.nextInt();
		indice = 0;

		do{

			indice++;
			System.out.println("Repetición " + indice);

		} while(indice < limite);

	}

}