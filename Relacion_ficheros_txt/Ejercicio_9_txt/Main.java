import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra que contenga la línea: ");
        String palabra = sc.nextLine();

        Filtrar_guardar_9_txt.leer("D:\\PROGRAMACIÓN\\TEMA 6\\Ejercicios_Archivos_Java\\Actividad_1_txt\\archivo1.txt",
                "D:\\PROGRAMACIÓN\\TEMA 6\\Ejercicios_Archivos_Java\\Actividad_9_txt\\filtrado.txt", palabra);

        sc.close();
    }
}