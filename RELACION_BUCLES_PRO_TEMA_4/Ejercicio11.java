import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena;

        int contador = 0;
        char palabra;

        //Desarrollo
        System.out.println("Introduce una cadena de texto:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            palabra = cadena.charAt(i);

            if (palabra != ' ' && (i == 0 || cadena.charAt(i - 1) == ' ')) {
                contador++;
            }
        }

        //Final
        System.out.println("Número de palabras: " + contador);

        sc.close();
    }
}
