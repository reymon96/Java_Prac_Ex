import java.util.Scanner;

class main{

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		int dato;
		System.out.print("Intrese un número: ");
			
		try {
			dato = lector.nextInt();
			System.out.println("Dato correcto.");
		} catch (Exception ex) {
			System.out.println("Dato invalido.....");
		}

	}

}