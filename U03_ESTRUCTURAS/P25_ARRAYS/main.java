import java.security.SecureRandom;
import java.util.Arrays;


/*
add 		Agrega un elemento al fi nal l del objeto ArrayList .
clear 		Elimina todos los elementos del objeto ArrayList .
contains 	Devuelve true si el objeto ArrayList contiene el elemento especifi cado;
			en caso contrario, devuelve false .
get 		Devuelve el elemento en el índice especifi cado.
indexOf 	Devuelve el índice de la primera ocurrencia del elemento especifi cado en el
objeto 		ArrayList .
remove 		Sobrecargado. Elimina la primera ocurrencia del valor especifi cado o del
			elemento en el subíndice especifi cado.
size 		Devuelve el número de elementos almacenados en el objeto ArrayList .
trimToSize 	Recorta la capacidad del objeto ArrayList al número actual de elementos.
*/

public class main {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();

		double dblArreglo[] = new double[10];

		System.out.println("Arreglo Inicial:");
		for (int i = 0; i 	< dblArreglo.length; i++) {
			dblArreglo[i] = (random.nextDouble()*10);
			System.out.println("Arreglo en la posición [" + i + "]: " + dblArreglo[i]);
		}

		System.out.println("\nArreglo ordenado: \n");
		Arrays.sort(dblArreglo);
		
		for (double dato : dblArreglo) {
			System.out.println("Dato: " + dato);
		}
		
	}

}