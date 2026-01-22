import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra que quieres buscar:");
        String palabra = sc.nextLine();
        Contar_palabras_8_txt.leer("D:\\PROGRAMACIÓN\\TEMA 6\\Ejercicios_Archivos_Java\\Actividad_1_txt\\archivo1.txt", palabra);

        sc.close();
    }
}
