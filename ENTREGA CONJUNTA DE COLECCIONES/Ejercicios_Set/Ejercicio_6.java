import java.util.HashSet;
import java.util.Set;

public class Ejercicio_6 {
    public static void combinar(){
        Set <String> equiposPrimera = new HashSet<>();
        equiposPrimera.add("Real Madrid");
        equiposPrimera.add("Barcelona");
        equiposPrimera.add("Betis");
        equiposPrimera.add("Atlético de Madrid");
        equiposPrimera.add("Valencia");

        Set <String> equiposSegunda = new HashSet<>();
        equiposSegunda.add("Granada");
        equiposSegunda.add("Málaga");
        equiposSegunda.add("Barcelona");
        equiposSegunda.add("Levante");
        equiposSegunda.add("Valencia");

        Set <String> combinado = new HashSet<>(equiposPrimera);
        combinado.addAll(equiposSegunda);
        System.out.println(combinado);
    }
}
