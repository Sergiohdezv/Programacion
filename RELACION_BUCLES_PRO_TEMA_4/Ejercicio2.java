import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena;
        char letra;
        int contador = 0;

        //Desarrollo
        System.out.println("Introduce una cadena de caracteres:");
        cadena = sc.nextLine();
        System.out.println("Ahora introduce una letra:");
        letra = sc.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        //Final
        if (contador == 0) {
            System.out.println("La letra '" + letra + "' no aparece en la cadena.");
        } else if (contador == 1) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " vez.");
        } else {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
        }

        sc.close();
    }
}
