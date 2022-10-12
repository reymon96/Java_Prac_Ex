import java.util.Scanner;

class main{
	
	public static void main(String[] args) {
			
		Scanner lector = new Scanner(System.in);
		
		int numero;

		System.out.print("Numeros positivos y negativos\nIngrese un número: ");
		numero = lector.nextInt();

		if (numero < 0) {
			System.out.println("Su número es negarivo.");
		} else if (numero > 0) {
			System.out.println("Su número es positivo.");
		} else {
			System.out.println("Su número es cero.");
		}
	}

}