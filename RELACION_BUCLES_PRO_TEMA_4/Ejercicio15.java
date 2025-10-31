import java.util.Scanner;

public class Ejercicio15 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        int numero, digito = 0;

        //Desarrollo
        System.out.println("Introduce un número entero y te diré cuántos dígitos tiene.");
        numero = sc.nextInt();

        do {
            numero /= 10;
            digito++;
        } while (numero != 0);

        //Final
        if (digito == 1) {
            System.out.println("El número tiene " + digito + " dígito.");
        } else {
            System.out.println("El número tiene " + digito + " dígitos.");
        }
        sc.close();
    }
}
