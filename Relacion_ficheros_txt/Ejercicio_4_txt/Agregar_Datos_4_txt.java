import java.io.*;

public class Agregar_Datos_4_txt {
    public static void escribir(String path, String datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(datos);
            bw.newLine();
            System.out.println("El texto se ha añadido.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
        }
    }
}