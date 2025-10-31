import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena, inverso = "";

        //Desarrollo
        System.out.println("Introduce una cadena de carácteres:");
        cadena = sc.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            inverso += cadena.charAt(i);
        }

        //Final
        if (cadena.equals(inverso)) {
            System.out.println("Sí es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        sc.close();
    }
}
