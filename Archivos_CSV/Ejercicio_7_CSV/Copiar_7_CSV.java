import java.io.*;

public class Copiar_7_CSV {
    public static void copiar (String ruta_origen, String ruta_copia) {

        try (BufferedReader br = new BufferedReader(new FileReader(ruta_origen)); BufferedWriter bw = new BufferedWriter(new FileWriter(ruta_copia))){

            String linea;
            while ((linea = br.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Copia del contenido realizada");

        } catch (Exception e) {
            System.out.println("Hubo un error en el intento de copia.");
            throw new RuntimeException(e);
        }
    }
}