import java.io.*;

public class Leer_6_CSV {
    public static void leer(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(", ");
                System.out.println("Nombre: " + partes[0]);
                System.out.println("Edad: " + partes[1]);
                System.out.println("Ciudad: " + partes[2]);
                System.out.println();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}