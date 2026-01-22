import java.io.*;

public class EscribirUnaLineaCSV {
    public static void escribir(String path, String datos) {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))){
            bf.write(datos);
            bf.newLine();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
