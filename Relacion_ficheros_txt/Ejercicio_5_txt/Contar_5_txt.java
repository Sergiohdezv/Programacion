import java.io.*;

public class Contar_5_txt {
    public static void leer(String ruta) {
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            System.out.println("El archivo tiene " + contador + " líneas");

        } catch (Exception e) {
            System.out.println("Error al contar las líneas");
            throw new RuntimeException(e);
        }
    }
}
