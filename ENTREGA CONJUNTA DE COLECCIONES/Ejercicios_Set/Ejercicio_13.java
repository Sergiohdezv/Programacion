import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio_13 {

    public static Set<Character> convertirASet(String palabra){
        Set<Character> set = new HashSet<>();
        palabra = palabra.toLowerCase();
        for(char c : palabra.toCharArray()){
            set.add(c);
        }
        return set;
    }

    public static boolean sonAnagramas(String palabra1, String palabra2){
        Set<Character> set1 = convertirASet(palabra1);
        Set<Character> set2 = convertirASet(palabra2);

        return set1.equals(set2);
    }

    public static void verificarAnagrama() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();

        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" sí son anagramas");
        } else {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" no son anagramas.");
        }
    }
}