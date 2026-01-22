import java.io.*;

public class Filtrar_guardar_9_txt {
    public static void leer(String archivo1, String archivo2, String palabra) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivo2))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            System.out.println("Las líneas se han guardado en el nuevo archivo.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

