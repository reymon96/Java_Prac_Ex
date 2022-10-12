import java.security.SecureRandom;

public class main {

	public static void main(String[] args) {
		
		int intArreglo[] = new int[10];
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < 10; i++) {
			intArreglo[i] = random.nextInt(100);
			System.out.println("Arreglo en la posición [" + i + "]: " + intArreglo[i]);
		}

	}

}