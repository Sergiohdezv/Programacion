import java.util.Random;

public class Ejercicio19 {
    static void main() {
        //Introducción
        Random rd = new Random();
        double numerosaleatorios, contador = 0, suma = 0, media = 0;

        //Desarrollo
        for (int i = 1; i <= 10; i++) {
            numerosaleatorios = rd.nextInt(100) + 1;
            System.out.println("Número " + i + ": " + numerosaleatorios);
            suma += numerosaleatorios;
            contador++;
        }
        media = suma / contador;

        //Final
        System.out.println("La media de los números es: " + media);
    }
}
