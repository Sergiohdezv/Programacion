import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nuevo texto:");
        String texto = sc.nextLine();
        Sobreescribir_6_txt.escribir("D:\\PROGRAMACIÓN\\TEMA 6\\Ejercicios_Archivos_Java\\Actividad_1_txt\\archivo1.txt", texto);

        sc.close();
    }
}