import java.security.SecureRandom;

public class main {

	public static void main(String[] args) {
		
		int intArreglo[] = new int[10];
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < intArreglo.length; i++) {
			intArreglo[i] = random.nextInt(100);
		}

		for (int dato : intArreglo) {
			System.out.println("Dato en fila: " + dato);
		}

	}

}