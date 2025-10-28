import java.util.Scanner;

public class Ejercicio10ConBucle {
    static void main() {
        //Introducción
        double notas, pesos, sumapesos = 0, promedio = 0;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce la calificación de la materia " + (i + 1) + ": ");
            notas = sc.nextDouble();
            System.out.println("Introduce el peso porcentual de la materia " + (i + 1) + " (en %): ");
            pesos = sc.nextDouble();
            sumapesos += pesos;
            promedio += notas * (pesos / 100);
        }
        if (sumapesos == 100) {
            if (promedio < 60) {
                System.out.println("Has reprobado, tu nota promedio es de: " + promedio);
            } else {
                System.out.println("Tu nota promedio es de: " + promedio);
            }
        } else {
            System.out.println("ERROR (Pesos de las asignaturas mal introducidos)");
        }
        sc.close();
    }
}
