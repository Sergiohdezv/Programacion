import java.util.Scanner;

public class Ejercicio18 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contadorconsonantes = 0;

        //Desarrollo
        System.out.println("Introduce una cadena de letras:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' && cadena.charAt(i) != 'u') {
                contadorconsonantes++;
            }
        }

        //Final
        if (contadorconsonantes == 0) {
            System.out.println("No hay consonantes en la cadena.");
        } else if (contadorconsonantes == 1) {
            System.out.println("Hay " + contadorconsonantes + " consonante en la cadena.");
        } else {
            System.out.println("Hay " + contadorconsonantes + " consonantes en la cadena.");
        }
        sc.close();
    }
}
