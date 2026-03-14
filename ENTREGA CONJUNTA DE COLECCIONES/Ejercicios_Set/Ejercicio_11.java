import java.util.HashSet;
import java.util.Set;

public class Ejercicio_11 {
    public static void subconjunto(){
        Set <String> equiposPrimera = new HashSet<>();
        equiposPrimera.add("Real Madrid");
        equiposPrimera.add("Barcelona");
        equiposPrimera.add("Betis");
        equiposPrimera.add("Atlético de Madrid");
        equiposPrimera.add("Valencia");

        Set <String> masEquipos = new HashSet<>();
        masEquipos.add("Real Madrid");
        masEquipos.add("Barcelona");
        masEquipos.add("Betis");
        masEquipos.add("Atlético de Madrid");
        masEquipos.add("Valencia");
        masEquipos.add("Levante");
        masEquipos.add("Real Sociedad");
        masEquipos.add("Athletic de Bilbao");

        if (masEquipos.containsAll(equiposPrimera)) {
            System.out.println("Sí es un subconjunto.");
        } else System.out.println("No es un subconjunto.");
        }

    }