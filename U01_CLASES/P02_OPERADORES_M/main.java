import java.util.Scanner;

class main {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese dos números para realizar operaciones matemáticas: ");
    
    int num01, num02;

    System.out.print("Ingrese el primer número:     ");
    num01 = entrada.nextInt();
    System.out.print("Ingrese el segundo número:    ");
    num02 = entrada.nextInt();
    
    System.out.printf("La sumatoria es: %d%n", (num01 + num02));
    System.out.printf("El residuo es: %d%n", (num01 - num02));
    System.out.printf("La división es: %d%n", (num01 / num02));
    System.out.printf("La multiplicación es: %d%n", (num01*num02));
    System.out.printf("El módulo es: %d%n", (num02 % num01));
}

}