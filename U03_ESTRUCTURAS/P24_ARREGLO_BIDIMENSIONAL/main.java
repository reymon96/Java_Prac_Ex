import java.security.SecureRandom;

public class main {

	public static void main(String[] args) {
		
		int intMatriz[][] = {{1,5,6,9},{2,9,4,2}, {4,7,9,2}};

		for (int fila = 0; fila < intMatriz.length; fila++) {
			for (int columna = 0; columna < intMatriz[0].length; columna++) {
				System.out.print(intMatriz[fila][columna] + "\t");
			}
			System.out.println();
		}

	}

}