import java.io.*;

public class Sobreescribir_6_txt {
    public static void escribir(String path, String datos) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))){
            bw.write(datos);
            bw.newLine();
            System.out.println("El archivo se ha sobreescrito.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al sobreescribir en el archivo.");
        }
    }
}