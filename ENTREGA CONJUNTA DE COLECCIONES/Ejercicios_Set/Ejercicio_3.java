import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_3 {
    public static void ordenarPalabras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe las palabras que quieres que sean almacenadas. (Escribe 'fin' cuando quieras parar):");
        Set<String> palabras = new LinkedHashSet<>();
        String respuesta = "";
        while (!respuesta.equals("fin")) {
            respuesta = sc.nextLine();
            if (respuesta.equals("fin")) {
                break;
            }
            palabras.add(respuesta);
        }
        System.out.println("Saliste del bucle. La lista de palabras es:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}