import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String texto = sc.nextLine();
        EscribirArchivo.escribir("D:\\PROGRAMACIÓN\\TEMA 6\\Ejercicios_Archivos_Java\\Actividad_1_txt\\archivo1.txt", texto);

        sc.close();
    }
}
