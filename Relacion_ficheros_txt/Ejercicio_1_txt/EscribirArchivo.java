import java.io.*;;

public class EscribirArchivo {
    public static void escribir(String path, String datos) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(datos);
            bw.newLine();
            System.out.println("El archivo fue creado.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
        }
    }
}