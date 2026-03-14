import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_4 {
    public static void comprobar() {
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
        System.out.println("Escribe el elemento específico que quieres comprobar si existe en la lista: ");
        String respuesta = sc.nextLine();
        if (ciudades.contains(respuesta)) {
            System.out.println(respuesta + " sí está en la lista.");
        } else System.out.println(respuesta + " no está en la lista");
    }
}
