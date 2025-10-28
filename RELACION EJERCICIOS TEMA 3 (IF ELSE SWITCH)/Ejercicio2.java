import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        //Introducción
        double precio, preciofinal, descuento = 0;
        String tipocliente;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce el precio del producto");
        precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce el tipo de cliente");
        tipocliente = sc.nextLine();

        if (tipocliente.equals("Cliente regular")) {
            descuento = (precio * 5) / 100;
        } else if (tipocliente.equals("Cliente premium")) {
            descuento = (precio * 10) / 100;
        } else if ((precio < 500) && (tipocliente.equals("Cliente VIP"))) {
            descuento = (precio * 20) / 100;
        } else if ((precio > 500) && (tipocliente.equals("Cliente VIP"))) {
            descuento = (precio * 25) / 100;
        } else {
            System.out.println("ERROR (Ha introducido mal el tipo de cliente)");
        }
        preciofinal = precio - descuento;

        //Final
        System.out.println("El descuento es de " + descuento + " €");
        System.out.println("El producto costará " + preciofinal + " €");

        sc.close();
    }
}
