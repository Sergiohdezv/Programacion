import java.util.TreeSet;

public class Ejercicio_8 {
    public static void arbolVacio() {
        TreeSet <String> Ejercicios = new TreeSet<>();
        Ejercicios.add("Clean");
        Ejercicios.add("Snatch");
        Ejercicios.add("Clean and Jerk");
        Ejercicios.add("Trhuster");
        Ejercicios.add("Peso muerto");

        Ejercicios.clear();

        if (Ejercicios.isEmpty()) {
            System.out.println("El conjunto está vacío.");
        } else System.out.println("El conjunto no está vacío.");
    }
}