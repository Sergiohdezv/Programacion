import java.util.Scanner;

public class Ejercicio9 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;

        //Desarrollo
        System.out.println("Introduce un número y te sumaré todos los números pares desde 1 hsata tu número.");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        //Final
        System.out.println("La suma es igual a " + suma);

        sc.close();
    }
}
