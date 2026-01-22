import java.io.*;

public class Ordenar_CSV_9 {
    public static void ordenar(String rutaOrigen, String rutaDestino, boolean tieneCabecera) {
        String cabecera = null;

        String[][] datosLeidos = new String[15][3];
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaOrigen))) {

            String linea;
            boolean primeraLinea = false;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!primeraLinea && tieneCabecera) {
                    cabecera = linea;
                    primeraLinea = true;
                    continue;
                }

                String[] partes = linea.split(", ");

                datosLeidos[contador][0] = partes[0];
                datosLeidos[contador][1] = partes[1];
                datosLeidos[contador][2] = partes[2];
                contador++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] datosFinales = new String[contador][3];
        for (int i = 0; i < contador; i++) {
            datosFinales[i][0] = datosLeidos[i][0];
            datosFinales[i][1] = datosLeidos[i][1];
            datosFinales[i][2] = datosLeidos[i][2];
        }

        ordenarAlfabeticamente(datosFinales);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino))) {
            if (tieneCabecera) {
                bw.write(cabecera);
                bw.newLine();
            }

            for (int i = 0; i < contador; i++) {
                bw.write(datosFinales[i][0] + ", " + datosFinales[i][1] + ", " + datosFinales[i][2]);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ordenarAlfabeticamente(String[][] datillos) {
        for (int i = 0; i < datillos.length - 1; i++) {
            for (int j = 0; j < datillos.length - 1 - i; j++) {

                String nombre1 = datillos[j][0].toLowerCase();
                String nombre2 = datillos[j + 1][0].toLowerCase();

                if (nombre1.compareTo(nombre2) > 0) {
                    String[] aux = datillos[j];
                    datillos[j] = datillos[j + 1];
                    datillos[j + 1] = aux;
                }
            }
        }
    }
}
