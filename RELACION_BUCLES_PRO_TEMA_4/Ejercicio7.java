import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        //Introducción
        Scanner sc = new Scanner(System.in);
        int numero;

        //Desarrollo y final
        System.out.println("Introduce un número. Haré una cuenta desde el 1 hasta el número que introduzcas.");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
