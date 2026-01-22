import java.io.*;
import java.util.Scanner;

public class Eliminar_10_txt {
    public static void eliminar (String ruta) {
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres eliminar el archivo? (S / N)");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            archivo.delete();
            System.out.println("El archivo se ha eliminado");
        } else {
            System.out.println("No se ha eliminado el archivo.");
        }

        sc.close();
    }
}
