import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroaleatorio = rd.nextInt(100) + 1;
        int intento;

        //Desarrollo y final
        System.out.println("Adivina el número aleatorio entre 1 y 100.");
        intento = sc.nextInt();

        if (intento == numeroaleatorio) {
            System.out.println("¡Lo has adivinado a la primera!");
        } else {
            do {
                System.out.println("Sigue intentándolo:");
                intento = sc.nextInt();
            } while (intento != numeroaleatorio);
            System.out.println("¡Lo has adivinado! El número aleatorio era " + numeroaleatorio);
        }

        sc.close();
    }
}
