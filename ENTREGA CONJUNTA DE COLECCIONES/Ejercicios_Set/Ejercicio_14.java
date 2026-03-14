import java.util.HashSet;
import java.util.Set;

public class Ejercicio_14 {
    public static void combinar(){
        Set <String> equiposPrimera = new HashSet<>();
        equiposPrimera.add("Real Madrid");
        equiposPrimera.add("Barcelona");
        equiposPrimera.add("Betis");
        equiposPrimera.add("Atlético de Madrid");
        equiposPrimera.add("Valencia");


        Set <String> copia = new HashSet<>();
        copia.addAll(equiposPrimera);
        System.out.println(copia);
    }
}
