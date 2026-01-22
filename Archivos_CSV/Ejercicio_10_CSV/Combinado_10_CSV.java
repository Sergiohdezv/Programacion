import java.io.*;
import java.util.ArrayList;

public class Combinado_10_CSV {
    public static void concatenar (String rutaOrigen1, String rutaOrigen2, String rutaDestino){

        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br1 = new BufferedReader(new FileReader(rutaOrigen1));
             BufferedReader br2 = new BufferedReader(new FileReader(rutaOrigen2))){

            String linea;
            while ((linea = br1.readLine()) != null) {
                if (!lineas.contains(linea)) {
                    lineas.add(linea);
                }
            }
            System.out.println("Primer archivo leído.");

            while ((linea = br2.readLine()) != null) {
                if (!lineas.contains(linea)) {
                    lineas.add(linea);
                }
            }
            System.out.println("Segundo archivo leído.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino, false))) {

            for (String lineaActual : lineas) {
                bw.write(lineaActual);
                bw.newLine();
            }
            System.out.println("Archivo combinado creado sin duplicados.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
