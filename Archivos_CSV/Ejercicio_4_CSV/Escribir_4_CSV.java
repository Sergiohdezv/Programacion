import java.io.*;
import java.util.Scanner;

public class Escribir_4_CSV {
    public static void escribir(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))){

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los datos formato: (nombre, edad, ciudad). Cuando acabes escribe 'fin':");
            String datos;

            while (!(datos = sc.nextLine()).equals("fin")) {
                bw.write(datos);
                bw.newLine();
            }

            sc.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
