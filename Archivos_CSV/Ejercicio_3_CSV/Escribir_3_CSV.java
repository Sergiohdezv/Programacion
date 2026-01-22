import java.io.*;
import java.util.Scanner;

public class Escribir_3_CSV {
    public static void escribir(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los datos (formato: nombre, edad, ciudad). Cuando acabes escribe 'fin':");

            while(true) {
                String datos = sc.nextLine();
                if (datos.equals("fin")) {
                    break;
                }

                bw.write(datos);
                bw.newLine();
            }

            sc.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}