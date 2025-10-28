import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        //Introducción
        double ingresosanuales, impuestos=0, reducciondependientes, totalfinal;
        int dependiente;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Introduce tus ingresos anuales:");
        ingresosanuales = sc.nextDouble();
        System.out.println("Introduce cuántos dependientes tiene:");
        dependiente = sc.nextInt();

        if (ingresosanuales < 20000 && ingresosanuales >= 0) {
            impuestos = (ingresosanuales * 5) / 100;
            System.out.println("Tus impuestos son del 5%, un total de " + impuestos + " €.");
        } else if (ingresosanuales < 40000 && ingresosanuales >= 20000) {
            impuestos = (ingresosanuales * 10) / 100;
            System.out.println("Tus impuestos son del 10%, un total de " + impuestos + " €.");
        } else if (ingresosanuales < 80000 && ingresosanuales >= 40000) {
            impuestos = (ingresosanuales * 20) / 100;
            System.out.println("Tus impuestos son del 20%, un total de " + impuestos + " €.");
        } else if (ingresosanuales >= 80000) {
            impuestos = (ingresosanuales * 30) / 100;
            System.out.println("Tus impuestos son del 30%, un total de " + impuestos + " €.");
        } else {
            System.out.println("ERROR, INGRESOS ANUALES MAL INTRODUCIDOS");
        }
        if (dependiente > 3) {
            reducciondependientes = (ingresosanuales * 5) / 100;
            totalfinal = impuestos - reducciondependientes;
            System.out.println("Al tener más de 3 dependientes se le aplica una reducción del 5%, quedando un total de " + totalfinal + " €");
        } else {
            totalfinal = impuestos;
            System.out.println("No se aplica reducción por dependientes. El total a pagar es de " + totalfinal + " €");
        }
        sc.close();
    }
}