import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena, cadenalarga ="";
        int contador = 0;

        //Desarrollo
        do {
            System.out.println("Introduce tantas cadenas de caracteres como quiera. Cuando esté cansado introduzca 'salir'.");
            cadena = sc.nextLine();
            if (!cadena.equals("salir")) {
                contador++;
                if (cadena.length() > cadenalarga.length()) {
                    cadenalarga = cadena;
                }
            }
        } while (!cadena.equals("salir"));

        //Final
        System.out.println("Has introducido " + contador + " cadenas.");
        System.out.println("La cadena más larga ha sido: '" + cadenalarga + "'.");

        sc.close();
    }
}
