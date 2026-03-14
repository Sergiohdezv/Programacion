import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_9 {
    public static void crearListaSet() {
        Set<String> nombres = new HashSet<>();
        nombres.add("Antonio");
        nombres.add("Cristina");
        nombres.add("Rafa");
        nombres.add("Oliver");
        nombres.add("Nico");
        nombres.add("Sergio");
        nombres.add("Antonio");
        System.out.println(nombres);

        TreeSet<String> nombrecitos = new TreeSet<>(nombres);
        for (String nom : nombrecitos) {
            System.out.println(nom);
        }
    }
}
