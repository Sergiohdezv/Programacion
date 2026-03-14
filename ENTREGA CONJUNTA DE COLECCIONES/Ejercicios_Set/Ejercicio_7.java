import java.util.HashSet;
import java.util.Set;

public class Ejercicio_7 {
    public static void comunes(){
        Set <String> asignaturas = new HashSet<>();
        asignaturas.add("Matemáticas");
        asignaturas.add("Historia");
        asignaturas.add("Lengua");
        asignaturas.add("Inglés");
        asignaturas.add("Programación");

        Set <String> otrasAsignaturas = new HashSet<>();
        otrasAsignaturas.add("Matemáticas");
        otrasAsignaturas.add("Filosofía");
        otrasAsignaturas.add("Lengua");
        otrasAsignaturas.add("Inglés");
        otrasAsignaturas.add("Francés");

        Set <String> comunes = new HashSet<>(asignaturas);
        comunes.retainAll(otrasAsignaturas);
        System.out.println(comunes);
    }
}
