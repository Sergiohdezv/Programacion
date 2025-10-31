import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena, cadenainvertida = "";

        //Desarrollo
        System.out.println("Introduce una cadena de caracteres:");
        cadena = sc.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenainvertida += cadena.charAt(i);
        }

        //Final
        System.out.println("La cadena invertida es: " + cadenainvertida);

        sc.close();
    }
}
