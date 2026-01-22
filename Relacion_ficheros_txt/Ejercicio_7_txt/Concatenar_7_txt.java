import java.io.*;
public class Concatenar_7_txt {
    public static void concatenar (String rutaOrigen1, String rutaOrigen2, String rutaDestino){

        try (BufferedReader br1 = new BufferedReader(new FileReader(rutaOrigen1)); BufferedReader br2 = new BufferedReader(new FileReader(rutaOrigen2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino))){

            String linea;
            while ((linea = br1.readLine()) != null ){
                System.out.println("El texto del archivo1.txt es: ");
                System.out.println(linea);
                bw.write(linea);
                bw.newLine();
            }

            while ((linea = br2.readLine()) != null ){
                System.out.println("El texto del archivo2.txt es: ");
                System.out.println(linea);
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo concatenado realizado.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}