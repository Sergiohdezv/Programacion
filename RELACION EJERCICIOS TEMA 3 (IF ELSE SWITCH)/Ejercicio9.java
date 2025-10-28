import java.util.Scanner;

public class Ejercicio9 {
    static void main() {
        //Introducción
        double numero1, numero2 = 0, resultado = 0;
        String operador;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Introduce el primer número:");
        numero1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Escribe la operación que quieras hacer (suma, resta, multiplicación, división, potencia, raíz o factorial):");
        operador = sc.nextLine();
        if (!operador.equals("factorial")) {
            System.out.println("Introduce el segundo número:");
            numero2 = sc.nextDouble();
        }
        switch (operador) {
            case "suma":
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "resta":
                resultado = numero1 - numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "multiplicación":
                resultado = numero1 * numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "división":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("ERROR (No se puede dividir entre 0)");
                }
                break;
            case "potencia":
                if (numero2 >= 0) {
                    resultado = Math.pow(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("ERROR (No se puede hacer la potencia con números negativos)");
                }
                break;
            case "raíz":
                if (numero1 >= 0) {
                    resultado = Math.pow(numero1, 1.0 / numero2);
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("ERROR (No se puede hacer la raíz de números negativos)");
                }
                break;
            case "factorial":
                resultado = 1;
                for (int i = 1; i <= numero1; i++) {
                    resultado *= i;
                }
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("ERROR");
        }
        sc.close();
    }
}
