import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        int opcion = 0, contador = 0;
        String cadena1, cadena2, cadenainvertida = "";

        //Desarrollo y final
        do {
            System.out.println();
            System.out.println("MENÚ");
            System.out.println("1 - Contar caracteres.");
            System.out.println("2 - Invertir una cadena.");
            System.out.println("3 - Salir.");
            System.out.println("Elija una opción (1, 2 o 3):");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca una cadena de caracteres:");
                    cadena1 = sc.nextLine();
                    for (int i = 0; i < cadena1.length(); i++) {
                        contador++;
                    }
                    System.out.println("Tu cadena tiene " + contador + " caracteres.");
                    break;
                case 2:
                    System.out.println("Introduzca una cadena de caracteres:");
                    cadena2 = sc.nextLine();
                    for (int i = cadena2.length() - 1; i >= 0; i--) {
                        cadenainvertida += cadena2.charAt(i);
                    }
                    System.out.println("La cadena invertida es: " + cadenainvertida);
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("ERROR (Número mal introducido)");
            }
        } while (opcion != 3);

        sc.close();
    }
}
