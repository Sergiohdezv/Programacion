import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_2 {
    public static void ordenarNumeros() {
        Set <Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(8);
        numeros.add(9);
        numeros.add(6);
        numeros.add(3);
        numeros.add(7);
        numeros.add(5);
        numeros.add(2);
        numeros.add(4);

        System.out.println("Números en orden ascendente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
