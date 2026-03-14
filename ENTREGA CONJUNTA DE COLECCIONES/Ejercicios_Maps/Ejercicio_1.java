import java.util.HashMap;
import java.util.Map;

public class Ejercicio_1 {

    public static Map<String, String> crearMapaPaisesYCapitales() {
        Map<String, String> paisesCapitales = new HashMap<>();

        paisesCapitales.put("España", "Madrid");
        paisesCapitales.put("Francia", "París");
        paisesCapitales.put("Italia", "Roma");
        paisesCapitales.put("Polonia", "Varsovia");
        paisesCapitales.put("Argentina", "Buenos Aires");

        return paisesCapitales;
    }

    public static void mostrarMapa(Map<String, String> mapa) {
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


