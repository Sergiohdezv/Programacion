import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        //Introducción
        int numero, i, suma = 0;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce un número y te diré si es perfecto o no:");
        numero = sc.nextInt();
        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        //Final
        if (suma == numero) {
                System.out.println("Es un número perfecto.");
        } else {
                System.out.println("No es un número perfecto");
        }
        sc.close();
    }
}
