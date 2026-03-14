import java.util.HashSet;
import java.util.Set;

public class Ejercicio_15 {
    public static void exclusivos() {
        Set<String> equiposPrimera = new HashSet<>();
        equiposPrimera.add("Real Madrid");
        equiposPrimera.add("Barcelona");
        equiposPrimera.add("Maracena");
        equiposPrimera.add("Armilla");
        equiposPrimera.add("Córdoba");
        equiposPrimera.add("Betis");
        equiposPrimera.add("Atlético de Madrid");
        equiposPrimera.add("Valencia");

        Set<String> masEquipos = new HashSet<>();
        masEquipos.add("Real Madrid");
        masEquipos.add("Barcelona");
        masEquipos.add("Betis");
        masEquipos.add("Atlético de Madrid");
        masEquipos.add("Valencia");
        masEquipos.add("Levante");
        masEquipos.add("Real Sociedad");
        masEquipos.add("Athletic de Bilbao");


        Set<String> exclusivosEquiposPrimera = new HashSet<>();
        Set<String> exclusivosMasEquipos = new HashSet<>();


        for (String equipillosPrimera : equiposPrimera) {
            if (!masEquipos.contains(equipillosPrimera)) {
                exclusivosEquiposPrimera.add(equipillosPrimera);
            }
        }


        for (String masEquipillos : masEquipos) {
            if (!equiposPrimera.contains(masEquipillos)) {
                exclusivosMasEquipos.add(masEquipillos);
            }
        }

        System.out.println("Exclusivos de A: " + exclusivosEquiposPrimera);
        System.out.println("Exclusivos de B: " + exclusivosMasEquipos);
    }
}



//15. Crea un programa que compare dos HashSet y muestre los elementos que son exclusivos
//de cada uno.