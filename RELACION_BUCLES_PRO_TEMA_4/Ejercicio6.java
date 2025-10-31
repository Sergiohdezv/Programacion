import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contadorvocales = 0;

        //Desarrollo
        System.out.println("Introduce una cadena de caracteres:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contadorvocales++;
            }
        }

        //Final
        if (contadorvocales == 0) {
            System.out.println("No hay vocales en la cadena.");
        } else if (contadorvocales == 1) {
            System.out.println("Hay " + contadorvocales + " vocal en la cadena");
        } else {
            System.out.println("Hay " + contadorvocales + " vocales en la cadena.");
        }
        sc.close();
    }
}
