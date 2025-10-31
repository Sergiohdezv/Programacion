import java.util.Scanner;

public class Ejercicio14 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        String cadena, resultado = "";

        //Desarrollo
        System.out.println("Introduce una cadena de caracteres:");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                resultado += Character.toLowerCase(cadena.charAt(i));
            } else if (Character.isLowerCase(cadena.charAt(i))) {
                resultado += Character.toUpperCase(cadena.charAt(i));
            } else {
                resultado += cadena.charAt(i);
            }
        }

        //Final
        System.out.println("Cadena transformada: " + resultado);

        sc.close();
    }
}

