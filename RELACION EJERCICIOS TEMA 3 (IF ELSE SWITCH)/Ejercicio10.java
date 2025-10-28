import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        //Introducción
        double notalengua, notamates, notaingles, notahistoria, notafisica, notalatin;
        double pesolengua, pesomates, pesoingles, pesohistoria, pesofisica, pesolatin, sumapesos, promedio = 0;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Introduce la calificación de lengua:");
        notalengua = sc.nextDouble();
        System.out.println("Introduce el peso porcentual de lengua (en %):");
        pesolengua = sc.nextDouble();
        System.out.println("Introduce la calificación de matemáticas:");
        notamates = sc.nextDouble();
        System.out.println("Introduce el peso porcentual de matemáticas (en %):");
        pesomates = sc.nextDouble();
        System.out.println("Introduce la calificación de inglés:");
        notaingles = sc.nextDouble();
        System.out.println("Introduce el peso porcentual de inglés (en %):");
        pesoingles = sc.nextDouble();
        System.out.println("Introduce la calificación de historia:");
        notahistoria = sc.nextDouble();
        System.out.println("Introduce el peso porcentual de historia (en %):");
        pesohistoria = sc.nextDouble();
        System.out.println("Introduce la calificación de física:");
        notafisica = sc.nextDouble();
        System.out.println("Introduce el peso porcentual de física (en %):");
        pesofisica = sc.nextDouble();
        System.out.println("Introduce la calificación de latín:");
        notalatin = sc.nextDouble();
        System.out.println("Introduce el peso porcentual de latín (en %):");
        pesolatin = sc.nextDouble();
        sumapesos = pesolengua + pesomates + pesoingles + pesohistoria + pesofisica + pesolatin;
        promedio = ((notalengua * pesolengua) + (notamates * pesomates) + (notaingles * pesoingles) + (notahistoria * pesohistoria) + (notafisica * pesofisica) + (notalatin * pesolatin)) / 100;

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
