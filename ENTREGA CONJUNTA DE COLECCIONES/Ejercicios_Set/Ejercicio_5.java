import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_5 {
    public static void eliminar() {
        Set<String> ciudades = new HashSet<>();
        ciudades.add("Granada");
        ciudades.add("Córdoba");
        ciudades.add("Sevilla");
        ciudades.add("Jaén");
        ciudades.add("Almería");
        ciudades.add("Cádiz");
        ciudades.add("Huelva");
        ciudades.add("Málaga");

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el elemento específico que quieres eliminar de la lista: ");
        String respuesta = sc.nextLine();
        if (ciudades.contains(respuesta)) {
            ciudades.remove(respuesta);
            System.out.println("Has eliminado " + respuesta + " de la lista.");
        } else System.out.println(respuesta + " no está en la lista");

        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}