import java.util.Random;

public class Ejercicio13 {
    static void main() {
        //Introducción
        Random rd = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenia = "";
        int numerosaleatorios;

        //Desarrollo
        for (int i = 0; i < 8; i++) {
            numerosaleatorios = rd.nextInt(caracteres.length());
            contrasenia += caracteres.charAt(numerosaleatorios);
        }

        //Final
        System.out.println("Contraseña generada: " + contrasenia);
    }
}

