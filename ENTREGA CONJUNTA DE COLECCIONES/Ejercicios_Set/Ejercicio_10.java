import java.util.HashSet;
import java.util.Set;
public class Ejercicio_10 {
    public static void crearListaSet() {
        Set <String> nombres = new HashSet<>();
        nombres.add("Antonio");
        nombres.add("Cristina");
        nombres.add("Rafa");
        nombres.add("Oliver");
        nombres.add("Nico");
        nombres.add("Sergio");
        nombres.add("Antonio");

        System.out.println("La lista tiene una cantidad de " + nombres.size() + " elementos únicos.");
    }
}
