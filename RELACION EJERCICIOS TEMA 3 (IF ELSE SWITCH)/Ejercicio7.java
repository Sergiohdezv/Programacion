import java.util.Scanner;

public class
Ejercicio7 {
    static void main() {
        //Introducción
        String respuesta1, respuesta2;
        Scanner sc = new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Jugador 1: ¿Piedra, papel, tijera, lagarto o Spock?");
        respuesta1 = sc.nextLine();
        System.out.println("Jugador 2: ¿Piedra, papel, tijera, lagarto o Spock?");
        respuesta2 = sc.nextLine();

        switch (respuesta1) {
            case "Tijera":
                switch (respuesta2) {
                    case "Papel":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Lagarto":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Piedra":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Spock":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Tijera":
                        System.out.println("¡Empate!");
                        break;
                } break;
            case "Piedra":
                switch (respuesta2) {
                    case "Papel":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Lagarto":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Tijera":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Spock":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Piedra":
                        System.out.println("¡Empate!");
                        break;
                } break;
            case "Papel":
                switch (respuesta2) {
                    case "Piedra":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Lagarto":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Tijera":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Spock":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Papel":
                        System.out.println("¡Empate!");
                        break;
                } break;
            case "Lagarto":
                switch (respuesta2) {
                    case "Piedra":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Papel":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Tijera":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Spock":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Lagarto":
                        System.out.println("¡Empate!");
                        break;
                } break;
            case "Spock":
                switch (respuesta2) {
                    case "Piedra":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Papel":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Tijera":
                        System.out.println("¡Gana el jugador 1!");
                        break;
                    case "Lagarto":
                        System.out.println("¡Gana el jugador 2!");
                        break;
                    case "Spock":
                        System.out.println("¡Empate!");
                        break;
                } break;
            default:
                System.out.println("Opción mal introducida, ¡vuelve a intentarlo!");
        }
        sc.close();
    }
}
