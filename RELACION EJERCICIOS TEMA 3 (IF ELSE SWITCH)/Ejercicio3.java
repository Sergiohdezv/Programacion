import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        //Introducción
        double notalengua, notamates, notaingles, notahistoria, notafisica, promedio;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Introduce la nota de Lengua:");
        notalengua = sc.nextDouble();
        System.out.println("Introduce la nota de Matemáticas:");
        notamates = sc.nextDouble();
        System.out.println("Introduce la nota de Inglés:");
        notaingles = sc.nextDouble();
        System.out.println("Introduce la nota de Historia:");
        notahistoria = sc.nextDouble();
        System.out.println("Introduce la nota de Física:");
        notafisica = sc.nextDouble();
        promedio = (notalengua + notamates + notaingles + notahistoria + notafisica) / 5;

        if (notalengua < 0 || notalengua > 100 || notamates < 0 || notamates > 100 || notaingles < 0 || notaingles > 100 || notahistoria < 0 || notahistoria > 100 || notafisica < 0 || notafisica > 100) {
            System.out.println("ERROR: NOTA MAL INTRODUCIDA");
        } else if (promedio <= 100 && promedio >= 90) {
            System.out.println("La calificación es " + promedio + " (A)");
        } else if (promedio < 90 && promedio >= 80) {
            System.out.println("La calificación es " + promedio + " (B)");
        } else if (promedio < 80 && promedio >= 70) {
            System.out.println("La calificación es " + promedio + " (C)");
        } else if (promedio < 70 && promedio >= 60) {
            System.out.println("La calificación es " + promedio + " (D)");
        } else if (promedio < 60 && promedio >= 0) {
            System.out.println("La calificación es " + promedio + " (F)");
        } else {
            System.out.println("ERROR");
        }
        sc.close();
    }
}
