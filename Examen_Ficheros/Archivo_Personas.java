import java.io.*;

public class Archivo_Personas {
    public static void leer2 (String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            String cabecera = br.readLine();
            int contadorMenoresIguales = 0;
            int contadoraMayores = 0;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String nombre = datos[0];
                    String localidad = datos[1];
                    String edad = datos[2];

                    try {
                        int edadNumero = Integer.parseInt(edad);

                        if (edadNumero <= 30) {
                            contadorMenoresIguales++;
                        } else contadoraMayores++;

                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Nombre: " + nombre + ", Localidad: " + localidad + ", Edad: " + edad);
                }
            }
            System.out.println("Personas mayores de 30 años: " + contadoraMayores);
            System.out.println("Personas de 30 años o menores: " + contadorMenoresIguales);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribir (String ruta, String ruta2) {
        try (BufferedReader br2 = new BufferedReader(new FileReader(ruta)); BufferedWriter bw = new BufferedWriter(new FileWriter(ruta2))) {
            String linea2;
            String cabecera = br2.readLine();
            bw.write(cabecera);
            bw.newLine();

            while ((linea2 = br2.readLine()) != null) {
                String[] datos2 = linea2.split(";");

                if (datos2.length == 3) {
                    String edad2 = datos2[2];

                    try {
                        int edadNumero2 = Integer.parseInt(edad2);

                        if (edadNumero2 > 30) {
                            bw.write(linea2);
                            bw.newLine();
                        }

                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
