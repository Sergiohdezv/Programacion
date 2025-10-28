import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        //Introducción
        double lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Introduce el primer lado del triángulo:");
        lado1 = sc.nextDouble();
        System.out.println("Introduce el segundo lado del triángulo:");
        lado2 = sc.nextDouble();
        System.out.println("Introduce el tercer lado del triángulo:");
        lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El triángulo es equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
                System.out.println("El triángulo es isósceles");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("El triángulo es escaleno");
            }
        } else {
            System.out.println("ERROR, NO FORMAN UN TRIÁNGULO");
        }
        sc.close();
    }
}
