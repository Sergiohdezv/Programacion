import java.io.*;

public class Contar_palabras_8_txt {
    public static void leer(String ruta, String palabra) {
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equals(palabra)) {
                        contador++;
                    }
                }
            }
            System.out.println("El archivo tiene " + contador + " palabras");

        } catch (Exception e) {
            System.out.println("Error al contar las palabras");
            throw new RuntimeException(e);
        }
    }
}
