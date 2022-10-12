import java.util.Scanner;
import java.security.SecureRandom;

public class main {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		while(true){

			System.out.print("¿Deseas tirar los dados? y/n ");
			String strRespuesta = lector.next();

			if (strRespuesta.equals("y") | strRespuesta.equals("Y")) {

				try {
						
					System.out.print("Escoja un número de 2 al 12: ");
					int intNumero = lector.nextInt();

					if(intNumero < 2) {
						System.out.println("Escoja un número mayor a 1.");
					} else if (intNumero > 12) {
						System.out.println("Escoja un número menor a 12.");
					} else {
						SecureRandom tiroDato = new SecureRandom();
						int intDado01 = tiroDato.nextInt(6);
						int intDado02 = tiroDato.nextInt(6);

						while(intDado01 < 1) {
							intDado01 = tiroDato.nextInt(6);
						}

						while(intDado02 < 1) {
							intDado02 = tiroDato.nextInt(6);
						}

						System.out.println("Los resultados son: \nDado 1:" + 
							intDado01 + "\nDado 2: " + intDado02);

						if ((intDado01 + intDado02) == intNumero) {
							System.out.println("Felicidades!!!! Has Ganado!!!!");
						} else {
							System.out.println("LASTIMA.....");
						}
					}

				} catch (Exception ex) {
					System.out.println("Digito invalido.\n");
				}

			} else if (strRespuesta.equals("n") | strRespuesta.equals("N")) {
				System.out.println("Bye!!!");
				break;
			} else {
				System.out.println("Escoja una respuesta valida.");
			}
		}


	}

}