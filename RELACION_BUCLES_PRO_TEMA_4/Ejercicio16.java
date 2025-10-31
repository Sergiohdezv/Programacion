import java.util.Scanner;

public class Ejercicio16 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        int numero, digito, suma = 0;

        //Desarrollo
        System.out.println("Introduce un número entero y te sumaré sus dígitos.");
        numero = sc.nextInt();

        do {
            digito = numero % 10;
            suma += digito;
            numero /= 10;
        } while (numero > 0);

        //Final
        System.out.println("La suma de sus dígitos es: " + suma);

        sc.close();
    }
}
