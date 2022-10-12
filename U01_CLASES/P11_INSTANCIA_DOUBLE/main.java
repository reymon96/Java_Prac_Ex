import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Cuenta cuenta01 = new Cuenta("Martín Antonio", 50.23);

        System.out.printf("Saldo de %s: $%.2f%n", 
        	cuenta01.ObtenerNombre(), 
        	cuenta01.ObtenerSaldo());

        Scanner lector = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar: ");
        double dblMontoDeposito = lector.nextDouble();

        System.out.printf("Saldo depositado: $%.2f%n", dblMontoDeposito);
        cuenta01.Deposito(dblMontoDeposito);

        System.out.printf("Su saldo actual es de: $%.2f%n", cuenta01.ObtenerSaldo());
    }

}