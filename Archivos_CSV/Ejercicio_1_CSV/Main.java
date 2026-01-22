import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce datos: (nombre, edad, ciudad.)");
        String info = sc.nextLine();
        EscribirUnaLineaCSV.escribir("D:\\PROGRAMACIÓN\\TEMA 6\\Ejercicio_Manejo_Archivos_CSV\\Ejercicio_1_CSV\\datos.csv", info);
        sc.close();
    }
}
