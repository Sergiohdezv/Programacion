import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        //Introducción
        int dia, anio;
        String mes;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Escribe el número de día de tu fecha:");
        dia = sc.nextInt();
        System.out.println("Escribe el mes de tu fecha:");
        sc.nextLine();
        mes = sc.nextLine();
        System.out.println("Escribe el número de año de tu fecha:");
        anio = sc.nextInt();

        switch (mes) {
            case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre":
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Fecha válida");
                } else {
                    System.out.println("Fecha inválida");
                }
                break;
            case "Abril", "Junio", "Septiembre", "Noviembre":
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Fecha válida");
                } else {
                    System.out.println("Fecha inválida");
                }
                break;
            case "Febrero":
                if (anio % 4 == 0) {
                    if (dia >= 1 && dia <= 29) {
                        System.out.println("Fecha válida");
                    } else {
                        System.out.println("Fecha inválida");
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("Fecha válida");
                    } else {
                        System.out.println("Fecha inválida");
                    }
                }
                break;
            default:
                System.out.println("ERROR");
        }
        sc.close();
    }
}