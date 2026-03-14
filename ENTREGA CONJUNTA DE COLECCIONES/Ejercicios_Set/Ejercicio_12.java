import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio_12 {
    public static void numerosAleatorios(){
        Set<Integer> numeros = new LinkedHashSet<>();
        Random rd = new Random();

        int cantidad = 10;

        while (numeros.size() < cantidad) {
            int num = rd.nextInt(1000);
            numeros.add(num);
        }
        for (int aleatorio : numeros) {
            System.out.println(aleatorio);
        }
    }
}
