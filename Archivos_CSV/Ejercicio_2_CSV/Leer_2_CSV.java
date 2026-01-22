import java.io.*;

public class Leer_2_CSV {
    public static void leer(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
