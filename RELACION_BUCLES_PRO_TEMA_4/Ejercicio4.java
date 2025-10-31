import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int longitud, numerosaleatorios;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String cadena ="";

        //Desarrollo
        System.out.println("Introduce la longitud que quieres que tenga la cadena (en número): ");
        longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++) {
            numerosaleatorios = rd.nextInt(caracteres.length());
            cadena += caracteres.charAt(numerosaleatorios);
        }

        //Final
        System.out.println("Cadena aleatoria de " + longitud + " caracteres: " + cadena);

        sc.close();
    }
}
