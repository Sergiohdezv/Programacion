import java.io.*;

public class Leer_Archivo_Y_Calcular {
    public static void leer (String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            int suma = 0;
            double media = 0;
            int contadorNumeros = 0;

            while ((linea = br.readLine()) != null) {
                try {
                    int numeroEntero = Integer.parseInt(linea);
                    contadorNumeros++;
                    suma += numeroEntero;
                    media = (double) suma / contadorNumeros;

                } catch (NumberFormatException e) {
                    System.out.println("Esta línea no es un número válido: " + linea);
                }
            }
            System.out.println("La suma de los números es: " + suma);
            System.out.println("La media de los números es: " + media);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
